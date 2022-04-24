package com.gpspamcary.pessoapamcary.model;

import javax.persistence.*;

@Entity
@Table(name = "gpspamcary_pessoa_001")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gpspamcary_pessoa_001_id", nullable = false, updatable = false, unique = true)
    private Long gpspamcaryPessoa001ID;

    @Column(name = "gpspamcary_pessoa_001_nome_completo", nullable = false)
    private String gpspamcaryPessoa001NomeCompleto;

    @Column(name = "gpspamcary_pessoa_001_rg", nullable = false, unique = true)
    private String gpspamcaryPessoa001RG;

    @Column(name = "gpspamcary_pessoa_001_cpf", nullable = false, unique = true)
    private String gpspamcaryPessoa001CPF;

    @Column(name = "gpspamcary_pessoa_001_estado")
    private String gpspamcaryPessoa001Estado;

    @Column(name = "gpspamcary_pessoa_001_cidade")
    private String gpspamcaryPessoa001Cidade;

    @Column(name = "gpspamcary_pessoa_001_endereco")
    private String gpspamcaryPessoa001Endereco;

    public Pessoa() {
    }

    public Pessoa(String gpspamcaryPessoa001NomeCompleto,
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
