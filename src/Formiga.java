public class Formiga extends Personagem{
    public Formiga(int energiaInicial){
        super(energiaInicial);
    }

    @Override
    public void mover() {
        this.energia -= 1;
        System.out.println("Anda só para frente");
        System.out.println("A formiga está se movendo! Energia atual: " + this.energia);
        
    
    }
    @Override
    public void fazerSom() {
        System.out.println("Fzzzz!");
        
    
    }


}
