package Pessoa;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import Produtos.Pedido;
import Produtos.StatusPedido;

public class Cliente extends Pessoa {
	private String endereco;
	private String telefone;
	private int numeroPedidos = 0;

	public Cliente(String nome, String email, String senha, int codigo, String endereco, String telefone) {
		super(nome, email, senha, codigo);
		this.endereco = endereco;
		this.telefone = telefone;
	}
    
	public void imprimir() {
		System.out.println("-------------------------");		
		System.out.println("Nome: "+getNome());
		System.out.println("Email: "+getEmail());
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Numero de Pedidos: "+getNumeroPedidos());
		System.out.println("-------------------------");		
	}
	
	public void menuCliente(Scanner scanner, Cliente cliente) {
		while (true) {
	        System.out.println("\n--- Menu do Cliente ---");
	        System.out.println("1 - Ver status do seu Pedido");
	        System.out.println("2 - Marcar pedido como recebido");
	        System.out.println("3 - Sair");

	        int opcao = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (opcao) {
	            case 1:
	                listarPedidosDoCliente(cliente);
	                break;
	            case 2:
	                marcarPedidoComoRecebido(scanner, cliente);
	                break;
	            case 3:
	                return;
	            default:
	                System.out.println("Opção inválida.");
	        }
	    }
	}
	private void marcarPedidoComoRecebido(Scanner scanner, Cliente cliente) {
	    System.out.println("\nPedidos entregues aguardando confirmação de recebimento:");

	    List<Pedido> pedidosEntregues = new ArrayList<>();
	    int index = 1;

	    for (Pedido p : ControlePedidos.listaPedidos) {
	        if (p.getCliente().equals(cliente) && p.getStatus() == StatusPedido.ENTREGUE) {
	            System.out.println(index + ". " + p);
	            pedidosEntregues.add(p);
	            index++;
	        }
	    }

	    if (pedidosEntregues.isEmpty()) {
	        System.out.println("Você não tem pedidos para confirmar recebimento.");
	        return;
	    }

	    System.out.print("Digite o número do pedido que deseja marcar como recebido: ");
	    int escolha = scanner.nextInt();
	    scanner.nextLine(); // consumir a quebra de linha

	    if (escolha < 1 || escolha > pedidosEntregues.size()) {
	        System.out.println("Número inválido.");
	        return;
	    }

	    Pedido pedidoSelecionado = pedidosEntregues.get(escolha - 1);
	    pedidoSelecionado.setStatus(StatusPedido.RECEBIDO);
	    System.out.println("Pedido marcado como recebido com sucesso!");
	}
	private void listarPedidosDoCliente(Cliente cliente) {
	    System.out.println("\nSeus pedidos:");
	    int index = 1;
	    for (Pedido p : ControlePedidos.listaPedidos) {
	        if (p.getCliente().equals(cliente)) {
	            System.out.println(index + ". " + p);
	        }
	        index++;
	    }
	}
	 
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setNumeroPedidos(int numeroPedidos) {
		this.numeroPedidos = numeroPedidos;
	}

	public int getNumeroPedidos() {
		return numeroPedidos;
	}


}
