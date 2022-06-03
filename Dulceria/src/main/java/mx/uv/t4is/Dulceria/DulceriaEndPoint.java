package mx.uv.t4is.Dulceria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import https.t4is_uv_mx.dulces.MostrarDulcesMenuResponse;
import https.t4is_uv_mx.dulces.ComprarDulcesResponse;
import https.t4is_uv_mx.dulces.MostrarDulcesInventarioResponse;
import https.t4is_uv_mx.dulces.ComprarDulcesRequest;
import https.t4is_uv_mx.dulces.ModificarInventarioRequest;
import https.t4is_uv_mx.dulces.ModificarInventarioResponse;

@Endpoint
public class DulceriaEndPoint {

    @Autowired
    Idulces idulces;
    //comprar los dulces 
    @PayloadRoot(localPart = "ComprarDulcesRequest" ,namespace = "https://t4is.uv.mx/dulces")
    @ResponsePayload
    public ComprarDulcesResponse comprarDulces(@RequestPayload ComprarDulcesRequest peticion){
       ComprarDulcesResponse respuesta = new ComprarDulcesResponse();
       Boolean isDulce = false;
        dulces dulceCompra = new dulces();
        dulceCompra.setId(peticion.getId());
        dulceCompra.setCantidadCompra(peticion.getCantidadCompra());
        dulceCompra.setPago(peticion.getPago()); 
        Iterable<dulces> lista = idulces.findAll();
        for (dulces dulces : lista) {
            if(dulces.getId()==peticion.getId()){
                if(dulces.getCantidad()>dulceCompra.getCantidadCompra()){
                    int dulcesExistencia = dulces.getCantidad();
                    int dulceComprar = dulceCompra.getCantidadCompra();
                    dulcesExistencia = dulcesExistencia - dulceComprar;
                    dulces.setCantidad(dulcesExistencia);
                    idulces.save(dulces);
                    isDulce = true;
                }
                else{
                    respuesta.setRespuesta("la cantidad deseada es mayor a la del inventario");        
                    return respuesta;
                }
            }
        }
        if(!isDulce)
        {
            respuesta.setRespuesta("Dulce no encontrado en el inventario");        
            return respuesta;
        }
                respuesta.setRespuesta("dulce comprado satisfactoriamente");        
                    return respuesta;
    }


    //mostrar el menu de los dulces 
    @PayloadRoot(localPart = "MostrarDulcesMenuRequest" ,namespace = "https://t4is.uv.mx/dulces")
    @ResponsePayload
    public MostrarDulcesMenuResponse mostrarDulces(){
        MostrarDulcesMenuResponse respuesta = new MostrarDulcesMenuResponse();
        //se genera una lista 
        Iterable<dulces> lista = idulces.findAll();
        //se recorre la lista para sacar los dulces
        for (dulces dulces : lista) {
            MostrarDulcesMenuResponse.Dulces e = new MostrarDulcesMenuResponse.Dulces();
            //se obtienen los dulces
            e.setId(dulces.getId());
            e.setNombreProducto(dulces.getNombreProducto());
            e.setPrecio(dulces.getPrecioProducto());
            //los guarda dulces
            respuesta.getDulces().add(e);
        }
        //regresa la respuesta 
        return respuesta;
    }

    //mostrar el inventario de los dulces 
    @PayloadRoot(localPart = "MostrarDulcesInventarioRequest" ,namespace = "https://t4is.uv.mx/dulces")
    @ResponsePayload
    public MostrarDulcesInventarioResponse mostrarDulcesInventario(){
        MostrarDulcesInventarioResponse respuesta = new MostrarDulcesInventarioResponse();
        //se genera una lista 
        Iterable<dulces> lista = idulces.findAll();
        //se recorre la lista para sacar del inventario los dulces
        for (dulces dulces : lista) {
            MostrarDulcesInventarioResponse.DulcesInventario e = new MostrarDulcesInventarioResponse.DulcesInventario();
            //se obtienen los dulces dle inventario 
            e.setId(dulces.getId());
            e.setNombreProducto(dulces.getNombreProducto());
            e.setPrecio(dulces.getPrecioProducto());
            e.setCantidad(dulces.getCantidad());
            e.setDisponibilidad(dulces.getDisponibilidad());
            
            //los guarda
            respuesta.getDulcesInventario().add(e);
        }
        //regresa la respuesta 
        return respuesta;
    }

    //modificacion de los dulcess en el inventario
    @PayloadRoot(localPart = "ModificarInventarioRequest" ,namespace = "https://t4is.uv.mx/dulces")
    @ResponsePayload
    public ModificarInventarioResponse modificarSaludo(@RequestPayload ModificarInventarioRequest peticion){       
        ModificarInventarioResponse respuesta = new ModificarInventarioResponse(); 
        dulces dulces = new dulces();
        dulces.setId(peticion.getId());
        dulces.setNombreProducto(peticion.getNombreProducto());
        dulces.setPrecioProducto(peticion.getPrecio());
        dulces.setCantidad(peticion.getCantidad());
        dulces.setDisponibilidad(peticion.getDisponibilidad());

        idulces.save(dulces);
        respuesta.setRespuesta("dulce modificado exitosamente");        
        return respuesta;
    }


}
