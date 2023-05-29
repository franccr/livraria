package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    //public void adiciona(br.com.casadocodigo.livraria.produtos.Livro livro){
    //    System.out.println("Adicionando: " + livro);
    //    livro.aplicaDescontoDe(0.05);
    //    total += livro.getValor();
    //}

    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador ++;
        this.total += produto.getValor();
    }

    public double getTotal(){
        return total;
    }

    public Produto[] getProdutos(){
        return produtos;
    }

}
