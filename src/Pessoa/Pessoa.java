package Pessoa;

public abstract class Pessoa {
	private String nome;
	private String email;
	private int codigo;
	private String senha;

	public Pessoa(String nome, String email, String senha, int codigo) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.codigo = codigo;
	}
     
	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
