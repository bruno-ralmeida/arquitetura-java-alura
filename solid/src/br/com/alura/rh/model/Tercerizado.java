package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Tercerizado {

    private DadosPessoais dadosPessoais;
    private String nomeEmpresa;

    public Tercerizado(DadosPessoais dadosPessoais, String nomeEmpresa) {
        this.dadosPessoais = dadosPessoais;
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
