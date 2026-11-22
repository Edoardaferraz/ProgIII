import java.util.ArrayList;
import java.util.Iterator;

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(104, "Tainá", 1850.00));
        contas.add(new ContaBancaria(208, "Doarda", 3120.40));
        contas.add(new ContaBancaria(315, "Vitor", 940.60));

        double saldoTotal = 0;

        Iterator<ContaBancaria> it = contas.iterator();
        while (it.hasNext()) {
            ContaBancaria conta = it.next();
            System.out.println("numero: " + conta.numero + " e titular: " + conta.titular);
            saldoTotal += conta.saldo;
        }

        System.out.printf("%nSaldo total acumulado no banco: R$ %.2f%n", saldoTotal);
    }
}