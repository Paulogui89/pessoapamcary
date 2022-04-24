package com.gpspamcary.pessoapamcary.dto;

import javax.persistence.Column;

public class PessoaDTO {

    private Long gpspamcaryPessoa001ID;

    private String gpspamcaryPessoa001NomeCompleto;

    private String gpspamcaryPessoa001RG;

    private String gpspamcaryPessoa001CPF;

    private String gpspamcaryPessoa001Estado;

    private String gpspamcaryPessoa001Cidade;

    private String gpspamcaryPessoa001Endereco;

    public PessoaDTO() {
    }

    public PessoaDTO(String gpspamcaryPessoa001NomeCompleto,
                     String gpspamcaryPessoa001RG,
                     String gpspamcaryPessoa001CPF,
                     String gpspamcaryPessoa001Estado,
                     String gpspamcaryPessoa001Cidade,
                     String gpspamcaryPessoa001Endereco) {
        this.gpspamcaryPessoa001NomeCompleto = gpspamcaryPessoa001NomeCompleto;
        this.gpspamcaryPessoa001RG = gpspamcaryPessoa001RG;
        this.gpspamcaryPessoa001CPF = gpspamcaryPessoa001CPF;
        this.gpspamcaryPessoa001Estado = gpspamcaryPessoa001Estado;
        this.gpspamcaryPessoa001Cidade = gpspamcaryPessoa001Cidade;
        this.gpspamcaryPessoa001Endereco = gpspamcaryPessoa001Endereco;
    }

    public PessoaDTO(Long gpspamcaryPessoa001ID,
                     String gpspamcaryPessoa001NomeCompleto,
                     String gpspamcaryPessoa001RG,
                     String gpspamcaryPessoa001CPF,
                     String gpspamcaryPessoa001Estado,
                     String gpspamcaryPessoa001Cidade,
                     String gpspamcaryPessoa001Endereco) {
        this.gpspamcaryPessoa001ID = gpspamcaryPessoa001ID;
        this.gpspamcaryPessoa001NomeCompleto = gpspamcaryPessoa001NomeCompleto;
        this.gpspamcaryPessoa001RG = gpspamcaryPessoa001RG;
        this.gpspamcaryPessoa001CPF = gpspamcaryPessoa001CPF;
        this.gpspamcaryPessoa001Estado = gpspamcaryPessoa001Estado;
        this.gpspamcaryPessoa001Cidade = gpspamcaryPessoa001Cidade;
        this.gpspamcaryPessoa001Endereco = gpspamcaryPessoa001Endereco;
    }


    public Long getGpspamcaryPessoa001ID() {
        return gpspamcaryPessoa001ID;
    }

    public void setGpspamcaryPessoa001ID(Long gpspamcaryPessoa001ID) {
        this.gpspamcaryPessoa001ID = gpspamcaryPessoa001ID;
    }

    public String getGpspamcaryPessoa001NomeCompleto() {
        return gpspamcaryPessoa001NomeCompleto;
    }

    public void setGpspamcaryPessoa001NomeCompleto(String gpspamcaryPessoa001NomeCompleto) {
        this.gpspamcaryPessoa001NomeCompleto = gpspamcaryPessoa001NomeCompleto;
    }

    public String getGpspamcaryPessoa001RG() {
        return gpspamcaryPessoa001RG;
    }

    public void setGpspamcaryPessoa001RG(String gpspamcaryPessoa001RG) {
        this.gpspamcaryPessoa001RG = gpspamcaryPessoa001RG;
    }

    public String getGpspamcaryPessoa001CPF() {
        return gpspamcaryPessoa001CPF;
    }

    public void setGpspamcaryPessoa001CPF(String gpspamcaryPessoa001CPF) {
        this.gpspamcaryPessoa001CPF = gpspamcaryPessoa001CPF;
    }

    public String getGpspamcaryPessoa001Estado() {
        return gpspamcaryPessoa001Estado;
    }

    public void setGpspamcaryPessoa001Estado(String gpspamcaryPessoa001Estado) {
        this.gpspamcaryPessoa001Estado = gpspamcaryPessoa001Estado;
    }

    public String getGpspamcaryPessoa001Cidade() {
        return gpspamcaryPessoa001Cidade;
    }

    public void setGpspamcaryPessoa001Cidade(String gpspamcaryPessoa001Cidade) {
        this.gpspamcaryPessoa001Cidade = gpspamcaryPessoa001Cidade;
    }

    public String getGpspamcaryPessoa001Endereco() {
        return gpspamcaryPessoa001Endereco;
    }

    public void setGpspamcaryPessoa001Endereco(String gpspamcaryPessoa001Endereco) {
        this.gpspamcaryPessoa001Endereco = gpspamcaryPessoa001Endereco;
    }
}
