package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.*;

public class OrdenandoComJava {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Java 8 Pratico");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Pratico");
        ebook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(fisico, ebook);

        Collections.sort(produtos);

        for (Produto produto : produtos){
            System.out.println(produto.getValor());
        }
    }
}
