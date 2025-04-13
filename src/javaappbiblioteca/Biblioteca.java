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
    private String sinopse;
    private String genero;
    private String publicoAlvo;
    private String autor;
    private String editora;
    private String ISBN;
    private String andar;
    private int corredor;
    private int anoLancamento;

    public Biblioteca(String titulo, String sinopse, String genero, String publicoAlvo, String autor, String editora, String ISBN, String andar, int corredor, int anoLancamento) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
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

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
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
