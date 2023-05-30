package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Promocional;

public abstract class Livro implements Produto, Promocional {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    private boolean impresso;

    boolean temAutor(){
        return this.autor != null;
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Livro(Autor autor){
        if (autor == null){
            throw new AutorNuloException("O Autor do livro não pode ser nulo");
        }
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    @Override
    public int compareTo(Produto outro){
        return (int) (this.getValor() - outro.getValor());
    }

}
