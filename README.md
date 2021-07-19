# Zuul 3

Puh, im letzten Arbeitsblatt waren ja eine ganze Menge IF-Anweisungen nötig um die verschiedenen Richtungen umzusetzen.
Stell dir vor du wolltest auch noch weitere Richtungen umsetzen, du müsstest jedes Mal an diversen Stellen ganz viele
IF-Anweisungen ergänzen. Um diesem Problem zuvor zu kommen beschließt du, deinen Entwurf nochmal zu verändern.

Um dir die IF-Anweisungen zu sparen müsstest du irgendwie die Zuordnung der Richtung zum richtigen Ausgang für jeden
Raum abspeichern können. Hier ein Beispiel anhand des Raums Taverne:

| Richtung, Datentyp String | Ausgang, Datentyp Raum |
| --- | --- |
| „north&quot; | nordausgang |
| „down&quot; | treppeNachUnten |
| „up&quot; | treppeNachOben&quot; |

Anhand einer solchen Zuordnung könnte der Code der Methode getAusgang(String richtung) der Klasse Raum deutlich verkürzt
werden. Die Richtung wäre der Schlüssel anhand dessen in der Tabelle nach dem richtigen Ausgang gesucht wird. Dieser
wird dann zurückgegeben.

In Java realisiert man eine solche Zuordnung mit einer Hashmap!

_Deklaration:_

HashMap\&lt;String, Raum\&gt; **ausgaenge;**

_Initialisierung:_

```java
ausgaenge=new HashMap<>();
```

_Werte hinzufügen:_

```java
ausgaenge.put("richtung",raumObjekt);
```

_Raum-Objekt anhand der Richtung bekommen:_

```java
Raum r=ausgaenge.get("richtung");
```

_Alle Schlüssel, die momentan in der HashMap gespeichert sind, erhalten und mit einer Schleife darüber iterieren:_

```java
for(String s:ausgaenge.keySet()){
        System.out.println(s);
        }
```

**Aufgabe 1**

Lösche in der Klasse Raum alle Attribute, die Ausgänge repräsentieren. Füge ein Attribut ausgaenge des Typs Hashmap
hinzu (siehe oben). Initialisiere es im Konstruktor der Klasse Raum, sodass jedes Raumobjekt seine eigene HashMap
erhält (siehe oben).

Jetzt sollten in der Klasse viele Fehler angezeigt werden. Keine Panik, wir werden das nach und nach beheben!

**Aufgabe 2**

setzeAusgaenge() funktioniert nun auch nicht mehr. Hier ist noch Wissen über die Ausgänge fest verdrahtet. Das muss
verbessert werden! Ersetze die Methode durch eine Methode setAusgang(String richtung, Raum nachbar). Diese Methode soll
der HashMap dann einen Eintrag hinzufügen.

Leider ist von dieser Änderung auch die Klasse Spiel betroffen. Vollkommene Entkopplung von Klassen nicht möglich, da
sonst keine Interaktion mehr möglich ist. Angestrebt wird jedoch, den Grad der Kopplung möglichst niedrig zu halten.
Ersetze den Methodenaufruf von setzeAusgaenge() durch entsprechende Aufrufe von setAusgang(String richtung, Raum
nachbar).

**Aufgabe 3**

getAusgang(String name) funktioniert nun nicht mehr. Ändere die Methode entsprechend ab. Hier sollte es keine
IF-Anweisungen mehr geben. Nutze die HashMap ausgaenge!

**Aufgabe 4**

Dasselbe gilt für die Methode ausgaengeToString(). Ändere auch sie entsprechend ab. Nutze die Möglichkeit, über alle
Schlüssel der HashMap zu iterieren (siehe oben)!

**Aufgabe 5**

Teste die neu gewonnene Flexibilität, die du durch die bessere Kohäsion der Klasse Raum sowie die geringere Kopplung der
Klassen Raum und Spiel gewonnen hast. Füge dem ersten Stock der Taverne einen weiteren Ausgang „window&quot; hinzu.
Springt man durch das Fenster, befindet man sich direkt auf dem Dorfplatz! Merkst du wie gering der Aufwand für diese
Änderung war?
