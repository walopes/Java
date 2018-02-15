
package projetopessoas;

/**
 *
 * @author walopes
 */
public class Funcionario extends Pessoa{
    
    /* Atributos */    
    private String setor;
    private boolean trabalhando;
    
    /* Metodos */
//    public Funcionario(String nome, String sexo, int idade) {
//        super(nome, sexo, idade);
//    }
    
    public void mudaTrabalho()
    {
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
