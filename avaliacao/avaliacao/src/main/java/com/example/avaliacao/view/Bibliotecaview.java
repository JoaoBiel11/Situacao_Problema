package com.example.avaliacao.view;


import com.example.avaliacao.controller.BibliotecaController;
import com.example.avaliacao.model.Emprestimo;
import com.example.avaliacao.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/emprestimo")
public class Bibliotecaview {

    BibliotecaController bibliotecaController = new BibliotecaController();

    @GetMapping
    public List<Emprestimo> getAll() {
        return bibliotecaController.getAll();
    }

    @GetMapping ("/{id}")
    public Emprestimo getById(@PathVariable Long id){
        return bibliotecaController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody Emprestimo emprestimo){
        return bibliotecaController.insert(emprestimo);
    }

    @PostMapping("/inserirLivro/{id}")
    public String insertLivro(@PathVariable Long id,@RequestBody Livro livro){
        return bibliotecaController.insertLivro(id, livro);
    }

    @PutMapping("/atualizarCliente/{id}")
    public Emprestimo updateCliente(@PathVariable Long id, @RequestBody Emprestimo emprestimo){
        return bibliotecaController.updateCliente(id, emprestimo);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        return bibliotecaController.delete(id);
    }


}
