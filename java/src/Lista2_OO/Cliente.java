package Lista2_OO;

public class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Olá! : " + nome + "Seja bem-vindo!";
}
 }