package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.*;
import br.com.casadocodigo.livraria.produtos.*;

import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());

        List<Produto> produtos = carrinho.getProdutos();

        //Enhanced-for
        for(Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("Fui executado!");
    }
}
