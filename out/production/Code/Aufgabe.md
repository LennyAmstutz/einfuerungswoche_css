# Aufgabe: Waldbrand-Simulation ("ForestBurn") in Java

## Ziel
Schreibe ein Java-Programm, das einen Waldbrand auf einem rechteckigen Gitter
(Grid) simuliert und in der Konsole anzeigt. Das gesamte Programm soll in einer
einzigen Java-Klasse stecken und ohne zusaetzliche Bibliotheken laufen.

## Der Wald
- Der Wald ist ein Gitter mit einer festen Breite und Hoehe (z. B. 30 x 20).
- Jede Zelle des Gitters ist ein Baum.
- Jeder Baum hat genau einen von drei Zustaenden:
  - **lebendig**
  - **brennend**
  - **verbrannt**
- Zu Beginn sind alle Baeume lebendig.

## Regeln pro Runde (Simulationsschritt)
1. **Feuer ausbreiten:** Ein brennender Baum kann jeden seiner bis zu 8
   Nachbarn (waagerecht, senkrecht und diagonal) anzuenden. Ein lebendiger
   Nachbar faengt nur mit einer bestimmten Wahrscheinlichkeit Feuer
   (z. B. 1 von 2). Neu entzuendete Baeume duerfen erst NACH der aktuellen
   Runde brennen – sonst wuerde das Feuer in einem einzigen Schritt ueber den
   ganzen Wald springen.
2. **Abbrennen:** Ein brennender Baum brennt eine feste Anzahl Runden
   (z. B. 3). Danach wird er zu **verbrannt**.
3. **Nachwachsen:** Ein verbrannter Baum kann mit einer bestimmten
   Wahrscheinlichkeit (z. B. 1 von 30) wieder **lebendig** werden.

## Start und Ablauf
- Zu Beginn wird ein zufaellig gewaehlter lebendiger Baum angezuendet.
- Das Programm laeuft in einer Schleife. In jeder Runde wird:
  1. das Gitter in der Konsole gezeichnet,
  2. eine Runde berechnet,
  3. kurz pausiert (z. B. 100 ms).
- Wenn kein Baum mehr brennt, soll automatisch wieder ein zufaelliger
  lebendiger Baum angezuendet werden.

## Ausgabe
- Zeichne das Gitter zeilenweise in der Konsole. Nutze z. B. ein Symbol/Emoji
  fuer lebendig (🌲), eines fuer brennend (🔥) und Leerzeichen fuer verbrannt.
- Loesche vor jeder neuen Runde den Bildschirm (z. B. mit ANSI-Codes), damit
  eine Animation entsteht.
- Gib unter dem Gitter eine kurze Statistik aus:
  Anzahl lebendiger, brennender und verbrannter Baeume.

## Vorgaben / Einschraenkungen
- Alles in **einer** einzigen Java-Klasse, so einfach wie moeglich.
- Keine externen Bibliotheken, nur die Java-Standardbibliothek.
- Zufall ueber `java.util.Random`.

## Bonus (optional)
- Wahrscheinlichkeiten, Groesse und Geschwindigkeit ueber Konstanten
  einstellbar machen.
