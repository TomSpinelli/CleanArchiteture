package org.quarta.main;

import org.quarta.adapter.QuartoRepositorioEmMemoria;
import org.quarta.casodeuso.CadastrarQuarto;
import org.quarta.casodeuso.ListarQuartos;
import org.quarta.casodeuso.ReservarQuarto;
import org.quarta.entidade.Quarto;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        QuartoRepositorioEmMemoria repositorioEmMemoria = new QuartoRepositorioEmMemoria();

        CadastrarQuarto cadastrar = new CadastrarQuarto(repositorioEmMemoria);
        ListarQuartos listar = new ListarQuartos(repositorioEmMemoria);
        ReservarQuarto reservar = new ReservarQuarto(repositorioEmMemoria);

        cadastrar.executar(1, "normal");
        cadastrar.executar(2, "premium");

        List<Quarto> quartos = listar.executar();
        for(Quarto quarto : quartos){
            System.out.println(quarto.getNumero() + ", " + quarto.getTipo() + ", " + quarto.getStatus());
        }

        reservar.executar(2);

        quartos = listar.executar();
        for(Quarto quarto : quartos){
            System.out.println(quarto.getNumero() + ", " + quarto.getTipo() + ", " + quarto.getStatus());
        }
    }
}
