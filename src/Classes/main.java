package Classes;

public class main {
    public static void main(String[]args){

        Fabrica embalagemC = new EmbalagemC();
        Fabrica embalagemR = new EmbalagemR();

        Distribuidora DCerveja =
                embalagemC.emitirNota("Jack Daniels de Maçã verde", 100000);

        Distribuidora DRefrigerante =
                embalagemR.emitirNota("Dolinho", 3000);

        DCerveja.notinha();
        DRefrigerante.notinha();

    }
}
