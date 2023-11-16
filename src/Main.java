
public class Main {
	public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimal(new Mamifero("Leão", "mamífero"));
        zoologico.adicionarAnimal(new Ave("Papagaio", "ave"));
        zoologico.fazerBarulho();
       
    }
}


