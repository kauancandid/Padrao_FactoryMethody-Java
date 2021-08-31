package Classes;

public class EmbalagemR extends Fabrica{

    @Override
    public Distribuidora emitirNota(String nome, float volume) {
        return new DRefrigerante(nome, volume);
    }


}
