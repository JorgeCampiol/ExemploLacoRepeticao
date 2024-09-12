import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* String[] nomeJogadores = new String[10];

        //inicializacao; condicao; incremento
        // ++ -> vai somar +1 i = i + 1
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do player " + i);
            nomeJogadores[i] = sc.next();
        }*/

        // Pedir o nome do time A
        // Pedir os nomes do time A (5 nomes)
        // Pedir o nome do time B
        // Pedir os nome do time B(5 nomes)

        //nome time A
        String nometimeA = "";

        System.out.println("Informe o nome do TimeA: ");
        nometimeA = sc.next();

        //nomes time A
        String[] nomestimeA = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os nomes do TimeA: ");
            nomestimeA[i] = sc.next();
        }
            // NOME TIME B
            String nometimeB = "";

            System.out.println("Informe o nome do TimeB: ");
            nometimeB = sc.next();

            //NOMES TIME B
            String[] nomestimeB = new String[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("Informe os nomes do TimeB: ");
                nomestimeB[i] = sc.next();

            }

      }
    }