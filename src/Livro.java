public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    boolean temAutor(){
        return this.autor != null;
    }

    void mostrarDetalhes() {
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

    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
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
}
