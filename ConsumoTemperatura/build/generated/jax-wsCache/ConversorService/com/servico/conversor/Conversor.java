
package com.servico.conversor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Conversor", targetNamespace = "http://conversor.servico.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Conversor {


    /**
     * 
     * @param c
     * @return
     *     returns com.servico.conversor.Temperatura
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gerarTemperatura", targetNamespace = "http://conversor.servico.com/", className = "com.servico.conversor.GerarTemperatura")
    @ResponseWrapper(localName = "gerarTemperaturaResponse", targetNamespace = "http://conversor.servico.com/", className = "com.servico.conversor.GerarTemperaturaResponse")
    @Action(input = "http://conversor.servico.com/Conversor/gerarTemperaturaRequest", output = "http://conversor.servico.com/Conversor/gerarTemperaturaResponse")
    public Temperatura gerarTemperatura(
        @WebParam(name = "c", targetNamespace = "")
        double c);

}
