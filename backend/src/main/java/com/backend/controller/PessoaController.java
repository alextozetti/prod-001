package com.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Pessoa;
import com.backend.service.PessoaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("")
    public List<Pessoa> getAll() {
        return pessoaService.getAll();
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return pessoaService.create(pessoa);
    }

    @GetMapping("/message")
    public String getMethodName() {
        return "Meu primeiro Deploy";
    }
    
}
