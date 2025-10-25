public class Teste {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", 4, 1);
        Disciplina disciplina2 = new Disciplina("Física", 6, 1);
        Disciplina disciplina3 = new Disciplina("Química", 4, 2);
        Disciplina disciplina4 = new Disciplina("Biologia", 4, 2);
        Disciplina disciplina5 = new Disciplina("História", 4, 1);

        // Criando um aluno e matriculando em disciplinas
        Aluno aluno1 = new Aluno("João Silva", 12345);
        Aluno aluno2 = new Aluno("Ana Souza", 54321);
        Aluno aluno3 = new Aluno("Carlos Pereira", 11223);
        aluno1.matricularDisciplina(disciplina1);
        aluno1.matricularDisciplina(disciplina2);
        aluno1.matricularDisciplina(disciplina3);

        aluno2.matricularDisciplina(disciplina1);
        aluno2.matricularDisciplina(disciplina2);
        aluno2.matricularDisciplina(disciplina3);

        aluno3.matricularDisciplina(disciplina1);
        aluno3.matricularDisciplina(disciplina2);
        aluno3.matricularDisciplina(disciplina3);

        //chamando calculo de carga horaria total dos alunos
        aluno1.calcularCargaHorariaTotal();
        aluno2.calcularCargaHorariaTotal();
        aluno3.calcularCargaHorariaTotal();

        // esxibindo informações dos alunos
        System.out.println("Informações do Aluno 1:");
        aluno1.exibirInfor();
        System.out.println("-------------------------");

        System.out.println("Informações do Aluno 2:");
        aluno2.exibirInfor();
        System.out.println("-------------------------");

        System.out.println("Informações do Aluno 3:");
        aluno3.exibirInfor();
        System.out.println("-------------------------");

        // Criando um professor e abrindo disciplinas
        Professor professor = new Professor("Maria Oliveira", 67890, 40);
        professor.abrirDisciplina(disciplina1);
        professor.abrirDisciplina(disciplina3);
        professor.abrirDisciplina(disciplina4);
        professor.abrirDisciplina(disciplina5);
        System.out.println("Informações do Professor:");
        professor.exibirInfor();
        System.out.println("-------------------------");

        // Exibindo número total de cadastros
        System.out.println("Número total de cadastros: " + professor.getNumeroDeCadastros());
    }
}