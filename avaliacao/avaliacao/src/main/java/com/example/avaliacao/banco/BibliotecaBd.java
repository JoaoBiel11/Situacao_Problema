package com.example.avaliacao.banco;

import com.example.avaliacao.model.Emprestimo;
import com.example.avaliacao.model.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BibliotecaBd {

    public List<Emprestimo> clientes;

    public BibliotecaBd() {
        this.clientes = new ArrayList<>();
    }

    //getall por data de inicio de emprestimo
    public List<Emprestimo> findAll(){
        return clientes.stream()
                .sorted(Comparator.comparing(Emprestimo::getDatainicio).reversed())
                .toList();
    }

    //procura pelo id de emprestimo
    public Emprestimo getById(Long id) {
        return clientes.stream()
                .filter(curso -> curso.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //adiciona um livro ao emprestimo
    public boolean insert(Emprestimo livros) {
        clientes.add(livros);
        return true;
    }

    //atualiza o cliente com base no id
    public Emprestimo updateCliente(Long id, Emprestimo emprestimo){
        Emprestimo emprestimoBd = clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);


        emprestimoBd.setCliente(emprestimo.getCliente());

        return emprestimoBd;
    }

    //adiciona novo livro ao emprestimo
    public boolean insertLivro(Long id, Livro livro){
         Emprestimo emprestimoBd = clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (emprestimoBd == null){
            return false;
        }

        emprestimoBd.getLivros().add(livro);

        return true;
    }

    public boolean delete(Long id){
        Emprestimo emprestimoBd = clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);

        clientes.remove(emprestimoBd);

        return true;
    }


}
