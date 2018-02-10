/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author walopes
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lutador[] lutadores = new Lutador[]{
        new Lutador("Pretty boy","França",31,1.75f,68.9f,11,3,1),
        new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3),
        new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1),
        new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2),
        new Lutador("Whindersson","Brasólia",21,1.74f,111.63f,0,15,1)
    };
        
        
        lutadores[0].apresentar();
        lutadores[0].ganharLuta();
        lutadores[0].ganharLuta();
        lutadores[0].ganharLuta();
        lutadores[0].ganharLuta();
        lutadores[0].ganharLuta();
        lutadores[0].perderLuta();
        lutadores[0].perderLuta();
        lutadores[0].perderLuta();
        lutadores[0].perderLuta();
        lutadores[0].perderLuta();
        lutadores[0].empatarLuta();
        lutadores[0].empatarLuta();
        lutadores[0].apresentar();
        lutadores[0].status();
        lutadores[3].status();        
        lutadores[4].status();
        
    }
    
}
