// =====================================================================
// TESTS
// Diese Datei prueft, ob deine Logik-Methoden richtig funktionieren.
// Du musst sie NICHT veraendern.
//
// So startest du die Tests:
//   javac *.java
//   java Tests
//
// Am Anfang sind fast alle Tests rot [X], weil die Logik noch fehlt.
// Sobald du eine Methode richtig programmierst, wird ihr Test gruen [OK].
// Ziel: alle Tests gruen!
// =====================================================================
public class Tests {

    static int bestanden = 0;
    static int total = 0;

    public static void main(String[] args) {

        System.out.println("========== TESTS ==========\n");

        // ----- Schere Stein Papier (Beispiel, sollte schon gruen sein) -----
        System.out.println("Schere Stein Papier:");
        pruefe("schere schlaegt papier",
                SchereSteinPapier.vergleiche("schere", "papier").equals("gewonnen"));
        pruefe("stein schlaegt schere",
                SchereSteinPapier.vergleiche("stein", "schere").equals("gewonnen"));
        pruefe("papier schlaegt stein",
                SchereSteinPapier.vergleiche("papier", "stein").equals("gewonnen"));
        pruefe("stein verliert gegen papier",
                SchereSteinPapier.vergleiche("stein", "papier").equals("verloren"));
        pruefe("gleiches gibt unentschieden",
                SchereSteinPapier.vergleiche("stein", "stein").equals("unentschieden"));

        // ----- Hoeher oder Tiefer -----
        System.out.println("\nHoeher oder Tiefer:");
        pruefe("30 bei gesucht 50 -> hoeher",
                HoeherTiefer.vergleiche(30, 50).equals("hoeher"));
        pruefe("70 bei gesucht 50 -> tiefer",
                HoeherTiefer.vergleiche(70, 50).equals("tiefer"));
        pruefe("50 bei gesucht 50 -> richtig",
                HoeherTiefer.vergleiche(50, 50).equals("richtig"));

        // ----- Hangman -----
        System.out.println("\nHangman:");
        char[] anzeige1 = {'_', '_', '_', '_', '_'};
        boolean gefunden1 = Hangman.deckeAuf("katze", anzeige1, 't');
        pruefe("deckeAuf findet 't' in 'katze'", gefunden1 == true);
        pruefe("deckeAuf setzt 't' an die richtige Stelle", anzeige1[2] == 't');

        char[] anzeige2 = {'_', '_', '_', '_', '_'};
        boolean gefunden2 = Hangman.deckeAuf("katze", anzeige2, 'x');
        pruefe("deckeAuf gibt false bei nicht vorhandenem Buchstaben", gefunden2 == false);

        pruefe("istGeloest true bei vollem Wort",
                Hangman.istGeloest(new char[]{'k', 'a', 't', 'z', 'e'}) == true);
        pruefe("istGeloest false wenn noch '_' da ist",
                Hangman.istGeloest(new char[]{'k', 'a', '_', 'z', 'e'}) == false);

        // ----- Tic Tac Toe -----
        System.out.println("\nTic Tac Toe:");
        char[] oben = {'X', 'X', 'X', '4', '5', '6', '7', '8', '9'};
        pruefe("hatGewonnen erkennt obere Reihe",
                TicTacToe.hatGewonnen(oben, 'X') == true);
        char[] spalte = {'O', '2', '3', 'O', '5', '6', 'O', '8', '9'};
        pruefe("hatGewonnen erkennt linke Spalte",
                TicTacToe.hatGewonnen(spalte, 'O') == true);
        char[] diagonale = {'X', '2', '3', '4', 'X', '6', '7', '8', 'X'};
        pruefe("hatGewonnen erkennt Diagonale",
                TicTacToe.hatGewonnen(diagonale, 'X') == true);
        char[] keineReihe = {'X', 'O', 'X', '4', '5', '6', '7', '8', '9'};
        pruefe("hatGewonnen gibt false ohne drei in Reihe",
                TicTacToe.hatGewonnen(keineReihe, 'X') == false);

        char[] vollesFeld = {'X', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X'};
        pruefe("istVoll erkennt volles Feld",
                TicTacToe.istVoll(vollesFeld) == true);
        char[] halbesFeld = {'X', 'O', '3', '4', '5', '6', '7', '8', '9'};
        pruefe("istVoll gibt false bei freien Feldern",
                TicTacToe.istVoll(halbesFeld) == false);

        // ----- Passwort Spiel -----
        System.out.println("\nPasswort Spiel:");
        pruefe("mindestens8Zeichen true bei 8 Zeichen",
                PasswortSpiel.mindestens8Zeichen("12345678") == true);
        pruefe("mindestens8Zeichen false bei 5 Zeichen",
                PasswortSpiel.mindestens8Zeichen("12345") == false);
        pruefe("hatZahl true bei 'abc1'",
                PasswortSpiel.hatZahl("abc1") == true);
        pruefe("hatZahl false bei 'abc'",
                PasswortSpiel.hatZahl("abc") == false);
        pruefe("hatGrossbuchstabe true bei 'aBc'",
                PasswortSpiel.hatGrossbuchstabe("aBc") == true);
        pruefe("hatGrossbuchstabe false bei 'abc'",
                PasswortSpiel.hatGrossbuchstabe("abc") == false);
        pruefe("zifferSumme von 'abc451' ist 10",
                PasswortSpiel.zifferSumme("abc451") == 10);
        pruefe("zifferSumme von 'hallo' ist 0",
                PasswortSpiel.zifferSumme("hallo") == 0);
        pruefe("enthaeltCss true bei 'myCSSpw'",
                PasswortSpiel.enthaeltCss("myCSSpw") == true);
        pruefe("enthaeltCss false bei 'hallo'",
                PasswortSpiel.enthaeltCss("hallo") == false);

        // ----- Ergebnis -----
        System.out.println("\n===========================");
        System.out.println("Ergebnis: " + bestanden + " von " + total + " Tests bestanden.");
        if (bestanden == total) {
            System.out.println("Super! Alles gruen. Du bist fertig!");
        } else {
            System.out.println("Noch " + (total - bestanden) + " offen. Weiter geht's!");
        }
    }

    // Prueft eine Bedingung und zeigt gruen [OK] oder rot [X].
    static void pruefe(String name, boolean bedingung) {
        total++;
        if (bedingung) {
            bestanden++;
            System.out.println("  [OK] " + name);
        } else {
            System.out.println("  [X ] " + name);
        }
    }
}
