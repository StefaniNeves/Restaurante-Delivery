package Pessoa;

import java.time.DayOfWeek;
import java.util.Scanner;
import Produtos.IniciarProdutos;
import Produtos.RepositorioCardapio;
import java.util.Locale;
import java.time.format.TextStyle;



public class TestarPessoas {

	public static void main(String[] args) {
		PessoaControler pessoaControler = new PessoaControler();
        boolean executando = true;
        Scanner scanner = new Scanner(System.in);
        pessoaControler.iniciarGerente();
        pessoaControler.iniciarCliente();
        pessoaControler.iniciarMotoboy();
        pessoaControler.iniciarCozinheiro();
    	RepositorioCardapio repositorioCardapio = new RepositorioCardapio();
		IniciarProdutos.GerarProdutos(repositorioCardapio);
		DayOfWeek dia = DayOfWeek.FRIDAY;
        String nomeDia = dia.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")).toUpperCase();
        pessoaControler.interfaceRestaurante();


        while(executando) {
        System.out.println("\n========== MENU ==========");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastrar Cliente");
        System.out.println("3 - Sair");
        System.out.print(">");
        int tipo = scanner.nextInt();
              switch(tipo) {
                case 1:
                	pessoaControler.login(repositorioCardapio, dia, nomeDia);
                	executando = true;
                	break;
                case 2:
                	pessoaControler.cadastrarCliente();
                	System.out.println("1 - Voltar ao menu");
                	System.out.println("2 - Sair");
                	int continuarCadastrando = scanner.nextInt();
                	if(continuarCadastrando == 1) {
                		executando = true;
                	}else if(continuarCadastrando == 2) {
                		executando = false;
                	}else {
                		System.out.println("Escolha inválida! ");
                		executando = false;
                	}
                	break;
                case 3: 
                	executando = false;
                	System.out.println("Saindo do programa!");
                	break;
                default: 
                	System.out.println("Opção invalida!");
              }
	}

  }
}
