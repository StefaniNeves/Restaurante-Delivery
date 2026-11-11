package Produtos;

import java.time.DayOfWeek;

	public class Sobremesa extends ItemCardapio {
	  public enum TipoSobremesa {
	    DOCE,
	    FRUTAS,
	    BOLO,
	    MOUSSE,
	    TORTA,
	    GELATINA,
	    PICOLE
	  }

	  private TipoSobremesa tipo;
	  private boolean gelado;

	  public Sobremesa(String nome, String descricao, double preco, int tempoPreparo, String codigo, String ingredientes,
	      DayOfWeek[] diasDisponiveis, boolean vegano, boolean semLactose, String alergenos,
	      TipoSobremesa tipo, boolean gelado) {
	    super(nome, descricao, preco, tempoPreparo, codigo, ingredientes, diasDisponiveis, vegano, semLactose,
	        alergenos);
	    this.tipo = tipo;
	    this.gelado = gelado;
	  }

	  @Override
	  public String getCategoria() {
	    return "Sobremesa";
	  }

	  public boolean getGelado() {
	    return gelado;
	  }

	  public TipoSobremesa getTipo() {
	    return tipo;
	  }
      
	  
	  @Override
	  public String toString() {
	    return String.format("%s - %s - Tipo: %s - R$ %.2f %s %s %s \n%s",
	        getNome(),
	        getDescricao(),
	        tipo.name(),
	        getPreco(),
	        gelado ? "(Gelado)" : "",
	        getVegano() ? "(Vegano)" : "",
	        getSemLactose() ? "(Sem Lactose)" : "",
	        getAlergenos(),
	        getMensagemAlergenos());
	  }
	}

