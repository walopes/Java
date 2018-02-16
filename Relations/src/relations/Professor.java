
package relations;


public final class Professor extends Pessoa{
    
    /* Atributos */
    private String especialidade;
    private float salario;
    
    /* Metodos */
    
    public Professor(String especialidade)
    {
        this.setEspecialidade(especialidade);
    }
    
    public void receberAumento(float x)
    {
        this.salario += x;
        System.out.println("O professor " +this.getNome() +" acabou de receber " 
                +x+ " de aumento. O seu salário atualmente é de R$ " +this.salario);
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
    
    @Override
    public String toString()
    {
        return "{Nome: " +this.getNome() + "; especialidade: " + this.getEspecialidade() 
                + "; salário: R$" +this.getSalario() +"}";
    }
    
    
}
