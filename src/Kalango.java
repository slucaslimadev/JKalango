public class Kalango extends Personagem {
    public Kalango(int energiaInicial){
        super(energiaInicial);
    }

    @Override
    public void mover(){
        this.energia -= 3;
        System.out.println("Rastejando ...");
        System.out.println("o Kalango está se movendo! Energia atual: " + this.energia);
    }    

    @Override
    public void fazerSom(){
        System.out.println("Tssss!");
    }    

}
