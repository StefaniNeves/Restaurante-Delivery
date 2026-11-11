package Produtos;

import java.util.List;
import Pessoa.Cliente;

public class Pedido {
    private Cliente cliente;
    private List<Produto> itens;
    private StatusPedido status;

    public Pedido(Cliente cliente, List<Produto> itens) {
        this.cliente = cliente;
        this.itens = itens;
        this.status = StatusPedido.EM_PREPARO;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Itens:\n");
        for (Produto p : itens) {
            sb.append("- ").append(p.getNome())
              .append(" x").append(p.getQuantidade())
              .append(" (R$ ").append(String.format("%.2f", p.getPreco())).append(")\n");
        }
        return sb.toString();
    }
}
