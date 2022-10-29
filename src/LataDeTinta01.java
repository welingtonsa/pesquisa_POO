    /* A classe LataDeTinta01 foi criada com base apenas na abstracao.
    /* A classe LataDeTinta01 nao esta encapsulada gerando assim 
     * o acesso ao metodos que deveriam ser privados. 
     */
  
    public class LataDeTinta01{
         
        public static  int modelLitros;
        public static double modelPreco;
        public int modelLataPorMetroQuadra;    
        public static  double  PI;
        public double totalDeLatas;
        public double totalDeLitros;
        public double areaLateral;
        public double areaBase;
      
        
        
        /* O construtor LataDeTinta01 recebem parametros de inicializacao para um objeto
         * LataDeTinta.  
         */
        public LataDeTinta01(int litros, int lataPorMetroQuadrado, double preco){
          modelLitros = litros;
          modelLataPorMetroQuadra = lataPorMetroQuadrado;
          modelPreco = preco;
          PI = 3.14;
        }     
        
       
        /* Calcular o custo para caular x cilindro */
        public double calcularCusto(){
          return calcularQuantidadeLatas() * this.modelPreco;
        }

         /* Calcular quantidade de latas */
         public double calcularQuantidadeLatas(){
          return calcularLitros() / this.modelLitros;
        }    

        /* Quantidade de litros */
        public double calcularLitros(){
          return calcularAreaDoCilindro()/this.modelLataPorMetroQuadra;
        }

        /* Cacular area do cilindro  */
        public double calcularAreaDoCilindro(){
          return this.areaBase + this.areaLateral;
        }

        /* Calculo da area base */
        public double calcularAreaBase(double R){
          return areaBase = PI * R;
        }
        
        /* Calculo da area lateral */
        public double calcularAreaLateral(double R, double H){
          return areaLateral = (H * (2 * PI * R * H));
        }
        
        /* getters and setters ********************************** */
        public static int getModelLitros() {
          return modelLitros;
        }

        public static void setModelLitros(int modelLitros) {
          LataDeTinta01.modelLitros = modelLitros;
        }

        public static double getModelPreco() {
          return modelPreco;
        }

        public static void setModelPreco(double modelPreco) {
          LataDeTinta01.modelPreco = modelPreco;
        }

        public int getModelLataPorMetroQuadra() {
          return modelLataPorMetroQuadra;
        }

        public void setModelLataPorMetroQuadra(int modelLataPorMetroQuadra) {
          this.modelLataPorMetroQuadra = modelLataPorMetroQuadra;
        }

        public double getPI() {
          return PI;
        }

        public void setPI(double pI) {
          PI = pI;
        }

        public double getTotalDeLatas() {
          return totalDeLatas;
        }

        public void setTotalDeLatas(double totalDeLatas) {
          this.totalDeLatas = totalDeLatas;
        }

        public double getTotalDeLitros() {
          return totalDeLitros;
        }

        public void setTotalDeLitros(double totalDeLitros) {
          this.totalDeLitros = totalDeLitros;
        }

        public double getAreaLateral() {
          return areaLateral;
        }

        public void setAreaLateral(double areaLateral) {
          this.areaLateral = areaLateral;
        }
        
      }
