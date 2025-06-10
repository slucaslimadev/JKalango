public class App {
    public static void main(String[] args) throws Exception {

        // Formiga
        System.out.println("================== FORMIGA ==================");
        Formiga f = new Formiga(10,"Formiga Bolada");
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.dormir();
        f.comer();
        

        // Abelinha
        System.out.println("================== ABELINHA ==================");
        Abelinha a = new Abelinha(10, "xXAbelinhaXx");
        a.mover();
        a.mover();
        a.mover();
        a.fazerSom();
        a.dormir();
        a.comer();
        

        //Kalango
        System.out.println("================== KALANGO ==================");
        Kalango k = new Kalango(10,"KalangoK2025");
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.dormir();
        k.comer();
        
        

    }
}
