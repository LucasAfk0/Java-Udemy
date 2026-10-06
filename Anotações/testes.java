

/*
public class testes {
    public static void main (string[] args) {
        var numero = 10; // inferência int
        var usuario = new Usuario(); // inferência do tipo Usuario
    }
}
/*


// Promoções Automáticas em java

/*
public class testes {
    public static void main(String[] args) {

        
        // byte, short e char são promovidos para int quando usados em uma expressão
        byte a = 10;
        int b = a + 5; //a é promovida para int antes do cálculo


        // Se um operando é long, o outro é promovido para long
        int a = 10;
        long b = 15l;
        long c = 1 + b; // a é promovida para long antes do cálculo


        // Se um operando é float, o outro é promovido para float
        int a = 10;
        float b = 1.5f;
        float c = a * b; // a é promovida para float antes do cálculo


        // Se um operando é double, o outro é promovido para double
        int a = 10;
        double b = 1.5;
        double c = a * b; // a é promovida para double antes do cálculo


    }
}
*/


// Tipos Primitivos

/*
public class testes {
    public static void main(String[] args) {
        byte idade = 24;
        short ano = 2026;
        int populacaoCidade = 500000;
        long populacaoMundial = 7800000000L;
        float altura = 1.75f;
        double salario = 1052.00;
        boolean estudante = true;
        char inicialNome = 'L'; // aspas simples para um unico caracterer

        System.out.println("idade: " + idade) ;
        System.out.println("ano: " + ano) ;
        System.out.println("População da cidade: " + populacaoCidade) ;
        System.out.println("População mundial: " + populacaoMundial) ;
        System.out.println("Altura: " + altura) ;
        System.out.println("Salário: " + salario) ;
        System.out.println("É estudante? " + estudante) ;
        System.out.println("Inicial do nome: " + inicialNome) ;
    }
}
/*




// Variáveis: São usadas para armazenar informações que podem ser usadas e manipuladas em um programa. No exemplo abaixo, a variável "farinha" é declarada como um inteiro (int) e inicializada com o valor 2. Em seguida, o programa imprime uma mensagem informando a quantidade de farinha necessária para a receita.

/*
public class testes {
    public static void main(String[] args) {
        int farinha = 2;
        System.out.println("A receita requer " + farinha + " xícaras de farinha.");
    }
}
*/


