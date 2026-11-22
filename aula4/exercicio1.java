abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 1.00;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;

        if (valor > 0 && valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Retirada de R$" + valor + " concluída (taxa de R$1,00 descontada).");
        } else {
            System.out.println("Retirada de R$" + valor + " negada: saldo insuficiente para valor + taxa.");
        }
    }
}

class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada de R$" + valor + " concluída (sem taxa).");
        } else {
            System.out.println("Retirada de R$" + valor + " negada: saldo insuficiente.");
        }
    }
}

public class exercicio1 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Rafael", 120.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Camila", 120.0);

        System.out.println("=== Depósitos ===");
        contaCorrente.depositar(80.0);
        contaPoupanca.depositar(80.0);
        System.out.println("Depósito de R$80,00 aplicado nas duas contas.");

        System.out.println("\n=== Saques válidos ===");
        contaCorrente.sacar(45.0);
        contaPoupanca.sacar(45.0);

        System.out.println("\n=== Tentativas de saque sem saldo ===");
        contaCorrente.sacar(300.0);
        contaPoupanca.sacar(300.0);

        System.out.println("\n=== Saldos finais ===");
        System.out.println("Conta Corrente (" + contaCorrente.getTitular() + "): R$" + contaCorrente.getSaldo());
        System.out.println("Conta Poupança (" + contaPoupanca.getTitular() + "): R$" + contaPoupanca.getSaldo());
    }
}