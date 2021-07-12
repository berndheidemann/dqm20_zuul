**Die Welt von Zuul**

**Aufgabe 1**

Lade dir das Archiv DieWeltVonZuul.zip von ItsLearning herunter.

*Eclipse*: Importiere das Archiv als Projekt

File � Import � existing Project into Workspace � Archiv ausw�hlen

*Eclipse*: Beachte, dass eventuell die Java-Version angepasst werden muss (Project � Properties � Java Build Path � Libraries � Button �Edit�)

*IntelliJ*: Entpacke das Archiv z.B. auf H:\projekte\zuul, starte IntelliJ und �ffne es (File � open).

IntelliJ: Beachte, dass eventuell die Java-Version angepasst werden muss (File � Project Structure � richtiges JDK ausw�hlen)

Starte das Spiel und schaue, welche Interaktionen m�glich sind.

**Aufgabe 2**

Betrachte den Source-Code der Anwendung. Was passiert in der Methode spielen() der Klasse Spiel? Versuche zu verstehen, wie der Programmfluss bei der Eingabe von help, go und quit aussieht. Was passiert im Code, wenn man z.B. go north eingibt?

**Aufgabe 3**

Lies die folgenden K�sten durch. Die beiden hier eingef�hrten Begriffe der Objektorientierten Programmierung werden im weiteren Verlauf h�ufig benutzt werden:

**Kopplung**

Der Begriff Kopplung beschreibt den Grad der Abh�ngigkeit zwischen Klassen. Es wird eine m�glichst lose Kopplung angestrebt, also ein System, in dem jede Klasse weitgehend unabh�ngig ist und mit anderen Klassen nur �ber m�glichst schmale, wohl definierte Schnittstellen kommuniziert.



**Koh�sion**

Der Begriff Koh�sion beschreibt, wie gut eine Programmeinheit eine logische Aufgabe oder Einheit abbildet. In einem System mit hoher Koh�sion ist jede Programmeinheit (eine Methode, Klasse oder ein Modul) verantwortlich f�r genau eine wohl definierte Aufgabe oder Einheit. Ein guter Klassenentwurf weist einen hohen Grad an Koh�sion auf.

- Eine Programmeinheit sollte f�r eine in sich geschlossene Aufgabe zust�ndig sein.
- Eine Methode sollte **eine** logische Operation implementieren.
- Eine Klasse sollte genau **einen** Typ von Objekt modellieren.
- Hauptanlass f�r Koh�sion ist die Wiederverwendung: Sie erh�ht die Wahrscheinlichkeit, dass eine Klasse oder Methode in einem anderen Zusammenhang eingesetzt werden kann. Au�erdem gibt es den Vorteil, dass im Falle von �nderungen die Stellen, die von diesen �nderungen betroffen sind, eher in einer Einheit zu finden sind.

Verst��t man gegen das **DRY-Prinzip** (Don�t repeat yourself), liegt h�ufig eine schlechte Koh�sion vor. Ein Beispiel w�re Code-Duplizierung:

- Erscheint ein Quelltextabschnitt mehr als einmal in einer Anwendung, spricht man von Code-Duplizierung
- Codeduplizierung birgt die Gefahr von Fehlern und Inkonsistenzen.
- Codeduplizierung ist ein Zeichen f�r schlechte Koh�sion.

**Aufgabe 4**

Schaue dir die Methoden wechselRaum() und willkommensTextAusgeben() an. Dort gibt es z.B. die oben beschriebene (fiese) Code-Duplizierung!

Schreibe eine Methode raumInfoAusgeben(), die du in den Methoden wechsleRaum() und willkommenstextAusgeben() aufgerufen wird und dar�ber die Codeduplizierung und die schlechte Koh�sion aufl�st.

**Aufgabe 5**

Erweiterung des Spiels: Es sollen die Bewegungsrichtungen up und down hinzugef�gt werden. Dementsprechend brauchen wir ein paar neue R�ume. Die Taverne hat nun einen ersten Stock, in dem die G�stezimmer untergebracht sind. Au�erdem hat die Taverne einen Keller, von dem ein Geheimgang zu einer alten Piratenh�hle unter der Lichtung f�hrt. Der auf der nachfolgenden Seite abgebildete Graph verdeutlicht, welche Wege m�glich sein sollen.

![](Aspose.Words.4e0f3e9a-5657-44df-ae87-fbaaeea33819.001.jpeg "R�ume")

Dazu sind �nderungen an folgenden Stellen n�tig:

- In der Klasse Raum
    - neue Instanzvariablen anlegen (treppeNachOben, treppeNachUnten)
    - in der Methode setzeAusg�nge()
- In der Klasse Spiel in der Methode
    - raeumeAnlegen()
    - rauminfoAusgeben()
    - wechsleRaum()

Teste dein Programm!

