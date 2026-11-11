package Produtos;

import java.time.DayOfWeek;
import java.util.Objects;

public class Bebida extends ItemCardapio {
  public enum TipoBebida {
    ALCOOLICA,
    SUCO,
    REFRIGERANTE,
	  AGUA,
	  CAFE,
	  CHA
  }

  private TipoBebida tipo;
  private boolean zeroAcucar;
  private String marca;
  private int volumeEmMl;

  public Bebida(String nome, String descricao, double preco, int tempoPreparo, String codigo, String ingredientes,
      DayOfWeek[] diasDisponiveis, boolean vegano, boolean semLactose, String alergenos,
      TipoBebida tipo, boolean zeroAcucar, String marca, int volumeEmMl) {
    super(nome, descricao, preco, tempoPreparo, codigo, ingredientes, diasDisponiveis, vegano, semLactose,
        alergenos);
    this.tipo = Objects.requireNonNull(tipo);

    if (volumeEmMl <= 0) {
      throw new IllegalArgumentException("Volume inválido! O valor deve ser maior que zero.");
    }

    this.zeroAcucar = zeroAcucar;
    this.marca = marca;
    this.volumeEmMl = volumeEmMl;
  }

  @Override
  public String getCategoria() {
    return "Bebida";
  }
  public boolean getCha() {
	    return tipo == TipoBebida.CHA;
	  }
  public boolean getCafe() {
	    return tipo == TipoBebida.CAFE;
	  }
  
  public boolean getAgua() {
	    return tipo == TipoBebida.AGUA;
	  }
  
  public boolean getAlcoolica() {
    return tipo == TipoBebida.ALCOOLICA;
  }

  public boolean getSuco() {
    return tipo == TipoBebida.SUCO;
  }

  public boolean getRefresco() {
    return tipo == TipoBebida.REFRIGERANTE;
  }

  public TipoBebida getTipo() {
    return tipo;
  }

  public boolean getZeroAcucar() {
    return zeroAcucar;
  }

  public String getMarca() {
    return marca;
  }

  public int getVolumeEmMl() {
    return volumeEmMl;
  }

  @Override
  public String toString() {
    return String.format("%s - %s - $s (%d ml) - R$ %.2f %s %s %s %s\n%s",
        getNome(),
        getDescricao(),
        marca,
        volumeEmMl,
        getPreco(),
        zeroAcucar ? "(Zero Açucar)" : "",
        getVegano() ? "(Vegano)" : "",
        getSemLactose() ? "(Sem Lactose)" : "",
        getAlergenos(),
        getMensagemAlergenos());
  }
}