package br.com.xxnbr.loja.imposto;

import br.com.xxnbr.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
