package com.example.avaliacao.model;

public class Livro {

    private Long idlivro;
    private String nome;
    private String autor;
    private String genero;

    public Livro(String nome, String autor, String genero, Long idlivro) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.idlivro = idlivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(Long id) {
        this.idlivro = id;
    }
}
