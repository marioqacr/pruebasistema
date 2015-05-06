<%-- 
    Document   : datosScopesInterfaces
    Created on : 30/09/2014, 10:46:28 AM
    Author     : mario
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <s:form action="scopesInterfaces">
        <s:textfield name="datoSesion" label="Sesion" />
        <s:textfield name="datoRequest" label="Request" />
        <s:textfield name="datosAplicacion" label="Aplicacion" />
        <s:submit />
    </s:form>
    </body>
</html>
