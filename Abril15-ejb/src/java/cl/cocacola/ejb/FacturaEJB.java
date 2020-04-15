
package cl.cocacola.ejb;

import cl.cocacola.entidades.Factura;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

// EJB para nosotros son las clases de servicio.
// clases que tienen funciones solamente.


@Stateless
@LocalBean
public class FacturaEJB {

    @PersistenceContext(unitName = "Abril15-ejbPU")
    private EntityManager em;
    
    // Entity Manager

    public int sumar(int n1,int n2) {
        return n1+n2;
    }
    public List<Factura> listar() {
        return em
                .createQuery("select f from Factura f") // JPQL
                .getResultList();
    }
    
    //  EJB todos los metodos son transacciones.
    // que significa. Si una operacion falla, se cancela todas las operaciones    
    // @Transactional
    
    public void insertar(Factura factura) {
        em.persist(factura); // save()
    }
}
