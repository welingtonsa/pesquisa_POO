/* Construa um algoritimo que calcule a quantidade de latas de
 * tinta necessarias e o custo para pintar tanques colindricos
 * de combustivel, em que sao forncecidos a altura(H) e o 
 * raio(R) desse cilindro:
 * Livro: Logica de programaao - A construcao de algoritimos e
 * estruturas de dados. 
 * Capitulo: Estrutura de Controle 03 - Exemplos - b, ALGORITIMO 3.3 
 * 
 */

public class AlgExemplo {
    public  static void main(String[] args) {
        /* Entrada do usuario */
        double R = 2;
        double H = 7;
        /* Constante */
        double PI = 3.14;
        /* Requisitos de lata de tinta: Foi usada a expressaao model para referenciar
         * uma futura classe
         */
        double modelLitros = 5;
        double modelLataPorMetroQuadra = 3;
        double modelPreco = 50.00;

        /* Calculos necessarios */
        double areaLateral = H * (2 * PI * R * H);
        double areaBase = PI * R;
        double areaDoCilindro = areaBase + areaLateral;
        double litrosNecessarios = areaDoCilindro / modelLataPorMetroQuadra;
        double quantidadeLatas = litrosNecessarios/modelLitros;
        double custo = quantidadeLatas * modelPreco;

        /* As impressoes no terminal alem do custo sao para verificar
         * o processo do algoritimo e comparar com as impressoes do 
         * outros algoritmos com classe. 
         */
        System.out.printf("Area lateral do cilindro: %.2f\n", areaLateral);
        System.out.printf("Area base do cilindo %.2f\n", areaBase);
        System.out.printf("Area do cilindro: %.2f \n", areaDoCilindro);
        System.out.printf("Quantidade de litros: %.2f\n", litrosNecessarios);
        System.out.printf("Quantidade de latas: %.2f \n", quantidadeLatas);
        System.out.printf("Custo: %.2f \n", custo);

    }
    
}
