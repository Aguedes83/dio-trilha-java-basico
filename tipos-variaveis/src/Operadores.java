public class Operadores {
    public static void main(String[] args) {
        // String nomeCompleto = "LINGUAGEM - " + "JAVA";

        // System.out.print(nomeCompleto);

        // String concatenacao ="?";

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);

        /*------------------------------------------------------------------------------
         * Operadores – 3
         */
        // int numero = 5;

        // numero = -numero;
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);

        /*------------------------------------------------------------------------------
         * Operadores – 4
         */
        // int numero = 5;
        // X repetição
        // numero = numero + 1;
        // numero++;
        
        // System.out.println(numero ++); // Apenas atribui após atribuir +1
        // System.out.println(numero --); // Apenas atribui após atribuir -1
        // System.out.println(++ numero); // Incrementa +1 e já imprime
        // System.out.println(numero);

        // #-- Valores Booleanos
        // boolean variavel = true;
        // System.out.println(!variavel);

        // variavel = !variavel;
        // System.out.println(variavel);

        /*------------------------------------------------------------------------------
         * Operadores – 5 - Ternário - IF/ELSE
         */
        // int a, b;

        // a = 5;
        // b = 6;

        // Utilizando IF - Normal
        // String resultado = "";
        // if(a==b)
        //     resultado = "Verdadeiro";
        // else
        //     resultado = "Falso";

        // Utilizando IF Ternário
        // String resultado = a==b ? "Verdadeiro" : "Falso"; //Tipo String
        // int resultado = a == b ? 1 : 0; //Tipo Int
        // System.out.println(resultado);

        /*------------------------------------------------------------------------------
         * Operadores – 6 - Relacionais
         */
        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;
        // if(numero1 <= numero2){
        //     System.out.println("a nossa condição é verdadeira");
        // }
        
        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;
        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 > numero2;
        // System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //--- Comparando Strings
        // String nomeUm = "Antonio";
        // String nomeDois = "Antonio";
        // System.out.println(nomeUm == nomeDois);

        //--- Utilizando comparação com equals
        // String nomeUm = "Antonio";
        // String nomeDois = new String("Antonio");
        // System.out.println(nomeUm.equals(nomeDois));


        /*------------------------------------------------------------------------------
         * Operadores – 7 - lÓGICOS // Operadores.java
         */
        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das consições é verdadeira");
        }

        System.out.println("Fim");
    }
}
