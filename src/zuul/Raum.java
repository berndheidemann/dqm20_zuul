/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * <p>
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Raum eine Referenz auf den
 * benachbarten Raum.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
package zuul;

import java.util.HashMap;

public class Raum {
    private String beschreibung;
    private HashMap<String, Raum> ausgaenge;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausg�nge.
     *
     * @param beschreibung enth�lt eine Beschreibung in der Form
     *                     "in einer K�che" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) {
        this.beschreibung = beschreibung;
        this.ausgaenge=new HashMap<>();
    }

    public Raum getAusgang(String richtung) {
        return this.ausgaenge.get(richtung);
    }

    public String ausgaengeToString() {
        String erg = "";
        for(String richtung:ausgaenge.keySet()){
            erg+=richtung + " ";
        }
        return erg;
    }

    public void setAusgang(String richtung, Raum nachbar) {
        this.ausgaenge.put(richtung, nachbar);
    }

    /**
     * @return Die Beschreibung dieses Raums.
     */
    public String gibBeschreibung() {
        return beschreibung;
    }

}
