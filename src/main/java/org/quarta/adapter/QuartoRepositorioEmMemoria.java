package org.quarta.adapter;

import org.quarta.entidade.Quarto;
import org.quarta.repositorio.QuartoRepositorio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuartoRepositorioEmMemoria implements QuartoRepositorio {
   private Map<Integer, Quarto> banco =  new HashMap<>();

    @Override
    public void salvar(Quarto quarto) {
        banco.put(quarto.getNumero(), quarto);
    }

    @Override
    public List<Quarto> listar() {
        return new ArrayList<>(banco.values());
    }

    @Override
    public Quarto buscar(int numero) {
        return banco.get(numero);
    }

}
