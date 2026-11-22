enum NivelAtleta {
    NOVATO,
    AMADOR,
    PROFISSIONAL
}

interface Corredor {
    void correr();
}

interface Nadador {
    void nadar();
}

interface Ciclista {
    void pedalar();
}

abstract class Atleta {
    protected String nome;
    protected int idade;
    protected NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do atleta não pode ser vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do atleta não pode ser negativa.");
        }
        this.nome = nome.trim();
        this.idade = idade;
        this.nivel = nivel;
    }

    public abstract void exibirModalidades();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public NivelAtleta getNivel() {
        return nivel;
    }
}

class CorredorProfissional extends Atleta implements Corredor {

    public CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo na pista.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " atua na modalidade: corrida.");
    }
}

class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando na piscina.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " atua na modalidade: natação.");
    }
}

class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo no percurso.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando em águas abertas.");
    }

    @Override
    public void pedalar() {
        System.out.println(nome + " está pedalando na estrada.");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " atua nas modalidades: corrida, natação e ciclismo.");
    }
}

public class exercicio7 {
    public static void main(String[] args) {
        Atleta[] elenco = new Atleta[4];
        elenco[0] = new CorredorProfissional("Gabriel", 27, NivelAtleta.PROFISSIONAL);
        elenco[1] = new NadadorProfissional("Sofia", 21, NivelAtleta.AMADOR);
        elenco[2] = new Triatleta("Helena", 29, NivelAtleta.PROFISSIONAL);
        elenco[3] = new CorredorProfissional("Thiago", 18, NivelAtleta.NOVATO);

        System.out.println("=== Atletas Cadastrados na Plataforma ===");
        for (Atleta atleta : elenco) {
            System.out.println("Atleta: " + atleta.getNome() + " | Idade: " + atleta.getIdade() + " | Nível: " + atleta.getNivel());
            atleta.exibirModalidades();
        }

        System.out.println("\n=== Executando modalidades via referências de interface ===");
        Atleta triatletaReferencia = elenco[2];

        if (triatletaReferencia instanceof Corredor) {
            Corredor corredor = (Corredor) triatletaReferencia;
            corredor.correr();
        }
        if (triatletaReferencia instanceof Nadador) {
            Nadador nadador = (Nadador) triatletaReferencia;
            nadador.nadar();
        }
        if (triatletaReferencia instanceof Ciclista) {
            Ciclista ciclista = (Ciclista) triatletaReferencia;
            ciclista.pedalar();
        }
    }
}