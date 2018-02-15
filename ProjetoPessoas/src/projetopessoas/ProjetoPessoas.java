
package projetopessoas;

/**
 *
 * @author walopes
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Paula");
        p3.setNome("Rodrigo");
        p4.setNome("Leão");
        
        p1.setSexo("Masculino");
        p4.setSexo("Feminino");
        
        p2.setIdade(18);
        p3.setIdade(25);
        
        p2.setCurso("Economia rural");
        p3.setSalario(3840.35f);
        p4.setSetor(null);
        
        // p1.receberAumento(250f); // Não funciona - p1 nao possui este metodo
        
        // -------------------------------
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
