/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.conversor;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author pedro
 */
@WebService(
        name = "Conversor",
        serviceName = "ConversorService")
public class Conversor {

    /**
     * This is a sa'mple web service operation
     * @param c
     * @return 
     */
    @WebMethod(operationName = "gerarTemperatura")
    
    public Temperatura gerarTemperatura(@WebParam(name = "c") double c) {
        
        Temperatura objTemperatura = new Temperatura (c);
        return objTemperatura;
    }
}
