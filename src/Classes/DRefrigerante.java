package Classes;

public class DRefrigerante extends Distribuidora{

    public DRefrigerante(String nome, float volume) {
        super(nome, volume);
    }

    public void tickted() {
        System.out.println("CUPOM FISCAL: \n"+
                "Nome: " + this.nome + "\n"+
                "Volume: " + this.volume
        );
    }
}