package Pessoa;

import Produtos.Pedido;
import Produtos.StatusPedido;
import java.util.Scanner;


public class Motoboy extends Funcionario {
	double salario;
	private String placaVeiculo;
	private String modeloVeiculo;
	private int entregasRealizadas;
	private String CNH;

	public Motoboy(String nome, String email, String senha, int codigo, String cargo, String cpf, int idade, String placaVeiculo,
			String modeloVeiculo, String CNH) {
		super(nome, email, senha, codigo, cargo, cpf, idade);
		this.placaVeiculo = placaVeiculo;
		this.modeloVeiculo = modeloVeiculo;
		this.CNH = CNH;
	}
	
	public void imprimir() {
		System.out.println("-------------------------");		
		System.out.println("Nome: "+getNome());
		System.out.println("Email: "+getEmail());
		System.out.println("Codigo: "+getCodigo());
		System.out.println("Cargo: "+getCargo());
		System.out.println("CPF: "+getCpf());
		System.out.println("Idade: "+getIdade());
		System.out.println("Placa do veiculo: "+getPlacaVeiculo());
		System.out.println("Modelo do veiculo: "+getModeloVeiculo());
		System.out.println("CNH: "+getCNH());
		System.out.println("Entregas realizadas: "+getEntregasRealizadas());
		System.out.println("-------------------------");		
	}
	
	public void menuMotoboy(Scanner scanner) {
	    while (true) {
	        System.out.println("\n--- Menu do Motoboy ---");
	        System.out.println("1 - Ver pedidos prontos para entrega");
	        System.out.println("2 - Marcar pedido como saiu para entrega");
	        System.out.println("3 - Marcar pedido como entregue ");
	        System.out.println("4 - Sair");

	        int opcao = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (opcao) {
	            case 1:
	                listarPedidosProntos();
	                break;
	            case 2:
	                marcarPedidoComoSaiu(scanner);
	                break;
	            case 3:
	            	confirmarEntrega(scanner);
	            	entregasRealizadas++;
	            	break;
	            case 4:
	                return;
	            default:
	                System.out.println("Opção inválida.");
	        }
	    }
	}

	private void listarPedidosProntos() {
	    System.out.println("\nPedidos prontos para entrega:");
	    int index = 1;
	    for (Pedido p : ControlePedidos.listaPedidos) {
	        if (p.getStatus() == StatusPedido.PRONTO_PARA_ENTREGA) {
	            System.out.println(index + ". " + p);
	        }
	        index++;
	    }
	}

	private void marcarPedidoComoSaiu(Scanner scanner) {
	    listarPedidosProntos();

	    System.out.print("\nDigite o número do pedido que deseja marcar como saiu para entrega: ");
	    int num = scanner.nextInt();
	    scanner.nextLine();

	    int count = 0;
	    for (Pedido p : ControlePedidos.listaPedidos) {
	        if (p.getStatus() == StatusPedido.PRONTO_PARA_ENTREGA) {
	            count++;
	            if (count == num) {
	                p.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
	                System.out.println("Pedido saiu para entrega!");
	                return;
	            }
	        }
	    }

	    System.out.println("Número de pedido inválido.");
	}
	
	private void listarPedidosPorStatus(StatusPedido status) {
	    System.out.println("\nPedidos com status: " + status);
	    int index = 1;
	    for (Pedido p : ControlePedidos.listaPedidos) {
	        if (p.getStatus() == status) {
	            System.out.println(index + ". " + p);
	        }
	        index++;
	    }
	}
	
	private void confirmarEntrega(Scanner scanner) {
       
		listarPedidosPorStatus(StatusPedido.SAIU_PARA_ENTREGA);

        System.out.print("\nDigite o número do pedido para confirmar a entrega: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int count = 0;
        for (Pedido p : ControlePedidos.listaPedidos) {
            if (p.getStatus() == StatusPedido.SAIU_PARA_ENTREGA) {
                count++;
                if (count == num) {
                    p.setStatus(StatusPedido.ENTREGUE);
                    System.out.println("Entrega confirmada! Pedido finalizado.");
                    return;
                }
            }
        }
        System.out.println("Pedido inválido.");
    }
	double calcularSalarioMotoboy(int entregasRealizadas) {
		salario = (entregasRealizadas*60) + 400;
		return salario;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public int getEntregasRealizadas() {
		return entregasRealizadas;
	}

	public void setEntregasRealizadas(int entregasRealizadas) {
		this.entregasRealizadas = entregasRealizadas;
	}

	public String getCNH() {
		return CNH;
	}

	public void setCNH(String cNH) {
		CNH = cNH;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

}
