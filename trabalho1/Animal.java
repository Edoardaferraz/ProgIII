public abstract class Animal {
    protected String nome;
    protected String especie;
    protected int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    // aqui é a regra: todo bicho filho é obrigado a implementar isso aqui
    public abstract void emitirSom();
    public abstract void alimentar();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Espécie: " + especie + " | Idade: " + idade + " anos");
    }
}