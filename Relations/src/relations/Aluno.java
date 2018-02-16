/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relations;

/**
 *
 * @author Acer
 */
public class Aluno extends Pessoa {
    
    // Exemplo de Herança de diferença
    // Nesse caso, são implementados atributos e métodos a mais
    
    /* Atributos */
    private int matricula;
    private String curso;
    
    /* Métodos */
    public void pagarMensalidade()
    {
        System.out.println("Mensalidade paga do aluno " +this.getNome() +" paga!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
