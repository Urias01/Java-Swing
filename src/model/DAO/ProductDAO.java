/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
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
                .getConnection(SERVIDOR, USUARIO, SENHA); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, produto.getCodigo());
            statement.setString(2, String.valueOf(produto.getStatus()));
            statement.setString(3, produto.getNome());
            statement.setString(4, produto.getDescricao());
            statement.setInt(5, produto.getQtdEstoque());
            statement.setInt(6, produto.getMinEstoque());
            statement.setInt(7, produto.getMaxEstoque());
            statement.setFloat(8, produto.getPrecoCompra());
            statement.setFloat(9, produto.getPrecoVenda());
            statement.setString(10, produto.getBarCode());
            statement.setInt(11, produto.getNcm());
            statement.setFloat(12, produto.getFator());
            statement.setDate(13, new java.sql.Date(produto.getDataCadastro().getTime()));
            statement.setString(14, produto.getImagem());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void alterarProduto(Product produto) {
        String sql = "UPDATE `loja`.`produto` SET cod = ?, status = ?, "
                + "nome = ?, descricao = ?, qtd_estoque = ?, estoque_minimo = ?, estoque_maximo = ?, "
                + "preco_compra = ?, preco_venda = ?, bar_code = ?, ncm = ?, fator = ?, data_cadastro = ?, "
                + "imagem = ? WHERE cod = ? ";

        try (Connection connection = DriverManager
                .getConnection(SERVIDOR, USUARIO, SENHA); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, produto.getCodigo());
            statement.setString(2, String.valueOf(produto.getStatus()));
            statement.setString(3, produto.getNome());
            statement.setString(4, produto.getDescricao());
            statement.setInt(5, produto.getQtdEstoque());
            statement.setInt(6, produto.getMinEstoque());
            statement.setInt(7, produto.getMaxEstoque());
            statement.setFloat(8, produto.getPrecoCompra());
            statement.setFloat(9, produto.getPrecoVenda());
            statement.setString(10, produto.getBarCode());
            statement.setInt(11, produto.getNcm());
            statement.setFloat(12, produto.getFator());
            statement.setDate(13, new java.sql.Date(produto.getDataCadastro().getTime()));
            statement.setString(14, produto.getImagem());
            statement.setString(15, produto.getCodigo());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> listarProduto() {
        String sql = "SELECT * FROM `loja`.`produto`";
        ResultSet result = null;

        List<Product> produtos = new ArrayList<>();
        try (Connection connection = DriverManager
                .getConnection(SERVIDOR, USUARIO, SENHA); PreparedStatement statement = connection.prepareStatement(sql)) {
            result = statement.executeQuery();

            while (result.next()) {
                Product produto = new Product();

                produto.setId(result.getInt("id"));
                produto.setCodigo(result.getString("cod"));
                produto.setStatus(result.getString("status").charAt(0));
                produto.setDataCadastro(result.getDate("data_cadastro"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setQtdEstoque(result.getInt("qtd_estoque"));
                produto.setMinEstoque(result.getInt("estoque_minimo"));
                produto.setMaxEstoque(result.getInt("estoque_maximo"));
                produto.setPrecoCompra(result.getFloat("preco_compra"));
                produto.setPrecoVenda(result.getFloat("preco_venda"));
                produto.setFator(result.getFloat("fator"));
                produto.setNcm(result.getInt("ncm"));
                produto.setBarCode(result.getString("bar_code"));
                produto.setImagem(result.getString("imagem"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

}
