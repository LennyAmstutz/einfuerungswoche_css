import java.util.Scanner;

// =====================================================================
// TIC TAC TOE (fuer zwei Spieler)
// Zwei Spieler (X und O) setzen abwechselnd auf ein 3x3 Feld.
// Wer zuerst drei in einer Reihe hat, gewinnt.
//
// DEINE AUFGABE: Schreibe die Methoden hatGewonnen() und istVoll().
//
// So ist das Feld aufgebaut (ein Array mit 9 Zeichen):
//   Index:   0 1 2      Anzeige:   1 | 2 | 3
//            3 4 5                  4 | 5 | 6
//            6 7 8                  7 | 8 | 9
// Ein leeres Feld enthaelt die Ziffer ('1' bis '9').
// Ein belegtes Feld enthaelt 'X' oder 'O'.
// =====================================================================
public class TicTacToe {

    // -----------------------------------------------------------------
    // DEINE AUFGABE 1
    //
    // Prueft, ob "zeichen" (also 'X' oder 'O') drei in einer Reihe hat.
    // Es gibt 8 Moeglichkeiten zu gewinnen:
    //   3 waagrechte Reihen, 3 senkrechte Reihen, 2 Diagonalen.
    //
    // feld:    das Array mit 9 Zeichen
    // zeichen: 'X' oder 'O'
    // Rueckgabe: true, wenn dieses Zeichen gewonnen hat, sonst false
    //
    // Beispiel: die obere Reihe (Index 0,1,2) ist ueberall 'X'
    //           -> hatGewonnen(feld, 'X') gibt true zurueck
    //
    // Tipp: Pruefe z.B. fuer die obere Reihe:
    //       feld[0] == zeichen && feld[1] == zeichen && feld[2] == zeichen
    //       Mache das fuer alle 8 Reihen.
    // -----------------------------------------------------------------
    public static boolean hatGewonnen(char[] feld, char zeichen) {

        // TODO: HIER PROGRAMMIEREN

        return false;   // <- Platzhalter
    }

    // -----------------------------------------------------------------
    // DEINE AUFGABE 2
    //
    // Prueft, ob das Feld voll ist (kein leeres Feld mehr).
    // Ein Feld ist belegt, wenn dort 'X' oder 'O' steht.
    //
    // Rueckgabe: true, wenn ALLE 9 Felder belegt sind, sonst false
    //
    // Tipp: Gehe mit einer for-Schleife durch das Feld. Sobald du ein
    //       Feld findest, das WEDER 'X' NOCH 'O' ist, ist es nicht voll.
    // -----------------------------------------------------------------
    public static boolean istVoll(char[] feld) {

        // TODO: HIER PROGRAMMIEREN

        return false;   // <- Platzhalter
    }

    // -----------------------------------------------------------------
    // Ein- und Ausgabe. Ist fertig. Ruft oben deine Methoden auf.
    // -----------------------------------------------------------------
    public static void spielen(Scanner sc) {

        char[] feld = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char spieler = 'X';
        boolean fertig = false;

        System.out.println("\n--- TIC TAC TOE ---");
        System.out.println("Zwei Spieler. Gib die Zahl des Feldes ein (1-9).");

        while (!fertig) {

            zeigeFeld(feld);

            System.out.print("Spieler " + spieler + ", welches Feld? ");
            String eingabe = sc.nextLine().trim();

            if (eingabe.length() != 1 || eingabe.charAt(0) < '1' || eingabe.charAt(0) > '9') {
                System.out.println("Bitte eine Zahl zwischen 1 und 9 eingeben.");
                continue;
            }

            int platz = eingabe.charAt(0) - '1';

            if (feld[platz] == 'X' || feld[platz] == 'O') {
                System.out.println("Dieses Feld ist schon belegt.");
                continue;
            }

            feld[platz] = spieler;

            if (hatGewonnen(feld, spieler)) {
                zeigeFeld(feld);
                System.out.println("Spieler " + spieler + " hat gewonnen!");
                fertig = true;
            } else if (istVoll(feld)) {
                zeigeFeld(feld);
                System.out.println("Unentschieden!");
                fertig = true;
            } else {
                if (spieler == 'X') {
                    spieler = 'O';
                } else {
                    spieler = 'X';
                }
            }
        }
    }

    // Zeigt das 3x3 Feld an. Ist fertig, nicht veraendern noetig.
    private static void zeigeFeld(char[] feld) {
        System.out.println();
        System.out.println(" " + feld[0] + " | " + feld[1] + " | " + feld[2]);
        System.out.println("---+---+---");
        System.out.println(" " + feld[3] + " | " + feld[4] + " | " + feld[5]);
        System.out.println("---+---+---");
        System.out.println(" " + feld[6] + " | " + feld[7] + " | " + feld[8]);
        System.out.println();
    }
}
