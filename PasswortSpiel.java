import java.util.Scanner;

// =====================================================================
// PASSWORT SPIEL (Idee wie bei neal.fun)
// Der Spieler muss ein Passwort finden, das ALLE Regeln gleichzeitig
// erfuellt. Nach jeder Eingabe wird geprueft, welche Regeln schon
// stimmen.
//
// DEINE AUFGABE: Schreibe die fuenf Regel-Methoden.
//
// Ein Beispiel-Passwort, das am Ende alle Regeln erfuellt: CSSpass451
// =====================================================================
public class PasswortSpiel {

    // -----------------------------------------------------------------
    // REGEL 1 (DEINE AUFGABE)
    // Gibt true zurueck, wenn das Passwort mindestens 8 Zeichen lang ist.
    //
    // Tipp: pw.length() gibt die Laenge zurueck.
    // -----------------------------------------------------------------
    public static boolean mindestens8Zeichen(String pw) {
        // TODO: HIER PROGRAMMIEREN
        return false;
    }

    // -----------------------------------------------------------------
    // REGEL 2 (DEINE AUFGABE)
    // Gibt true zurueck, wenn im Passwort mindestens eine Ziffer (0-9) ist.
    //
    // Tipp: Gehe mit einer for-Schleife durch das Passwort.
    //       Ein Zeichen c ist eine Ziffer, wenn:  c >= '0' && c <= '9'
    // -----------------------------------------------------------------
    public static boolean hatZahl(String pw) {
        // TODO: HIER PROGRAMMIEREN
        return false;
    }

    // -----------------------------------------------------------------
    // REGEL 3 (DEINE AUFGABE)
    // Gibt true zurueck, wenn im Passwort mindestens ein Grossbuchstabe
    // (A-Z) vorkommt.
    //
    // Tipp: Ein Zeichen c ist ein Grossbuchstabe, wenn: c >= 'A' && c <= 'Z'
    // -----------------------------------------------------------------
    public static boolean hatGrossbuchstabe(String pw) {
        // TODO: HIER PROGRAMMIEREN
        return false;
    }

    // -----------------------------------------------------------------
    // REGEL 4 (DEINE AUFGABE)
    // Zaehlt alle Ziffern im Passwort zusammen und gibt die Summe zurueck.
    //
    // Beispiel: "abc451" -> 4 + 5 + 1 = 10, also Rueckgabe 10
    // Beispiel: "hallo"  -> keine Ziffern, also Rueckgabe 0
    //
    // (Die Regel im Spiel lautet: die Summe muss genau 10 sein.)
    //
    // Tipp: Eine Ziffer c kannst du mit  (c - '0')  in eine Zahl umwandeln.
    //       '5' - '0' ergibt zum Beispiel 5.
    // -----------------------------------------------------------------
    public static int zifferSumme(String pw) {
        // TODO: HIER PROGRAMMIEREN
        return 0;
    }

    // -----------------------------------------------------------------
    // REGEL 5 (DEINE AUFGABE)
    // Gibt true zurueck, wenn im Passwort das Wort "css" vorkommt
    // (egal ob gross oder klein geschrieben).
    //
    // Tipp: Mach das Passwort zuerst klein: pw.toLowerCase()
    //       Dann pruefe mit  .indexOf("css") != -1
    // -----------------------------------------------------------------
    public static boolean enthaeltCss(String pw) {
        // TODO: HIER PROGRAMMIEREN
        return false;
    }

    // -----------------------------------------------------------------
    // Ein- und Ausgabe. Ist fertig. Ruft oben deine Regel-Methoden auf.
    // -----------------------------------------------------------------
    public static void spielen(Scanner sc) {

        System.out.println("\n--- PASSWORT SPIEL ---");
        System.out.println("Finde ein Passwort, das ALLE Regeln erfuellt.");
        System.out.println("(Leer lassen und Enter druecken, um abzubrechen.)");

        boolean gewonnen = false;

        while (!gewonnen) {

            System.out.print("\nDein Passwort: ");
            String pw = sc.nextLine();

            // Abbrechen mit leerer Eingabe.
            if (pw.length() == 0) {
                System.out.println("Abgebrochen.");
                return;
            }

            boolean r1 = mindestens8Zeichen(pw);
            boolean r2 = hatZahl(pw);
            boolean r3 = hatGrossbuchstabe(pw);
            int summe = zifferSumme(pw);
            boolean r4 = (summe == 10);
            boolean r5 = enthaeltCss(pw);

            System.out.println(zeichen(r1) + " Regel 1: mindestens 8 Zeichen");
            System.out.println(zeichen(r2) + " Regel 2: mindestens eine Zahl");
            System.out.println(zeichen(r3) + " Regel 3: ein Grossbuchstabe");
            System.out.println(zeichen(r4) + " Regel 4: Ziffern ergeben zusammen 10 (aktuell " + summe + ")");
            System.out.println(zeichen(r5) + " Regel 5: enthaelt das Wort 'css'");

            if (r1 && r2 && r3 && r4 && r5) {
                System.out.println("\nPerfekt! Alle Regeln erfuellt. Gewonnen!");
                gewonnen = true;
            }
        }
    }

    // Kleiner Helfer fuer die Anzeige: Haken oder Kreuz.
    private static String zeichen(boolean erfuellt) {
        if (erfuellt) {
            return "[OK]";
        } else {
            return "[X ]";
        }
    }
}
