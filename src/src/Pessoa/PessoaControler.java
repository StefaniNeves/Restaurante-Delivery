package Pessoa;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;
import Produtos.FazerPedido;
import Produtos.MostrarCardapio;
import Produtos.RepositorioCardapio;
import Produtos.Entrada;
import Produtos.PratoPrincipal;
import Produtos.Sobremesa;
import Produtos.Bebida;



public class PessoaControler {
	private RepositorioPessoa repositorio = new RepositorioPessoa();
	RepositorioCardapio repositorioCardapio = new RepositorioCardapio();

	private Scanner scanner = new Scanner(System.in);	
	
	public void interfaceRestaurante() {
		String nomeRestaurante = "RESTAURANTE DELIVERY";
		System.out.println(" =============================================================");
		System.out.println("|                                                             |");
		System.out.println("|                                                             |");
		System.out.println("|                     "+nomeRestaurante+"                    |");
		System.out.println("|                                                             |");
		System.out.println("|                                                             |");
		System.out.println(" =============================================================");
	}
	
	public void iniciarGerente() {
		Gerente gerente = new Gerente("Mars", "mars@gmail", "gerente", 021412, "Gerente", "21412443121", 22);
    	repositorio.adicionarPessoa(gerente);
	}
	
	public void iniciarCozinheiro() {
	      Cozinheiro cozinheiro = new Cozinheiro("Lopes", "cozinheiro@gmail", "cozinheiro", 123412, "Cozinheiro", "2141251512", 25, "Senor", "Frituras");	
	      repositorio.adicionarPessoa(cozinheiro);	}
	
	public void iniciarMotoboy() {
		Motoboy motoboy = new Motoboy("Amanda", "motoboy@gmail", "motoboy", 124124, "Motoboy", "21412424214", 21, "CN123T", "UNO", "121424142");
		repositorio.adicionarPessoa(motoboy);
	}
	
	public void iniciarCliente() {
		Cliente cliente = new Cliente("Pedro", "cliente@gmail", "cliente", 12424, "PraçaDaBandeira", "8822213123");
		repositorio.adicionarPessoa(cliente);
	}
	
	
	public void exibirSalario(Pessoa pessoa) {
		 if(pessoa instanceof Gerente) {
		    System.out.println("GERENTE: "+((Gerente) pessoa).calcularSalarioGerente());
		 }else if (pessoa instanceof Cozinheiro) {
		    System.out.println("COZINHEIRO: "+((Cozinheiro) pessoa).calcularSalarioCozinheiro(((Cozinheiro) pessoa).getNumeroPedidosPreparados()));
		 }else if(pessoa instanceof Motoboy) {
		    System.out.println("MOTOBOY: "+((Motoboy) pessoa).calcularSalarioMotoboy(((Motoboy) pessoa).getEntregasRealizadas()));
		 }else{
			 System.out.println("Pessoa inválida!");
		 }
	}		 
		 
	
	public void excluirConta(String senha) {
		Pessoa pessoa = repositorio.buscarPorSenha(senha);
		if(pessoa == null) {
			System.out.println("Senha inválida");
			return;
		}if(pessoa instanceof Gerente) {
			System.out.println("A conta do gerente não pode ser excluida!");
			return;
		}
		repositorio.removerPorSenha(senha);
		System.out.println("Conta excluida com sucesso");
	}
	public void atualizarDados(Pessoa pessoa) {
		System.out.println("\n====================ATUALIZAR DADOS=======================");
		System.out.print("Novo Nome : ");
		String Novonome = scanner.next();
		pessoa.setNome(Novonome);
		System.out.print("Novo email: ");
		String Novoemail = scanner.next();
		pessoa.setEmail(Novoemail);
		System.out.print("Novo Codigo: ");
		int Novocodigo = scanner.nextInt();
		pessoa.setCodigo(Novocodigo);
		System.out.print("Nova Senha: ");
		String Novasenha = scanner.next();
		pessoa.setSenha(Novasenha);
		if(pessoa instanceof Cliente) {
			Cliente c =(Cliente)pessoa;			
		System.out.print("Novo Endereço: ");
		String Novoendereco = scanner.next();
		c.setEndereco(Novoendereco);
		System.out.print("Novo Telefone: ");
		String Novotelefone = scanner.next();
		c.setTelefone(Novotelefone);
		} else if (pessoa instanceof Funcionario) {
			Funcionario f = (Funcionario)pessoa;
			System.out.println("Novo cpf: ");
			String NovoCpf = scanner.next();
			f.setCpf(NovoCpf);
			System.out.println("Nova idade: ");
			int NovaIdade = scanner.nextInt();
			f.setIdade(NovaIdade);
			  if(f instanceof Cozinheiro) {
				  Cozinheiro cozinheiro = (Cozinheiro)f;
				  System.out.println("Novo nivel de experiencia: ");
				  String NovoNivelDeExperiencia = scanner.next();
				  ((Cozinheiro) f).setNivelExperiencia(NovoNivelDeExperiencia);
				  System.out.println("Novas especialidades: ");
                  String NovasEspecialidades = scanner.next();
                  ((Cozinheiro) f).setEspecialidades(NovasEspecialidades);
                  System.out.println("Dados do cozinheiro atualizado!");
			  }else if(f instanceof Motoboy) {
				  Motoboy motoboy = (Motoboy)f;
				  System.out.println("Nova placa de veiculo: ");
				  String NovaPlacaVeiculo = scanner.next();
				  ((Motoboy) f).setPlacaVeiculo(NovaPlacaVeiculo);
				  System.out.println("Novo modelo de veiculo: ");
				  String NovoModeloVeiculo = scanner.next();
				  ((Motoboy) f).setModeloVeiculo(NovoModeloVeiculo);
				  System.out.println("Nova CNH: ");
				  String NovaCNH = scanner.next();
				  ((Motoboy) f).setCNH(NovaCNH);
				  System.out.println("Dados do motoboy atualizado! ");	
			  }else {
				  System.out.println("Tipo de pessoa desconhecido");
			  }
		}
		
	}
	
	public void cadastrarCliente() {
		System.out.print("Nome : ");
		String nome = scanner.next();
		System.out.print("Digite o email: ");
		String email = scanner.next();
		System.out.print("Codigo: ");
		int codigo = scanner.nextInt();
		System.out.print("Endereço: ");
		String endereco = scanner.next();
		System.out.print("Telefone: ");
		String telefone = scanner.next();
		System.out.print("Senha: ");
		String senha = scanner.next();
		Cliente cliente = new Cliente(nome, email, senha, codigo, endereco, telefone);
		repositorio.adicionarPessoa(cliente);
		System.out.println();
		System.out.println("Cliente Cadastrado com sucesso!");
		}
	
	public void cadastrarFuncionario() {
			System.out.print("Nome : ");
			String nome = scanner.next();
			System.out.print("Digite o email: ");
			String email = scanner.next();
			System.out.println("Codigo: ");
			int codigo = scanner.nextInt();
			System.out.println("Cargo: ");
			String cargo = scanner.next();
			System.out.println("CPF: ");
			String cpf = scanner.next();
			System.out.println("Idade: ");
			int idade = scanner.nextInt();
			System.out.println("Senha: ");
	    	String senha = scanner.next();
			   switch(cargo) {
				    case "Cozinheiro":
				    	System.out.println("Nivel de experiencia: ");
				    	String nivelExperiencia = scanner.next();
				    	System.out.println("Especialidades: ");
				    	String especialidades = scanner.next();
				    	Cozinheiro cozinheiro = new Cozinheiro(nome, email, senha, codigo, cargo, cpf, idade, nivelExperiencia, especialidades);
				    	repositorio.adicionarPessoa(cozinheiro);
				    	System.out.println();
					    System.out.println("Cozinheiro cadastrado com sucesso!");
					    System.out.println();
					    break;
				    case "Gerente": 
				    	Gerente gerente = new Gerente(nome, email, senha, codigo, cargo, cpf, idade);
				    	repositorio.adicionarPessoa(gerente);
				    	System.out.println();
					    System.out.println("Gerente cadastrado com sucesso!");
					    System.out.println();
					    break;
				    case "Motoboy":
				    	System.out.println("Placa do veículo: ");
				    	String placaVeiculo = scanner.next();
				    	System.out.println("Modelo do veiculo: ");
				    	String modeloVeiculo = scanner.next();
				    	System.out.println("CNH: ");
				    	String CNH = scanner.next();
				    	Motoboy motoboy = new Motoboy(nome, email, senha, codigo, cargo, cpf, idade, placaVeiculo, modeloVeiculo, CNH);
				    	repositorio.adicionarPessoa(motoboy);
				    	System.out.println();
					    System.out.println("Motoboy cadastrado com sucesso!");
					    System.out.println();
					    break;
				    default:
				    	System.out.println("Tipo de funcionario não existe!");
				 }
			}
	public void adicionarProduto() {
	    boolean adicionando = true;
	    while (adicionando) {
	        Scanner scanner = new Scanner(System.in); 

	        System.out.println("Qual produto você quer adicionar?");
	        System.out.println("1 - Entrada, 2 - Prato Principal, 3 - Sobremesa, 4 - Bebida");
	        int tipoProdutoEscolhido = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.println("Nome: ");
	        String nome = scanner.nextLine();

	        System.out.println("Descricao: ");
	        String descricao = scanner.nextLine();

	        System.out.println("Preço: ");
	        double preco = scanner.nextDouble();
	        scanner.nextLine();

	        System.out.println("Tempo de Preparo: ");
	        int tempoPreparo = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("Codigo: ");
	        String codigo = scanner.nextLine();

	        System.out.println("Ingredientes: ");
	        String ingredientes = scanner.nextLine();

	        DayOfWeek[] diasDisponiveis = null;
	        while (true) {
	            try {
	                System.out.println("Dia da semana (ex: MONDAY): ");
	                String entradaDia = scanner.nextLine().trim().toUpperCase();
	                DayOfWeek dia = DayOfWeek.valueOf(entradaDia);
	                diasDisponiveis = new DayOfWeek[]{dia};
	                break;
	            } catch (IllegalArgumentException e) {
	                System.out.println("❌ Dia inválido. Tente novamente com um nome como 'SEGUNDA'.");
	            }
	        }

	        boolean vegano = false;
	        while (true) {
	            System.out.print("É vegano? (s/n): ");
	            String entrada = scanner.nextLine().trim().toLowerCase();
	            if (entrada.equals("s") || entrada.equals("sim")) {
	                vegano = true;
	                break;
	            } else if (entrada.equals("n") || entrada.equals("nao") || entrada.equals("não")) {
	                vegano = false;
	                break;
	            } else {
	                System.out.println("❌ Resposta inválida. Digite 's' ou 'n'.");
	            }
	        }

	        boolean semLactose = false;
	        while (true) {
	            System.out.print("É sem lactose? (s/n): ");
	            String entrada = scanner.nextLine().trim().toLowerCase();
	            if (entrada.equals("s") || entrada.equals("sim")) {
	                semLactose = true;
	                break;
	            } else if (entrada.equals("n") || entrada.equals("nao") || entrada.equals("não")) {
	                semLactose = false;
	                break;
	            } else {
	                System.out.println("❌ Resposta inválida. Digite 's' ou 'n'.");
	            }
	        }

	        System.out.println("Alergenos: ");
	        String alergenos = scanner.nextLine();

	        switch (tipoProdutoEscolhido) {
	            case 1:
	                System.out.println("Tamanho da Porção: ");
	                String tamanhoPorcao = scanner.nextLine();

	                System.out.println("Calorias: ");
	                int calorias = scanner.nextInt();
	                scanner.nextLine();

	                System.out.println("Classificação Nutricional: ");
	                String classificacaoNutricional = scanner.nextLine();

	                Entrada entrada = new Entrada(nome, descricao, preco, tempoPreparo,
	                        codigo, ingredientes, diasDisponiveis, vegano, semLactose,
	                        alergenos, tamanhoPorcao, calorias, classificacaoNutricional);
                    repositorioCardapio.adicionarItem(entrada);
	                
	                System.out.println("✅ Entrada adicionada com sucesso!");
	                break;
	            case 2:
	            	boolean vegetariano = false;
	            	while (true) {
	            	    System.out.print("É vegetariano? (s/n): ");
	            	    String entrada1 = scanner.nextLine().trim().toLowerCase();

	            	    if (entrada1.equals("s") || entrada1.equals("sim")) {
	            	        vegetariano = true;
	            	        break;
	            	    } else if (entrada1.equals("n") || entrada1.equals("nao") || entrada1.equals("não")) {
	            	        vegetariano = false;
	            	        break;
	            	    } else {
	            	        System.out.println("❌ Resposta inválida. Digite 's' para sim ou 'n' para não.");
	            	    }
	            	}
	            	    System.out.println("Proteina Princial: ");
	            	    String proteinaPrincipal = scanner.next();
	            	    boolean semGluten = false;
	            	    while (true) {
	            	        System.out.print("É sem glúten? (s/n): ");
	            	        String entrada2 = scanner.nextLine().trim().toLowerCase();

	            	        if (entrada2.equals("s") || entrada2.equals("sim")) {
	            	            semGluten = true;
	            	            break;
	            	        } else if (entrada2.equals("n") || entrada2.equals("nao") || entrada2.equals("não")) {
	            	            semGluten = false;
	            	            break;
	            	        } else {
	            	            System.out.println("❌ Resposta inválida. Digite 's' para sim ou 'n' para não.");
	            	        }
	            	    }
	            	    PratoPrincipal pratoPrincipal = new PratoPrincipal(nome, descricao, preco, tempoPreparo,
	                        codigo, ingredientes, diasDisponiveis, vegano, semLactose,
	                        alergenos, vegetariano, proteinaPrincipal, semGluten);
	            	    repositorioCardapio.adicionarItem(pratoPrincipal);
	            	    break;
	            case 3:
	            	Sobremesa.TipoSobremesa tipo = null;
	            	while (true) {
	            	    System.out.print("Tipo de sobremesa (BOLO, SORVETE, TORTA, PUDIM): ");
	            	    String entrada3 = scanner.nextLine().trim().toUpperCase();
	            	    try {
	            	        tipo = Sobremesa.TipoSobremesa.valueOf(entrada3);
	            	        break;
	            	    } catch (IllegalArgumentException e) {
	            	        System.out.println("❌ Tipo inválido. Tente novamente.");
	            	    }
	            	}
	            	boolean gelado = false;
	            	while (true) {
	            	    System.out.print("É gelado? (s/n): ");
	            	    String entrada4 = scanner.nextLine().trim().toLowerCase();

	            	    if (entrada4.equals("s") || entrada4.equals("sim")) {
	            	        gelado = true;
	            	        break;
	            	    } else if (entrada4.equals("n") || entrada4.equals("nao") || entrada4.equals("não")) {
	            	        gelado = false;
	            	        break;
	            	    } else {
	            	        System.out.println("❌ Resposta inválida. Digite 's' para sim ou 'n' para não.");
	            	    }
	            	}
	            	Sobremesa sobremesa = new Sobremesa(nome, descricao, preco, tempoPreparo,
	                        codigo, ingredientes, diasDisponiveis, vegano, semLactose,
	                        alergenos, tipo, gelado);
	            	        repositorioCardapio.adicionarItem(sobremesa);
	            	        break;
	            case 4: 
	            	Bebida.TipoBebida tipo2 = null;

	            	while (true) {
	            	    System.out.print("Tipo de bebida (SUCO, REFRIGERANTE, AGUA, CERVEJA): ");
	            	    String entrada5 = scanner.nextLine().trim().toUpperCase();

	            	    try {
	            	        tipo2 = Bebida.TipoBebida.valueOf(entrada5);
	            	        break;
	            	    } catch (IllegalArgumentException e) {
	            	        System.out.println("❌ Tipo inválido. Tente novamente com um tipo válido.");
	            	    }
	            	}
	            	boolean zeroAcucar = false;
	            	while (true) {
	            	    System.out.print("É zero açúcar? (s/n): ");
	            	    String entrada6 = scanner.nextLine().trim().toLowerCase();

	            	    if (entrada6.equals("s") || entrada6.equals("sim")) {
	            	        zeroAcucar = true;
	            	        break;
	            	    } else if (entrada6.equals("n") || entrada6.equals("nao") || entrada6.equals("não")) {
	            	        zeroAcucar = false;
	            	        break;
	            	    } else {
	            	        System.out.println("❌ Resposta inválida. Digite 's' para sim ou 'n' para não.");
	            	    }
	            	}
	            	System.out.println("Marca: ");
	            	String marca = scanner.next();
	            	System.out.println("Volume em Ml: ");
	            	int volumeEmMl = scanner.nextInt();
	            	Bebida bebida = new Bebida(nome, descricao, preco, tempoPreparo,
	                        codigo, ingredientes, diasDisponiveis, vegano, semLactose,
	                        alergenos, tipo2, zeroAcucar, marca, volumeEmMl);
	            	        repositorioCardapio.adicionarItem(bebida);
	            	        break;
	            default:
	                System.out.println("Tipo de produto ainda não implementado.");
	        }

	        System.out.print("Deseja adicionar outro produto? (s/n): ");
	        String continuar = scanner.nextLine().toLowerCase();
	        if (!continuar.equals("s") && !continuar.equals("sim")) {
	            adicionando = false;
	        }
	    }
	}		
	public void login(RepositorioCardapio repositorioCardapio, DayOfWeek dia, String nomeDia) {
		MostrarCardapio mostrar = new MostrarCardapio();
		FazerPedido fazerPedido = new FazerPedido();
		boolean menuLogin = true;
		while(menuLogin) {
	    System.out.println("----------LOGIN----------");
	    System.out.println("Digite seu email: ");
	    String email = scanner.next();
		System.out.print("Digite sua senha: ");
        String senha = scanner.next();
		Pessoa pessoa = repositorio.buscarPorSenha(senha);
		Pessoa pessoa1 = repositorio.buscarPorEmail(email);
        if(pessoa == null || pessoa1 == null) {
        	System.out.println("Usuário não cadastrado no sistema.");
        	return;
        } else {
        System.out.println("Usuario encontrado.");
        System.out.println("");
        if(pessoa instanceof Cliente) {
        	   boolean menuCliente = true;
               while(menuCliente) {
               System.out.println("1 - Mostrar Dados: ");
               System.out.println("2 - Atualizar Dados");
               System.out.println("3 - excluir Conta");
       	       System.out.println("4 - Voltar ao login");
       	       System.out.println("5 - Sair");
       	       System.out.println("6 - Ver Cardapio:");
       	       System.out.println("7 - Fazer Pedido");
       	       System.out.println("8 - Menu de Pedidos");
       	       int escolhaMenuCliente = scanner.nextInt();
                  switch(escolhaMenuCliente) {
                  case 1: System.out.println("");
                	      System.out.println("Dados do cliente: ");
                          ((Cliente) pessoa).imprimir();
                          System.out.println("\n==================================");
                          System.out.println("1 - Voltar para Menu do Cliente");
                          System.out.println("2 - Sair");
                          System.out.println("\n==================================");
                          int escolhaDoCliente = scanner.nextInt();
                          if(escolhaDoCliente == 1) {
                        	  menuCliente = true;
                          }else if(escolhaDoCliente == 2){
                        	  menuCliente = false;
                        	  menuLogin = false;
                          }else {
                        	  System.out.println("Escolha inválida!");
                        	  menuCliente = true;
                          }
                          break; 
                  case 2: 
                	  atualizarDados(pessoa);
                	  System.out.println("1 - Voltar para Menu do Cliente");
                      System.out.println("2 - Sair");
                      int escolhaDoCliente2 = scanner.nextInt();
                      if(escolhaDoCliente2 == 1) {
                    	  menuCliente = true;
                      }else if(escolhaDoCliente2 == 2){
                    	  menuCliente = false;
                    	  menuLogin = false;
                      }else {
                    	  System.out.println("Escolha inválida!");
                    	  menuCliente = true;
                      }
                      break; 
                  
                  case 3:
                	  excluirConta(pessoa.getSenha());
                	  System.out.println("Conta excluida com sucesso, retornando ao Login");
                	  menuCliente = false;
                	  break;
                  
                  case 4: 
                	  menuCliente = false;
                	  break;
                  case 5:
                	  menuCliente = false;
                	  menuLogin = false;
                	  break;
                  case 6:
                	  System.out.println("");
              		  mostrar.ExibirCardapio(repositorioCardapio, dia, nomeDia);
              		  System.out.println("");
                	  break;
                  case 7:
                	  fazerPedido.RealizarPedido(repositorioCardapio, ((Cliente) pessoa));
                      System.out.println("\n==================================");
                	  System.out.println("1 - Voltar para Menu do Cliente");
                      System.out.println("2 - Sair");
                      System.out.println("==================================");
                      int escolhaDoCliente7 = scanner.nextInt();
                      if(escolhaDoCliente7 == 1) {
                    	  menuCliente = true;
                      }else if(escolhaDoCliente7 == 2){
                    	  menuCliente = false;
                    	  menuLogin = false;
                      }else {
                    	  System.out.println("Escolha inválida!");
                    	  menuCliente = true;
                      }
                	  break;
                  case 8:
                	  ((Cliente) pessoa).menuCliente(scanner, ((Cliente) pessoa));
                	  break;
                  }
          }
               } else if(pessoa instanceof Cozinheiro) {
            	   boolean menuCozinheiro = true;
                   while(menuCozinheiro) {   
                   System.out.println("----Menu Cozinheiro-----");
                   System.out.println("1 - Mostrar Dados: ");
                   System.out.println("2 - Atualizar Dados");
                   System.out.println("3 - Pedir demissão");
           	       System.out.println("4 - Voltar ao login");
           	       System.out.println("5 - Sair");
           	       System.out.println("6 - Menu de Pedidos: ");
           	       System.out.println("7 - Exibir salário atualizado: ");
            	   int escolhaDoFuncionario = scanner.nextInt();
            	    switch(escolhaDoFuncionario) {
            	    case 1:
            	    	System.out.println("Dados do cozinheiro: ");
                  	  ((Cozinheiro) pessoa).imprimir();
                  	    System.out.println("1 - Voltar para Menu do cozinheiro: ");
                  	    System.out.println("2 - Sair");
                  	    int escolhaDoMenufuncionario = scanner.nextInt();
                  	    if(escolhaDoMenufuncionario == 1) {
                         	  menuCozinheiro = true;
                  	    }else if(escolhaDoMenufuncionario == 2) {
                  	    	System.out.println("Saindo do programa.");
                  	    	menuCozinheiro = false;
                  	    	menuLogin = false;
                  	    }else {
                  	    	System.out.println("Escolha invalida");
                  	    	menuCozinheiro = true;
                  	    }
                  	    break;
            	    case 2:  
                  	  atualizarDados(pessoa);
                  	  System.out.println("1 - Voltar para Menu do cozinheiro: ");
              	      System.out.println("2 - Sair");
              	      int escolhaDoMenufuncionario2 = scanner.nextInt();
              	       if(escolhaDoMenufuncionario2 == 1) {
                     	  menuCozinheiro = true;
              	      }else if(escolhaDoMenufuncionario2 == 2) {
              	    	System.out.println("Saindo do programa.");
              	    	menuCozinheiro = false;
              	    	menuLogin = false;
              	      }else {
              	    	System.out.println("Escolha invalida");
              	    	menuCozinheiro = true;
              	      }
              	    break;
            	    case 3: excluirConta(pessoa.getSenha());
              	            System.out.println("Conta excluida com sucesso, retornando ao Login");
              	            menuCozinheiro = false;
              	     break;
                
                    case 4: 
              	            menuCozinheiro = false;
              	     break;
                    
                    case 5:
              	            menuCozinheiro = false;
              	            menuLogin = false;
              	     break;
                    
                    case 6:
                    	    ((Cozinheiro) pessoa).menuCozinheiro(scanner);
                    	    
                     break;
                    
                    case 7:
                    	    System.out.println("------------------------");
                    	    exibirSalario(pessoa);
                    	    menuCozinheiro = true;
                    	    break;
                    default: 
                    	   System.out.println("Escolha inválida!");
                    	   menuCozinheiro = true;
                }
            	    	
            	   
        	  }
                 } else if (pessoa instanceof Motoboy) {
                	 boolean menuMotoboy = true;
                     while(menuMotoboy) {   
                     System.out.println("----Menu Motoboy-----");
                     System.out.println("1 - Mostrar Dados: ");
                     System.out.println("2 - Atualizar Dados");
                     System.out.println("3 - Pedir demissão");
             	     System.out.println("4 - Voltar ao login");
             	     System.out.println("5 - Sair");
             	     System.out.println("6 - Menu de Pedidos: ");
             	     System.out.println("7 - Exibir salário atualizado");
              	   int escolhaDoFuncionario = scanner.nextInt();
              	    switch(escolhaDoFuncionario) {
              	    case 1:
              	    	System.out.println("Dados do Motoboy: ");
                    	  ((Motoboy) pessoa).imprimir();
                    	    System.out.println("1 - Voltar para Menu do cozinheiro: ");
                    	    System.out.println("2 - Sair");
                    	    int escolhaDoMenufuncionario = scanner.nextInt();
                    	    if(escolhaDoMenufuncionario == 1) {
                           	  menuMotoboy = true;
                    	    }else if(escolhaDoMenufuncionario == 2) {
                    	    	System.out.println("Saindo do programa.");
                    	    	menuMotoboy = false;
                    	    	menuLogin = false;
                    	    }else {
                    	    	System.out.println("Escolha invalida");
                    	    	menuMotoboy = true;
                    	    }
                    	    break;
              	    case 2:  
                    	  atualizarDados(pessoa);
                    	  System.out.println("1 - Voltar para Menu do cozinheiro: ");
                	      System.out.println("2 - Sair");
                	      int escolhaDoMenufuncionario2 = scanner.nextInt();
                	       if(escolhaDoMenufuncionario2 == 1) {
                       	  menuMotoboy = true;
                	      }else if(escolhaDoMenufuncionario2 == 2) {
                	    	System.out.println("Saindo do programa.");
                	    	menuMotoboy = false;
                	    	menuLogin = false;
                	      }else {
                	    	System.out.println("Escolha invalida");
                	    	menuMotoboy = true;
                	      }
                	    break;
              	    case 3: excluirConta(pessoa.getSenha());
                	            System.out.println("Conta excluida com sucesso, retornando ao Login");
                	            menuMotoboy = false;
                	     break;
                  
                      case 4: 
                	            menuMotoboy = false;
                	     break;
                      
                      case 5:
                	            menuMotoboy = false;
                	            menuLogin = false;
                	     break;
                      
                      case 6:
                    	    ((Motoboy) pessoa).menuMotoboy(scanner);
                    	 break;
                      
                      case 7:
                    	  System.out.println("------------------------");
                  	      exibirSalario(pessoa);
                  	      menuMotoboy = true;
                  	      break;
                  	    
                  	  default: 
                  		  System.out.println("Escolha inválida");
                  		  menuMotoboy = true;
                  }
                     }	
                 } else if (pessoa instanceof Gerente) {

               boolean menuGerente = true;
               while(menuGerente) { 
            	 System.out.println("-----------------------------");
             	 System.out.println("Escolha um opção: ");
                 System.out.println("1 - Cadastrar funcionario: ");
                 System.out.println("2 - Lista de clientes: ");
                 System.out.println("3 - Lista de funcionarios: ");
                 System.out.println("4 - Buscar cliente: ");
                 System.out.println("5 - Buscar funcionario: ");
                 System.out.println("6 - Demitir funcionario: ");
                 System.out.println("7 - Voltar para login: ");
                 System.out.println("8 - Sair");
                 System.out.println("9 - Ver Cardapio");
                 System.out.println("10 - Adicionar ou Remover Produto:");
                 System.out.println("11 - Mostrar Salarios: ");
                 System.out.println("12 - Ver detalhaes dos produtos");
                 System.out.println("-----------------------------");
                 int escolha = scanner.nextInt();
                   switch(escolha) {
                       case 1:
                    	 cadastrarFuncionario();
                    	 System.out.println("1 - Voltar");
                    	 System.out.println("2 - Sair");
                    	 int escolhaMenuGerente1 = scanner.nextInt();
                    	 if(escolhaMenuGerente1 == 1) {
                    		 menuGerente = true;
                    	 }else if(escolhaMenuGerente1 == 2) {
                    		 System.out.println("Encerrando Programa!");
                    	     menuLogin = false;
                    	     menuGerente = false;                    	
                    	     }else {
                     		System.out.println("Escolha inválida! ");
                    		menuGerente = true;
                    	}                 	 
                    	 break;
                       case 2:
                    	 listarClientes();
                    	 System.out.println("1 - Voltar");
                    	 System.out.println("2 - Sair");
                    	 int escolhaMenuGerente2 = scanner.nextInt();
                    	 if(escolhaMenuGerente2 == 1) {
                    		 menuGerente = true;
                    	 }else if(escolhaMenuGerente2 == 2) {
                    		 System.out.println("Encerrando Programa!");
                    	     menuLogin = false;
                    	     menuGerente = false;                    	 
                    	     }else {
                     		System.out.println("Escolha inválida! ");
                    		menuGerente = true;
                    	}             
                    	 break;
                       case 3:
                    	 listarFuncionarios();
                    	 System.out.println("----------------------------");
                    	 System.out.println("1 - Voltar");
                    	 System.out.println("2 - Sair");
                    	 int escolhaMenuGerente3 = scanner.nextInt();
                    	 if(escolhaMenuGerente3 == 1) {
                    		 menuGerente = true;
                    	 }else if(escolhaMenuGerente3 == 2) {
                    		 System.out.println("Encerrando Programa!");
                    	     menuLogin = false;
                    	     menuGerente = false;
                    	 }else {
                     		System.out.println("Escolha inválida! ");
                    		menuGerente = true;
                    	}             
                    	 break;
                       case 4:
                    	 System.out.println("Digite o codigo do cliente: ");
                    	 int codigoCliente = scanner.nextInt();
                   		 Pessoa pessoaCliente = repositorio.buscarPorCodigo(codigoCliente);
                         if(pessoaCliente instanceof Cliente) {
                        	 ((Cliente)pessoaCliente).imprimir();
                         }
                         System.out.println("--------------------------");
                         System.out.println("1 - Voltar");
                    	 System.out.println("2 - Sair");
                    	 int escolhaMenuGerente4 = scanner.nextInt();
                    	 if(escolhaMenuGerente4 == 1) {
                    		 menuGerente = true;
                    	 }else if(escolhaMenuGerente4 == 2) {
                    		 System.out.println("Encerrando Programa!");
                    	     menuLogin = false;
                    	     menuGerente = false;                    	
                    	    }else {
                     		System.out.println("Escolha inválida! ");
                    		menuGerente= true;
                    	}             
                    	 break;
                       case 5:
                    	 System.out.println("Digite o codigo do funcionario: ");
                      	 int codigoFuncionario = scanner.nextInt();
                     	     Pessoa pessoaFuncionario = repositorio.buscarPorCodigo(codigoFuncionario);
                           if(pessoaFuncionario instanceof Cozinheiro) {
                          	 ((Cozinheiro)pessoaFuncionario).imprimir();
                           }else if(pessoaFuncionario instanceof Motoboy) {
                            	 ((Motoboy)pessoaFuncionario).imprimir();
                            	 System.out.println("1 - Voltar");
                            	 System.out.println("2 - Sair");
                            	 int escolhaMenuGerente5 = scanner.nextInt();
                            	 if(escolhaMenuGerente5 == 1) {
                            		 menuGerente = true;
                            	 }else if(escolhaMenuGerente5 == 2) {
                            		 System.out.println("Encerrando Programa!");
                            	     menuLogin = false;
                            	     menuGerente = false;                            
                            	    }else {
                             		System.out.println("Escolha inválida! ");
                            		menuGerente = true;
                            	}             
                      	 break;
                      }
                       case 6:
                    	   System.out.println("Digite o codigo do funcionario que você quer demitir: ");
                        	 int codigoParaFuncionario = scanner.nextInt();
                       	     Pessoa pessoaParaFuncionario = repositorio.buscarPorCodigo(codigoParaFuncionario);
                             if(pessoaParaFuncionario instanceof Cozinheiro) {
                            	 repositorio.removerPorCodigo(codigoParaFuncionario);
                             }else if(pessoaParaFuncionario instanceof Motoboy) {
                            	 repositorio.removerPorCodigo(codigoParaFuncionario);
                             }
                             System.out.println("Funcionario demitido com sucesso!");
                             System.out.println("----------------------------");
                             System.out.println("1 - Voltar");
                        	 System.out.println("2 - Sair");
                        	 int escolhaMenuGerente6 = scanner.nextInt();
                        	 if(escolhaMenuGerente6 == 1) {
                        		 menuGerente = true;
                        	 }else if(escolhaMenuGerente6 == 2) {
                        		 System.out.println("Encerrando Programa!");
                        	     menuLogin = false;
                        	     menuGerente = false;
                        	 }else {
                         		System.out.println("Escolha inválida! ");
                        		menuGerente = true;
                        	}
                        	 break;
                       case 7:
                             menuGerente = false;
                             menuLogin = false;
                             break;
                       case 8:
                             System.out.println("Encerrando Programa!");
                    	     menuLogin = false;
                    	     menuGerente = false;
                    	     break;
                       case 9:
                     		 mostrar.ExibirCardapio(repositorioCardapio, dia, nomeDia);
                             break;
                       case 10:
                    	     System.out.println("1 - Adicionar Produto ao Cardapio");
                    	     System.out.println("2 - Remover Produto do Cardapio");
                    	     int escolha10 = scanner.nextInt();
                    	     if(escolha10 == 1) {
                    	    	 adicionarProduto();
                    	    	 System.out.println("1 - Voltar");
                            	 System.out.println("2 - Sair");
                            	 int escolhaMenuGerente7 = scanner.nextInt();
                            	 if(escolhaMenuGerente7 == 1) {
                            		 menuGerente = true;
                            	 }else if(escolhaMenuGerente7 == 2) {
                            		 System.out.println("Encerrando Programa!");
                            	     menuLogin = false;
                            	     menuGerente = false;
                            	 }else {
                             		System.out.println("Escolha inválida! ");
                            		menuGerente = true;
                            	}
                    	     }else if(escolha10 == 2) {
                    	    	 System.out.println("Escreva o código do Produto que será removido: ");
                    	    	 String codigo = scanner.next();
                    	    	 repositorioCardapio.removerItem(codigo);
                    	    	 menuGerente = true;                 	    	 
                    	     }else {
                    	    	 System.out.println("Escolha inválida!Retornando para o menu Gerente."); 
                    	    	 menuGerente = true;
                    	     }
                    	     break;
                       case 11:
                    	      exibirSalario(pessoa);
                    	      break;
                       default:
                     	 System.out.println("Escolha inválida.");
                     	 break;

                   }
        	  }
          }
        } 
       }  		
	}		
	public void listarClientes() {
		ArrayList<Cliente> clientes = repositorio.listaClientes();
		System.out.println("==========CLIENTES==========");
		 if(clientes.isEmpty()) {
		   System.out.println("Nenhum cliente Cadastrado.");
		   }else {
			   for(Cliente c : clientes) {
			   c.imprimir();
		   }
		}	   
	}
	public void listarFuncionarios() {
		ArrayList<Funcionario> funcionario = repositorio.listaFuncionarios();
		System.out.println("==========FUNCIONARIOS==========");
	     if(funcionario.isEmpty()){
	    	 System.out.println("Nenhum funcionário Cadastrado.");
	     }else {
	    	 for(Funcionario f: funcionario) {
	    		 if(f instanceof Gerente) {
	    			 ((Gerente) f).imprimir();
	    		 }else if(f instanceof Cozinheiro) {
	    			 ((Cozinheiro)f).imprimir();
	    		 }else if(f instanceof Motoboy) {
	    			 ((Motoboy)f).imprimir();
	    		 }else {
	    			System.out.println("Listar não deu certo!"); 
	    		 }
	    	 }
	     }
	}
	
	

}
