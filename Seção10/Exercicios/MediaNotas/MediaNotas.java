public class MediaNotas {
    public static void main (String [] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;

        double Media = ( nota1 + nota2 + nota3 ) / 3;

        System.out.printf ("%.2f%n" , Media); //println não suporta "%.2f%n" que serve para arredondar a media das notas
    }
}