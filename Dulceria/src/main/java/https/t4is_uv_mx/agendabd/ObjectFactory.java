//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.17 a las 04:28:20 PM CDT 
//


package https.t4is_uv_mx.agendabd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.agendabd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MostrarDulcesMenuRequest_QNAME = new QName("https://t4is.uv.mx/agendabd", "MostrarDulcesMenuRequest");
    private final static QName _MostrarDulcesInventarioRequest_QNAME = new QName("https://t4is.uv.mx/agendabd", "MostrarDulcesInventarioRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.agendabd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MostrarDulcesNenuResponse }
     * 
     */
    public MostrarDulcesNenuResponse createMostrarDulcesNenuResponse() {
        return new MostrarDulcesNenuResponse();
    }

    /**
     * Create an instance of {@link MostrarDulcesInventarioResponse }
     * 
     */
    public MostrarDulcesInventarioResponse createMostrarDulcesInventarioResponse() {
        return new MostrarDulcesInventarioResponse();
    }

    /**
     * Create an instance of {@link ComprarDulcesRequest }
     * 
     */
    public ComprarDulcesRequest createComprarDulcesRequest() {
        return new ComprarDulcesRequest();
    }

    /**
     * Create an instance of {@link ComprarDulcesResponse }
     * 
     */
    public ComprarDulcesResponse createComprarDulcesResponse() {
        return new ComprarDulcesResponse();
    }

    /**
     * Create an instance of {@link MostrarDulcesNenuResponse.Dulces }
     * 
     */
    public MostrarDulcesNenuResponse.Dulces createMostrarDulcesNenuResponseDulces() {
        return new MostrarDulcesNenuResponse.Dulces();
    }

    /**
     * Create an instance of {@link MostrarDulcesInventarioResponse.DulcesInventario }
     * 
     */
    public MostrarDulcesInventarioResponse.DulcesInventario createMostrarDulcesInventarioResponseDulcesInventario() {
        return new MostrarDulcesInventarioResponse.DulcesInventario();
    }

    /**
     * Create an instance of {@link ModificarInventarioRequest }
     * 
     */
    public ModificarInventarioRequest createModificarInventarioRequest() {
        return new ModificarInventarioRequest();
    }

    /**
     * Create an instance of {@link ModificarInventarioResponse }
     * 
     */
    public ModificarInventarioResponse createModificarInventarioResponse() {
        return new ModificarInventarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/agendabd", name = "MostrarDulcesMenuRequest")
    public JAXBElement<Object> createMostrarDulcesMenuRequest(Object value) {
        return new JAXBElement<Object>(_MostrarDulcesMenuRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/agendabd", name = "MostrarDulcesInventarioRequest")
    public JAXBElement<Object> createMostrarDulcesInventarioRequest(Object value) {
        return new JAXBElement<Object>(_MostrarDulcesInventarioRequest_QNAME, Object.class, null, value);
    }

}
