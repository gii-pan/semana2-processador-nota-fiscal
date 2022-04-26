package br.com.alura.oobj.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PedidoTest {
    private final Pedido pedido  = new Pedido();
//    private final ItemPedido item = new ItemPedido();
//    private Integer quantidade;
//    private BigDecimal valorUnitario;
    private List<ItemPedido> itens = new ArrayList<>();

    @Test
    public void totalDeUmPedidoComApenasUmItem() {
//        quantidade = 1;
//        valorUnitario = new BigDecimal(2);
//
//        item.setQuantidade(quantidade);
//        item.setValorUnitario(valorUnitario);
//
//        itens.add(item);
//        pedido.setItens(itens);
//
//        Assertions.assertEquals(item.getSubtotal(),pedido.getTotal());

          itens = Collections.singletonList(
                  new ItemPedido(1L, "Pedido 1", 2, new BigDecimal(3), "2003.10.2")
          );

          pedido.setItens(itens);
          Assertions.assertEquals(itens.get(0).getSubtotal(),pedido.getTotal());
    }

    @Test
    public void totalDeUmPedidoComMultiplosItens(){
//        ItemPedido item2 = new ItemPedido();
//        quantidade = 1;
//        valorUnitario = new BigDecimal(2);
//
//        item.setQuantidade(quantidade);
//        item.setValorUnitario(valorUnitario);
//
//        item2.setQuantidade(quantidade);
//        item2.setValorUnitario(valorUnitario);
//
//        itens.add(item);
//        itens.add(item2);
//        pedido.setItens(itens);
//
//        Assertions.assertEquals(itens.stream().map(ItemPedido::getSubtotal)
//                .reduce(BigDecimal.ZERO, BigDecimal::add), pedido.getTotal());

        itens = Arrays.asList(
                new ItemPedido(1L, "Pedido 1", 2, new BigDecimal(3),"2003.10.2"),
                new ItemPedido(2L, "Pedido 2", 4, new BigDecimal(6),"2003.00.2")
        );
        pedido.setItens(itens);

        Assertions.assertEquals(itens.stream().map(ItemPedido::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add), pedido.getTotal());
    }
}