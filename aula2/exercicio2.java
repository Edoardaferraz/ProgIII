class Contador {
    static int totalObjetos = 0;

    Contador() {
        totalObjetos++;
    }

    static void mostrarTotal() {
        System.out.println("numero de objetos criados: " + totalObjetos);
    }
}

public class exercicio2 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        Contador.mostrarTotal();
    }
}