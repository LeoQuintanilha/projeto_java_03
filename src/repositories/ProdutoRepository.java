package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Produto;

public class ProdutoRepository {

	//métido para acessar um banco de dados do PostGreSQL
	//e cadastrar um produto na tabela do banco de dados
	
	public void create(Produto produto) throws Exception {
		
		//Nome do DRIVER JDBC para conexão com o banco de dados
		Class.forName("org.postgresql.Driver");
		
		//abrindo conexão com o banco de dados
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_aula03", "postgres", "18031120");
		
		//escrevendo o comando SQL para excutar no banco de dados
		PreparedStatement preparedStatement = connection.prepareStatement("insert into produto(nome, preco, quantidade) values (?, ?, ?)");
		preparedStatement.setString(1, produto.getNome());
		preparedStatement.setDouble(2, produto.getPreco());
		preparedStatement.setInt(3, produto.getQuantidade());
		preparedStatement.execute();
		
		//fechando a conexão com o banco de dados
		connection.close();
		
		
		
	}
}
