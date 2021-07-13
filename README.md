# Zuul 2

Für die Lösung des des letzten Arbeitsblatts wurden an vielen Stellen Änderungen durchgeführt. Änderungen an so vielen Stellen verweisen auf enge Kopplung und einen schlechten Softwareentwurf!

_Idealerweise sollten andere Klassen nicht von einer Änderung der Klasse Raum betroffen sein!_

Dies ist hier jedoch der Fall, da die Klasse Spiel die konkrete Implementierung der Klasse Raum benutzt. So greift sie z.B. direkt auf die öffentlichen Eigenschaften der Klasse Raum zu!

**Aufgabe -** Verringere die Kopplung!

_Änderungen in der Klasse Raum_

- Kapsel die Attribute der Klasse Raum, indem du den Zugriffsmodifizierer private verwendest
- Da nun ein Zugriff von außen nicht mehr möglich ist, werden zwei Schnittstellen benötigt:
  - Schreibe eine Methode getAusgang(), der die Richtung als String (north, south, etc.) übergeben wird und die den entsprechenden Raum zurückgibt.

Beispiel des Aufrufs in der Klasse Spiel (siehe unten unter _Änderungen in der Klasse Spiel_):

``` java
Raum r = this.aktuellerRaum.getAusgang("down");
```

- Schreibe eine Methode ausgaengeToString(), die alle vorhandenen Ausgänge als String zurückgibt. Ein Ausgang ist vorhanden, wenn er nicht null ist!

Beispiel des Aufrufs in der Klasse Spiel (siehe unten unter _Änderungen in der Klasse Spiel)_:

``` java
String ausgaenge = this.aktuellerRaum.ausgaengeToString();
```
Liefert den String &quot;south up down&quot;, sofern dies die einzigen Ausgänge des Raums sind

_Änderungen in der Klasse Spiel_

- Ein direkter Zugriff auf die Instanzvariablen der Klasse Raum ist nun nicht mehr möglich.
  - Ersetze daher in der Methode wechsleRaum() die if-Anweisungen durch Aufruf der Methode getAusgang()
  - Ersetze daher in der Methode rauminfoAusgeben() die if-Anweisungen durch Aufruf der Methode ausgaengeToString()

_Teste dein Programm!_