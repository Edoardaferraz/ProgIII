class Livro {
    String titulo;
    String autor;

    Livro() {
        titulo = "Coraline";
        autor = "Neil Gaiman";
    }

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

public class exercicio1 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        System.out.println("título: " + livro1.titulo + " e autor: " + livro1.autor);
        System.out.println("autor: " + livro2.autor + " e título: " + livro2.titulo);
    }
}