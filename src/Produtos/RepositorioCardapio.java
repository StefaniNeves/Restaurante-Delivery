package Produtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.time.DayOfWeek;

public class RepositorioCardapio {
  private List<ItemCardapio> itemCardapio;

  public RepositorioCardapio() {
    this.itemCardapio = new ArrayList<ItemCardapio>();
  }

  public void adicionarItem(ItemCardapio item) {
    itemCardapio.add(item);
  }

  public List<ItemCardapio> listarItens() {
    return new ArrayList<ItemCardapio>(itemCardapio);
  }

  public ItemCardapio buscarItemPorCodigo(String codigo) {
    for (ItemCardapio item : itemCardapio) {
      if (item.getCodigo().equals(codigo)) {
        return item;
      }
    }
    return null;
  }
  
  public ItemCardapio buscarItemPorNome(String nome) {
	  String buscado = nome.trim().toLowerCase();
	    for (ItemCardapio item : itemCardapio) {
	        String atual = item.getNome().trim().toLowerCase();
	        if (atual.equals(buscado)) {
	            return item;
	        }
	    }
	    return null;
	}

  public boolean removerItem(String codigo) {
    Iterator<ItemCardapio> iterator = itemCardapio.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().getCodigo().equals(codigo)) {
        iterator.remove();
        return true;
      }
    }
    return false;
  }

  public boolean codigoJaExiste(String codigo) {
    return buscarItemPorCodigo(codigo) != null;
  }

  public List<ItemCardapio> listarItensPorDia(DayOfWeek dia) {
    List<ItemCardapio> itensDoDia = new ArrayList<ItemCardapio>();
    for (ItemCardapio item : itemCardapio) {
      for (DayOfWeek disponivel : item.getDiasDisponiveis()) {
        if (disponivel == dia) {
          itensDoDia.add(item);
          break;
        }
      }
    }
    return itensDoDia;
  }
  public void imprimirEntrada(DayOfWeek dia) {
	  List<ItemCardapio> itens = listarItensPorDia(dia);
	  for(ItemCardapio item : itens) {
		  if(item instanceof Entrada) {
			  item.imprimirNoCardapio(item.getNome(), item.getDescricao(), item.getPreco());
		  }
	  }
  }
  public void imprimirPratoPrincipal(DayOfWeek dia) {
	  List<ItemCardapio> itens = listarItensPorDia(dia);
	  for(ItemCardapio item : itens) {
		  if(item instanceof PratoPrincipal) {
			  item.imprimirNoCardapio(item.getNome(), item.getDescricao(), item.getPreco());
		  }
	  }
  }
public void imprimirSobremesa(DayOfWeek dia) {
	  List<ItemCardapio> itens = listarItensPorDia(dia);
	  for(ItemCardapio item : itens) {
		  if(item instanceof Sobremesa) {
			  item.imprimirNoCardapio(item.getNome(), item.getDescricao(), item.getPreco());
		  }
	  }
}
public void imprimirBebidas(DayOfWeek dia) {
	  List<ItemCardapio> itens = listarItensPorDia(dia);
	  for(ItemCardapio item : itens) {
		  if(item instanceof Bebida) {
			  item.imprimirNoCardapio(item.getNome(), item.getDescricao(), item.getPreco());
		  }
	  }
}

}

  
  
  
  
  
  
