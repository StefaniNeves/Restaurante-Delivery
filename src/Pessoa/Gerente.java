package Pessoa;

public class Gerente extends Funcionario {
	final double salario = 2000.00;
	private int clientesAtendidosNoMes = 0;

	public Gerente(String nome, String email, String senha, int codigo, String cargo, String cpf, int idade) {
		super(nome, email, senha, codigo, cargo, cpf, idade);
	}
    
	public void imprimir() {
		System.out.println("-------------------------");		
		System.out.println("Nome: "+getNome());
		System.out.println("Email: "+getEmail());
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Cargo: "+getCargo());
		System.out.println("Endereço: "+getCpf());
		System.out.println("Telefone: "+getIdade());
		System.out.println("Numero de Atendimentos no mês: "+getClientesAtendidosNoMes());
		System.out.println("-------------------------");		
	}
	
	 double calcularSalarioGerente() {
		return salario;
	}
	public int getClientesAtendidosNoMes() {
		return clientesAtendidosNoMes;
	}

	public void setClientesAtendidosNoMes(int clientesAtendidosNoMes) {
		this.clientesAtendidosNoMes = clientesAtendidosNoMes;
	}

}
