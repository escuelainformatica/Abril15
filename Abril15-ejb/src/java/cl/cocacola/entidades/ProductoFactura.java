
package cl.cocacola.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductoFactura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductoFactura;
    private String nombre;
    

    /**
     * @return the idProductoFactura
     */
    public int getIdProductoFactura() {
        return idProductoFactura;
    }

    /**
     * @param idProductoFactura the idProductoFactura to set
     */
    public void setIdProductoFactura(int idProductoFactura) {
        this.idProductoFactura = idProductoFactura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
