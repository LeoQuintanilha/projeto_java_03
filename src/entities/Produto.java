package entities;

public class Produto {

	// atributos
	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {

		if (idProduto <= 0) {
			throw new IllegalArgumentException("O Id do produto deve ser maior do que zero!");
		}

		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		if(nome == null || nome.length() < 6) {
			throw new IllegalArgumentException("O nome do produto é obrigatório e deve ter no mínimo 6 caracteres!");
		}
		
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		
		if(preco<= 0) {
			throw new IllegalArgumentException("O preço do produto deve ser maior do que zero!");
		}
		
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		
		if(quantidade<= 0) {
			throw new IllegalArgumentException("A quantidade do produto deve ser maior do que zero!");
		}
		
		this.quantidade = quantidade;
	}
}
