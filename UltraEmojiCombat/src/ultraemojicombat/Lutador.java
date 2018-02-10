
package ultraemojicombat;


public class Lutador {
    
    /* Atributos */
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    // Categoria: inválido (i), peso medio (m), peso pequeno (l) e peso pesado (p)
    private float peso;
    private char categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    /* Metodos */
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
            int vitorias, int derrotas, int empates)
    {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setPeso(float p)
    {
        this.peso = p;
        if (p < 52.2f) this.setCategoria('i'); //invalido/ invalid
        else if (p <= 70.3f) this.setCategoria('l'); //leve/ lightweigth
        else if (p <= 83.9f) this.setCategoria('m'); //medio/ medium
        else if (p <= 120.2f) this.setCategoria('p'); //pesado/ heavy
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    public void apresentar()
    {
        System.out.println("Lutador " +this.getNome());
        System.out.println("Nacionalidade: " +getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Ganhou " + this.getVitorias() + " vez(es)");
        System.out.println("Perdeu " + this.getDerrotas() + " vez(es)");
        System.out.println("Empatou " + this.getEmpates()+ " vez(es)");
        
    }
    
    public void status()
    {
        System.out.println("_____________________________________________");
        System.out.print("Lutador(a) " +this.getNome());
        System.out.print(", de " +this.getNacionalidade());
        System.out.print(", é um peso ");
        if(this.getCategoria() == 'p' ) System.out.println(" pesado.");
        else if(this.getCategoria() == 'l') System.out.println(" leve.");
        else if(this.getCategoria() == 'm') System.out.println(" médio.");
        else System.out.println(" inválido.");
        System.out.print("Ganhou " + this.getVitorias() + " vez(es), ");
        System.out.print("perdeu " + this.getDerrotas() + " vez(es) e ");
        System.out.println("empatou " + this.getEmpates()+ " vez(es).");
        System.out.println("_____________________________________________");
    }
    
    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
}
//////////////////////// EOF ////////////////////////
