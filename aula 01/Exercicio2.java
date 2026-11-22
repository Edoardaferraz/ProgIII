
public class Exercicio2 {
    public static void main(String[] args) {

        boolean peca_disponivel = true;
        boolean pagamento_confirmado = false;
        boolean pedido_enviado = true;

        System.out.println("Peça disponível: " + peca_disponivel);
        System.out.println("Pagamento confirmado? " + pagamento_confirmado);
        System.out.println("Pedido enviado: " + pedido_enviado);

        if (peca_disponivel) {
            System.out.println("A peça está disponível para compra!");
        } else {
            System.out.println("Essa peça está esgotada.");
        }

        if (pagamento_confirmado) {
            System.out.println("Pagamento aprovado!");
        } else {
            System.out.println("Aguardando confirmação do pagamento.");
        }

        if (pedido_enviado) {
            System.out.println("Seu pedido já foi enviado!");
        } else {
            System.out.println("Seu pedido ainda está sendo preparado.");
        }
    }
}
