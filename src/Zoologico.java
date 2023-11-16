
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void fazerBarulho() {
        for (Animal animal : this.animais) {
            animal.emitirSom();
        }
    }
}
