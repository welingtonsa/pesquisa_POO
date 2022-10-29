public class TesteLataTinta01 {
    public static void main(String[] args) throws Exception {
        /*  Verificando atributos da classe LataDeTinta01 class*/
        System.out.println("Quantidade de litros da Lata : " + LataDeTinta01.modelLitros);
        System.out.println("Preco da lata de tinta : " + LataDeTinta01.modelPreco);
        System.out.println("Litro da Lata de tinta: " + LataDeTinta01.getModelLitros());
        System.out.println("Preco da lata de tinta : " + LataDeTinta01.getModelPreco());

        /* Estanciando uma classe LataDeTinta com atributos */
        LataDeTinta01 azul = new LataDeTinta01(5, 3, 50.00);

        /* Verificando atributos da estancia azul e atributos da classe LataDeTinta*/
        System.out.println("Litros lata de tinta azul :" + azul.getModelLitros());
        System.out.println("Litros da lata de tinta : " + LataDeTinta01.getModelLitros());
        System.out.println();

        /* Algoritimo de exemplo  */
        double raio = 2;
        double altura = 7;

        System.out.printf("Area lateral do cilindro: %.2f\n", azul.calcularAreaLateral(raio, altura));
        System.out.printf("Area base do cilindo %.2f\n", azul.calcularAreaBase(raio));
        System.out.printf("Area do cilindro: %.2f \n", azul.calcularAreaDoCilindro());
        System.out.printf("Quantidade de litros: %.2f\n", azul.calcularLitros());
        System.out.printf("Quantidade de latas: %.2f \n", azul.calcularQuantidadeLatas());
        System.out.printf("Custo: %.2f \n", azul.calcularCusto());
    }
}
