# Game Browser – Java Übungsprojekt

Ein kleines Übungsprojekt für den Einstieg in Java. Es gibt ein Menü im
Terminal, von dem aus man **fünf kleine Spiele** starten kann.

Das Drumherum (Menü, Ein- und Ausgabe, Tests) ist **schon fertig**.
Deine Aufgabe ist es, die **Spiellogik** zu programmieren – also die Stellen,
an denen `// TODO: HIER PROGRAMMIEREN` steht.

---

## Voraussetzungen

- Java (JDK) installiert (`java -version` und `javac -version` müssen funktionieren)
- Ein Terminal / eine Konsole

---

## Starten

Alle Dateien liegen in einem Ordner. Im Terminal in diesen Ordner wechseln, dann:

**Zuerst die Tests (empfohlen!):**
```
javac *.java
java Tests
```
Am Anfang sind fast alle Tests rot `[X]`, weil die Logik noch fehlt.
Sobald du eine Methode richtig schreibst, wird ihr Test grün `[OK]`.
**Ziel: alle Tests grün.**

**Das Spiel selbst starten:**
```
javac *.java
java Main
```
> Hinweis: Die Spiele funktionieren erst richtig, wenn du die Logik
> programmiert hast. Arbeite am besten mit den Tests und probiere danach
> im Menü aus, ob dein Spiel läuft.

---

## Welche Dateien bearbeite ich?

| Datei | Was tun? |
|-------|----------|
| `SchereSteinPapier.java` | **Nichts** – das ist das gelöste Beispiel. Schau es dir an! |
| `HoeherTiefer.java` | Methode `vergleiche()` schreiben |
| `Hangman.java` | Methoden `deckeAuf()` und `istGeloest()` schreiben |
| `TicTacToe.java` | Methoden `hatGewonnen()` und `istVoll()` schreiben |
| `PasswortSpiel.java` | Die fünf Regel-Methoden schreiben |
| `Main.java` | **Nichts** – das ist das Menü |
| `Tests.java` | **Nichts** – das prüft deine Lösung |

Du schreibst **nur** die Methoden mit `// TODO: HIER PROGRAMMIEREN`.
Die Ein- und Ausgabe ist überall schon fertig.

---

## Was die Spiele können müssen

### 1. Schere Stein Papier — *(schon gelöst, als Vorlage)*
Spieler wählt Schere, Stein oder Papier. Der Computer wählt zufällig.
Dann wird verglichen, wer gewinnt. Schaue dir diese Datei an, um zu sehen,
wie so eine Logik-Methode aussieht.

### 2. Höher oder Tiefer
Der Computer denkt sich eine Zahl von 1 bis 100 aus. Der Spieler rät.
Das Programm sagt:
- **"hoeher"**, wenn der Tipp zu klein war
- **"tiefer"**, wenn der Tipp zu groß war
- **"richtig"**, wenn der Tipp stimmt

Am Ende wird angezeigt, wie viele Versuche man gebraucht hat.

### 3. Hangman
Der Computer wählt ein Wort. Der Spieler rät Buchstaben.
- Richtiger Buchstabe: Er wird an den passenden Stellen aufgedeckt.
- Falscher Buchstabe: Ein Fehler (maximal 6 Fehler sind erlaubt).
- Wenn das ganze Wort aufgedeckt ist: gewonnen.
- Wenn die Fehler aufgebraucht sind: verloren.

### 4. Tic Tac Toe (zwei Spieler)
Zwei Spieler (`X` und `O`) setzen abwechselnd auf ein 3×3-Feld
(Zahlen 1–9 wählen das Feld). Wer zuerst **drei in einer Reihe** hat
(waagrecht, senkrecht oder diagonal), gewinnt. Ist das Feld voll und
niemand hat gewonnen: unentschieden.

### 5. Passwort Spiel *(Idee wie bei neal.fun)*
Der Spieler muss ein Passwort finden, das **alle Regeln gleichzeitig**
erfüllt. Nach jeder Eingabe wird angezeigt, welche Regeln schon stimmen.

Die Regeln:
1. Mindestens 8 Zeichen lang
2. Enthält mindestens eine Zahl
3. Enthält mindestens einen Großbuchstaben
4. Die Ziffern ergeben zusammen genau 10
5. Enthält das Wort `css`

Ein Passwort, das alle Regeln erfüllt, ist zum Beispiel: `CSSpass451`

---

## Tipps

- Fang mit dem einfachsten Spiel an: **Höher oder Tiefer**.
- Über jeder Methode steht ein Kommentar, der genau erklärt, was rein-
  und was rauskommt, mit einem Beispiel.
- Lass nach jeder Änderung `java Tests` laufen und schau, ob mehr grün wird.
- Nutze `SchereSteinPapier.java` als Vorlage, wenn du nicht weiterweißt.

Viel Erfolg!
