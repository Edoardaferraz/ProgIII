import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("fim do intervalo: ");
        int fim = scanner.nextInt();

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
            System.out.println("intervalo ajustado automaticamente para " + inicio + " até " + fim + ":");
        } else {
            System.out.println("intervalo será " + inicio + " e " + fim + ":");
        }

        for (int num = inicio; num <= fim; num++) {
            if (ehPrimo(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        scanner.close();
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}