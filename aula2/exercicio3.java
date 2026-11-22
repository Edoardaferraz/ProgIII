import java.util.ArrayList;
import java.util.Iterator;

public class exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Beatriz");
        alunos.add("Lucas");
        alunos.add("Mariana");
        alunos.add("Rafael");
        alunos.add("Camila");

        System.out.println("lista original:");
        Iterator<String> it = alunos.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            System.out.println(nome);
        }

        it = alunos.iterator();
        while (it.hasNext()) {
            String nome = it.next();
            if (nome.equals("Mariana")) {
                it.remove();
            }
        }

        System.out.println("\nLista atualizada:");
        for (String nome : alunos) {
            System.out.println(nome);
        }
    }
}