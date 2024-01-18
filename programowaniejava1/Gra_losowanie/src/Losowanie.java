import java.util.Random;
import java.util.Scanner;

public class Losowanie {

    static int graj() {
        Random random = new Random();
        int liczbaDoOdgadniecia = random.nextInt(101);

        int liczbaProb = 0;
        boolean zgadniete = false;

        Scanner scanner = new Scanner(System.in);

        while (!zgadniete) {
            try {
                System.out.print("Spróbuj zgadnąć liczbę: ");
                int strzal = scanner.nextInt();
                liczbaProb++;

                if (strzal == liczbaDoOdgadniecia) {
                    zgadniete = true;
                    System.out.println("GRATULACJE! Zgadłeś! " + liczbaDoOdgadniecia + "!");
                } else if (strzal < liczbaDoOdgadniecia) {
                    System.out.println("Za mało. Spróbuj jeszcze raz.");
                } else {
                    System.out.println("Za dużo. Spróbuj jeszcze raz.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Zła liczba. Spróbuj jeszcze raz.");
                scanner.next();
            }
        }

        return liczbaProb;
    }

}
