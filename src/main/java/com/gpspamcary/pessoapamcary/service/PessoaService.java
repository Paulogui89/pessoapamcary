package com.gpspamcary.pessoapamcary.service;


import com.gpspamcary.pessoapamcary.exception.PessoaDataBaseConstraintException;
import com.gpspamcary.pessoapamcary.model.Pessoa;
import com.gpspamcary.pessoapamcary.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        try{
            return repository.save(pessoa);
        }catch (Exception e){
            throw new PessoaDataBaseConstraintException(e.getMessage());
        }
    }
}
