package br.com.xxnbr.loja.imposto;

import br.com.xxnbr.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
