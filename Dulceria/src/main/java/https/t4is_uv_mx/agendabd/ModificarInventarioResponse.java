//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.17 a las 04:28:20 PM CDT 
//


package https.t4is_uv_mx.agendabd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="nuevoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nuevaCantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nuevoPrecio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "nuevoNombre",
    "nuevaCantidad",
    "nuevoPrecio"
})
@XmlRootElement(name = "ModificarInventarioResponse")
public class ModificarInventarioResponse {

    protected int id;
    @XmlElement(required = true)
    protected String nuevoNombre;
    protected int nuevaCantidad;
    protected int nuevoPrecio;

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
     * Obtiene el valor de la propiedad nuevoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevoNombre() {
        return nuevoNombre;
    }

    /**
     * Define el valor de la propiedad nuevoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevoNombre(String value) {
        this.nuevoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevaCantidad.
     * 
     */
    public int getNuevaCantidad() {
        return nuevaCantidad;
    }

    /**
     * Define el valor de la propiedad nuevaCantidad.
     * 
     */
    public void setNuevaCantidad(int value) {
        this.nuevaCantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nuevoPrecio.
     * 
     */
    public int getNuevoPrecio() {
        return nuevoPrecio;
    }

    /**
     * Define el valor de la propiedad nuevoPrecio.
     * 
     */
    public void setNuevoPrecio(int value) {
        this.nuevoPrecio = value;
    }

}
