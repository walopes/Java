
package relations;

import java.text.ParseException;


public class Relations {

    public static void main(String[] args) throws ParseException {
        
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];
        
        pessoas[0] = new Pessoa("Pedro",'M',22);
        pessoas[1] = new Pessoa("Luisa",'F',19);
        
        livros[0] = new Livro("Abarat", "Clive Baker",345,pessoas[0]);
        livros[1] = new Livro("Frankenstein", "Mary Shelley",188,pessoas[1]);
        livros[2] = new Livro("Drácula", "Bram Stocker",382,pessoas[1]);
        
        livros[0].detalhes();
        livros[1].detalhes();
        livros[1].folhear(74);
        livros[1].avancarPag();
        livros[1].detalhes();
        livros[2].detalhes();
        
        //pessoas[0].verificaIdade("23 de maio de 1993");
        
    }
    
}
