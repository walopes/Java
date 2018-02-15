
package projetopessoas;

/**
 *
 * @author walopes
 */
public class Aluno extends Pessoa{
    
    /* Atributos */    
    private int mat;
    private String curso;

//    public Aluno(String nome, String sexo, int idade) {
//        super(nome, sexo, idade);
//    }
    
    /* Metodos */    
    public void cancelarMtr()
    {
        System.out.println("Matrícula será cancelada!");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        
    
}
