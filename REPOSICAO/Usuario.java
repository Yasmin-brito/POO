public class Usuario {
    private String nome;
    private int matricula;
    private int cargaHorariaTotal;
    private static int numeroDeCadastros = 0;

    public Usuario(String nome, int matricula, int cargaHorariaTotal) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHorariaTotal = cargaHorariaTotal;
        numeroDeCadastros++;
    }
    public void exibirInfor() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carga Horária Total: " + cargaHorariaTotal + " horas");
    }

    public int getNumeroDeCadastros() {
        return numeroDeCadastros;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }
}