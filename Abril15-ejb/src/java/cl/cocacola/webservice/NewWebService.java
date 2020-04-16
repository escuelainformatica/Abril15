/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.cocacola.webservice;

import cl.cocacola.ejb.FacturaEJB;
import cl.cocacola.entidades.Factura;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@Stateless
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @EJB
    private FacturaEJB ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        return ejbRef.sumar(n1, n2);
    }

    @WebMethod(operationName = "listar")
    public List<Factura> listar() {
        return ejbRef.listar();
    }

    @WebMethod(operationName = "insertar")
    @Oneway
    public void insertar(@WebParam(name = "factura") Factura factura) {
        ejbRef.insertar(factura);
    }
    
}
