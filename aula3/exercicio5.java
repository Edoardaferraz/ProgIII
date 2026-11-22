class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}

public class exercicio5 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int somaTresInteiros = calc.somar(4, 9, 12);
        int somaDoisInteiros = calc.somar(18, 27);
        double somaDoisDoubles = calc.somar(6.4, 8.2);

        System.out.println("Resultado de dois inteiros (18 + 27): " + somaDoisInteiros);
        System.out.println("Resultado de dois doubles (6.4 + 8.2): " + somaDoisDoubles);
        System.out.println("Resultado de três inteiros (4 + 9 + 12): " + somaTresInteiros);
    }
}