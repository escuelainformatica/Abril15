
package cl.cocacola.webservice;

import cl.cocacola.ejb.FacturaEJB;
import cl.cocacola.entidades.Factura;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.jboss.weld.context.ejb.Ejb;

@Stateless // <--- EJB
@WebService(serviceName = "FacturaWS")
public class FacturaWS {

    @EJB
    private FacturaEJB facturaEJB;
    
    @WebMethod()
    public List<Factura> listar() {
        return facturaEJB.listar();
    }
    

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
}
