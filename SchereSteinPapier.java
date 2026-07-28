import java.util.Random;
import java.util.Scanner;

// =====================================================================
// SCHERE STEIN PAPIER
//
// DIESES SPIEL IST ALS BEISPIEL KOMPLETT GELOEST.
// Schau es dir an, um zu verstehen, wie die anderen Spiele aufgebaut
// sind. Bei den anderen Spielen musst du die Logik selber schreiben.
// =====================================================================
public class SchereSteinPapier {

    // -----------------------------------------------------------------
    // DAS IST DIE LOGIK-METHODE (bei dir musst du so etwas schreiben).
    //
    // Vergleicht die Wahl des Spielers mit der des Computers.
    //
    // spieler:  "schere", "stein" oder "papier"
    // computer: "schere", "stein" oder "papier"
    // Rueckgabe: "gewonnen", "verloren" oder "unentschieden"
    //
    // Beispiel: vergleiche("schere", "papier") ergibt "gewonnen"
    // -----------------------------------------------------------------
    public static String vergleiche(String spieler, String computer) {

        // Gleiche Wahl -> unentschieden.
        if (spieler.equals(computer)) {
            return "unentschieden";
        }

        // Die drei Faelle, in denen der Spieler gewinnt.
        if (spieler.equals("schere") && computer.equals("papier")) {
            return "gewonnen";
        }
        if (spieler.equals("stein") && computer.equals("schere")) {
            return "gewonnen";
        }
        if (spieler.equals("papier") && computer.equals("stein")) {
            return "gewonnen";
        }

        // Sonst hat der Spieler verloren.
        return "verloren";
    }

    // -----------------------------------------------------------------
    // Das ist die Ein- und Ausgabe. Sie ist fertig und ruft oben
    // die Methode vergleiche() auf.
    // -----------------------------------------------------------------
    public static void spielen(Scanner sc) {

        System.out.println("\n--- SCHERE STEIN PAPIER ---");
        System.out.print("Deine Wahl (schere/stein/papier): ");
        String spieler = sc.nextLine().toLowerCase().trim();

        // Pruefen, ob die Eingabe gueltig ist.
        if (!spieler.equals("schere") && !spieler.equals("stein") && !spieler.equals("papier")) {
            System.out.println("Das gibt es nicht.");
            return;
        }

        // Der Computer waehlt zufaellig.
        String[] moeglich = {"schere", "stein", "papier"};
        Random random = new Random();
        String computer = moeglich[random.nextInt(3)];
        System.out.println("Computer waehlt: " + computer);

        // Die Logik-Methode entscheidet, wer gewinnt.
        String ergebnis = vergleiche(spieler, computer);

        if (ergebnis.equals("gewonnen")) {
            System.out.println("Du hast GEWONNEN!");
        } else if (ergebnis.equals("verloren")) {
            System.out.println("Du hast VERLOREN!");
        } else {
            System.out.println("UNENTSCHIEDEN!");
        }
    }
}
