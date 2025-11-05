
public class TestWorld {
    public static void main(String[] args) {
        World aWorld = new World(); 
        
        aWorld.putsGreasyPaper(2,5);
        aWorld.putsGreasyPaper(4,1);
        aWorld.putsGreasyPaper(1, 3);
        System.out.println(aWorld);
        aWorld.removesGreasyPaper(2, 5);
        System.out.println(aWorld);
        boolean b = aWorld.isDirty(2, 3);
        System.err.println(b);
        b = aWorld.isDirty(1, 3);
        System.err.println(b);
        int nb= aWorld.nbGreasyPapers();
        System.out.println(nb);

        
    }
}
