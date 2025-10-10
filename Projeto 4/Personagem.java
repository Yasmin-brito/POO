import java.util.ArrayList;

public abstract class Personagem {
    protected String nome;
    protected float dinheiro;
    protected int ataque;
    protected int defesa;
    protected int magia;
    protected int velocidade;
    protected String arma;
    protected String equipamento;
    protected ArrayList<Item> mochila;

    public Personagem(String nome, float dinheiro, int ataque, int defesa, int magia, int velocidade){
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.velocidade = velocidade;
        this.arma = null;
        this.equipamento = null;
        this.mochila = new ArrayList<>();
    }

    public void exibirFicha(){
        System.out.println("\nNome do Personagem: "+this.nome+"\nQtd de dinheiro: "+this.dinheiro+"\nAtributos: atq: "+this.ataque+", defesa: "+this.defesa+", magia: "+this.magia+", velocidade: "+this.velocidade+"\nEquipamento em utilizacao: "+this.equipamento+"\nArma em utilizacao: "+this.arma+"\n");
        System.out.print("Itens da mochila: ");
        int cont = 0;
        for(Item I : mochila){
            System.out.print(I.getNome());
            cont ++;
            if (cont < mochila.size()) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\n");
    }
    public void adicionarMochila(Item x){
        this.mochila.add(x);
    }
    public abstract boolean equiparItem(Item x);

    public boolean pagar(Item x){
        if (this.dinheiro >= x.getPreco()) {
            this.dinheiro = this.dinheiro - x.getPreco();
            return true;
        }
        return false;
    }
    public Item buscarItemMochila(String nome){
        for(Item item : mochila){
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }
    public Item vender(Item x){
        this.mochila.remove(x);
        this.dinheiro += x.getPreco()/2;
        return x;
    }
    
}
