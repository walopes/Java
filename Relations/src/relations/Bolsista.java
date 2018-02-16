
package relations;


public final class Bolsista extends Aluno {
    
    /* Atributos */
    private float bolsa;    
    
    /* Métodos */
    public void renovarBolsa()
    {
        System.out.println("Renovando bolsa de " +this.getNome());
    }
    
    @Override
    public void pagarMensalidade()
    {
        System.out.println(this.getNome() + " é bolsista!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
