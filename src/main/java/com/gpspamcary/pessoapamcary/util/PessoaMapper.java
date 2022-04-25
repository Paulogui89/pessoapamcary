package com.gpspamcary.pessoapamcary.util;

import com.gpspamcary.pessoapamcary.dto.PessoaDTO;
import com.gpspamcary.pessoapamcary.exception.PessoaDataBaseConstraintException;
import com.gpspamcary.pessoapamcary.model.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PessoaMapper {

    public static PessoaDTO toDTO(Pessoa pessoa){
        PessoaDTO dto = new PessoaDTO();
        dto.setGpspamcaryPessoa001ID(pessoa.getGpspamcaryPessoa001ID());
        dto.setGpspamcaryPessoa001NomeCompleto(pessoa.getGpspamcaryPessoa001NomeCompleto());
        dto.setGpspamcaryPessoa001RG(pessoa.getGpspamcaryPessoa001RG());
        dto.setGpspamcaryPessoa001CPF(pessoa.getGpspamcaryPessoa001CPF());
        dto.setGpspamcaryPessoa001Estado(pessoa.getGpspamcaryPessoa001Estado());
        dto.setGpspamcaryPessoa001Cidade(pessoa.getGpspamcaryPessoa001Cidade());
        dto.setGpspamcaryPessoa001Endereco(pessoa.getGpspamcaryPessoa001Endereco());
        return dto;
    }

    public static Pessoa toEntity(PessoaDTO dto){
        Pessoa pessoa = new Pessoa();
        pessoa.setGpspamcaryPessoa001ID(dto.getGpspamcaryPessoa001ID());
        pessoa.setGpspamcaryPessoa001NomeCompleto(dto.getGpspamcaryPessoa001NomeCompleto()!= null ? dto.getGpspamcaryPessoa001NomeCompleto().toUpperCase(Locale.ROOT): null);
        pessoa.setGpspamcaryPessoa001RG(dto.getGpspamcaryPessoa001RG()!= null ? dto.getGpspamcaryPessoa001RG().replaceAll("[^\\d]", ""):null);
        pessoa.setGpspamcaryPessoa001CPF(dto.getGpspamcaryPessoa001CPF()!= null ? dto.getGpspamcaryPessoa001CPF().replaceAll("[^\\d]", ""):null);
        pessoa.setGpspamcaryPessoa001Estado(dto.getGpspamcaryPessoa001Estado()!= null ? dto.getGpspamcaryPessoa001Estado().toUpperCase(Locale.ROOT): null);
        pessoa.setGpspamcaryPessoa001Cidade(dto.getGpspamcaryPessoa001Cidade()!= null ? dto.getGpspamcaryPessoa001Cidade().toUpperCase(Locale.ROOT): null);
        pessoa.setGpspamcaryPessoa001Endereco(dto.getGpspamcaryPessoa001Endereco()!= null ? dto.getGpspamcaryPessoa001Endereco().toUpperCase(Locale.ROOT): null);
        ValidatePessoa(pessoa);
        return pessoa;
    }

    public static List<PessoaDTO> toListDTO(List<Pessoa> listPessoa) {
        List<PessoaDTO> listDTO = new ArrayList<>();
        for (Pessoa pessoa:listPessoa
        ) {
            listDTO.add(toDTO(pessoa));
        }
        return listDTO;
    }

    private static void ValidatePessoa(Pessoa pessoa) {
        if(pessoa.getGpspamcaryPessoa001RG()!= null){
            validateRG(pessoa.getGpspamcaryPessoa001RG());
        }
        if(pessoa.getGpspamcaryPessoa001CPF()!= null){
            validateCPF(pessoa.getGpspamcaryPessoa001CPF());
        }
        if(pessoa.getGpspamcaryPessoa001Estado()!= null){
            validateEstado(pessoa.getGpspamcaryPessoa001Estado());
        }

    }

    private static void validateRG(String rg) {
        if(rg.length() != 9){
            throw new PessoaDataBaseConstraintException("RG Invalido");
        }
    }

    private static void validateCPF(String cpf) {
        if(cpf.length() != 11){
            throw new PessoaDataBaseConstraintException("CPF Invalido");
        }
    }

    private static void validateEstado(String estado) {
        if(estado.length() != 2){
            throw new PessoaDataBaseConstraintException("Estado Invalido");
        }
    }

}
