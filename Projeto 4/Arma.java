public class Arma extends Equipamento {
    private int dano;
    private String tipoDano;

    public Arma(String nome, float preco, String tipo, int ataque, int defesa, int magia, int velocidade, int dano, String tipoDano){
        super(nome, preco, tipo, ataque, defesa, magia, velocidade);
        this.dano = dano;
        this.tipoDano = tipoDano;
    }

    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("Dano: "+this.dano+", Tipo do Dano: "+this.tipoDano);
    }
    public int getDano(){
        return this.dano;
    }
    @Override
    public void usar(){
        System.out.println("Esse item não pode ser consumível");
    }
}
