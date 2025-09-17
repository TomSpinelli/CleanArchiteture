package org.sexta.adapter;

import org.sexta.entidade.Pedido;
import org.sexta.repositorio.PedidoRepositorio;
import java.util.ArrayList;
import java.util.List;

public class PedidoRepositorioEmMemoria implements PedidoRepositorio {

    private final List<Pedido> banco = new ArrayList<>();

    @Override
    public void salvar(Pedido pedido) {
        banco.add(pedido);
    }

    @Override
    public List<Pedido> listar() {
        return new ArrayList<>(banco);
    }
}
