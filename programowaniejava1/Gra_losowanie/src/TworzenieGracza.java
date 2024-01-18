import java.util.Scanner;

public class TworzenieGracza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze w zgadywaniu liczby!");


        System.out.print("Podaj swoją nazwę: ");
        String nick = scanner.nextLine();

        if (ZapiszGracza.czyGraczIstnieje(nick)) {
            System.out.println("Witaj ponownie, " + nick + "!");
        } else {
            System.out.println("Witaj, " + nick + "!");
        }

        boolean graAktywna = true;
        while (graAktywna) {
            int wynik = Losowanie.graj();

            ZapiszGracza.zapiszWynikDoPliku(nick, wynik);

            System.out.print("Chcesz zagrać jeszcze raz? (wpisz t-tak lub n-nie): ");
            String odpowiedz = scanner.nextLine().toLowerCase();
            graAktywna = odpowiedz.equals("t");
        }

        scanner.close();
    }
}
