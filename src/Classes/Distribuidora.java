package Classes;

public abstract class Distribuidora {

    String nome;
    float volume;

    public Distribuidora(String nome, float volume) {
        this.nome = nome;
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    void notinha(){
        System.out.println("CCUPOM FISCAL: \n"+
                "Tipo: " + this.nome + "\n"+
                "Volume: " + this.volume + "\n"
        );
    }
}