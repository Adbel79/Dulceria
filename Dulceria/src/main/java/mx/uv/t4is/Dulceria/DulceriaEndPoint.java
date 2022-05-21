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

@Endpoint
public class DulceriaEndPoint {

    @Autowired
    Idulces idulces;


    //comprar los dulces 
    @PayloadRoot(localPart = "ComprarDulcesRequest" ,namespace = "https://t4is.uv.mx/agendabd")
    @ResponsePayload
    public ComprarDulcesResponse comprarDulces(@RequestPayload ComprarDulcesRequest peticion){
        ComprarDulcesResponse respuesta = new ComprarDulcesResponse();

        return respuesta; 
    }

    //mostrar el menu de los dulces 
    @PayloadRoot(localPart = "MostrarDulcesMenuRequest" ,namespace = "https://t4is.uv.mx/Dulceria")
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
    @PayloadRoot(localPart = "MostrarDulcesInventarioRequest" ,namespace = "https://t4is.uv.mx/Dulceria")
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
            e.setDisponibilidad(dulces.getDisponibilidad());
            //los guarda
            respuesta.getDulcesInventario().add(e);
        }
        //regresa la respuesta 
        return respuesta;
    }


}
