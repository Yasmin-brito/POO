import java.lang.reflect.Array;
import java.util.ArrayList;

public class Treinador {
    private String nome;
    private int idade;
    private ArrayList<String> medalhas;
    private ArrayList<Pokemon> equipe;

    Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.medalhas = new ArrayList<>();
        this.equipe = new ArrayList<>();

    }

    public void exibirInforPersonagem() {
        System.out.println("Nome do personagem: " + this.nome + "\nIdade: " + this.idade +
                "\nMedalhas: " + exibirMedalhas());

        System.out.println("Pokemons");

        for (Pokemon x : this.equipe) {
            x.exibirInforPokemon();
        }
    }

    private String exibirMedalhas() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < this.medalhas.size() - 1; i++) {
            s.append(this.medalhas.get(i));
            s.append(", ");
        }
        if (this.medalhas.size() > 0) {
            s.append(this.medalhas.get(this.medalhas.size() - 1));
        }
        return s.toString();
    }

    public void adicionarPokemon(Pokemon x) {
        if (this.equipe.size() < 6) {
            this.equipe.add(x);
        }
    }

    public boolean retirarPokemon(String nomePokemon) {
        Pokemon remover = null;
        for (Pokemon p : this.equipe) {
            if (p.especie.equalsIgnoreCase(nomePokemon)) {
                remover = p;
            }
        }
        if (remover != null) {
            this.equipe.remove(remover);
            return true;
        } else {
            return false;
        }
    }

    public void adicionarMedalhas(String nomeMedalha) {
        if (this.medalhas.size() < 8) {
            this.medalhas.add(nomeMedalha);
        }
    }
}
