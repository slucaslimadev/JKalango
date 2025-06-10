public class Formiga extends Personagem{
    public Formiga(int energiaInicial, String nome){
        super(energiaInicial);
        System.out.println("Nome Personagem: "+nome);
    }

    @Override
    public void mover() {
        this.energia -= 1;
        System.out.println("A formiga está se movendo!\nEnergia: -1\nEnergia atual: " + this.energia);
        if(this.energia < 5){
            System.out.println("Personagem está cansado!");
        }
        
    
    }
    @Override
    public void fazerSom() {
        System.out.println("Fzzzz!");
        
    
    }

    @Override
    public void comer(){
        this.energia += 1;
        System.out.println("O personagem está comendo!\nRecuperando: 1 de energia\nEnergia Atual: " + this.energia);
    }


}
