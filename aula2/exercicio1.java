class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println("modelo: " + modelo);
        System.out.println("marca: " + marca);
        System.out.println("ano: " + ano);
    }
}

public class exercicio1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Mercedes";
        carro1.modelo = "Mercedes-BENZ W225";
        carro1.ano = 1937;

        Carro carro2 = new Carro();
        carro2.marca = "Ferrari";
        carro2.modelo = "Ferrari 250 LM";
        carro2.ano = 1963;

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}