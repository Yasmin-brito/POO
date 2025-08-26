public class Main {
    public static void main(String[] args) {
        Job Mago = new Job("Mago", 15, 20, 5, "Gelo");
        Job Arqueiro = new Job("Arqueiro", 30, 10, 10, "Vento");
        Job Guerreiro = new Job("Guerreiro", 50, 20, 15, "Fogo");
        Job Elfo = new Job("Elfo", 20, 10, 30, "Luz");

        Skill bolaDeFogo = new Skill(15, "Fogo", 20,0, 0);
        Skill espadaSagrada = new Skill(25, "Luz", 0, 15, 40);

        Personagem P = new Personagem("Yasmin", 100, Mago, bolaDeFogo);
        P.exibirInfo();


        Personagem P2 = new Personagem("Edson", 100, Guerreiro, espadaSagrada);
        P2.exibirInfo();

        System.out.println("Simulacao de ataque:\n");

        P.atacar(P,P2);
        System.out.println("-- " +P.nome+ " ataca "+ P2.nome + ": dano = ("+ P.skill.danoBase + " + 1.2 * " +
                P.job.ataque + " - " + P2.job.defesa + ") * 1.5 = " );
        System.out.println("Defesa de " + P2.nome + " fica em " + P2.job.defesa + ", vida fica em " +  P2.hp + " e cura: " + P2.skill.efeitoCura + "\n");

        P2.atacar(P2, P);
        System.out.println("-- " +P2.nome+ " ataca "+ P.nome + ": dano = ("+ P2.skill.danoBase + " + 1.2 * " +
                P2.job.ataque + " - " + P.job.defesa + ") * 1.5 = " );
        System.out.println("Defesa de " + P.nome + " fica em: " + P.job.defesa + ", vida fica em " + P.hp + " e cura: " + P.skill.efeitoCura + "\n");
    }
}