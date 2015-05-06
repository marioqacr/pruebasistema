<%-- 
    Document   : resultado
    Created on : 30/09/2014, 10:54:32 AM
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
        Request: <s:property value="#request.datoRequest" /><br />
        Sesión: <s:property value="#session.datoSesion" /><br />
        Aplicacion: <s:property value="#application.datoAplicacion" /><br />
    </body>
</html>
