public abstract class Polluter extends Robot {

    public Polluter(World m)
    {
        super(m);
    }
    public Polluter(int x, int y, World m) 
    {
        super(x, y, m); // appelle le constructeur de Robot
    }
    public void pollute() 
    {
        m.putsGreasyPaper(posx, posy); // dépose un papier gras sur la case actuelle
    }
}
