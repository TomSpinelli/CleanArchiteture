package org.sexta.repositorio;

import org.sexta.entidade.Pedido;
import java.util.List;

public interface PedidoRepositorio {

    void salvar(Pedido pedido);

    List<Pedido> listar();
}
