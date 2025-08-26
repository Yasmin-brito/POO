public class Job {
    String nome;
    int ataque;
    int defesa;
    int vigor;
    String fraqueza;

    Job(String nome, int ataque, int defesa, int vigor, String fraqueza){
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vigor = vigor;
        this.fraqueza = fraqueza;
    }
    void mais_nivel(int n){
        this.defesa += (n*10) -5;
        this.ataque += n*10;
        this.vigor += n*5;
    }
}
