public abstract class Personagem {
    protected int energia;
    protected String nome;



    public Personagem(int energiaInicial){
        this.energia = energiaInicial;
    }

    public Personagem(String nome){
        this.nome = nome;
    }
    public abstract void  mover();
    public abstract void fazerSom();


    public void dormir(){
        this.energia += 10;
        System.out.println("O personagem está dormindo!\nRecuperou 10 pontos de energia.\nEnergia Atual: "+ this.energia);
    }
    public void comer(){
        this.energia += 0;
    }
    


}
