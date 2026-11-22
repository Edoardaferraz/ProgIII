import java.util.Arrays;
import java.util.Objects;

class Produto implements Comparable<Produto> {
    protected String nome;
    protected double preco;
    protected String codigoBarras;

    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco + " | Cód. Barras: " + codigoBarras;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Produto)) {
            return false;
        }
        Produto outroProduto = (Produto) obj;
        return Objects.equals(this.codigoBarras, outroProduto.codigoBarras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoBarras);
    }

    // Para ordenar por NOME, use:
    // return this.nome.compareToIgnoreCase(outro.nome);
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }
}

class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}

class CD extends Produto {
    private int numFaixas;

    public CD(String nome, double preco, int numFaixas, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.numFaixas = numFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Faixas: " + numFaixas;
    }
}

class DVD extends Produto {
    private int duracaoMinutos;

    public DVD(String nome, double preco, int duracaoMinutos, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + duracaoMinutos + " min";
    }
}

public class Loja {

    public static int buscarProduto(Produto alvo, Produto[] catalogo) {
        for (int idx = 0; idx < catalogo.length; idx++) {
            if (catalogo[idx] != null && catalogo[idx].equals(alvo)) {
                return idx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Produto[] catalogo = new Produto[5];

        catalogo[0] = new Livro("Capitães da Areia", 48.0, "Jorge Amado", "7891011");
        catalogo[1] = new Livro("O Cortiço", 44.5, "Aluísio Azevedo", "7891012");
        catalogo[2] = new CD("Acústico MTV", 34.9, 16, "7891013");
        catalogo[3] = new DVD("O Auto da Compadecida", 27.9, 104, "7891014");
        catalogo[4] = new DVD("Central do Brasil", 32.0, 113, "7891015");

        System.out.println("=== Catálogo da Loja ===");
        for (Produto item : catalogo) {
            System.out.println(item);
        }

        Produto copiaMesmoCodigo = new Livro("O Cortiço", 44.5, "Aluísio Azevedo", "7891012");
        Produto copiaCodigoDiferente = new Livro("O Cortiço", 44.5, "Aluísio Azevedo", "0000000");

        System.out.println("\n--- Busca com mesmo código de barras ---");
        int posIgual = buscarProduto(copiaMesmoCodigo, catalogo);
        if (posIgual != -1) {
            System.out.println("Encontrado na posição " + posIgual + " do vetor.");
        } else {
            System.out.println("Não encontrado no vetor.");
        }

        System.out.println("\n--- Busca com código de barras diferente ---");
        int posDiferente = buscarProduto(copiaCodigoDiferente, catalogo);
        if (posDiferente != -1) {
            System.out.println("Encontrado na posição " + posDiferente + " do vetor.");
        } else {
            System.out.println("Não encontrado no vetor.");
        }

        Arrays.sort(catalogo);

        System.out.println("\n=== Catálogo Ordenado ===");
        for (Produto item : catalogo) {
            System.out.println(item);
        }
    }
}