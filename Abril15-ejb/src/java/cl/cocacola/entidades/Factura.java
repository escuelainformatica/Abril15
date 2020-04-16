
package cl.cocacola.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Factura {
    
    @Id
    private int idFactura;
    
    private String nombreCliente;
    private String direccionCliente;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="id_factura") // el nombre de la columna
    private List<FacturaDetalle> facturaDetalle;
    
    
    
    // private Date fecha;
    
    /**
     * @return the idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the direccionCliente
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * @param direccionCliente the direccionCliente to set
     */
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    /**
     * @return the facturaDetalle
     */
    public List<FacturaDetalle> getFacturaDetalle() {
        return facturaDetalle;
    }

    /**
     * @param facturaDetalle the facturaDetalle to set
     */
    public void setFacturaDetalle(List<FacturaDetalle> facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }
    

}
