package com.gpspamcary.pessoapamcary.service;

import com.gpspamcary.pessoapamcary.dto.PessoaDTO;
import com.gpspamcary.pessoapamcary.exception.PessoaDataBaseConstraintException;
import com.gpspamcary.pessoapamcary.model.Pessoa;
import com.gpspamcary.pessoapamcary.repository.PessoaRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;


@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRepository repository;

    @InjectMocks
    private PessoaService service;

    @Test
    public void saveTest() {
        Pessoa pessoa1 = new Pessoa("PAULO","000012345","00000067890","SP","DIADEMA","AVENIDA BRASIL");
        PessoaDTO pessoaDTO1 = new PessoaDTO("Paulo","000012345","00000067890","SP","diadema","Avenida brasil");

        Mockito.when(repository.save(any())).thenReturn(pessoa1);
        PessoaDTO pessoaResposta = service.save(pessoaDTO1);
        assertEquals(pessoa1.getGpspamcaryPessoa001Cidade().toUpperCase(Locale.ROOT), pessoaResposta.getGpspamcaryPessoa001Cidade());

    }

    @Test
    public void savefindByIDTest() {
        Pessoa pessoa1 = new Pessoa("Paulo","000012345","00000067890","SP","diadema","Avenida brasil");

        pessoa1.setGpspamcaryPessoa001ID(1L);
        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(pessoa1));
        PessoaDTO pessoaResposta = service.findByID(1L);
        assertEquals(Long.valueOf(1l), pessoaResposta.getGpspamcaryPessoa001ID());
    }

    @Test
    public void findByCPFTest() {
        Pessoa pessoa1 = new Pessoa("Paulo","000012345","00000067890","SP","diadema","Avenida brasil");
        Mockito.when(repository.findByGpspamcaryPessoa001CPF("00000067890")).thenReturn(Optional.of(pessoa1));
        PessoaDTO pessoaResposta = service.findByCPF("00000067890");
        assertEquals("00000067890", pessoaResposta.getGpspamcaryPessoa001CPF());
    }

    @Test
    public void findAllTest() {
        List<Pessoa> list = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(list);
        List<PessoaDTO> listResposta = service.findAll();
        assertEquals(0 ,list.size());
    }


}
