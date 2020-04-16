
package cl.cocacola.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class FacturaDetalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacturaDetalle;
    
    @ManyToOne //(cascade = CascadeType.PERSIST)
    private ProductoFactura productoFactura;
 
    private int cantidad;
    private int precioUnitario;
    
    
    @ManyToOne
    private Factura factura;
    

    /**
     * @return the idFacturaDetalle
     */
    public int getIdFacturaDetalle() {
        return idFacturaDetalle;
    }

    /**
     * @param idFacturaDetalle the idFacturaDetalle to set
     */
    public void setIdFacturaDetalle(int idFacturaDetalle) {
        this.idFacturaDetalle = idFacturaDetalle;
    }


    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioUnitario
     */
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @XmlTransient // no serialize (con xml este campo)
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the productoFactura
     */
    public ProductoFactura getProductoFactura() {
        return productoFactura;
    }

    /**
     * @param productoFactura the productoFactura to set
     */
    public void setProductoFactura(ProductoFactura productoFactura) {
        this.productoFactura = productoFactura;
    }
    
    
}
