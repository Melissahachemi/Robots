public class TestRobot {
    public static void main(String[] args) {
        System.out.println("=== TEST STRAIGHTER ===");
        testStraighter();
        
        System.out.println("\n=== TEST JUMPER ===");
        testJumper();
        
        System.out.println("\n=== TEST CLEANER ===");
        testCleaner();
        
        System.out.println("\n=== TEST DISTRACTED CLEANER ===");
        testDistractedCleaner();
    }
    
    // Test du Straighter
    public static void testStraighter() {
        World w = new World(5, 5);
        Straighter s = new Straighter(2, w);  // Colonne 2
        
        System.out.println("Avant visite :");
        System.out.println(w);
        
        s.visit();
        
        System.out.println("Après visite (colonne 2 polluée) :");
        System.out.println(w);
        System.out.println("Nombre de papiers : " + w.nbGreasyPapers());
    }
    
    // Test du Jumper
    public static void testJumper() {
        World w = new World();
        Jumper j = new Jumper(0, 0, w, 2);  // deltax = 2
        
        System.out.println("Avant visite :");
        System.out.println(w);
        
        j.visit();
        
        System.out.println("Après visite (sauts de 2) :");
        System.out.println(w);
        System.out.println("Nombre de papiers : " + w.nbGreasyPapers());
    }
    
    // Test du Cleaner
    public static void testCleaner() {
        World w = new World(5, 5);
        
        // Polluer d'abord le monde
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                w.putsGreasyPaper(i, j);
            }
        }
        
        System.out.println("Avant visite (monde pollué) :");
        System.out.println(w);
        System.out.println("Nombre de papiers : " + w.nbGreasyPapers());
        
        Cleaner c = new Cleaner(w);
        c.visit();
        
        System.out.println("Après visite (monde propre) :");
        System.out.println(w);
        System.out.println("Nombre de papiers : " + w.nbGreasyPapers());
    }
    
    // Test du DistractedCleaner
    public static void testDistractedCleaner() {
        World w = new World(5, 5);
        
        // Polluer d'abord le monde
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                w.putsGreasyPaper(i, j);
            }
        }
        
        System.out.println("Avant visite (monde pollué) :");
        System.out.println(w);
        System.out.println("Nombre de papiers : " + w.nbGreasyPapers());
        
        DistractedCleaner dc = new DistractedCleaner(w);
        dc.visit();
        
        System.out.println("Après visite (moitié propre) :");
        System.out.println(w);
        System.out.println("Nombre de papiers restants : " + w.nbGreasyPapers());
    }
}