
public class Ave extends Animal {
    private String tipoAve;

    public Ave(String nome, String tipoAve) {
        super(nome);
        this.tipoAve = tipoAve;
    }

    @Override
    public void emitirSom() {
        System.out.println("Este é um som específico de " + this.tipoAve + ", faz um som: ");
    }
}
