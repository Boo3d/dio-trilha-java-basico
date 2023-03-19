public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);
        
        String concatenacao = "?";
        
        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        int numero = 5;

        System.out.println(- numero);
        System.out.println(numero);
        
        numero = - numero;
        
        System.out.println(numero);
        
        numero = numero * -1;

        System.out.println(numero);

        numero++;
        //numero + 1;

        System.out.println(numero++);

        System.out.println(++numero);

        System.out.println(numero);

        numero--;
        //numero - 1;

        System.out.println(numero--);

        System.out.println(--numero);

        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);
        
        System.out.println(variavel);
        
        variavel = !variavel;
        
        System.out.println(variavel);

        int a = 5, b = 6;

        String resultado = "";

        //Exemplo de condicional utilizando uma estrutura if/else
        
        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }
        
        System.out.println(resultado);

        //Exemplo de condicional utilizando operador tenário

        resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);
    }
}
