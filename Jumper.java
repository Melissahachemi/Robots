public class Jumper extends Polluter{
    private int deltax; 
    public Jumper(int x,int y,World m,int deltax)
    {
        super(x, y, m); 
        this.deltax=deltax; 
    }
    public Jumper(World m, int deltax )
    {
        super(m);  // Position aléatoire via Polluter
        this.deltax = deltax;
    }    
    public Jumper(World m){
        this(m, 1 + (int)(Math.random() * 5));  // deltax aléatoire entre 1 et 5

    }
@Override
    public void visit() {
        int row = 0;
        int column = 0;
        
        // Commence à (0, 0)
        this.movesTo(row, column);
        this.pollute();
        
        // Continue tant qu'on est dans les limites du monde
        while (row < m.getNBL()) {
            column = (row * deltax) % m.getNBC();  // Modulo pour rester dans les limites
            this.movesTo(row, column);
            this.pollute();
            row++;
        }
    }
}
 