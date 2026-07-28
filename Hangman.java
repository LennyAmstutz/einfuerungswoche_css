import java.util.Random;
import java.util.Scanner;

// =====================================================================
// HANGMAN
// Der Computer waehlt ein Wort. Der Spieler raet Buchstaben.
// Bei jedem falschen Buchstaben verliert man ein Leben (max 6 Fehler).
//
// DEINE AUFGABE: Schreibe die Methoden deckeAuf() und istGeloest().
// =====================================================================
public class Hangman {

    // -----------------------------------------------------------------
    // DEINE AUFGABE 1
    //
    // Der Spieler hat einen Buchstaben geraten. Diese Methode soll:
    //   - im Wort schauen, an welchen Stellen dieser Buchstabe steht
    //   - an genau diesen Stellen den Buchstaben in "anzeige" eintragen
    //   - true zurueckgeben, wenn der Buchstabe mindestens einmal vorkam
    //   - false zurueckgeben, wenn der Buchstabe NICHT im Wort war
    //
    // wort:     das gesuchte Wort, z.B. "katze"
    // anzeige:  ein Array gleich lang wie das Wort. Am Anfang ueberall '_'.
    //           Beispiel: {'_','_','_','_','_'}
    // buchstabe: der geratene Buchstabe, z.B. 't'
    //
    // Beispiel: wort = "katze", anzeige = {'_','_','_','_','_'}, buchstabe = 't'
    //   -> anzeige wird zu {'_','_','t','_','_'} und die Methode gibt true zurueck
    //
    // Tipp: Gehe mit einer for-Schleife durch das Wort.
    //       Mit wort.charAt(i) bekommst du den Buchstaben an Stelle i.
    // -----------------------------------------------------------------
    public static boolean deckeAuf(String wort, char[] anzeige, char buchstabe) {

        // TODO: HIER PROGRAMMIEREN

        return false;   // <- Platzhalter
    }

    // -----------------------------------------------------------------
    // DEINE AUFGABE 2
    //
    // Prueft, ob das Wort komplett aufgedeckt ist.
    //   - true  -> wenn KEIN '_' mehr in anzeige steht (alles geraten)
    //   - false -> wenn noch mindestens ein '_' da ist
    //
    // Beispiel: {'k','a','t','z','e'} -> true
    // Beispiel: {'k','a','_','z','e'} -> false
    // -----------------------------------------------------------------
    public static boolean istGeloest(char[] anzeige) {

        // TODO: HIER PROGRAMMIEREN

        return false;   // <- Platzhalter
    }

    // -----------------------------------------------------------------
    // Ein- und Ausgabe. Ist fertig. Ruft oben deine Methoden auf.
    // -----------------------------------------------------------------
    public static void spielen(Scanner sc) {

        String[] woerter = {"apfel", "banane", "computer", "schule", "katze"};
        Random random = new Random();
        String wort = woerter[random.nextInt(woerter.length)];

        // Anzeige mit lauter '_' vorbereiten.
        char[] anzeige = new char[wort.length()];
        for (int i = 0; i < wort.length(); i++) {
            anzeige[i] = '_';
        }

        int fehlerUebrig = 6;

        System.out.println("\n--- HANGMAN ---");
        System.out.println("Errate das Wort. Du hast " + fehlerUebrig + " Fehler frei.");

        while (fehlerUebrig > 0 && !istGeloest(anzeige)) {

            System.out.print("\nWort:  ");
            for (int i = 0; i < anzeige.length; i++) {
                System.out.print(anzeige[i] + " ");
            }
            System.out.println();
            System.out.println("Fehler uebrig: " + fehlerUebrig);

            System.out.print("Buchstabe: ");
            String eingabe = sc.nextLine().toLowerCase().trim();
            if (eingabe.length() == 0) {
                System.out.println("Bitte einen Buchstaben eingeben.");
                continue;
            }
            char buchstabe = eingabe.charAt(0);

            boolean gefunden = deckeAuf(wort, anzeige, buchstabe);

            if (gefunden) {
                System.out.println("Richtig!");
            } else {
                fehlerUebrig--;
                System.out.println("Falsch! Dieser Buchstabe ist nicht im Wort.");
            }
        }

        if (istGeloest(anzeige)) {
            System.out.println("\nGratulation! Das Wort war: " + wort);
        } else {
            System.out.println("\nVerloren! Das Wort war: " + wort);
        }
    }
}
