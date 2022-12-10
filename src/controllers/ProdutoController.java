package controllers;

import javax.swing.JOptionPane;

import entities.Produto;
import repositories.ProdutoRepository;

public class ProdutoController {

	
	public void cadastrarProduto() {
		
		try {
			
			Produto produto = new Produto();
			
			//produto.setIdProduto(Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do produto")));
			produto.setNome(JOptionPane.showInputDialog("Informe o nome do produto"));
			produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto")));
			produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto")));
		
			ProdutoRepository produtoRepository = new ProdutoRepository();
			produtoRepository.create(produto);
		
			JOptionPane.showMessageDialog(null, "Produto cadastradao com sucesso!");
		}
		
		catch(IllegalArgumentException e) {
		
			JOptionPane.showInputDialog(null, "Erro de validação: " + e.getMessage());
		}
		
		catch(Exception e) {
			
			System.out.println("\nFalha ao cadastrar produto");
			e.printStackTrace(); 
		}
		
	}
	
	
	
	
	
	
	
}
