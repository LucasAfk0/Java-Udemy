package Seção13;

public class loops {
    public static void main (String[] args) {

       for (int j = 0; j < 10; j++) {
        if (j == 5) {
            continue; //Pula a iteração quando j é igual a 5
        }
        System.out.println(j);
       } 


    }
}


/// Controle de Loop
/*

for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Sai do Loop i é igual a 5
            }
        System.out.println(i);
        }

*/

/// Do While
/*

int k = 0;

        do {
            System.out.println(k);
            k++;
        } while (k < 5);

*/

/// While
/*

int j = 0;
       
        while (j < 5) {
        j++;
        System.out.println(j);
        
       }

*/

/// For
/*

for ( int i = 0; i < 5; i++) {
            System.out.println(i);
        }

*/