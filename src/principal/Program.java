package principal;

import controllers.ProdutoController;

public class Program {

	//ponto de partida paa execução do projeto
	public static void main(String[] args) {
		
		ProdutoController produtoController = new ProdutoController();
		produtoController.cadastrarProduto();
		
		
	}

}
