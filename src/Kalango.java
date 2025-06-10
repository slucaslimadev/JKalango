public class Kalango extends Personagem {
    public Kalango(int energiaInicial, String nome){
        super(energiaInicial);
        System.out.println("Nome Personagem: "+nome);
    }

    @Override
    public void mover(){

        this.energia -= 3;
        System.out.println("o Kalango está se movendo!\nEnergia: -3\nEnergia atual: " + this.energia);
        if(this.energia < 5){
            System.out.println("Personagem está cansado!");
        }

    }    

    @Override
    public void fazerSom(){
        System.out.println("Tssss!");
    }    

    @Override
    public void comer(){
        this.energia += 3;
        System.out.println("O personagem está comendo!\nRecuperando: 3 de energia\nEnergia Atual: " + this.energia);
    }

}
