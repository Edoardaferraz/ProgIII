import java.util.Scanner;

abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}

class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.10);
    }
}

class FuncionarioComissionado extends Funcionario {
    private double comissao;

    public FuncionarioComissionado(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor da comissão do funcionário comissionado: R$ ");
        double valorComissao = leitor.nextDouble();

        Funcionario colaboradorCLT = new FuncionarioCLT("Lucas", "CLT-101", 2400.0);
        Funcionario colaboradorComissionado = new FuncionarioComissionado("Beatriz", "COM-202", 1800.0, valorComissao);

        System.out.println("\n=== Folha de Pagamento ===");
        System.out.println(colaboradorCLT.getNome() + " (CLT) -> Salário total: R$ " + colaboradorCLT.calcularSalario());
        System.out.println(colaboradorComissionado.getNome() + " (Comissionado) -> Salário total: R$ " + colaboradorComissionado.calcularSalario());

        leitor.close();
    }
}