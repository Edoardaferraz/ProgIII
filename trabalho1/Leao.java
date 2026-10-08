public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, "Leão", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Leão) ruge: RROOOAAAR! 🦁");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está comendo carne fresca.");
    }
}