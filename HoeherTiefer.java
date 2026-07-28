import java.util.Random;
import java.util.Scanner;

// =====================================================================
// HOEHER ODER TIEFER
// Der Computer denkt sich eine Zahl von 1 bis 100 aus.
// Der Spieler raet, der Computer sagt "hoeher" oder "tiefer".
//
// DEINE AUFGABE: Schreibe die Methode vergleiche().
// =====================================================================
public class HoeherTiefer {

    // -----------------------------------------------------------------
    // DEINE AUFGABE
    //
    // Vergleicht den Tipp des Spielers mit der gesuchten Zahl.
    //
    // tipp:    die Zahl, die der Spieler geraten hat
    // gesucht: die Zahl, die der Computer sich ausgedacht hat
    //
    // Rueckgabe (ein Text):
    //   "hoeher"  -> wenn der Tipp zu KLEIN war (der Spieler muss hoeher gehen)
    //   "tiefer"  -> wenn der Tipp zu GROSS war (der Spieler muss tiefer gehen)
    //   "richtig" -> wenn der Tipp genau stimmt
    //
    // Beispiel: vergleiche(30, 50) ergibt "hoeher"
    // Beispiel: vergleiche(70, 50) ergibt "tiefer"
    // Beispiel: vergleiche(50, 50) ergibt "richtig"
    // -----------------------------------------------------------------
    public static String vergleiche(int tipp, int gesucht) {

        // TODO: HIER PROGRAMMIEREN
        // Tipp: Du brauchst drei Faelle (if / else if / else).

        return "";   // <- diesen Platzhalter spaeter ersetzen
    }

    // -----------------------------------------------------------------
    // Ein- und Ausgabe. Ist fertig. Ruft oben vergleiche() auf.
    // (Funktioniert erst richtig, wenn vergleiche() geschrieben ist.)
    // -----------------------------------------------------------------
    public static void spielen(Scanner sc) {

        Random random = new Random();
        int gesucht = random.nextInt(100) + 1;

        int versuche = 0;
        boolean gefunden = false;

        System.out.println("\n--- HOEHER ODER TIEFER ---");
        System.out.println("Ich denke an eine Zahl zwischen 1 und 100. Rate sie!");

        while (!gefunden) {

            System.out.print("Dein Tipp: ");
            String eingabe = sc.nextLine().trim();

            int tipp;
            try {
                tipp = Integer.parseInt(eingabe);
            } catch (Exception e) {
                System.out.println("Bitte eine Zahl eingeben.");
                continue;
            }

            versuche++;

            String ergebnis = vergleiche(tipp, gesucht);

            if (ergebnis.equals("hoeher")) {
                System.out.println("Hoeher!");
            } else if (ergebnis.equals("tiefer")) {
                System.out.println("Tiefer!");
            } else if (ergebnis.equals("richtig")) {
                System.out.println("Richtig! Die Zahl war " + gesucht + ".");
                System.out.println("Du hast " + versuche + " Versuche gebraucht.");
                gefunden = true;
            } else {
                System.out.println("(vergleiche() ist noch nicht fertig programmiert.)");
            }
        }
    }
}
