
package introsde.meteoadapter.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.meteoadapter.soap package. 
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

    private final static QName _GetMeteo_QNAME = new QName("http://soap.meteoadapter.introsde/", "getMeteo");
    private final static QName _GetMeteoResponse_QNAME = new QName("http://soap.meteoadapter.introsde/", "getMeteoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.meteoadapter.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMeteoResponse }
     * 
     */
    public GetMeteoResponse createGetMeteoResponse() {
        return new GetMeteoResponse();
    }

    /**
     * Create an instance of {@link GetMeteo }
     * 
     */
    public GetMeteo createGetMeteo() {
        return new GetMeteo();
    }

    /**
     * Create an instance of {@link Meteo }
     * 
     */
    public Meteo createMeteo() {
        return new Meteo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeteo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.meteoadapter.introsde/", name = "getMeteo")
    public JAXBElement<GetMeteo> createGetMeteo(GetMeteo value) {
        return new JAXBElement<GetMeteo>(_GetMeteo_QNAME, GetMeteo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeteoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.meteoadapter.introsde/", name = "getMeteoResponse")
    public JAXBElement<GetMeteoResponse> createGetMeteoResponse(GetMeteoResponse value) {
        return new JAXBElement<GetMeteoResponse>(_GetMeteoResponse_QNAME, GetMeteoResponse.class, null, value);
    }

}
