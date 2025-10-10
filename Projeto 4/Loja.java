import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Item> produtos;

    public Loja(String nome){
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public void listarProdutos(){
        for(Item I : produtos){
            I.exibirInfor();
            System.out.println("\n---------------------------------------------\n");
        }
        // System.out.println("\n");
    }
    public void adicionarProduto(Item novo){
        this.produtos.add(novo);
    }
    public Item comprar (String nome){
        for(Item I : produtos){
            if (I.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(I);
                return I;
            }
        }
        return null;
    }
    public String getNome(){
        return this.nome;
    }
}
