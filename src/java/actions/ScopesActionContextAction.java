/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author mario
 */
@Namespace(value = "/")
@Action(value = "scopesActionContext", results ={@Result(name = "success", location = "/resultado.jsp")})
public class ScopesActionContextAction extends ActionSupport
{
    private String datoSesion;
    private String datosAplicacion;

    @Override
    public String execute() throws Exception
    {
        ActionContext contexto = ActionContext.getContext();
        
        Map<String, Object> application = contexto.getApplication();
        Map<String, Object> sesion = contexto.getSession();
        
        application.put("datoAplicacion", datosAplicacion);
        sesion.put("datoSesion", datoSesion);

        return SUCCESS;
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