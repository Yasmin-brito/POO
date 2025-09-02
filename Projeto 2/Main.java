// import java.util.Objects;
// import java.util.Scanner;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Treinador T1 = new Treinador("Yasmin", 20);

        while(true){
            System.out.println("\n---MENU---");
            System.out.println("1. Mostrar dados do treinador");
            System.out.println("2. Adicionar Pokemon");
            System.out.println("3. Retirar Pokemons");
            System.out.println("4. Ganhar medalha");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opcao: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    T1.exibirInforPersonagem();
                    break;
                case 2:
                    System.out.print("Nome do Pokemon: ");
                    String especie = sc.nextLine();
                    System.out.print("Tipo do Pokémon: ");
                    String tipo = sc.nextLine();
                    System.out.print("Nível do Pokémon: ");
                    int nivel = sc.nextInt();
                    sc.nextLine();
                    Pokemon novo = new Pokemon(especie, tipo, nivel);
                    T1.adicionarPokemon(novo);
                    System.out.println("Pokemon adicionado!");
                    break;
                case 3:
                    System.out.print("Nome do Pokémon para retirar: ");
                    String nomeRetirar = sc.nextLine();

                    if(T1.retirarPokemon(nomeRetirar)){
                        System.out.println("Pokémon removido!");
                    } else {
                        System.out.println("Pokémon não encontrado na equipe.");
                    }
                    break;
                case 4:
                    System.out.print("Nome da medalha: ");
                    String medalha = sc.nextLine();
                    T1.adicionarMedalhas(medalha);
                    System.out.println("Medalha adicionada!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        }
    }
}