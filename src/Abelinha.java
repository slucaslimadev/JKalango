public class Abelinha extends Personagem{
    public Abelinha(int energiaInicial, String nome){
        super(energiaInicial);
        System.out.println("Nome Personagem: "+nome);
    }

    @Override
    public void mover() {
        this.energia -= 2;
        System.out.println("A Abelinha está se movendo!\nEnergia: -2\nEnergia atual: " + this.energia);
        if(this.energia < 5){
            System.out.println("Personagem está cansado!");
        }
    }
    @Override
    public void fazerSom(){
        System.out.println("Bzzzz!");
    }

    @Override
    public void comer(){
        this.energia += 2;
        System.out.println("O personagem está comendo!\nRecuperando: 2 de energia\nEnergia Atual: " + this.energia);
    }


}
