package Pessoa;

public class Funcionario extends Pessoa {
	String cargo;
	String cpf;
	int idade;
	

	public Funcionario(String nome, String email, String senha, int codigo, String cargo, String cpf, int idade) {
		super(nome, email, senha, codigo);
		this.cargo = cargo;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
