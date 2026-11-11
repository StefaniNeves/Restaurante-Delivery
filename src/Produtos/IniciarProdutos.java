package Produtos;

import java.time.DayOfWeek;
import Produtos.Bebida.TipoBebida;
import Produtos.Sobremesa.TipoSobremesa;


public class IniciarProdutos {
	RepositorioCardapio repositorio = new RepositorioCardapio();

        public static void GerarProdutos(RepositorioCardapio repositorio){
            //Cardapio da Segunda:
            Entrada fritas = new Entrada("Fritas","Porção de batata palito frita, bem sequinha e crocante.", 25.90, 10, "ENT001", "Batata, óleo, sal", new DayOfWeek[]{DayOfWeek.MONDAY}, true, true, "nenhum", "150g", 290, "Fonte de carboidratos"); 
    		repositorio.adicionarItem(fritas);
    		Entrada dadinhoTapioca = new Entrada("Dadinho de tapioca","Servido com geleia de pimenta especial, feita aqui.", 29.90, 8,"ENT002","Tapioca, queijo, pimenta", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "lactose", "6 unidades", 270, "Rico em energia" ); 
    		repositorio.adicionarItem(dadinhoTapioca);
    		Entrada torresmo = new Entrada( "Torresmo", "Individual, por comer com a feijoada (ou não!)", 14.90, 6, "ENT003", "Pele de porco, sal, óleo", new DayOfWeek[]{DayOfWeek.MONDAY}, false, true, "nenhum", "100g", 420, "Rico em gordura" ); 
    		repositorio.adicionarItem(torresmo);
    		Entrada saladainha = new Entrada("Saladinha","Porção individual de salada, com folhas frescas e tomate-cereja.", 14.90, 5, "ENT004", "Alface, rúcula, tomate-cereja", new DayOfWeek[]{DayOfWeek.MONDAY}, true, true, "nenhum", "80g", 60, "Baixas calorias" ); 
            repositorio.adicionarItem(saladainha);
      
            PratoPrincipal bifeCavalo = new PratoPrincipal("Bife à cavalo","Filé mignon grelhado, arroz, feijão, farofa e ovo.", 58.90, 25, "PRP001", "Filé mignon, arroz, feijão, ovo, farofa", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "nenhum", false, "Filé mignon", true ); 
            repositorio.adicionarItem(bifeCavalo);
            PratoPrincipal frangoGrelhado = new PratoPrincipal("Frango grelhado","Frango grelhado, arroz, feijão, farofa e salada.", 52.90, 20, "PRP002", "Frango, arroz, feijão, farofa, salada", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "nenhum", false, "Frango", true ); 
            repositorio.adicionarItem(frangoGrelhado); 	 
            PratoPrincipal peixeDia = new PratoPrincipal("Peixe do dia com legumes","Peixe grelhado com legumes variados.", 55.90, 22, "PRP003", "Peixe, legumes, azeite", new DayOfWeek[]{DayOfWeek.MONDAY}, false, true, "peixe", false, "Peixe", true ); 
            repositorio.adicionarItem(peixeDia); 	 
            PratoPrincipal omelete = new PratoPrincipal("Omelete", "Omelete especial com arroz, feijão e salada.", 29.90, 15, "PRP004", "Ovos, arroz, feijão, salada", new DayOfWeek[]{DayOfWeek.MONDAY}, true, true, "ovos", true, "Ovo", true ); 
            repositorio.adicionarItem(omelete);
            
            Sobremesa brigadeiroColher = new Sobremesa("Brigadeiro de colher", "O nome já diz tudo! Feito aqui.", 19.90, 3, "SOB001", "Leite condensado, chocolate, manteiga", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "lactose", TipoSobremesa.DOCE, false ); 
            repositorio.adicionarItem(brigadeiroColher); 	 
            Sobremesa merengue = new Sobremesa("Merengue", "Morango, suspiros e chantilly servidos com carinho.", 22.90, 4, "SOB002", "Morango, suspiro, chantilly", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "lactose, ovo", TipoSobremesa.DOCE, true ); 
            repositorio.adicionarItem(merengue); 	 
            Sobremesa pudim = new Sobremesa("Pudim", "Sem furinhos, tá? Feito com leite fresco na casa.", 15.90, 5, "SOB003", "Leite, ovos, açúcar", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "lactose, ovo", TipoSobremesa.DOCE, false ); 
            repositorio.adicionarItem(pudim); 	 
            Sobremesa frutasEstacao = new Sobremesa("Frutas da estação", "Fatiadas, sem casca e semente, servidas num pratinho.", 9.90, 2, "SOB004", "Frutas variadas", new DayOfWeek[]{DayOfWeek.MONDAY}, true, true, "nenhum", TipoSobremesa.FRUTAS, false ); 
            repositorio.adicionarItem(frutasEstacao);
            
            Bebida refrigerante = new Bebida("Refrigerante", "Lata 350 ml", 5.90, 0, "BEB001", "Água gaseificada, açúcar, corantes", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "corantes, cafeína", TipoBebida.REFRIGERANTE, false, "Coca-Cola", 350 ); 
            repositorio.adicionarItem(refrigerante);	 
            Bebida agua500 = new Bebida("Água", "Garrafa 500 ml com ou sem gás", 3.90, 0, "BEB002", "Água mineral", new DayOfWeek[]{DayOfWeek.MONDAY}, true, true, "nenhum", TipoBebida.AGUA, true, "Crystal", 500 ); 
            repositorio.adicionarItem(agua500); 	 
            Bebida agua300 = new Bebida("Água com gás", "Garrafa 300 ml", 2.90, 0, "BEB003", "Água com gás", new DayOfWeek[]{DayOfWeek.MONDAY}, true, true, "nenhum", TipoBebida.AGUA, true, "Crystal", 300 ); 
            repositorio.adicionarItem(agua300); 	 
            Bebida ginTonica = new Bebida("Gin tônica", "Taça 150 ml, tônica com gin", 24.90, 1, "BEB004", "Gin, água tônica", new DayOfWeek[]{DayOfWeek.MONDAY}, false, false, "álcool", TipoBebida.ALCOOLICA, false, "Tanqueray", 150 );
            repositorio.adicionarItem(ginTonica);
            
            //Cardapio da Terça:
            Entrada bruschetta = new Entrada("Bruschetta", "Fatias de pão italiano com tomate, manjericão e azeite.", 22.90, 10, "ENT001", "Pão italiano, tomate, manjericão, azeite", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, true, "glúten", "2 unidades", 180, "Fonte de fibras" ); 
            repositorio.adicionarItem(bruschetta); 	 
            Entrada caldoAbobora = new Entrada("Caldo de abóbora", "Servido quentinho com croutons crocantes.", 18.90, 15, "ENT002", "Abóbora, creme de leite, croutons", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, false, "lactose, glúten", "300ml", 120, "Rico em vitaminas" ); 
            repositorio.adicionarItem(caldoAbobora); 	 
            Entrada bolinhoArroz = new Entrada("Bolinho de arroz", "Porção com 6 unidades, acompanha molho de pimenta suave.", 21.90, 12, "ENT003", "Arroz, ovos, queijo, molho de pimenta", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "ovos, lactose", "6 unidades", 250, "Alto em carboidratos" ); 
            repositorio.adicionarItem(bolinhoArroz);	 
            Entrada mixFolhas = new Entrada("Mix de folhas", "Alface americana, rúcula e cenoura ralada com molho mostarda e mel.", 16.90, 8, "ENT004", "Alface, rúcula, cenoura, molho de mostarda e mel", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, true, "mostarda", "150g", 90, "Baixo teor calórico" ); 
            repositorio.adicionarItem(mixFolhas);
            Sobremesa mousseChocolate = new Sobremesa("Mousse de chocolate", "Macio, cremoso e com cobertura de raspas.", 17.90, 5, "SOB001", "Chocolate, creme de leite, ovos", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "lactose, ovos", TipoSobremesa.MOUSSE, true ); 
            repositorio.adicionarItem(mousseChocolate);	 
            Sobremesa brownieSorvete = new Sobremesa("Brownie com sorvete", "Brownie de chocolate com noz + bola de creme.", 22.00, 8, "SOB002", "Chocolate, nozes, sorvete, ovos, farinha", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "lactose, ovos, glúten, nozes", TipoSobremesa.BOLO, true ); 
            repositorio.adicionarItem(brownieSorvete);	 
            Sobremesa tortaLimao = new Sobremesa("Torta de limão", "Base crocante, mousse de limão e merengue tostado.", 15.00, 6, "SOB003", "Farinha, limão, ovos, leite condensado", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "lactose, ovos, glúten", TipoSobremesa.TORTA, true ); 
            repositorio.adicionarItem(tortaLimao);	 
            Sobremesa frutasIogurte = new Sobremesa("Frutas com iogurte", "Cubos de frutas frescas com iogurte natural.", 9.90, 4, "SOB004", "Frutas variadas, iogurte natural", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, false, "lactose", TipoSobremesa.FRUTAS, false ); 
            repositorio.adicionarItem(frutasIogurte);	
            PratoPrincipal escondidinho = new PratoPrincipal("Escondidinho de carne", "Acompanhado de arroz branco e salada.", 49.90, 20, "PRP001", "Carne moída, purê de batata, arroz, salada", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "glúten, lactose", false, "Carne bovina", false ); 
            repositorio.adicionarItem(escondidinho);		 
            PratoPrincipal estrogonofe = new PratoPrincipal("Estrogonofe de frango", "Com arroz, batata palha e salada de alface.", 47.00, 18, "PRP002", "Frango, creme de leite, arroz, batata palha", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "lactose, glúten", false, "Frango", false ); 
            repositorio.adicionarItem(estrogonofe); 		 
            PratoPrincipal moqueca = new PratoPrincipal("Moqueca de peixe", "Servida com arroz, farofa de dendê e pirão.", 59.90, 25, "PRP003", "Peixe, leite de coco, arroz, farofa", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, true, "peixe", false, "Peixe", true ); 
            repositorio.adicionarItem(moqueca);		 
            PratoPrincipal lasanha = new PratoPrincipal("Lasanha à bolonhesa", "Com queijo gratinado e molho de tomate fresco.", 43.90, 20, "PRP004", "Massa, carne moída, queijo, molho de tomate", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, false, "glúten, lactose", false, "Carne bovina", false ); 
            repositorio.adicionarItem(lasanha);		
            Bebida refrigeranteTerca = new Bebida("Refrigerante", "Lata 350 ml", 5.90, 0, "BEB001", "Água gaseificada, açúcar, corantes, conservantes", new DayOfWeek[]{DayOfWeek.TUESDAY}, false, true, "corantes", TipoBebida.REFRIGERANTE, false, "Coca-Cola", 350 ); 
            repositorio.adicionarItem(refrigeranteTerca);
            Bebida agua = new Bebida("Água mineral", "500 ml com ou sem gás", 3.90, 0, "BEB002", "Água mineral natural", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, true, "nenhum", TipoBebida.AGUA, true, "Crystal", 500 ); 
            repositorio.adicionarItem(agua);			 
            Bebida suco = new Bebida("Suco natural", "Sabores: laranja, limão, uva.", 7.90, 2, "BEB003", "Fruta natural, água, açúcar", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, true, "nenhum", TipoBebida.SUCO, false, "Suco da Casa", 400 ); 
            repositorio.adicionarItem(suco);
            Bebida cafe = new Bebida("Café expresso", "Servido na xícara, forte e encorpado.", 4.50, 1, "BEB004", "Café 100% arábica", new DayOfWeek[]{DayOfWeek.TUESDAY}, true, true, "nenhum", TipoBebida.CAFE, true, "Três Corações", 100 ); 
            repositorio.adicionarItem(cafe);
            
            //Cardapio de Quarta:
            
            Entrada croquete = new Entrada("Croquete de carne", "Croquetes crocantes com molho de mostarda.", 23.90, 12, "ENT005", "Carne moída, farinha, especiarias", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, false, "glúten, ovos", "6 unidades", 260, "Alto teor proteico" ); 
            repositorio.adicionarItem(croquete); 
            Entrada miniCaprese = new Entrada("Mini caprese", "Tomate cereja, muçarela de búfala e manjericão com azeite.", 24.90, 10, "ENT006", "Tomate, muçarela de búfala, manjericão, azeite", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, false, "lactose", "8 unidades", 150, "Fonte de cálcio" ); 
            repositorio.adicionarItem(miniCaprese);
            Entrada cevicheVegetariano = new Entrada("Ceviche vegetariano", "Marinado com limão, coentro e pimentões coloridos.", 19.90, 8, "ENT007", "Pimentão, cebola roxa, limão, coentro", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "nenhum", "200g", 100, "Rico em vitamina C" ); 
            repositorio.adicionarItem(cevicheVegetariano);
            Entrada palitosQueijo = new Entrada("Palitos de queijo", "Queijo empanado frito, acompanha molho agridoce.", 26.90, 10, "ENT008", "Queijo, farinha, ovos, molho", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, false, "lactose, glúten, ovos", "5 unidades", 300, "Fonte de proteína e cálcio" ); 
            repositorio.adicionarItem(palitosQueijo);
            PratoPrincipal feijoadaCompleta = new PratoPrincipal("Feijoada completa", "Com arroz, farofa, couve e laranja.",  62.00,  30,  "PRP005",  "Feijão preto, carne suína, arroz, couve",  new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, false, "glúten", false, "Carne suína", true ); 
            repositorio.adicionarItem(feijoadaCompleta);
            PratoPrincipal strogonoffVegetariano = new PratoPrincipal("Strogonoff vegetariano","Feito com cogumelos, arroz e batata palha.", 45.00, 18, "PRP006", "Cogumelos, creme de leite, arroz, batata", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "lactose", true, "Cogumelos", false  ); 
            repositorio.adicionarItem(strogonoffVegetariano);
            PratoPrincipal yakisoba = new PratoPrincipal("Yakisoba de carne", "Macarrão oriental com legumes e molho shoyu.", 49.90, 20, "PRP007", "Carne bovina, legumes, macarrão, shoyu", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, false, "glúten, soja", false, "Carne bovina", false ); 
            repositorio.adicionarItem(yakisoba);
            PratoPrincipal nhoque = new PratoPrincipal("Nhoque ao sugo","Massa de batata com molho de tomate fresco.", 39.90, 15, "PRP008", "Batata, farinha, molho de tomate", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "glúten", true, "Nenhuma", false ); 
            repositorio.adicionarItem(nhoque);
          
            Sobremesa mousseMaracuja = new Sobremesa("Mousse de maracujá", "Cremoso e doce na medida.", 16.00, 5, "SOB005", "Maracujá, leite condensado, creme de leite", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, false, "lactose", TipoSobremesa.MOUSSE, true ); 
            repositorio.adicionarItem(mousseMaracuja); 
            Sobremesa boloCenoura = new Sobremesa("Bolo de cenoura com cobertura", "Cobertura de chocolate crocante.", 13.00, 10, "SOB006", "Cenoura, ovos, açúcar, farinha, chocolate", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, false, "glúten, lactose, ovos", TipoSobremesa.BOLO, false ); 
            repositorio.adicionarItem(boloCenoura); 
            Sobremesa cocada = new Sobremesa("Cocada cremosa", "Coco ralado com leite condensado.", 14.00, 4, "SOB007", "Coco, leite condensado, açúcar", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, false, "lactose", TipoSobremesa.DOCE, false ); 
            repositorio.adicionarItem(cocada); 
            Sobremesa saladaFrutas = new Sobremesa("Salada de frutas", "Frutas da estação picadas e geladas.", 10.00, 3, "SOB008", "Frutas diversas", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "nenhum", TipoSobremesa.FRUTAS, true ); 
            repositorio.adicionarItem(saladaFrutas); 
             
            Bebida refrigeranteZero = new Bebida("Refrigerante Zero", "Lata 350 ml sem açúcar", 5.90, 0, "BEB005", "Água gaseificada, adoçantes, corantes", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, false, true, "corantes", TipoBebida.REFRIGERANTE, true, "Coca-Cola Zero",  350 ); 
            repositorio.adicionarItem(refrigeranteZero); 
            Bebida aguaComGelo = new Bebida("Água com gelo e limão", "Refrescante", 3.90, 0, "BEB006", "Água, limão", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "nenhum", TipoBebida.AGUA, true, "Do Campo", 500 ); 
            repositorio.adicionarItem(aguaComGelo); 
            Bebida sucoDetox = new Bebida("Suco detox", "Couve, limão e maçã.", 8.90, 2, "BEB007", "Couve, limão, maçã, água", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "nenhum", TipoBebida.SUCO, true, "Natural Juice", 400 ); 
            repositorio.adicionarItem(sucoDetox); 
            Bebida chaGelado = new Bebida("Chá gelado", "Sabor pêssego, zero açúcar.", 6.50, 1, "BEB008", "Chá preto, pêssego, adoçantes", new DayOfWeek[]{DayOfWeek.WEDNESDAY}, true, true, "nenhum", TipoBebida.CHA, true, "Feel Good", 300 );
            repositorio.adicionarItem(chaGelado);
            //Cardapio da Quinta:
             
            Entrada bolinhoBacalhau = new Entrada("Bolinho de bacalhau", "Crocante por fora e macio por dentro.", 26.90, 12, "ENT009", "Bacalhau, batata, temperos", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "peixe, ovos", "6 unidades", 250, "Fonte de ômega 3" ); 
            repositorio.adicionarItem(bolinhoBacalhau); 	 
            Entrada bruschettaHolandesa = new Entrada("Bruschetta", "Pão italiano com tomate, manjericão e azeite.", 21.90, 8, "ENT010", "Pão, tomate, azeite, manjericão", new DayOfWeek[]{DayOfWeek.THURSDAY}, true, true, "glúten", "2 fatias", 200, "Rico em antioxidantes" ); 
            repositorio.adicionarItem(bruschettaHolandesa);	 
           	Entrada carpaccio = new Entrada("Carpaccio de carne", "Finas fatias de carne com parmesão e rúcula.", 29.90, 10, "ENT011", "Carne bovina, parmesão, rúcula", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "lactose", "100g", 180, "Fonte de ferro" ); 
           	repositorio.adicionarItem(carpaccio);	 
           	Entrada hummus = new Entrada("Hummus com torradas", "Pasta de grão-de-bico com azeite e alho.", 18.90, 7, "ENT012", "Grão-de-bico, alho, tahine, azeite", new DayOfWeek[]{DayOfWeek.THURSDAY}, true, true, "glúten (nas torradas)", "150g + 4 torradas", 220, "Rico em fibras" ); 
           	repositorio.adicionarItem(hummus);	  
           	PratoPrincipal lasanhaBolonhesa = new PratoPrincipal("Lasanha à bolonhesa","Massa fresca com carne moída e molho de tomate.", 58.00, 25, "PRP009", "Massa, carne moída, molho, queijo", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "glúten, lactose", false, "Carne bovina", false ); 
           	repositorio.adicionarItem(lasanhaBolonhesa);	 
           	PratoPrincipal moqueca2 = new PratoPrincipal("Moqueca de peixe", "Peixe cozido com leite de coco e pimentões.", 59.90, 30, "PRP010", "Peixe, leite de coco, pimentão, arroz", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, true, "peixe", false, "Peixe", true ); 
           	repositorio.adicionarItem(moqueca2);	 
           	PratoPrincipal risotoFunghi = new PratoPrincipal("Risoto de funghi", "Arroz arbório com cogumelos e parmesão.", 49.00, 20, "PRP011", "Arroz arbório, funghi, queijo", new DayOfWeek[]{DayOfWeek.THURSDAY}, true, false, "lactose", true, "Cogumelos", false ); 
           	repositorio.adicionarItem(risotoFunghi);	 
           	PratoPrincipal escondidinho2 = new PratoPrincipal("Escondidinho de carne seca", "Purê de mandioca com carne seca desfiada.", 52.90, 20, "PRP012", "Carne seca, mandioca, queijo", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "lactose", false, "Carne bovina", true ); 
           	repositorio.adicionarItem(escondidinho2);	  
           	Sobremesa tortaLimao2 = new Sobremesa("Torta de limão", "Cremosa com cobertura merengue.", 16.90, 8, "SOB009", "Limão, leite condensado, massa", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "lactose, glúten", TipoSobremesa.TORTA, true ); 
           	repositorio.adicionarItem(tortaLimao2);	 
           	Sobremesa manjar = new Sobremesa("Manjar de coco", "Com calda de ameixa.", 17.00, 5, "SOB010", "Leite, coco, açúcar, ameixa", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "lactose", TipoSobremesa.DOCE, true ); 
           	repositorio.adicionarItem(manjar);	 
            Sobremesa brownie = new Sobremesa("Brownie de chocolate", "Servido com calda quente.", 15.90, 6, "SOB011", "Chocolate, farinha, ovos, manteiga", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "glúten, lactose, ovos", TipoSobremesa.BOLO, false ); 
            repositorio.adicionarItem(brownie);	 
            Sobremesa gelatinaColorida = new Sobremesa("Gelatina colorida", "Diversos sabores, bem refrescante.", 9.90, 2, "SOB012", "Gelatina, corantes, água", new DayOfWeek[]{DayOfWeek.THURSDAY}, true, true, "corantes", TipoSobremesa.GELATINA, true ); 
            repositorio.adicionarItem(gelatinaColorida);	 
            Bebida refrigeranteLaranja = new Bebida("Refrigerante de laranja", "Lata 350 ml", 5.90, 0, "BEB009", "Água gaseificada, açúcar, corante", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "corantes", TipoBebida.REFRIGERANTE, false, "Fanta", 350 ); 
            repositorio.adicionarItem(refrigeranteLaranja);	 
            Bebida aguaSemGas = new Bebida("Água sem gás", "Garrafa 500ml", 3.90, 0, "BEB010", "Água mineral", new DayOfWeek[]{DayOfWeek.THURSDAY}, true, true, "nenhum", TipoBebida.AGUA, true, "Crystal", 500 ); 
            repositorio.adicionarItem(aguaSemGas);	 
            Bebida sucoManga = new Bebida("Suco de manga", "Natural, sem açúcar adicionado.", 7.90, 2, "BEB011", "Manga, água", new DayOfWeek[]{DayOfWeek.THURSDAY}, true, true, "nenhum", TipoBebida.SUCO, true, "Natural Juice", 400 ); 
            repositorio.adicionarItem(sucoManga);	 
            Bebida cafeGelado = new Bebida("Café gelado", "Com leite e um toque de baunilha.", 6.90, 2, "BEB012", "Café, leite, baunilha", new DayOfWeek[]{DayOfWeek.THURSDAY}, false, false, "lactose", TipoBebida.CAFE,false, "CoffeeTime", 300 ); 
            repositorio.adicionarItem(cafeGelado);
            //Cardapio de Sexta:
              	  
            Entrada pastelQueijo = new Entrada("Pastel de queijo", "Pastel frito com recheio de queijo derretido.", 19.90, 10, "ENT013", "Massa de pastel, queijo", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, false, "glúten, lactose", "2 unidades", 320, "Fonte de energia" ); 
            repositorio.adicionarItem(pastelQueijo); 	 
            Entrada ceviche = new Entrada("Ceviche de tilápia", "Tilápia marinada no limão com cebola e coentro.", 27.90, 8, "ENT014", "Tilápia, limão, cebola, coentro", new DayOfWeek[]{DayOfWeek.FRIDAY}, false, true, "peixe", "120g", 180, "Rico em proteína" ); 
            repositorio.adicionarItem(ceviche);	 
            Entrada tabule = new Entrada("Tabule", "Salada árabe refrescante com trigo e hortelã.", 16.90, 6, "ENT015", "Trigo, tomate, pepino, hortelã", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "glúten", "150g", 160, "Fonte de fibras" ); 
            repositorio.adicionarItem(tabule);	 
            Entrada guacamole = new Entrada("Guacamole com chips", "Abacate temperado com chips crocantes.", 22.90, 7, "ENT016", "Abacate, tomate, limão, chips de milho", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "nenhum", "100g + chips", 210, "Gorduras boas" ); 
            repositorio.adicionarItem(guacamole);	 
            PratoPrincipal feijoada = new PratoPrincipal("Feijoada completa", "Feijão preto com carnes, arroz e couve.", 62.90, 30, "PRP013", "Feijão preto, carnes, arroz, couve", new DayOfWeek[]{DayOfWeek.FRIDAY}, false, false, "nenhum", false, "Carnes variadas", true ); 
            repositorio.adicionarItem(feijoada);	 
            PratoPrincipal peixeAssado = new PratoPrincipal("Peixe assado com legumes", "Filé assado com batatas e cenouras.", 55.00, 25, "PRP014", "Filé de peixe, legumes, azeite", new DayOfWeek[]{DayOfWeek.FRIDAY}, false,true, "peixe", false, "Peixe",true ); 
            repositorio.adicionarItem(peixeAssado);	 
            PratoPrincipal macarraoVegano = new PratoPrincipal("Macarrão vegano ao pesto", "Com molho pesto de manjericão e castanhas.", 49.90, 20, "PRP015", "Macarrão, manjericão, castanhas", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "glúten, castanhas", true,"Nenhuma (vegano)", false ); 
            repositorio.adicionarItem(macarraoVegano);	 
            PratoPrincipal estrogonofeFrango = new PratoPrincipal("Estrogonofe de frango", "Com arroz branco e batata palha.", 54.90, 18, "PRP016", "Frango, creme de leite, arroz, batata", new DayOfWeek[]{DayOfWeek.FRIDAY}, false, false, "lactose", false, "Frango", true ); 
            repositorio.adicionarItem(estrogonofeFrango);	 	
            Sobremesa mousseMaracujaSesta = new Sobremesa("Mousse de maracujá", "Doce cremoso e refrescante.", 13.90, 5, "SOB013", "Maracujá, leite condensado, creme de leite", new DayOfWeek[]{DayOfWeek.FRIDAY}, false, false, "lactose", TipoSobremesa.MOUSSE, true ); 
            repositorio.adicionarItem(mousseMaracujaSesta);	 
            Sobremesa cocadaSexta = new Sobremesa("Cocada branca", "Doce tradicional de coco.", 11.90, 4, "SOB014", "Coco, açúcar, leite", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, false, "lactose", TipoSobremesa.DOCE, false ); 
            repositorio.adicionarItem(cocadaSexta);	 
            Sobremesa rolinhoDoce = new Sobremesa("Rolinho doce de banana", "Com canela e açúcar.", 12.90, 6, "SOB015", "Banana, massa, canela", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "glúten", TipoSobremesa.BOLO, false ); 
            repositorio.adicionarItem(rolinhoDoce);	 
            Sobremesa picoleMorango = new Sobremesa("Picolé de morango", "Fruta natural congelada.", 7.90, 0, "SOB016", "Morango, água, açúcar", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "nenhum", TipoSobremesa.PICOLE, true); 
            repositorio.adicionarItem(picoleMorango);	   
            Bebida sucoCaju = new Bebida("Suco de caju", "Natural, levemente adocicado.", 6.90, 2, "BEB013", "Caju, água, açúcar", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "nenhum", TipoBebida.SUCO, false, "Natural", 400 ); 
            repositorio.adicionarItem(sucoCaju);	 
            Bebida refrigeranteCola = new Bebida("Refrigerante cola", "Lata 350 ml", 5.90, 0, "BEB014", "Água gaseificada, açúcar, cafeína", new DayOfWeek[]{DayOfWeek.FRIDAY}, false, false, "cafeína, corante",TipoBebida.REFRIGERANTE, false, "Coca-Cola", 350 ); 
            repositorio.adicionarItem(refrigeranteCola);	 
            Bebida aguaComGas = new Bebida("Água com gás", "Garrafa 500 ml", 3.90, 0, "BEB015", "Água mineral com gás", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "nenhum", TipoBebida.AGUA, true, "Crystal", 500 ); 
            repositorio.adicionarItem(aguaComGas);	 
            Bebida sucoVerde = new Bebida("Suco verde", "Detox com couve, maçã e limão.", 8.90, 3, "BEB016", "Couve, maçã, limão, água", new DayOfWeek[]{DayOfWeek.FRIDAY}, true, true, "nenhum", TipoBebida.SUCO, true, "Detox Mix",  400 ); 
            repositorio.adicionarItem(sucoVerde);
        }
}
