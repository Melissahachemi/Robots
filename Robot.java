public abstract class Robot {
    protected int posx,posy; 
    protected World m; 

    public Robot(int x, int y, World m)
    {
        this.posx=x; 
        this.posy=y; 
        this.m=m;
    }
    public Robot (World m)
    {
        this(
            (int)(Math.random()*m.getNBL()),
            (int)(Math.random() * m.getNBC()),
            m); 

    }

    public void movesTo(int x , int y )
    {
        this.posx = x;
        this.posy = y;
    }; 
    public abstract void visit(); 
    @Override
    public String toString() {
        return "Robot at (" + posx + ", " + posy + ")";
    }
}
