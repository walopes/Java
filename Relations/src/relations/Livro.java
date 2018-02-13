
package relations;

public class Livro implements Publicacao{
    
    /* Atributos */
    
    private Pessoa leitor;
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    
    /* Métodos */
    
    public Livro(String titulo, String autor, int totalPg)
    {
        leitor = null;
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totalPg);
        this.setPagAtual(0);
    }
    
    public void detalhes()
    {
        System.out.println("-------------------------");
        System.out.print("O autor(a) "+this.getAutor() + " está lendo o livro ");
        System.out.print(this.getTitulo() + ", do(a) autor(a)" +this.getAutor());
        System.out.print(", atualmente na página " +this.getPagAtual() + " de um total de ");
        System.out.println(this.getTotPaginas() + " páginas.");
        System.out.println("-------------------------");
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        this.avancarPag();
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public void setLeitor(Pessoa l)
    {
        this.leitor = l;
    }
    
    public Pessoa getLeitor()
    {
        return this.leitor;
    }
    
    
    
}
