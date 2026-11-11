package Produtos;

import java.time.DayOfWeek;

public class Entrada extends ItemCardapio {
  private String tamanhoPorcao;
  private int calorias;
  private String classificacaoNutricional;

  public Entrada(String nome, String descricao, double preco, int tempoPreparo, String codigo, String ingredientes,
      DayOfWeek[] diasDisponiveis, boolean vegano, boolean semLactose, String alergenos,
      String tamanhoPorcao, int calorias, String classificacaoNutricional) {
    super(nome, descricao, preco, tempoPreparo, codigo, ingredientes, diasDisponiveis, vegano, semLactose,
        alergenos);
    this.tamanhoPorcao = tamanhoPorcao;
    this.calorias = calorias;
    this.classificacaoNutricional = classificacaoNutricional;
  }

  @Override
  public String getCategoria() {
    return "Entrada";
  }

  public String getTamanhoPorcao() {
    return tamanhoPorcao;
  }

  public int getCalorias() {
    return calorias;
  }

  public String getClassificacaoNutricional() {
    return classificacaoNutricional;
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %s - %dkcal - %s - R$ %.2f %s %s %s\n%s",
        getNome(),
        getDescricao(),
        tamanhoPorcao,
        calorias,
        classificacaoNutricional,
        getPreco(),
        getVegano() ? "(Vegano)" : "",
        getSemLactose() ? "(Sem Lactose)" : "",
        getAlergenos(),
        getMensagemAlergenos());
  }
}

