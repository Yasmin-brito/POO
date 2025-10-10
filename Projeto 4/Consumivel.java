public class Consumivel extends Item {
    private int doses;

    public Consumivel(String nome, int preco, String tipo, int doses){
        super(nome, preco, tipo);
        this.doses = doses;
    }

    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("Quantidade de dose disponivel: "+this.doses);
    }
    @Override
    public void usar(){
        if (this.doses <= 0) {
            System.out.println("Nao ha mais doses disponiveis");
            this.doses = 0;
        }
        else{
            this.doses --;
            System.out.println("Você utilizou o "+super.getNome()+". Doses restantes: "+this.doses+"\n");
        }
    }
}
