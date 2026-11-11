package Produtos;

import java.time.DayOfWeek;

public class PratoPrincipal extends ItemCardapio {
  private boolean vegetariano;
  private String proteinaPrincipal;
  private boolean semGluten;
  

  public PratoPrincipal(String nome, String descricao, double preco, int tempoPreparo, String codigo,
      String ingredientes, DayOfWeek[] diasDisponiveis, boolean vegano, boolean semLactose,
      String alergenos, boolean vegetariano, String proteinaPrincipal, boolean semGluten) {
    super(nome, descricao, preco, tempoPreparo, codigo, ingredientes, diasDisponiveis, vegano, semLactose,
        alergenos);
    this.vegetariano = vegetariano;
    this.proteinaPrincipal = proteinaPrincipal;
    this.semGluten = semGluten;
  }

  @Override
  public String getCategoria() {
    return "Prato Principal";
  }

  public boolean getVegetariano() {
    return vegetariano;
  }

  public String getProteinaPrincipal() {
    return proteinaPrincipal;
  }

  public boolean getSemGluten() {
    return semGluten;
  }

  @Override
  public String toString() {
    return String.format("%s - %s - Proteína: %s - Acompanhamentos: %s - R$ %.2f %s %s %s %s\n%s",
        getNome(),
        getDescricao(),
        proteinaPrincipal,
        getPreco(),
        vegetariano ? "(Vegetariano)" : "",
        getVegano() ? "(Vegano)" : "",
        getSemGluten() ? "(Sem Gluten)" : "",
        getAlergenos(),
        getMensagemAlergenos());
  }

}