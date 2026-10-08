import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a lista polimórfica de animais
        List<Animal> zoológico = new ArrayList<>();

        // Cadastrando os animais
        zoológico.add(new Leao("Simba", 5));
        zoológico.add(new Elefante("Dumbo", 10));
        zoológico.add(new Macaco("George", 3));
        zoológico.add(new Cobra("Jorgina Calarrara", 12));
        zoológico.add(new Harpy("Piupiu", 7));
         
        System.out.println("=== BEM-VINDO AO ZOOLÓGICO ===");
        System.out.println();

        // passa de bicho em bicho na lista mandando cada um fazer seu som e comer
        for (Animal a : zoológico) {
            a.exibirInformacoes();
            a.emitirSom();
            a.alimentar();
            System.out.println("-----------------------------------");
        }
    }
}