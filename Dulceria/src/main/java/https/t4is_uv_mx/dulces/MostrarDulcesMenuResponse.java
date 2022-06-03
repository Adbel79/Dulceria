//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.02 a las 04:09:35 PM CDT 
//


package https.t4is_uv_mx.dulces;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="dulces" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "dulces"
})
@XmlRootElement(name = "MostrarDulcesMenuResponse")
public class MostrarDulcesMenuResponse {

    @XmlElement(required = true)
    protected List<MostrarDulcesMenuResponse.Dulces> dulces;

    /**
     * Gets the value of the dulces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dulces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDulces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MostrarDulcesMenuResponse.Dulces }
     * 
     * 
     */
    public List<MostrarDulcesMenuResponse.Dulces> getDulces() {
        if (dulces == null) {
            dulces = new ArrayList<MostrarDulcesMenuResponse.Dulces>();
        }
        return this.dulces;
    }


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
     *         &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "nombreProducto",
        "precio"
    })
    public static class Dulces {

        protected int id;
        @XmlElement(required = true)
        protected String nombreProducto;
        @XmlElement(name = "Precio")
        protected int precio;

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
         * Obtiene el valor de la propiedad nombreProducto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreProducto() {
            return nombreProducto;
        }

        /**
         * Define el valor de la propiedad nombreProducto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreProducto(String value) {
            this.nombreProducto = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public int getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(int value) {
            this.precio = value;
        }

    }

}
