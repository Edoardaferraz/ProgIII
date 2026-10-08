public class Macaco extends Animal {

    public Macaco(String nome, int idade) {
        super(nome, "Macaco", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Macaco) grita: U-U-AA-AA! 🐒");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo bananas e nozes.");
    }
}