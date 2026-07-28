import java.util.Scanner;

// =====================================================================
// DAS HAUPTMENUE ("Game Browser")
// Diese Datei ist FERTIG. Du musst sie nicht veraendern.
// Von hier aus werden die einzelnen Spiele gestartet.
// =====================================================================
public class Main {

    public static void main(String[] args) {

        // Ein Scanner fuer alle Spiele.
        Scanner sc = new Scanner(System.in);

        boolean laeuft = true;

        while (laeuft) {

            System.out.println();
            System.out.println("========================");
            System.out.println("   GAME BROWSER");
            System.out.println("========================");
            System.out.println("1) Schere Stein Papier  (BEISPIEL, schon geloest)");
            System.out.println("2) Hoeher oder Tiefer");
            System.out.println("3) Hangman");
            System.out.println("4) Tic Tac Toe");
            System.out.println("5) Passwort Spiel");
            System.out.println("0) Beenden");
            System.out.print("Deine Wahl: ");

            String wahl = sc.nextLine().trim();

            if (wahl.equals("1")) {
                SchereSteinPapier.spielen(sc);
            } else if (wahl.equals("2")) {
                HoeherTiefer.spielen(sc);
            } else if (wahl.equals("3")) {
                Hangman.spielen(sc);
            } else if (wahl.equals("4")) {
                TicTacToe.spielen(sc);
            } else if (wahl.equals("5")) {
                PasswortSpiel.spielen(sc);
            } else if (wahl.equals("0")) {
                laeuft = false;
            } else {
                System.out.println("Diese Wahl gibt es nicht.");
            }
        }

        System.out.println("Auf Wiedersehen!");
    }
}
