public class  Animal {
	    private String nome;
	    
	    public Animal (String nome, String tipoMamifero, String tipoAve) {
	    	this.nome = nome;
	    }

	    public Animal(String nome) {
	        this.nome = nome;
	    }

	    public void emitirSom() {
	        System.out.println("Este é um som genérico de animal");
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
}



