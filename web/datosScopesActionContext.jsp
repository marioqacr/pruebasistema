<%-- 
    Document   : datosScopesActionContext
    Created on : 30/09/2014, 05:09:30 PM
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
<s:form action="scopesActionContext">
    <s:textfield name="datoSesion" label="Sesion" />
    <s:textfield name="datosAplicacion" label="Aplicacion" />
    <s:submit />
</s:form>
    </body>
</html>
