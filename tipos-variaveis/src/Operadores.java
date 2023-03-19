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

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente de numero2? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que numero2? " + simNao);
        
        simNao = numero1 < numero2;

        System.out.println("numero1 é menor que numero2? " + simNao);
        
        simNao = numero1 >= numero2;

        System.out.println("numero1 é maior ou igual a numero2? " + simNao);
        
        simNao = numero1 <= numero2;

        System.out.println("numero1 é menor ou igual a numero2? " + simNao);

        String nomeUm = "Dyego";
        String nomeDois = "Dyego";

        System.out.println( nomeUm == nomeDois);
        
        nomeDois = new String("Dyego");

        System.out.println( nomeUm == nomeDois);

        System.out.println( nomeUm.equals(nomeDois));
    }
}
