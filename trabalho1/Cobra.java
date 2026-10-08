public class Cobra extends Animal {

    public Cobra(String nome, int idade) {
        super(nome, "Cobra", idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (Cobra) ela fala no seu ouvido: Sou Jorgina Calarrara, a cascavel do Piauí! 💋🐍");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está se alimentando de pequenos roedores.");
    }
}