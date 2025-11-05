# 🤖 Polluter Robots

# Robots
 A world is represented by a 2D matrix of boxes. Different kind of robots move in a world:  polluters and cleaners

# 🤖 Polluter Robots

## 🧠 Description

Le projet **Polluter Robots** simule un monde en deux dimensions où différents types de robots se déplacent et interagissent avec leur environnement.  
Certains **polluent** en déposant des papiers gras, tandis que d’autres **nettoient** ces papiers.  
Ce projet illustre les principes fondamentaux de la **programmation orientée objet en Java** : héritage, abstraction et polymorphisme.

---

## 🌍 Structure du projet

### 1. `World`
Représente le monde sous forme d’une matrice 2D (`boolean[][] mat`).  
Chaque case indique si elle contient ou non un papier gras.

**Attributs principaux :**
- `nbL` : nombre de lignes  
- `nbC` : nombre de colonnes  
- `mat` : matrice booléenne des papiers gras  

**Méthodes clés :**
- `putsGreasyPaper(int x, int y)` : ajoute un papier gras sur la case `(x, y)`  
- `removesGreasyPaper(int x, int y)` : enlève un papier gras  
- `isDirty(int x, int y)` : teste si la case est sale  
- `nbGreasyPapers()` : renvoie le nombre total de papiers gras  
- `toString()` : affiche le monde (`.` = propre, `x` = sale)

---

### 2. `Robot` *(classe abstraite)*
Classe de base représentant un robot.

**Attributs :**
- `posx`, `posy` : position du robot  
- `m` : référence vers l’objet `World`  

**Constructeurs :**
- `Robot(int x, int y, World m)` : crée un robot à la position donnée  
- `Robot(World m)` : crée un robot à une position aléatoire  

**Méthodes :**
- `movesTo(int x, int y)` : déplace le robot  
- `visit()` : méthode abstraite redéfinie dans les sous-classes

---

### 3. `Polluter` *(abstraite)*
Sous-classe de `Robot` représentant les robots pollueurs.  

**Méthode :**
- `pollute()` : dépose un papier gras sur la case actuelle.

---

### 4. `Straighter`
Pollueur qui avance en ligne droite dans une colonne.  

**Comportement :**
- Démarre à `(0, startingColumn)` et descend jusqu’à la fin de la colonne.  
- Laisse un papier gras sur chaque case visitée.

---

### 5. `Jumper`
Pollueur “sauteur” qui se déplace en diagonale avec un saut défini (`deltax`).

**Comportement :**
- Se déplace de `(0,0)` → `(1, deltax)` → `(2, 2*deltax)` → `(3, 3*deltax)` (modulo le nombre de colonnes).  
- Laisse un papier gras sur chaque case visitée.

---

### 6. `Cleaner`
Robot nettoyeur parcourant la grille en style **boustrophédon** (zigzag).

**Comportement :**
- Parcourt la première ligne de gauche à droite, la suivante de droite à gauche, etc.  
- Supprime les papiers rencontrés.

---

### 7. `DistractedCleaner`
Sous-classe de `Cleaner`.  
Même déplacement, mais **ne nettoie qu’une case sur deux** (il est distrait 😅).

---

### 8. `TestWorld` et `TestRobot`
Classes de test permettant de :
- Créer un monde (`World`)
- Tester les différentes méthodes et comportements des robots

---

## ⚙️ Technologies utilisées
- **Langage :** Java  
- **Paradigme :** Programmation Orientée Objet (POO)  
- **Concepts clés :**
  - Abstraction  
  - Héritage  
  - Polymorphisme  
  - Exceptions personnalisées  
  - Tableaux 2D

---

## ▶️ Exécution

### Compilation :
```bash
javac *.java
