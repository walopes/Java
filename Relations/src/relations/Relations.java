
package relations;

import java.text.ParseException;


public class Relations {

    public static void main(String[] args) throws ParseException {
        
        // Pessoa p1 = new Pessoa(); // Errado - nao pode ser instanciada
        /* 
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo('M');
        System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudinéia");
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.setMatricula(14987);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Carlão");
        b1.setMatricula(11487);
        b1.setBolsa(12.75f);
        b1.setSexo('M');
        b1.pagarMensalidade(); 
        
        Professor p = new Professor("matemática");
        p.setNome("Rolando da Rocha");
        p.setIdade(34);
        p.setSalario(3534.5f);
        p.receberAumento(2000);
        System.out.println(p.toString());
        
        Tecnico T = new Tecnico();
        T.setCurso("Informática");
        T.setNome("Janus");
        T.setMatricula(4874);
        T.setIdade(72);
        T.setSexo('M');
        System.out.println(T.toString());
        
    }
    
}
