
package relations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class Pessoa {
    
    /* Atributos */
    
    private String nome;
    private int idade;
    private char sexo;
    
    /* Métodos */
    
    public Pessoa(String nome, char sexo, int idade)
    {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }
    
    public void fazerAniver(String niver) throws ParseException
    {   
        this.idade++;
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
    
    /* NOT WORKING SO FAR :( */
    public void verificaIdade(String niver) throws ParseException
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
        
        Calendar calendario = Calendar.getInstance();
        Calendar aniversario = Calendar.getInstance();
        SimpleDateFormat data = new SimpleDateFormat("dd MMM yyyy",Locale.ENGLISH);
        calendario.setTime(data.parse(niver));
        
        long tempo = ChronoUnit.YEARS.between(calendario.toInstant(), aniversario.toInstant());
        System.out.print("Pela data: " +niver + ", para o dia de hoje: " +aniversario.toString());
        System.out.println(", tem-se " +tempo +" anos de diferença.");
    }
    
    
    
}
