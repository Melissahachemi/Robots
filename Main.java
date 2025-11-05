public class Main
{
        public static void main(String[] args)
        {
            World w = new World(5, 5);
        Straighter s = new Straighter(0, w); 
            System.out.println("Avant visite :");
        System.out.println(w);

        s.visit();

        System.out.println("Après visite :");
        System.out.println(w);
        }
}
