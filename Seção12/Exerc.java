package Seção12;

public class Exerc {
    public static void main (String[] args) {

      
        
    }
    
}

/// Aprovação Notas e Frequencia
/*

    int nota1 = 5;
      int nota2 = 6;
      int frequencia = 80;

      double media = (nota1 + nota2) / 2;
      boolean aprovado = media >= 6 && frequencia >= 75;

      if (aprovado) {
        System.out.println("O Aluno foi APROVADO");
      } else {
        System.out.println("O Aluno foi REPROVADO");
      };

*/

/// Aprovação Simplificada
/*

    int nota1 = 6;
      int nota2 = 6;
      
      double media = (nota1 + nota2) / 2.0;

      if (media >= 6){
        System.out.println("O Aluno foi APROVADO");
      } else {
        System.out.println("O Aluno foi REPROVADO");
      };

*/

/// Numero de dias no mês
/*

String diasNoMes = "Fevereiro";

        String mes = switch (diasNoMes) {
            case "Janeiro", "Março" , "Maio" , "Julho" , "Agosto" , "Outubro" , "Dezembro" -> "Esse mês tem 31 dias";
            case "Abril" , "Junho", "Setembro" , "Novembro" -> "Esse mês tem 30 dias";
            case "Fevereiro" -> "Esse mês tem 28 dias";
            default -> "Mês desconhecido";
        };

        System.out.println(mes);

*/


/// Verificador do Mês
/*

int mes = 2;

        switch(mes) {
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro");
            default -> System.out.println("Desconhecido (Deve ser um valor entre 1 e 5");
        }

*/

/// Nivel de Satisfação
/*

int nivel = 2;

        switch(nivel) {
            case 1 -> System.out.println("Muito insatisfeito");
            case 2 -> System.out.println("Insatisfeito");
            case 3 -> System.out.println("Neutro");
            case 4 -> System.out.println("Satisfeito");
            case 5 -> System.out.println("Muito satisfeito");
            default -> System.out.println("Desconhecido (Deve ser um valor entre 1 e 5");
        }


*/
