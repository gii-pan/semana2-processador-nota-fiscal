package br.com.alura.oobj.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


class ItemPedidoTest {
    private ItemPedido item;
    private Integer quantidade;
    private BigDecimal valorUnitario;

    @BeforeEach
    public void inicializacao() {
        item = new ItemPedido();
    }

    @Test
    public void calculoDoSubtotalDeItemComUmaUnidade() {
        quantidade = 1;
        valorUnitario = new BigDecimal("2");
        BigDecimal subTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));

        item.setQuantidade(quantidade);
        item.setValorUnitario(valorUnitario);

        Assertions.assertEquals(subTotal, item.getSubtotal());
    }

    @Test
    public void calculoDoSubtotalDeItemComMaisDeUmaUnidade(){
        quantidade = 3;
        valorUnitario = new BigDecimal("4");
        BigDecimal subTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));

        item.setQuantidade(quantidade);
        item.setValorUnitario(valorUnitario);

        Assertions.assertEquals(subTotal, item.getSubtotal());
    }
}