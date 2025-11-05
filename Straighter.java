public class Straighter extends Polluter {
    private int startingColumn;
    public Straighter(int startingColumn, World m){
        super(0,startingColumn,m);
        this.startingColumn = startingColumn;
    }
    public Straighter(World m){
       this((int)(Math.random() * m.getNBC()), m);
    }
    public int startingcolomn(){
        return startingColumn;
    }

    @Override 
    public void visit()
    {
        int row = 0; // commence à la ligne 0
        this.movesTo(row, startingColumn); 
        
        while(row < m.getNBL())
        { // parcourt toutes les lignes
            this.movesTo(row, startingColumn);  
            this.pollute();
            row++; // avance à la ligne suivante
        }
    }
    
}
