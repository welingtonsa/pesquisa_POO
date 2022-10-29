public class LataDeTinta02  extends Cilindro{
    /* Atributos da classe LataDeTinta02 tambem sao privados pois nao possuem
     * ncessidade fora da classe. 
     */
    private double modelLitros;
    private double modelPreco;
    private double modelLitrosPorMetroQuadrado;
    private int modelLataPorMetroQuadrado;

    /* Constructors ************************************************************ */
    public LataDeTinta02(){

    }
    /* No processo de abstracao cada nova instancia da lata de tinta tera seus 
     * proprios atributos nao sendo possivel o acesso a esses metodos. Apenas
     * em caso da regra de negocio tiver a necessidade de alterar preco de alguma
     * novaLataDeTinta. 
     */
    public LataDeTinta02(double litros, double preco, int lataPorMetroQuadrado){
        modelLitros = litros;
        modelPreco = preco;
        modelLataPorMetroQuadrado = lataPorMetroQuadrado;
    }

    /* Metodos da classe ******************************************************** */
    /* os metodos da classe LataDeTinta02 nao sao todos privados pois o acesso ao
     * metodo calcularCusto e calcularQuantidadeLitros sao necessario fora da classe. 
     */
    public  double calcularCusto(){
        return modelPreco * calcularQuantidadeLatas();
    }

    private  double calcularQuantidadeLatas(){
        return modelLitrosPorMetroQuadrado / modelLitros;
    }

    public double calcularQuantidadeLitros(double area){
        modelLitrosPorMetroQuadrado =  area / modelLataPorMetroQuadrado;
        return modelLitrosPorMetroQuadrado;
    }
    


    
}
