package Produtos;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class testarCardapios {

	public static void main(String[] args) {
		RepositorioCardapio repositorio = new RepositorioCardapio();
		
		IniciarProdutos.GerarProdutos(repositorio);
        
		MostrarCardapio mostrar = new MostrarCardapio();
		
		DayOfWeek dia = DayOfWeek.FRIDAY;

		String nomeDia = dia.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")).toUpperCase();

		mostrar.ExibirCardapio(repositorio, dia, nomeDia);
	}

}
