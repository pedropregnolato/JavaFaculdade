
package com.servico.conversor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servico.conversor package. 
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

    private final static QName _GerarTemperatura_QNAME = new QName("http://conversor.servico.com/", "gerarTemperatura");
    private final static QName _GerarTemperaturaResponse_QNAME = new QName("http://conversor.servico.com/", "gerarTemperaturaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servico.conversor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarTemperatura }
     * 
     */
    public GerarTemperatura createGerarTemperatura() {
        return new GerarTemperatura();
    }

    /**
     * Create an instance of {@link GerarTemperaturaResponse }
     * 
     */
    public GerarTemperaturaResponse createGerarTemperaturaResponse() {
        return new GerarTemperaturaResponse();
    }

    /**
     * Create an instance of {@link Temperatura }
     * 
     */
    public Temperatura createTemperatura() {
        return new Temperatura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarTemperatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversor.servico.com/", name = "gerarTemperatura")
    public JAXBElement<GerarTemperatura> createGerarTemperatura(GerarTemperatura value) {
        return new JAXBElement<GerarTemperatura>(_GerarTemperatura_QNAME, GerarTemperatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarTemperaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversor.servico.com/", name = "gerarTemperaturaResponse")
    public JAXBElement<GerarTemperaturaResponse> createGerarTemperaturaResponse(GerarTemperaturaResponse value) {
        return new JAXBElement<GerarTemperaturaResponse>(_GerarTemperaturaResponse_QNAME, GerarTemperaturaResponse.class, null, value);
    }

}
