package com.grupo.cardapiosaudavel.model;


import com.grupo.cardapiosaudavel.view.Tela;



public class Cardapio {
	

	
	


	public void iniciarCardapio() {
	
		
		Tela tela = new Tela();

		
		String menu = ":: Cardápio Saúdavel ::\n\n" +
				"1. Definição\n" +
				"2. Aumento de peso\n" +
				"3. Perca de Peso\n";
				


		boolean isAtivo = true;

		
		while (isAtivo) {
			String opcao = tela.informar(menu, "Informe Qual Dieta Deseja Seguir", -1);

			switch (opcao) {
			case "1":
				definiçao(tela);
				
				break;

			case "2":
				aumentoDePeso(tela);
				break;

			case "3":
				percaDePeso(tela);
				break;

			

			default:
				int sair = tela.confirmar("Deseja sair?", "Encerrar", 3);

				if (sair == 0) {
					isAtivo = false;
					tela.mostrar("Encerrando o cardapio...", "Encerrando", 1);
				}
			} 
		} 
	
}
	

	private void definiçao(Tela tela) {
		
		 tela.mostrar("Cardápio (baseado em uma dieta de 2000kcal)\n"
		 		+ "\n"
		 		+ "Café da Manhã aproximadamente 400kcal: \n"
		 		+ "Mingau de Aveia com banana( 200 ml de leite e 3 colheres de sopa de aveia após pronto adicione a banana)\n"
		 		+ "2 Ovos Cozidos\n"
		 		+ "\n"
		 		+ "Pré almoço Aproximadamente 100 kcal: \n"
		 		+ "3 Castanhas do Pará\n"
		 		+ "\n"
		 		+ "Almoço Aproximadamente 600kcal:\n"
		 		+ "\n"
		 		+ "200g de arroz integral\n"
		 		+ "150g de filé de frango\n"
		 		+ "200g de vegetais\n"
		 		+ "\n"
		 		+ "Lanche da tarde aproximadamente 300kcal:\n"
		 		+ "1 dose de whey + iogurte natural desnatado 160g + 2 colheres de sopa de aveia em flocos\n"
		 		+ "\n"
		 		+ "Jantar aproximadamente 500kcal:\n"
		 		+ "150g de arroz integral\n"
		 		+ "100g de filé de frango\n"
		 		+ "150g de vegetais\n"
		 		+ "2 castanhas do Pará\n"
		 		+ "\n"
		 		+ "Ceia aproximadamente 100 kcal:\n"
		 		+ "Omelete de claras com espinafre( 1/2 xícaras de espinafre, 2 claras de ovos, utilize temperos dá sua casa, dê preferências aos naturais","Aqui Está Sua Dieta de Definição",1);

		
		
		
	} 
	
	private void aumentoDePeso(Tela tela) {
		tela.mostrar("Cardápio (baseado em uma dieta de 2500kcal aumento de peso)\n"
				+ "\n"
				+ "Café da Manhã aproximadamente 500kcal: \n"
				+ "Mingau de Aveia com banana( 300 ml de leite e 4 colheres de sopa de aveia após pronto adicione a banana)\n"
				+ "3 Ovos Cozidos\n"
				+ "\n"
				+ "Pré almoço Aproximadamente 150 kcal: \n"
				+ "5 Castanhas do Pará\n"
				+ "\n"
				+ "Almoço Aproximadamente 700kcal:\n"
				+ "\n"
				+ "250g de arroz integral\n"
				+ "150g de filé de frango\n"
				+ "250g de vegetais\n"
				+ "\n"
				+ "Lanche da tarde aproximadamente 400kcal:\n"
				+ "1 dose de whey + iogurte natural desnatado 200g + 3 colheres de sopa de aveia em flocos\n"
				+ "\n"
				+ "Jantar aproximadamente 600kcal:\n"
				+ "200g de arroz integral\n"
				+ "100g de filé de frango\n"
				+ "200g de vegetais\n"
				+ "2 castanhas do Pará\n"
				+ "\n"
				+ "Ceia aproximadamente 150 kcal:\n"
				+ "Omelete de claras com espinafre( 1 xícaras de espinafre, 4 claras de ovos, utilize temperos dá sua casa, dê preferências aos naturais", "Cardápio de Aumento De Peso", 1);
	
			}
			
	
	 
	  private void percaDePeso(Tela tela) {
		  tela.mostrar("Cardápio (baseado em uma dieta de 1700kcal)Perca De Peso\n"
		  		+ "\n"
		  		+ "Café da Manhã aproximadamente 300kcal: \n"
		  		+ "Mingau de Aveia com banana( 150 ml de leite e 2 colheres de sopa de aveia após pronto adicione a banana)\n"
		  		+ "1 Ovos Cozidos\n"
		  		+ "\n"
		  		+ "Pré almoço Aproximadamente 60 kcal: \n"
		  		+ "2 Castanhas do Pará\n"
		  		+ "\n"
		  		+ "Almoço Aproximadamente 500kcal:\n"
		  		+ "\n"
		  		+ "150g de arroz integral\n"
		  		+ "100g de filé de frango\n"
		  		+ "200g de vegetais\n"
		  		+ "\n"
		  		+ "Lanche da tarde aproximadamente 280kcal:\n"
		  		+ "1 dose de whey + iogurte natural desnatado 160g + 1 colheres de sopa de aveia em flocos\n"
		  		+ "\n"
		  		+ "Jantar aproximadamente 470kcal:\n"
		  		+ "150g de arroz integral\n"
		  		+ "100g de filé de frango\n"
		  		+ "150g de vegetais\n"
		  		+ "1 castanhas do Pará\n"
		  		+ "\n"
		  		+ "Ceia aproximadamente 100 kcal:\n"
		  		+ "Omelete de claras com espinafre( 1/2 xícaras de espinafre, 2 claras de ovos, utilize temperos dá sua casa, dê preferências aos naturais", "Cardápio para Aumento de Peso", 1);
	  }
	  
	  }



	  

	  

	   
	   
		
	









