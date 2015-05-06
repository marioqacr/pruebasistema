/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author mario
 */
@Namespace(value = "")
@Action(value = "scopesInterfaces", results ={@Result(name = "success", location = "/resultado.jsp")})
public class ScopesInterfacesAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware
{
    private String datoSesion;
    private String datoRequest;
    private String datosAplicacion;
    private Map<String, Object> sesion;
    private Map<String, Object> application;
    private Map<String, Object> request;

    @Override
    public String execute() throws Exception
    {
        application.put("datoAplicacion", datosAplicacion);
        sesion.put("datoSesion", datoSesion);
        request.put("datoRequest", datoRequest);

        return SUCCESS;
    }

    public void setRequest(Map<String, Object> map)
    {
        this.request = map;
    }

    public void setApplication(Map<String, Object> map)
    {
        this.application = map;
    }

    public void setSession(Map<String, Object> map)
    {
        this.sesion = map;
    }

    public void setDatoRequest(String datoRequest)
    {
        this.datoRequest = datoRequest;
    }

    public void setDatoSesion(String datoSesion)
    {
        this.datoSesion = datoSesion;
    }

    public void setDatosAplicacion(String datosAplicacion)
    {
        this.datosAplicacion = datosAplicacion;
    }
}