package Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Pessoa.Cliente;
import Pessoa.ControlePedidos;


public class FazerPedido {

    public  void RealizarPedido(RepositorioCardapio repositorio, Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> carrinho = new ArrayList<>();
        String opcao = "";

        do {
            System.out.print("Nome do produto: ");
            String nomeBusca = scanner.nextLine().trim();

            ItemCardapio ic = repositorio.buscarItemPorNome(nomeBusca);
            if (ic == null) {
            	System.out.println("");
                System.out.println("❌ Produto não encontrado ou indisponível hoje.");
                continue;
            }

            System.out.print("Quantidade: ");
            int qt = Integer.parseInt(scanner.nextLine());

            boolean achou = false;
            for (Produto p : carrinho) {
                if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                    p.setQuantidade(p.getQuantidade() + qt);
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                Produto pedido = new Produto(ic.getNome(), ic.getPreco(), qt);
                carrinho.add(pedido);
            }

            System.out.print("Adicionar outro produto? (s/n): ");
            opcao = scanner.nextLine().trim();
        } while (opcao.equalsIgnoreCase("s"));

        System.out.print("Deseja remover algum produto? (s/n): ");
        opcao = scanner.nextLine().trim();
        if (opcao.equalsIgnoreCase("s") && !carrinho.isEmpty()) {
            System.out.println("Produtos no carrinho:");
            for (int i = 0; i < carrinho.size(); i++) {
                Produto p = carrinho.get(i);
                System.out.printf("%d – %s (x%d)\n", i + 1, p.getNome(), p.getQuantidade());
            }
            System.out.print("Número do produto para remover: ");
            int idx = Integer.parseInt(scanner.nextLine()) - 1;
            if (idx >= 0 && idx < carrinho.size()) {
                carrinho.remove(idx);
                System.out.println("✅ Item removido.");
            } else {
                System.out.println("❌ Índice inválido.");
            }
        }

        final double TAXA_ENTREGA = 10.00;
        double soma = 0;
        int totalItens = 0;

        System.out.println("\n========= RESUMO DO PEDIDO =========");
        for (Produto p : carrinho) {
            double subtotal = p.getTotal();
            System.out.printf("%s – %d x R$ %.2f = R$ %.2f\n",
                              p.getNome(), p.getQuantidade(),
                              p.getPreco(), subtotal);
            soma += subtotal;
            totalItens += p.getQuantidade();
        }
        System.out.printf("Total de itens: %d\n", totalItens);
        System.out.printf("Subtotal: R$ %.2f\n", soma);
        System.out.printf("Taxa de entrega: R$ %.2f\n", TAXA_ENTREGA);
        System.out.printf("** Total a pagar: R$ %.2f **\n", soma + TAXA_ENTREGA);

        Pedido novoPedido = new Pedido(cliente, carrinho);
        ControlePedidos.listaPedidos.add(novoPedido);
        System.out.println("✅ Pedido registrado com sucesso!");
    }
}
    
    

