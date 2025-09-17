package org.terceira.main;

import org.terceira.adapter.FilmeRepositorioEmMemoria;
import org.terceira.casodeuso.BuscarFilmePorTitulo;
import org.terceira.entidade.Filme;

public class Main {
    public static void main(String[] args) {

        FilmeRepositorioEmMemoria repositorioEmMemoria = new FilmeRepositorioEmMemoria();
        repositorioEmMemoria.salvar(new Filme("LOTR", "Ficção Científica", 2000));
        BuscarFilmePorTitulo buscarFilmePorTitulo = new BuscarFilmePorTitulo(repositorioEmMemoria);

        try {
            Filme filme = buscarFilmePorTitulo.executar("LOTR");
            System.out.println(filme.getTitulo() + ", genero: " + filme.getGenero() + ", ano: " + filme.getAno());

            buscarFilmePorTitulo.executar("Harry Potter");

        } catch (RuntimeException e) {
            System.out.println("Erro: Filme Não Encontrado");
        }
    }
}
