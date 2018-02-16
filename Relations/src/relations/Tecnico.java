
package relations;

public class Tecnico extends Aluno{
    
    /* Atributos */
    private String registroProfissional;
    
    /* Métodos */
    public void praticar()
    {
        System.out.println("O aluno" +this.getNome() +", do curso de " 
                +this.getCurso() +" está praticando.");
    }
    
    
}
