public abstract class Item {
    private String nome;
    private float preco;
    private String tipo;

    public Item(String nome, float preco, String tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public void exibirInfor(){
        System.out.println("Item: "+this.nome+", preco: "+this.preco+", tipo: "+this.tipo+".\n");
    }
    public String getNome(){
        return this.nome;
    }
    public float getPreco(){
        return this.preco;
    }
    public String getTipo(){
        return this.tipo;
    }
    public abstract void usar();
}