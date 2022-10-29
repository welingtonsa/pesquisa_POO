public class Cilindro {
    /* Os atributos agora privados da classe cilindro sao privados e nao podem ser acessador fora da classe.  */
    private double modelAltura;
    private double modelRaio;
    private static final double PI = 3.14;

    /* Constructors ************************************************************ */
    public Cilindro(){

    }

    /* O construtor rece os valores na sua inicilizacao sem necessidade de acessar os atributos.  */
    public Cilindro(double altura, double raio){
        modelAltura = altura;
        modelRaio = raio;
    }
    
    /* Metodos da classe Cilindro *********************************************** */
    /* os metodos da classe privados fazem a classe ficar segura pois nao seram 
     * acessadas do lado de fora da classe
     */

     /* Unico metodo publico para retorno do  valor da area do cilindro ********* */
    public  double calcularAreaDoCilindro(){
        return  calcularAreaLateral() + calcularAreaBase();
        
    }

    private double calcularAreaBase(){
        return  PI * modelRaio;
    }

    private double calcularAreaLateral(){
        return (modelAltura * (2 * PI * this.modelRaio * modelAltura));
    }

    
}
