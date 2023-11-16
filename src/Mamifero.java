
public class Mamifero extends Animal {
    private String tipoMamifero;

    public Mamifero(String nome, String tipoMamifero) {
        super(nome);
        this.tipoMamifero = tipoMamifero;
    }


	@Override
    public void emitirSom() {
        System.out.println("Este é um som específico de " + this.tipoMamifero +", faz um som ");
    }
}
