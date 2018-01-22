
package introsde.mapsadapter.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.mapsadapter.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMaps_QNAME = new QName("http://soap.mapsadapter.introsde/", "getMaps");
    private final static QName _GetMapsResponse_QNAME = new QName("http://soap.mapsadapter.introsde/", "getMapsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.mapsadapter.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMapsResponse }
     * 
     */
    public GetMapsResponse createGetMapsResponse() {
        return new GetMapsResponse();
    }

    /**
     * Create an instance of {@link GetMaps }
     * 
     */
    public GetMaps createGetMaps() {
        return new GetMaps();
    }

    /**
     * Create an instance of {@link Maps }
     * 
     */
    public Maps createMaps() {
        return new Maps();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.mapsadapter.introsde/", name = "getMaps")
    public JAXBElement<GetMaps> createGetMaps(GetMaps value) {
        return new JAXBElement<GetMaps>(_GetMaps_QNAME, GetMaps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMapsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.mapsadapter.introsde/", name = "getMapsResponse")
    public JAXBElement<GetMapsResponse> createGetMapsResponse(GetMapsResponse value) {
        return new JAXBElement<GetMapsResponse>(_GetMapsResponse_QNAME, GetMapsResponse.class, null, value);
    }

}
