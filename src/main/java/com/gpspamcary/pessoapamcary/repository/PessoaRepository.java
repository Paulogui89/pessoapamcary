package com.gpspamcary.pessoapamcary.repository;

import com.gpspamcary.pessoapamcary.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    public Optional<Pessoa> findByGpspamcaryPessoa001CPF(String cpf);
}

