package Produtos;

import java.time.DayOfWeek;

public abstract class ItemCardapio {
  private String nome;
  private String descricao;
  private double preco;
  private int tempoPreparo;
  private String codigo;
  private String ingredientes;
  private DayOfWeek[] diasDisponiveis;
  private boolean vegano;
  private boolean semLactose;
  private String alergenos;

  public ItemCardapio(String nome, String descricao, double preco, int tempoPreparo, String codigo, String ingredientes,
      DayOfWeek[] diasDisponiveis, boolean vegano, boolean semLactose, String alergenos) {
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.tempoPreparo = tempoPreparo;
    this.codigo = codigo;
    this.ingredientes = ingredientes;
    this.diasDisponiveis = diasDisponiveis;
    this.vegano = vegano;
    this.semLactose = semLactose;
    this.alergenos = alergenos;
  }
  
  public void imprimirNoCardapio(String nome, String descricao, double preco) {
	  System.out.printf("%-20s %-35s R$ %.2f\n", nome, descricao, preco);
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getIngredientes() {
    return ingredientes;
  }

  public DayOfWeek[] getDiasDisponiveis() {
    return diasDisponiveis;
  }

 
  public boolean getVegano() {
    return vegano;
  }

  public boolean getSemLactose() {
    return semLactose;
  }

  public String getAlergenos() {
    return alergenos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setPreco(double preco) {
    if (preco < 0)
      throw new IllegalArgumentException("O preço não pode ser negativo");
    this.preco = preco;
  }

  public int getTempoPreparo() {
    return tempoPreparo;
  }

  public void setTempoPreparo(int tempoPreparo) {
    if (tempoPreparo <= 0)
      throw new IllegalArgumentException("Tempo de preparo invalído");
    this.tempoPreparo = tempoPreparo;
  }

  public void setCodigo(String codigo) {
    if (codigo == null || codigo.isEmpty()) {
      throw new IllegalArgumentException("O código não pode ser nulo ou vazio");
    }
    this.codigo = codigo;
  }

  public void setIngredientes(String ingredientes) {
    this.ingredientes = ingredientes;
  }

  public void setDiasDisponiveis(DayOfWeek[] diasDisponiveis) {
    this.diasDisponiveis = diasDisponiveis;
  }

  public void setVegano(boolean vegano) {
    this.vegano = vegano;
  }

  public void setSemLactose(boolean semLactose) {
    this.semLactose = semLactose;
  }

  public void setAlergenos(String alergenos) {
    this.alergenos = alergenos;
  }

  public String getMensagemAlergenos() {
    if (alergenos != null && !alergenos.trim().isEmpty()) {
      return "Contém alérgenos: " + alergenos;
    } else {
      return "Não contém alérgenos.";
    }
  }

  public abstract String getCategoria();

  public void exibirItem() {
    System.out.printf("%s (%s)\nR$ %.2f | Preparo: %d min | %s\n%s\n%s\n\n",
        nome, getCategoria(), preco, tempoPreparo,
        vegano ? "Vegano" : "Não vegano",
        "Alergicos: " + getMensagemAlergenos(),
        "Disponível em: " + java.util.Arrays.toString(diasDisponiveis));
  }
}
