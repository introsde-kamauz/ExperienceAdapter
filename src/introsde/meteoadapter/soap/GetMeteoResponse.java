
package introsde.meteoadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getMeteoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getMeteoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMeteo" type="{http://soap.meteoadapter.introsde/}meteo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeteoResponse", propOrder = {
    "getMeteo"
})
public class GetMeteoResponse {

    protected Meteo getMeteo;

    /**
     * Recupera il valore della proprietà getMeteo.
     * 
     * @return
     *     possible object is
     *     {@link Meteo }
     *     
     */
    public Meteo getGetMeteo() {
        return getMeteo;
    }

    /**
     * Imposta il valore della proprietà getMeteo.
     * 
     * @param value
     *     allowed object is
     *     {@link Meteo }
     *     
     */
    public void setGetMeteo(Meteo value) {
        this.getMeteo = value;
    }

}
