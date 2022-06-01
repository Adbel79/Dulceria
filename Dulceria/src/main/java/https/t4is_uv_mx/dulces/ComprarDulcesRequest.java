//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.31 a las 03:42:07 PM CDT 
//


package https.t4is_uv_mx.dulces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cantidadCompra" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "cantidadCompra",
    "pago"
})
@XmlRootElement(name = "ComprarDulcesRequest")
public class ComprarDulcesRequest {

    protected int id;
    protected int cantidadCompra;
    protected int pago;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadCompra.
     * 
     */
    public int getCantidadCompra() {
        return cantidadCompra;
    }

    /**
     * Define el valor de la propiedad cantidadCompra.
     * 
     */
    public void setCantidadCompra(int value) {
        this.cantidadCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     */
    public int getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     */
    public void setPago(int value) {
        this.pago = value;
    }

}
