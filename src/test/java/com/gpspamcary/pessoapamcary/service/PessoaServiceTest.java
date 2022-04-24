package com.gpspamcary.pessoapamcary.service;

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
import java.util.Optional;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class PessoaServiceTest {

    @Mock
    private PessoaRepository repository;

    @InjectMocks
    private PessoaService service;

    @Test
    public void saveTest() {
        Pessoa pessoa1 = new Pessoa("Paulo","12345","67890","SP","diadema","Avenida brasil");

        Mockito.when(repository.save(pessoa1)).thenReturn(pessoa1);
        Pessoa pessoaResposta = service.save(pessoa1);
        assertEquals(pessoa1.getGpspamcaryPessoa001Cidade(), pessoaResposta.getGpspamcaryPessoa001Cidade());

    }

    @Test
    public void savefindByIDTest() {
        Pessoa pessoa1 = new Pessoa("Paulo","12345","67890","SP","diadema","Avenida brasil");
        pessoa1.setGpspamcaryPessoa001ID(1L);
        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(pessoa1));
        Pessoa pessoaResposta = service.findByID(1L);
        assertEquals(Long.valueOf(1l), pessoaResposta.getGpspamcaryPessoa001ID());
    }

    @Test
    public void findByCPFTest() {
        Pessoa pessoa1 = new Pessoa("Paulo","12345","67890","SP","diadema","Avenida brasil");
        Mockito.when(repository.findByGpspamcaryPessoa001CPF("67890")).thenReturn(Optional.of(pessoa1));
        Pessoa pessoaResposta = service.findByCPF("67890");
        assertEquals("67890", pessoaResposta.getGpspamcaryPessoa001CPF());
    }

    @Test
    public void findAllTest() {
        List<Pessoa> list = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(list);
        List<Pessoa> listResposta = service.findAll();
        assertEquals(0 ,list.size());
    }



    @Ignore
    public void saveTestException() {
        Pessoa pessoa1 = new Pessoa("Paulo","12345","67890","SP","diadema","Avenida brasil");


        try {
            Mockito.when(repository.save(pessoa1)).thenThrow(new Exception("erro db"));
            service.save(pessoa1);
        }catch (PessoaDataBaseConstraintException e){
            assertEquals(e.getMessage(), "erro db");
        }

    }




}
