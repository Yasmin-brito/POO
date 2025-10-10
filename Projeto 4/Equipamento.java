public class Equipamento extends Item {
    private int ataque;
    private int defesa;
    private int magia;
    private int velocidade;

    public Equipamento(String nome, float preco, String tipo, int ataque, int defesa, int magia, int velocidade){
        super(nome, preco, tipo);
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.velocidade = velocidade;
    }
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("Especificacoes:\nAtq: "+this.ataque+", Defesa: "+this.defesa+", Magia: "+this.magia+", Velocidade: "+this.velocidade+"\n");
    }
    public int getAtaque(){
        return this.ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public int getMagia(){
        return this.magia;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    @Override
    public void usar(){
        System.out.println("Esse item não pode ser consumivel");
    }
}
