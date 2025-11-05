public class DistractedCleaner extends Cleaner {
    private boolean shouldClean;  // Compteur pour alterner
    
    public DistractedCleaner(World m) {
        super(m);
        this.shouldClean = true;  // Commence par nettoyer
    }
    
    public DistractedCleaner(int x, int y, World m) {
        super(x, y, m);
        this.shouldClean = true;
    }
    
    @Override
    public void visit() {
        for (int i = 0; i < m.getNBL(); i++) {
            if (i % 2 == 0) {  // Lignes paires : gauche → droite
                for (int j = 0; j < m.getNBC(); j++) {
                    this.movesTo(i, j);
                    if (shouldClean) {
                        this.clean();
                    }
                    shouldClean = !shouldClean;  // Alterne
                }
            } else {  // Lignes impaires : droite → gauche
                for (int j = m.getNBC() - 1; j >= 0; j--) {
                    this.movesTo(i, j);
                    if (shouldClean) {
                        this.clean();
                    }
                    shouldClean = !shouldClean;  // Alterne
                }
            }
        }
    }
}