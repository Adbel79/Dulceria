package mx.uv.t4is.Dulceria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//DTO
@Entity
public class dulces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreProducto;
    private int precioProducto;
    private int Cantidad;
    private int cantidadCompra;
    private String disponibilidad;
    private int pago;
    
    
    
    
    @Override
    public String toString() {
        return "dulces [Cantidad=" + Cantidad + ", cantidadCompra=" + cantidadCompra + ", disponibilidad="
                + disponibilidad + ", id=" + id + ", nombreProducto=" + nombreProducto + ", pago=" + pago
                + ", precioProducto=" + precioProducto + "]";
    }



    public dulces() {
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getNombreProducto() {
        return nombreProducto;
    }



    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }



    public int getPrecioProducto() {
        return precioProducto;
    }



    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }



    public int getCantidad() {
        return Cantidad;
    }



    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }



    public int getCantidadCompra() {
        return cantidadCompra;
    }



    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }



    public String getDisponibilidad() {
        return disponibilidad;
    }



    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }



    public int getPago() {
        return pago;
    }



    public void setPago(int pago) {
        this.pago = pago;
    }
    

    

    

  
}
