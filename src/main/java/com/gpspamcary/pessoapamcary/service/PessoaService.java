package com.gpspamcary.pessoapamcary.service;


import com.gpspamcary.pessoapamcary.dto.PessoaDTO;
import com.gpspamcary.pessoapamcary.exception.PessoaDataBaseConstraintException;
import com.gpspamcary.pessoapamcary.exception.PessoaNotFoundException;
import com.gpspamcary.pessoapamcary.model.Pessoa;
import com.gpspamcary.pessoapamcary.repository.PessoaRepository;
import com.gpspamcary.pessoapamcary.util.PessoaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository repository;

    public List<PessoaDTO> findAll(){
        return PessoaMapper.toListDTO(repository.findAll()) ;
    }

    public PessoaDTO save(PessoaDTO pessoaDTO) {
        try{
            Pessoa pessoa = PessoaMapper.toEntity(pessoaDTO);
            return PessoaMapper.toDTO(repository.save(pessoa));
        }catch (Exception e){
            throw new PessoaDataBaseConstraintException(e.getMessage());
        }
    }

    public PessoaDTO findByID(Long id) {
        Optional<Pessoa> optionalPessoa = repository.findById(id);
        return PessoaMapper.toDTO(optionalPessoa.orElseThrow(() -> new PessoaNotFoundException("not find by id" + id)));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public PessoaDTO findByCPF(String cpf) {
        Optional<Pessoa> optionalPessoa = repository.findByGpspamcaryPessoa001CPF(cpf.replaceAll("[^\\d]", ""));
        return PessoaMapper.toDTO(optionalPessoa.orElseThrow(() -> new PessoaNotFoundException("not find by cpf" + cpf)));
    }
}
