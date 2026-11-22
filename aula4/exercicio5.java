enum StatusPedido {
    AGUARDANDO_PAGAMENTO,
    PAGO,
    ENVIADO,
    ENTREGUE,
    CANCELADO
}

class Pedido {
    private int numero;
    private double valor;
    private StatusPedido status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public void exibirMensagem() {
        System.out.print("Pedido #" + numero + " (R$ " + valor + ") -> ");

        switch (status) {
            case AGUARDANDO_PAGAMENTO:
                System.out.println("Pendente de confirmação de pagamento.");
                break;
            case PAGO:
                System.out.println("Pagamento aprovado; preparando separação.");
                break;
            case ENVIADO:
                System.out.println("Em rota de entrega com a transportadora.");
                break;
            case ENTREGUE:
                System.out.println("Entregue ao destinatário.");
                break;
            case CANCELADO:
                System.out.println("Pedido cancelado no sistema.");
                break;
        }
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        Pedido itemA = new Pedido(105, 195.0);

        Pedido itemB = new Pedido(208, 420.0);
        itemB.alterarStatus(StatusPedido.ENTREGUE);

        Pedido itemC = new Pedido(312, 95.0);
        itemC.alterarStatus(StatusPedido.CANCELADO);

        itemA.exibirMensagem();
        itemB.exibirMensagem();
        itemC.exibirMensagem();
    }
}