package Polimorf;

public class Funcionario extends PessoaFisica {
	
	private String cartao;
	
	public Funcionario() {}
	public Funcionario(String nome, String rg, String cpf) {
		super(nome,rg);
		this.cartao = cartao;	
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
}
