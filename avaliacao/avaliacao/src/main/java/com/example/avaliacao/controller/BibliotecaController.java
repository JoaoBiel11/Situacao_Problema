package com.example.avaliacao.controller;

import com.example.avaliacao.banco.BibliotecaBd;
import com.example.avaliacao.model.Emprestimo;
import com.example.avaliacao.model.Livro;

import java.util.EnumMap;
import java.util.List;

public class BibliotecaController {

    BibliotecaBd repository = new BibliotecaBd();

    //ver todos
    public List<Emprestimo> getAll(){
        return repository.findAll();
    }

    //update
    public Emprestimo updateCliente(Long id, Emprestimo emprestimo){
        return repository.updateCliente(id, emprestimo);
    }

    //insert livro
    public String insertLivro(Long id , Livro livro){
        String response = (repository.insertLivro(id , livro)) ? "Livro inserido com sucesso!" :
                "Não foi possivel inserir o livro";

        return response;
    }

    //insert
    public boolean insert(Emprestimo emprestimo){
        return repository.insert(emprestimo);
    }

    //ver todos pleo id
    public Emprestimo getById(Long id){
        return repository.getById(id);
    }

    public boolean delete(Long id){
        return repository.delete(id);
    }

}
