import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Guerreiro y = new Guerreiro("Yasmin", 1000f, 20, 0, 10, 0);
        Loja loja = new Loja("Loja Dora Aventureira");

        loja.adicionarProduto(new Consumivel("Pocao de Vida", 10, "Consumivel", 3));
        loja.adicionarProduto(new Arma("Faca alongada", 50f, "Espada", 5, 2, 0, 1, 12, "Perfurante"));
        loja.adicionarProduto(new Armadura("Peitoral de ferro", 750f, "Armadura", 0, 20, 0, 0, 40));
        loja.adicionarProduto(new Arma("Cajado de Noe", 1000f, "Cajado", 30, 0, 60, 0, 30, "Reparticao"));
        loja.adicionarProduto(new Equipamento("Pergaminho de fogo", 450f, "Pergaminho", 0, 0, 30, 25));

        while (true) {
            System.out.println("\n--- Bem vindo a "+loja.getNome()+"---\n");
            System.out.println("--- MENU ---\n");
            System.out.println("1. Comprar");
            System.out.println("2. Ficha Personagem");
            System.out.println("3. Equipar item");
            System.out.println("4. Consumir um item");
            System.out.println("5. Vender um item");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nItens disponiveis na loja:\n");
                    loja.listarProdutos();
                    System.out.print("Digite o nome do item que deseja comprar: ");
                    String nomeItem = sc.nextLine();
                    Item itemEscolhido = loja.comprar(nomeItem);

                    if (itemEscolhido == null) {
                        System.out.println("\nItem nao encontrado ou ja vendido.");
                    } else if (!y.pagar(itemEscolhido)) {
                        System.out.println("\nDinheiro insuficiente para comprar este item.");
                        loja.adicionarProduto(itemEscolhido);
                    } else {
                        System.out.println("\nItem comprado: " + itemEscolhido.getNome());
                        y.adicionarMochila(itemEscolhido); 
                    }
                    break;
                case 2:
                    y.exibirFicha();
                    break;
                case 3:
                    System.out.println("\nQual item deseja equipar?");
                    String item = sc.nextLine();
                    Item itemEquipar = y.buscarItemMochila(item);
                    if (itemEquipar == null) {
                        System.out.println("\nItem nao encontrado na mochila.\n");
                    }else{
                        if (y.equiparItem(itemEquipar)) {
                            System.out.println("\nItem equipado!\n");
                        }else{
                            System.out.println("\nSeu personagem nao pode equipar esse item\n");
                        }        
                    }
                    break;
                case 4:
                    System.out.println("\nQual item você deseja consumir? ");
                    String itemConsumivel = sc.nextLine();
                    Item itemConsumir = y.buscarItemMochila(itemConsumivel);
                    if (itemConsumir == null) {
                        System.out.println("\nItem nao encontrado na mochila.\n");
                    } else if (itemConsumir instanceof Consumivel) {
                        itemConsumir.usar();
                    } else {
                        System.out.println("\nO item selecionado nao é consumivel.\n");
                    }
                    break;
                case 5:
                    System.out.println("\nQual item você deseja vender?");
                    String itemvender = sc.nextLine();
                    Item itemvendido = y.buscarItemMochila(itemvender);
                    if (itemvendido == null) {
                        System.out.println("\nItem equipado não pode ser vendido!");
                    }else {
                        loja.adicionarProduto(y.vender(itemvendido));
                        System.out.println("\nItem vendido!");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("\nOpcao invalida!");
            }
        }
    }
}
