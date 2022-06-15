<%-- 
    Document   : index
    Created on : 14/06/2022, 21:36:34
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	com.servico.reservas.ReservasAereasService service = new com.servico.reservas.ReservasAereasService();
	com.servico.reservas.ReservasAereas port = service.getReservasAereasPort();
	 // TODO initialize WS operation arguments here
	java.lang.String localizacao = "janela";
	java.lang.String classe = "primeira";
	// TODO process result here
	boolean result = port.reservarassento(localizacao, classe);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
