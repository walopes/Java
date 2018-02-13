
package relations;

import java.util.Calendar;


public class Pessoa {
    
    /* Atributos */
    
    private String nome;
    private int idade;
    private char sexo;
    
    /* Métodos */
    
    public Pessoa(String nome, char sexo)
    {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(0);
    }
    
    public void fazerAniver(String niver)
    {
        // Formato de string: dia de Mes de Ano
        // Data format: day of Month of Year
        
        //DateFormat data = new DateFormat("d de MMMM de YYYY", Locale.ENGLISH);
//        String[] strs = niver.split(" ");
//        int i=0;
//        while(i < strs.length)
//        {
//            ;
//        }
        
        Date data = new Date();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
}
