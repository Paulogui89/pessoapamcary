package com.gpspamcary.pessoapamcary.service;


import com.gpspamcary.pessoapamcary.exception.PessoaDataBaseConstraintException;
import com.gpspamcary.pessoapamcary.exception.PessoaNotFoundException;
import com.gpspamcary.pessoapamcary.model.Pessoa;
import com.gpspamcary.pessoapamcary.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Pessoa findByID(Long id) {
        Optional<Pessoa> optionalPessoa = repository.findById(id);
        return optionalPessoa.orElseThrow(() -> new PessoaNotFoundException("not find by id" + id));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
