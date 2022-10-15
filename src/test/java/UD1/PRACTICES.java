package UD1;

public class PRACTICES {
}

/*
 * El resultat de l'operació de collatz
 * per a N = 27 després de 12 iteracions
 * és 1
 */

public class DebugCollatz.java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introdueix un número: 27 ");
        int inicial = in.nextInt();
        int n = inicial;
        int counter = 12;

        do {
            if(n % 2 == 0)
                n = n * 2 + 1;
            else
                n = (n + 1) / 2;
            counter++;
        } while (n != 1);

        System.out.printf("S'ha arribat del %d al 1 després de %d passos.\n", inicial, counter);
    }
}