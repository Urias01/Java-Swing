/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.*;
import model.Product;

/**
 *
 * @author urias
 */
public class ProductDAO {

    private static final String SERVIDOR = "jdbc:mysql://localhost:3306/loja";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public static void inserirProduto(Product produto) {
        String sql = "INSERT INTO `loja`.`produto` (cod, status, "
                + "nome, descricao, qtd_estoque, estoque_minimo, estoque_maximo, "
                + "preco_compra, preco_venda, bar_code, ncm, fator, data_cadastro, "
                + "imagem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager
                .getConnection(SERVIDOR, USUARIO, SENHA); 
          PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, produto.getCodigo());
            statement.setString(2, String.valueOf(produto.getStatus()));
            statement.setString(3, produto.getNome());
            statement.setString(4, produto.getDescricao());
            statement.setInt(5, produto.getQtdEstoque());
            statement.setInt(6, produto.getMinEstoque());
            statement.setInt(7, produto.getMaxEstoque());
            statement.setFloat(8, produto.getPrecoCompra());
            statement.setFloat(9, produto.getPrecoVenda());
            statement.setInt(10, produto.getBarCode());
            statement.setInt(11, produto.getNcm());
            statement.setFloat(12, produto.getFator());
            statement.setDate(13, new java.sql.Date(produto.getDataCadastro().getTime()));
            statement.setString(14, produto.getImagem());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
}
