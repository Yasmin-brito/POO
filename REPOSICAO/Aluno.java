import java.util.ArrayList;

public class Aluno extends Usuario {
    private ArrayList<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, int matricula) {
        super(nome, matricula, 0);
        disciplinasMatriculadas = new ArrayList<>();
    }

    @Override
    public void exibirInfor() {
        super.exibirInfor();
        System.out.println("Disciplinas Matriculadas:");
        for (Disciplina disciplina : disciplinasMatriculadas) {
            disciplina.exibirDetalhes();
            System.out.println("-----------------------");
        }
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    public int calcularCargaHorariaTotal() {
        int cargaHorariaTotal = 0;
        for (Disciplina disciplina : disciplinasMatriculadas) {
            cargaHorariaTotal += disciplina.getCargaHoraria();
        }
        return cargaHorariaTotal;
    }
}