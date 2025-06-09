public class Abelinha extends Personagem{
    public Abelinha(int energiaInicial){
        super(energiaInicial);
    }

    @Override
    public void mover() {
        this.energia -= 2;
        System.out.println("Anda 360 graus");
        System.out.println("A Abelinha está se movendo! Energia atual: " + this.energia);
    }
    @Override
    public void fazerSom(){
        System.out.println("Bzzzz!");
    }

}
