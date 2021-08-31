package Classes;

public class EmbalagemC extends Fabrica{


    @Override
    public Distribuidora emitirNota(String nome, float volume) {
        return new DCerveja(nome, volume);

    }

}
