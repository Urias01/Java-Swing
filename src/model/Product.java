/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author urias
 */
public class Product {

    private int id;
    private String codigo;
    private char status;
    private String nome;
    private String descricao;
    private int qtdEstoque;
    private int minEstoque;
    private int maxEstoque;
    private float precoCompra;
    private float precoVenda;
    private int barCode;
    private int ncm;
    private float fator;
    private Date dataCadastro;
    private String imagem;

    public Product(String codigo, char status, String nome,
            String descricao, int qtdEstoque, int minEstoque, int maxEstoque,
            float precoCompra, float precoVenda, int barCode, int ncm,
            float fator, Date dataCadastro, String imagem) {
        this.codigo = codigo;
        this.status = status;
        this.nome = nome;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.minEstoque = minEstoque;
        this.maxEstoque = maxEstoque;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.barCode = barCode;
        this.ncm = ncm;

        this.dataCadastro = dataCadastro;
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getMinEstoque() {
        return minEstoque;
    }

    public void setMinEstoque(int minEstoque) {
        this.minEstoque = minEstoque;
    }

    public int getMaxEstoque() {
        return maxEstoque;
    }

    public void setMaxEstoque(int maxEstoque) {
        this.maxEstoque = maxEstoque;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getNcm() {
        return ncm;
    }

    public void setNcm(int ncm) {
        this.ncm = ncm;
    }

    public float getFator() {
        return fator;
    }

    public void setFator(float fator) {
        this.fator = fator;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    

}
