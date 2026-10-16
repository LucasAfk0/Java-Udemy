package Seção12;

public class ControlesDeFluxo {
    public static void main (String[] args) {
        
        
        

    }
}

/// Switch
/*

int day = 3;

        switch (day) {
            case 1 -> System.out.printf("Segunda") ;
                case 2 -> System.out.printf("Terça") ;
                    case 3 -> System.out.printf("Quarta") ;
                        case 4 -> System.out.printf("Quinta") ;
                            case 5 -> System.out.printf("Sexta") ;

                default -> System.out.println("Desconhecido");
        }

        String dia = "Sabado";

        String tipoDeDia = switch (dia) {
            case "Seg." , "Ter." , "Qua." , "Qui." , "Sex" -> "Dia util";
            case "Sabado" , "Domingo" -> "Fim de Semana";
            default -> "Desconhecido";
        };

        System.out.println(tipoDeDia);

*/

/// instanceof
/*

Object obj = "Hello";

        obj = (obj instanceof Integer) ? obj : "Não é uma String";
        System.out.println(obj); // Condição if traduzida para Operador Ternário

         
        if ( obj instanceof String) {
            System.out.println(obj);
        } else {
            System.out.println("Não é uma String");
        };

*/

/// Operador Ternário
/* 

int a = 10; 
        String resultado = (a % 2 == 0) ? "Par" : "Impar" ;
       
        System.out.println(resultado);

*/

/// Instruções Condicionais - if else
/*

int a = 10;

        if (a > 5) {
            System.out.println("a é maior que 5"); 
        } else {
           System.out.println("a é menor que 5"); 
        }

*/