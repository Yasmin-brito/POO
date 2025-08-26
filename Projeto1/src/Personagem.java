public class Personagem {
    String nome;
    Job job;
    int hpMax;
    int hp;
    int nivel;
    Skill skill;


    Personagem(String nome, int HP, Job job, Skill skill){
        this.nome = nome;
        this.hpMax = this.hp = HP + job.vigor;
        this.nivel = 1;
        this.job = job;
        this.skill = skill;

    }
    void exibirInfo(){
        System.out.println("Personagem: " +nome);
        System.out.println("Classe: " +job.nome +" Nv " + nivel);
        System.out.println("HP: " +hp+"/"+hpMax);
        System.out.println("Ataque " + job.ataque);
        System.out.println("Defesa " + job.defesa);
        System.out.println("Vigor: " + job.vigor);
        System.out.println("Fraqueza " + job.fraqueza);
        System.out.println("Skill " + skill.tipo + " (" + "Base " + skill.danoBase + ", Tipo " + skill.tipo + ", reduz defesa em "
                + skill.efeitoDefesa + "%, " + "Cura: "+ skill.efeitoCura + ", Furia "+ skill.efeitoFuria+ ")"+"\n");
    }
    public void receberDano(int n){
        hp = hp - n;
        if(hp <= 0){
            System.out.println("O personagem "+nome+" morreu\n");
            hp = 0;
        }
    }
    public void subir_nivel(int n){
        nivel = nivel+n;
        hpMax += n*5;
        job.mais_nivel(n);
    }
    public void atacar (Personagem atacante,Personagem inimigo){
        int dano = skill.calcularDano(atacante, inimigo);
        inimigo.receberDano(dano);
    }
}
