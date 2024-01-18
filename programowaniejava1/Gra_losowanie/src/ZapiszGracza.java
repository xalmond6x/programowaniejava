import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ZapiszGracza {

    static void zapiszWynikDoPliku(String nick, int wynik) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nick + ".txt"))) {
            writer.println("Nazwa: " + nick);
            writer.println("Wynik: " + wynik);
            System.out.println("Wynik zapisano w pliku.");
        } catch (IOException e) {
            System.out.println("Błąd przy zapisywaniu wyniku.");
        }
    }

    static boolean czyGraczIstnieje(String nick) {
        File plik = new File(nick + ".txt");
        return plik.exists();
    }
}
