import java.util.ArrayList;

public class Professor extends Usuario {
    private ArrayList<Disciplina> disciplinasMinistradas;

    Professor(String nome, int matricula, int cargaHorariaTotal) {
        super(nome, matricula, cargaHorariaTotal);
        disciplinasMinistradas = new ArrayList<>();
    }

    @Override
    public void exibirInfor() {
        super.exibirInfor();
        System.out.println("Disciplinas Ministradas:");
        for (Disciplina disciplina : disciplinasMinistradas) {
            disciplina.exibirDetalhes();
            System.out.println("-----------------------");
        }
        int cargaDisciplinas = calcularCargaDisciplinas();
        if(cargaDisciplinas < getCargaHorariaTotal()){
            System.out.println("Carga horaria com disciplinas:" + cargaDisciplinas);
            System.out.println("Total de horas para outras atividades:"+ (getCargaHorariaTotal() - cargaDisciplinas) );
        }
    }

    public boolean abrirDisciplina(Disciplina disciplina) {
        int somaCarga = calcularCargaDisciplinas();
       
        if(getCargaHorariaTotal() - (somaCarga + disciplina.getCargaHoraria()) < 0){
            System.out.println("Carga horária excedida. Não é possível abrir mais disciplinas.");
            return false;
        }
        disciplinasMinistradas.add(disciplina);
        return true;
    }

    private int calcularCargaDisciplinas(){
        int somaCarga = 0;
        for(Disciplina d: disciplinasMinistradas) {
            somaCarga += d.getCargaHoraria();
        }
        return somaCarga;
    }
}