public class TesteLataTinta02 {
    public static void main(String[] args) {
        
        /* Estanciando as classes que agora estao encapsuladas recebendo os atributos de
         * inicializacao. 
        */
        Cilindro newCilindro = new Cilindro(7,2);
        LataDeTinta02 azul = new LataDeTinta02(5,50.00,3);

        /* Metodos que eram acessiveis sem enpsulamento agora nao podem ser chamados.  */
        //System.out.println(newCilindro.calcularAreaLateral());
        //System.out.println(newCilindro.calcularAreaBase());
        
        /* Unicos metodos necessarios para algoritimo. */
        azul.calcularQuantidadeLitros(newCilindro.calcularAreaDoCilindro());
        System.out.println(azul.calcularCusto());

       
    }
}
