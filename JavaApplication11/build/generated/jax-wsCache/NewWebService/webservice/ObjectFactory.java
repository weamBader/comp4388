
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://webService/", "helloResponse");
    private final static QName _FeaturesResponse_QNAME = new QName("http://webService/", "FeaturesResponse");
    private final static QName _Template_QNAME = new QName("http://webService/", "Template");
    private final static QName _JSONException_QNAME = new QName("http://webService/", "JSONException");
    private final static QName _IOException_QNAME = new QName("http://webService/", "IOException");
    private final static QName _Hello_QNAME = new QName("http://webService/", "hello");
    private final static QName _Features_QNAME = new QName("http://webService/", "Features");
    private final static QName _TemplateResponse_QNAME = new QName("http://webService/", "TemplateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeaturesResponse }
     * 
     */
    public FeaturesResponse createFeaturesResponse() {
        return new FeaturesResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JSONException }
     * 
     */
    public JSONException createJSONException() {
        return new JSONException();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link TemplateResponse }
     * 
     */
    public TemplateResponse createTemplateResponse() {
        return new TemplateResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Template }
     * 
     */
    public Template createTemplate() {
        return new Template();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "FeaturesResponse")
    public JAXBElement<FeaturesResponse> createFeaturesResponse(FeaturesResponse value) {
        return new JAXBElement<FeaturesResponse>(_FeaturesResponse_QNAME, FeaturesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Template }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "Template")
    public JAXBElement<Template> createTemplate(Template value) {
        return new JAXBElement<Template>(_Template_QNAME, Template.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JSONException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "JSONException")
    public JAXBElement<JSONException> createJSONException(JSONException value) {
        return new JAXBElement<JSONException>(_JSONException_QNAME, JSONException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Features }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "Features")
    public JAXBElement<Features> createFeatures(Features value) {
        return new JAXBElement<Features>(_Features_QNAME, Features.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "TemplateResponse")
    public JAXBElement<TemplateResponse> createTemplateResponse(TemplateResponse value) {
        return new JAXBElement<TemplateResponse>(_TemplateResponse_QNAME, TemplateResponse.class, null, value);
    }

}
