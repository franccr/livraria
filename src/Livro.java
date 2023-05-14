public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    private boolean impresso;

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
        } else if (!this.impresso && porcentagem > 0.15) {
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

    public Livro(Autor autor){
        //encadeamento de metodos no encapsulamento
        this();
        this.autor = autor;
        this.impresso = true;
    }

    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }
}
