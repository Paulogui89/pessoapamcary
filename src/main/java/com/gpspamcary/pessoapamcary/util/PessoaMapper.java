package com.gpspamcary.pessoapamcary.util;

import com.gpspamcary.pessoapamcary.dto.PessoaDTO;
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
}
