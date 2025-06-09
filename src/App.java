public class App {
    public static void main(String[] args) throws Exception {

        // Formiga
        System.err.println("==== FORMIGA ====");
        Formiga f = new Formiga(10);
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.dormir();

        // Abelinha
        System.err.println("==== ABELINHA ====");
        Abelinha a = new Abelinha(10);
        a.mover();
        a.mover();
        a.mover();
        a.fazerSom();
        a.dormir();

        //Kalango
        System.err.println("==== KALANGO ====");
        Kalango k = new Kalango(10);
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.dormir();

    }
}
