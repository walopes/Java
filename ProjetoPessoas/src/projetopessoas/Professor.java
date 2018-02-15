
package projetopessoas;

/**
 *
 * @author walopes
 */
public class Professor extends Pessoa{
    
    /* Atributos */    
    private String especialidade;
    private float salario;
    
    /* Metodos */
//    public Professor(String nome, String sexo, int idade) {
//        super(nome, sexo, idade);
//    }
    
    public void receberAumento(float num)
    {
        this.salario += num;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
