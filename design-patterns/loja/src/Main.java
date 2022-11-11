import br.com.xxnbr.loja.imposto.CalculadoraImpostos;
import br.com.xxnbr.loja.imposto.ISS;
import br.com.xxnbr.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

        System.out.println(calculadoraImpostos.calcular(orcamento, new ISS()));

    }
}