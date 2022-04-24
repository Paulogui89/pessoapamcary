package com.gpspamcary.pessoapamcary.repository;

import com.gpspamcary.pessoapamcary.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

