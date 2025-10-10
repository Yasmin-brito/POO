
public class Mago extends Personagem {

    public Mago(String nome, float dinheiro, int ataque, int defesa, int magia, int velocidade){
        super(nome, dinheiro, ataque, defesa, magia, velocidade);
        
    }

    @Override
    public boolean equiparItem(Item x){
        if (x instanceof Equipamento) {
            if(!(x.getTipo().equalsIgnoreCase("Espada") || x.getTipo().equalsIgnoreCase("Armadura"))){
                if (x instanceof Arma) {
                    this.ataque += ((Arma)x).getAtaque();
                    this.defesa += ((Arma)x).getDefesa();
                    this.magia += ((Arma)x).getMagia();
                    this.velocidade += ((Arma)x).getVelocidade();
                    this.mochila.remove(x);
                    return true;
                } else{
                    this.ataque += ((Equipamento)x).getAtaque();
                    this.defesa += ((Equipamento)x).getDefesa();
                    this.magia += ((Equipamento)x).getMagia();
                    this.velocidade += ((Equipamento)x).getVelocidade();
                    this.mochila.remove(x);
                    return true;
                }
            }
        }
        return false;
    }
}
