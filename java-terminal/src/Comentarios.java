public class Comentarios {
    public static void main(String[] args) {
        // Olá eu sou um comentário em uma única linha

        /*
         * Olá,
         * Eu sou um comentário
         * que posso ser mais detalhado
         * quando necessário
         */
    }

    /**
     * Estas duas estrelinhas acima 
     * é para identificar que você pretende elaborar
     * a nivel de documentação.
     */
    public void metodo (){

    }

    /*
     * Este método foi elavorado as pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou multiplicar dois numeros
     */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; //r é igual a resultado
        if (m == "M"){ // M= multiplicação
            r = n * x;
        }else{
            //se não soma mesmo
        }
        return r;
    }
}
