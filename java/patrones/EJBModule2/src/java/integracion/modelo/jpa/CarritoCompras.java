/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package integracion.modelo.jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique Moreno
 */
@Entity
@Table(name = "carrito_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarritoCompras.findAll", query = "SELECT c FROM CarritoCompras c"),
    @NamedQuery(name = "CarritoCompras.findByIdCarrito", query = "SELECT c FROM CarritoCompras c WHERE c.idCarrito = :idCarrito"),
    @NamedQuery(name = "CarritoCompras.findByTotal", query = "SELECT c FROM CarritoCompras c WHERE c.total = :total"),
    @NamedQuery(name = "CarritoCompras.findBySubtotal", query = "SELECT c FROM CarritoCompras c WHERE c.subtotal = :subtotal"),
    @NamedQuery(name = "CarritoCompras.findByImpuestos", query = "SELECT c FROM CarritoCompras c WHERE c.impuestos = :impuestos")})
public class CarritoCompras implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CARRITO")
    private Integer idCarrito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL")
    private double total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUBTOTAL")
    private double subtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IMPUESTOS")
    private double impuestos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carritoCompras")
    private Collection<CarritoComprasHasProducto> carritoComprasHasProductoCollection;

    public CarritoCompras() {
    }

    public CarritoCompras(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public CarritoCompras(Integer idCarrito, double total, double subtotal, double impuestos) {
        this.idCarrito = idCarrito;
        this.total = total;
        this.subtotal = subtotal;
        this.impuestos = impuestos;
    }

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    @XmlTransient
    public Collection<CarritoComprasHasProducto> getCarritoComprasHasProductoCollection() {
        return carritoComprasHasProductoCollection;
    }

    public void setCarritoComprasHasProductoCollection(Collection<CarritoComprasHasProducto> carritoComprasHasProductoCollection) {
        this.carritoComprasHasProductoCollection = carritoComprasHasProductoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrito != null ? idCarrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarritoCompras)) {
            return false;
        }
        CarritoCompras other = (CarritoCompras) object;
        if ((this.idCarrito == null && other.idCarrito != null) || (this.idCarrito != null && !this.idCarrito.equals(other.idCarrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "integracion.modelo.jpa.CarritoCompras[ idCarrito=" + idCarrito + " ]";
    }
    
}
