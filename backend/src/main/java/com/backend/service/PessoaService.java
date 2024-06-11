package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.model.Pessoa;
import com.backend.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    public Pessoa create(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> getAll(){
        return pessoaRepository.findAll();
    }

}
