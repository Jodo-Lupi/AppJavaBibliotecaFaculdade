/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappbiblioteca;

/**
 *
 * @author Joao
 */
public class Biblioteca {
    private String titulo;
    private String descricao;
    private String categoria;
    private String publicoAlvo;
    private String autor;
    private String editora;
    private String ISBN;
    private int andar;
    private int corredor;
    private int anoLancamento;

    public Biblioteca(String titulo, String descricao, String categoria, String publicoAlvo, String autor, String editora, String ISBN, int andar, int corredor, int anoLancamento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.publicoAlvo = publicoAlvo;
        this.autor = autor;
        this.editora = editora;
        this.ISBN = ISBN;
        this.andar = andar;
        this.corredor = corredor;
        this.anoLancamento = anoLancamento;
    }

    public Biblioteca() {
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCorredor() {
        return corredor;
    }

    public void setCorredor(int corredor) {
        this.corredor = corredor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
}
