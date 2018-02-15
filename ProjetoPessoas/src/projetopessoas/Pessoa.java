
package projetopessoas;

/**
 *
 * @author walopes
 */
public class Pessoa {
    
    /* Atributos */
    
    private String nome, sexo;
    private int idade;
    
    
    /* Metodos */
    
    public Pessoa(String nome, String sexo, int idade)
    {
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setNome(nome);
    }
    
    public void fazerAniversario()
    {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
