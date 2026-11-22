import java.util.Objects;

class ContaBancaria {
    private int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "ContaBancaria [numero=" + numero + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContaBancaria outraConta = (ContaBancaria) obj;
        return numero == outraConta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        ContaBancaria cA = new ContaBancaria(4050);
        ContaBancaria cB = new ContaBancaria(4050);
        ContaBancaria cC = new ContaBancaria(8090);

        System.out.println("cA.equals(cB) [mesmo número]: " + cA.equals(cB));
        System.out.println("cA.equals(cC) [número diferente]: " + cA.equals(cC));
        System.out.println("\nSaída direta via toString():");
        System.out.println(cA);
        System.out.println(cB);
        System.out.println(cC);
    }
}