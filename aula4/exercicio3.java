interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

interface Ciclista {
    void pedalar();
}

class Triatleta implements Corredor, Nadador, Ciclista {
    private String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo na pista.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando na piscina.");
    }

    @Override
    public void pedalar() {
        System.out.println(nome + " está pedalando na estrada.");
    }

    public void mostrarModalidades() {
        System.out.println("Modalidades de " + nome + ": corrida, natação e ciclismo.");
    }
}

public class exercicio3 {
    public static void main(String[] args) {
        Triatleta triatletaA = new Triatleta("Mateus");
        Triatleta triatletaB = new Triatleta("Juliana");

        System.out.println("=== Treino do Atleta 1 ===");
        triatletaA.mostrarModalidades();
        triatletaA.correr();
        triatletaA.nadar();
        triatletaA.pedalar();

        System.out.println("\n=== Treino do Atleta 2 ===");
        triatletaB.mostrarModalidades();
        triatletaB.correr();
        triatletaB.nadar();
        triatletaB.pedalar();
    }
}