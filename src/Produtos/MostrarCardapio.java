package Produtos;

import java.time.DayOfWeek;

public class MostrarCardapio {
	RepositorioCardapio repositorio = new RepositorioCardapio();

	public void ExibirCardapio(RepositorioCardapio repositorio, DayOfWeek dia, String nomeDia) {
		System.out.println("==========================================================");
		System.out.println("                    CARDAPIO DA "+nomeDia+"                        ");
		System.out.println("==========================================================");
		System.out.println("ENTRADAS: ");
		repositorio.imprimirEntrada(dia);
		System.out.println();
		System.out.println("PRATOS PRINCIPAIS: ");
		repositorio.imprimirPratoPrincipal(dia);
        System.out.println();
		System.out.println("SOBREMESAS: ");
		repositorio.imprimirSobremesa(dia);
        System.out.println();
		System.out.println("BEBIDAS: ");
		repositorio.imprimirBebidas(dia);
        System.out.println();
				
		
		
	}

}
