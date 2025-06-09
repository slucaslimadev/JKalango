public abstract class Personagem {
    protected int energia;



    public Personagem(int energiaInicial){
        this.energia = energiaInicial;
    }

    
    public abstract void  mover();
    public abstract void fazerSom();


    public void dormir(){
        this.energia += 10;
        System.out.println("O personagem está dormindo! Recuperou 10 pontos de energia.\n Energia Atual: "+ this.energia);

    }
    


}
