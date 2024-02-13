
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionEuToDh_QNAME = new QName("http://WS/", "ConversionEuToDh");
    private static final QName _ConversionEuToDhResponse_QNAME = new QName("http://WS/", "ConversionEuToDhResponse");
    private static final QName _GetCompte_QNAME = new QName("http://WS/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://WS/", "getCompteResponse");
    private static final QName _ListesCompte_QNAME = new QName("http://WS/", "listesCompte");
    private static final QName _ListesCompteResponse_QNAME = new QName("http://WS/", "listesCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuToDh }
     * 
     * @return
     *     the new instance of {@link ConversionEuToDh }
     */
    public ConversionEuToDh createConversionEuToDh() {
        return new ConversionEuToDh();
    }

    /**
     * Create an instance of {@link ConversionEuToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuToDhResponse }
     */
    public ConversionEuToDhResponse createConversionEuToDhResponse() {
        return new ConversionEuToDhResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ListesCompte }
     * 
     * @return
     *     the new instance of {@link ListesCompte }
     */
    public ListesCompte createListesCompte() {
        return new ListesCompte();
    }

    /**
     * Create an instance of {@link ListesCompteResponse }
     * 
     * @return
     *     the new instance of {@link ListesCompteResponse }
     */
    public ListesCompteResponse createListesCompteResponse() {
        return new ListesCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConversionEuToDh")
    public JAXBElement<ConversionEuToDh> createConversionEuToDh(ConversionEuToDh value) {
        return new JAXBElement<>(_ConversionEuToDh_QNAME, ConversionEuToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConversionEuToDhResponse")
    public JAXBElement<ConversionEuToDhResponse> createConversionEuToDhResponse(ConversionEuToDhResponse value) {
        return new JAXBElement<>(_ConversionEuToDhResponse_QNAME, ConversionEuToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListesCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListesCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listesCompte")
    public JAXBElement<ListesCompte> createListesCompte(ListesCompte value) {
        return new JAXBElement<>(_ListesCompte_QNAME, ListesCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListesCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListesCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listesCompteResponse")
    public JAXBElement<ListesCompteResponse> createListesCompteResponse(ListesCompteResponse value) {
        return new JAXBElement<>(_ListesCompteResponse_QNAME, ListesCompteResponse.class, null, value);
    }

}
