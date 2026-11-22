class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato miando: MIAUUUUUUU");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo: AAAAUUUU AUUUU");
    }
}

public class exercicio4 {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Gato();
        animais[1] = new Cachorro();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}