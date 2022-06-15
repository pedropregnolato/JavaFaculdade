<%-- 
    Document   : index
    Created on : 11/04/2022, 16:12:39
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> <head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Conversor temperatura</title>
 </head>
 <body> <h1>CONVERTENDO °C PARA °F</h1>
 
           <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.conversor.ConversorService service = new com.servico.conversor.ConversorService();
	com.servico.conversor.Conversor port = service.getConversorPort();
	 // TODO initialize WS operation arguments here
	double c = 0.0d;
	// TODO process result here
	com.servico.conversor.Temperatura result = port.gerarTemperatura(c);
	double f = result.getC() * 1.8 + 32;
        out.println(result.getC() + "°C são " + f + "°F");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

 
 </body></html>
