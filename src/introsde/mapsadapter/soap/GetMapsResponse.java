
package introsde.mapsadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMapsResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMapsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMaps" type="{http://soap.mapsadapter.introsde/}maps" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMapsResponse", propOrder = {
    "getMaps"
})
public class GetMapsResponse {

    protected Maps getMaps;

    /**
     * Recupera il valore della proprietà getMaps.
     * 
     * @return
     *     possible object is
     *     {@link Maps }
     *     
     */
    public Maps getGetMaps() {
        return getMaps;
    }

    /**
     * Imposta il valore della proprietà getMaps.
     * 
     * @param value
     *     allowed object is
     *     {@link Maps }
     *     
     */
    public void setGetMaps(Maps value) {
        this.getMaps = value;
    }

}
