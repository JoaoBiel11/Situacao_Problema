package com.example.avaliacao.model;

import jdk.jfr.DataAmount;

import java.util.List;

public class Emprestimo {
    private Long id;
    private Cliente cliente;
    private String datainicio;
    private String datafim;
    private List<Livro> livros;

    public Emprestimo(Cliente cliente, String datainicio, String datafim, List<Livro> livros, Long id) {
        this.cliente = cliente;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.livros = livros;
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
