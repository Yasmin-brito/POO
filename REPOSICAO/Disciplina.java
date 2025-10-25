public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private int semestre;

    public Disciplina(String nome, int cargaHoraria, int semestre) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.semestre = semestre;
    }

    public void exibirDetalhes() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horaria: " + cargaHoraria + " horas");
        System.out.println("Semestre: " + semestre);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}