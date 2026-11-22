interface Pagamento {
    void processarPagamento(double valor);
    void cancelarPagamento();
}

class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Transação de R$" + valor + " aprovada no cartão de crédito.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Estorno do pagamento no cartão solicitado.");
    }
}

class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Transferência de R$" + valor + " confirmada via Pix.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Devolução via Pix acionada.");
    }
}

class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Cobrança de R$" + valor + " registrada por boleto bancário.");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boleto bancário cancelado no sistema.");
    }
}

public class exercicio4 {
    public static void main(String[] args) {
        Pagamento[] formasPagamento = new Pagamento[3];
        formasPagamento[0] = new PagamentoCartao();
        formasPagamento[1] = new PagamentoPix();
        formasPagamento[2] = new PagamentoBoleto();

        double quantia = 240.0;

        for (Pagamento metodo : formasPagamento) {
            metodo.processarPagamento(quantia);
            metodo.cancelarPagamento();
            System.out.println();
        }
    }
}