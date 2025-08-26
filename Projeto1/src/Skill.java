public class Skill {
    int danoBase;
    String tipo;
    int efeitoDefesa;
    int efeitoCura;
    int efeitoFuria;

    Skill (int danoBase, String tipo, int efeitoDefesa, int efeitoCura, int efeitoFuria){
        this.danoBase = danoBase;
        this.tipo = tipo;
        this.efeitoDefesa = efeitoDefesa;
        this.efeitoCura = efeitoCura;
        this.efeitoFuria = efeitoFuria;
    }

    public int calcularDano (Personagem atacante, Personagem alvo){
        if(efeitoDefesa > 0){
             alvo.job.defesa = alvo.job.defesa - (alvo.job.defesa * alvo.skill.efeitoDefesa /100);
        }
        double dano = danoBase + (1.2 * atacante.job.ataque)- alvo.job.defesa;

        if(dano < 0){
            dano = 0;
        }
        if(alvo.job.fraqueza.equals(tipo)){
            dano *= 1.5;
        }
        if(efeitoFuria > 0 && atacante.hp < efeitoFuria){
            dano *= 2;
        }
        if(efeitoCura > 0){
            alvo.hp += efeitoCura;
            if (alvo.hp > alvo.hpMax){
                alvo.hp = alvo.hpMax;
            }
        }
        return (int) Math.round(dano);
    }
}
