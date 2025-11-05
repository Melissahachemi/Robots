public class World {
    private int nbL;
    private int nbC;
    private boolean[][] mat; 

    public World (int nbL, int nbC)
    {
        if (nbL <= 0 || nbC <= 0) 
        {
        throw new IllegalArgumentException("Number of lines and columns must be positive");
        }
        this.nbL=nbL; 
        this.nbC=nbC; 
        this.mat= new boolean[nbL][nbC]; 
    }
    public World() 
    {
        this.nbL = 10;
        this.nbC = 10;
        this.mat = new boolean[nbL][nbC]; // toutes les cases false par défaut
    }
    int getNBL(){
        return nbL;
    }

    int getNBC()
    {
        return nbC; 
    }
    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nbL;i++)
        {
            for(int j=0; j<nbC; j++)
            {
                if(mat[i][j])
                {
                    sb.append('x');
                }
                else 
                { 
                    sb.append('.');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
    public void putsGreasyPaper(int x,int y)
    {
        if (x < 0 || x >= nbL || y < 0 || y >= nbC) 
        {
            throw new IndexOutOfBoundsException("Invalid coordinates (" + x + ", " + y + ") for world of size " + nbL + "x" + nbC);
        }
        mat[x][y]=true;

    }
    public void removesGreasyPaper(int x,int y)
    {
        if (x < 0 || x >= nbL || y < 0 || y >= nbC) 
        {
            throw new IndexOutOfBoundsException("Invalid coordinates (" + x + ", " + y + ") for world of size " + nbL + "x" + nbC);
        }
        mat[x][y]=false;
    }
    public boolean isDirty(int x, int y)
    {    
        if (x < 0 || x >= nbL || y < 0 || y >= nbC) 
        {
            throw new IndexOutOfBoundsException("Invalid coordinates (" + x + ", " + y + ") for world of size " + nbL + "x" + nbC);
        }
        return mat[x][y];
    }
    public int nbGreasyPapers(){
        int count=0;
        for(int i=0;i<nbL;i++)
        {
            for(int j=0;j<nbC;j++)
            {
                if (isDirty(i,j))
                {
                    count ++;
                }
            }  
        }
        return count;
    }


    
}
