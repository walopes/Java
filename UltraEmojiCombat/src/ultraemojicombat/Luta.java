
package ultraemojicombat;

import java.util.Random;

public class Luta {
    
    // Regras da Luta
    // 
    // - Somente lutam entre si da mesma classe
    // - Desafiado e desafiante devem ser diferentes lutadores
    // - Luta somente acontece se esta estiver aprovada
    // - O unico resultado possível é vitoria ou derrota
    //////////////////////////////////
    
    /* Atributos */
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    /* Métodos */
    
    public void Luta()
    {
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;
    }
    
    public int escolherVencedor()
    {
        Random ale = new Random();
        return (ale.nextInt(3));
        
    }
    
    public void Lutar()
    {
        if(this.aprovada)
        {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            switch(this.escolherVencedor())
            {
                case 0: // Empate
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();
                        System.out.println("Empataram");
                        break;
                case 1: // Vitoria do desafiado
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        System.out.println("Incrííível vitória de " +desafiado.getNome());
                        break;
                case 2: // Vitoria do desafiante
                        desafiado.perderLuta();
                        desafiante.ganharLuta();
                        System.out.println("Vitória do desafiante! Vitória de "+desafiante.getNome());
                        break;
                default:
                        System.out.println("Caros amigos, a luta foi cancelada. A pontuação se mantém!");
                        break;
            
            }
        }else
            System.out.println("Luta não pode acontecer!");
    }
    
    public void marcarLuta(Lutador A, Lutador B)
    {
        if((A.getCategoria() == B.getCategoria()) && (B.getNome() != A.getNome()))
        {
            this.aprovada = true;
            desafiado = A;
            desafiante = B;
        }else
        {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
   

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
}

////////////////////////// EOF //////////////////////////////
