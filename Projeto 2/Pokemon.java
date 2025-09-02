
public class Pokemon {
    String especie;
    String tipo;
    int nivel;

    Pokemon(String especie, String tipo, int nivel){
        this.especie = especie;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public void exibirInforPokemon(){
        System.out.println("Especie: "+ especie + ", "
        + "Tipo: "+ tipo + ", "
        + "Nivel: " + nivel + "/100\n");
    }
}
