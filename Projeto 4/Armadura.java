public class Armadura extends Equipamento {
    private int protecao;

    public Armadura(String nome, float preco, String tipo, int ataque, int defesa, int magia, int velocidade, int protecao){
        super(nome, preco, tipo, ataque, defesa, magia, velocidade);
        this.protecao = protecao;
    }

    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("Protecao: "+this.protecao);
    }
    public int getProtecao(){
        return this.protecao;
    }
}
