public class Cleaner extends Robot {
    public Cleaner(int x, int y, World m ){
        super(x,y,m);
    }
    public Cleaner(World m){
        super(m);
    }
    public void clean (){
        m.removesGreasyPaper(posx,posy);
    }
    @Override
    public void visit() 
    {
        for (int i = 0; i < m.getNBL(); i++)
        {
            if (i % 2 == 0) 
            {  // Lignes paires : gauche → droite
                for (int j = 0; j < m.getNBC(); j++) {
                    this.movesTo(i, j);
                    this.clean();
                }
            } else 
            {  // Lignes impaires : droite → gauche (boustrophédon)
                for (int j = m.getNBC() - 1; j >= 0; j--) {
                    this.movesTo(i, j);
                    this.clean();
                }
            }
        }
    }
}
