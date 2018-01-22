
package introsde.meteoadapter.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per meteo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="meteo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxTemperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minTemperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meteo", propOrder = {
    "maxTemperature",
    "minTemperature",
    "precipitation"
})
public class Meteo {

    protected Double maxTemperature;
    protected Double minTemperature;
    protected String precipitation;

    /**
     * Recupera il valore della propriet� maxTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Imposta il valore della propriet� maxTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTemperature(Double value) {
        this.maxTemperature = value;
    }

    /**
     * Recupera il valore della propriet� minTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTemperature() {
        return minTemperature;
    }

    /**
     * Imposta il valore della propriet� minTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTemperature(Double value) {
        this.minTemperature = value;
    }

    /**
     * Recupera il valore della propriet� precipitation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecipitation() {
        return precipitation;
    }

    /**
     * Imposta il valore della propriet� precipitation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecipitation(String value) {
        this.precipitation = value;
    }

}
