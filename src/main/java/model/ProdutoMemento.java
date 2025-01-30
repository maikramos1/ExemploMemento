/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maik.maifredo
 */
public class ProdutoMemento {
    private String nome;
    private double preco;
    private String categoria;

    ProdutoMemento(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }

    String getCategoria() {
        return categoria;
    }
    
    
}
