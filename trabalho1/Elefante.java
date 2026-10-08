public class Elefante extends Animal {

    public Elefante(String nome, int idade) {
        super(nome, "Elefante", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Elefante) trombeta: PHHOOOO! 🐘");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo capim, folhas e frutas.");
    }
}