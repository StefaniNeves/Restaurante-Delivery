package Pessoa;

import Produtos.Pedido;
import java.util.Scanner;
import Produtos.StatusPedido;


public class Cozinheiro extends Funcionario {
	double salario;
	private String nivelExperiencia;
	private int numeroPedidosPreparados = 0;
	private String especialidades;

	public Cozinheiro(String nome, String email, String senha, int codigo, String cargo, String cpf, int idade, String nivelExperiencia,
			String especialidades) {
		super(nome, email, senha, codigo, cargo, cpf, idade);
		this.nivelExperiencia = nivelExperiencia;
		this.especialidades = especialidades;
	}

	public void imprimir() {
		System.out.println("-------------------------");		
		System.out.println("Nome: "+getNome());
		System.out.println("Email: "+getEmail());
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Cargo: "+getCargo());
		System.out.println("Endereço: "+getCpf());
		System.out.println("Telefone: "+getIdade());
		System.out.println("NivelDeExperiencia: "+getNivelExperiencia());
		System.out.println("Pedidos preparados: "+getNumeroPedidosPreparados());
		System.out.println("-------------------------");		
	}
	 public void menuCozinheiro(Scanner scanner) {
	        while (true) {
	            System.out.println("\n--- Menu do Cozinheiro ---");
	            System.out.println("1 - Ver pedidos em preparo");
	            System.out.println("2 - Marcar pedido como pronto");
	            System.out.println("3 - Sair");
	            System.out.print(">");

	            int opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    listarPedidosEmPreparo();
	                    break;
	                case 2:
	                    marcarPedidoComoPronto(scanner);
	                    numeroPedidosPreparados++;
	                    break;
	                case 3:
	                    return;
	                default:
	                    System.out.println("Opção inválida.");
	            }
	        }
	    }

	    private void listarPedidosEmPreparo() {
	        System.out.println("\nPedidos em preparo:");
	        int index = 1;
	        for (Pedido p : ControlePedidos.listaPedidos) {
	            if (p.getStatus() == StatusPedido.EM_PREPARO) {
	                System.out.println(index + ". " + p);
	            }
	            index++;
	        }
	    }

	    private void marcarPedidoComoPronto(Scanner scanner) {
	        listarPedidosEmPreparo();

	        System.out.print("\nDigite o número do pedido que deseja marcar como pronto: ");
	        int num = scanner.nextInt();
	        scanner.nextLine();

	        int count = 0;
	        for (Pedido p : ControlePedidos.listaPedidos) {
	            if (p.getStatus() == StatusPedido.EM_PREPARO) {
	                count++;
	                if (count == num) {
	                    p.setStatus(StatusPedido.PRONTO_PARA_ENTREGA);
	                    System.out.println("✅ Pedido marcado como pronto!");
	                    numeroPedidosPreparados++;
	                    return;
	                }
	            }
	        }
	        System.out.println("❌ Pedido inválido.");
	    }
	
	
	double calcularSalarioCozinheiro(int numeroPedidosPreparados) {
		salario = (numeroPedidosPreparados*50) + 500;
		return salario;
	}
	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	public String getNivelExperiencia() {
		return nivelExperiencia;
	}

	public void setNivelExperiencia(String nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}

	public int getNumeroPedidosPreparados() {
		return numeroPedidosPreparados;
	}

	public void setNumeroPedidosPreparados(int numeroPedidosPreparados) {
		this.numeroPedidosPreparados = numeroPedidosPreparados;
	}

}
