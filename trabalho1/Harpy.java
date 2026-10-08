public class Harpy extends Animal {

    public Harpy(String nome, int idade) {
        super(nome, "Harpy", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Harpy) ela grita: FESTA EM IPANEMA MEU AMOOOOR 🕊️");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está se alimentando de MAMACOS.");
    }
}