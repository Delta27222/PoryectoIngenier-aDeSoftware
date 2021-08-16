package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import modelo.Cliente;
import modelo.Venta;
import modelo.Vehiculo;
import org.json.simple.parser.ParseException;


public class Controladora {
	
    JFrame ventana;
    public Controladora() {
		
    }
    
    public Controladora(JFrame ventana){
      this.ventana = ventana;
    }
    
    
     //ESTE METODO SE USA PARA ABRIR TODAD LAS VENTANAS 
    public void iniciaVentana(JFrame ventana, String ruta){
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setIconImage(new ImageIcon(ruta).getImage());        
    } 
    //ESTE METODO SE USA PARA ABRIR TODAD LAS VENTANAS 
    
    //ESTE METODO CREARA EL ARRAYJSON DE LOS CLIENTES Y DE LOS VEHICULOS
    public JSONArray creadorJsonArray() {
    	JSONArray array = new JSONArray(); 
    	return array; 
	}
    //ESTE METODO CREARA EL ARRAYJSON DE LOS CLIENTES Y DE LOS VEHICULOS
    
    //ESTE METODO FUNCIONARA PARA SABER SI EXISTE CLIENTES O VEHICULOS DENTRO DEL JSON
    public boolean  hayAlguien(JSONArray array) {
        int x = array.size();
        if (x == 0){  //DEVUELVE 0 SI NO HAY NADA
            return false; 
        }
       return true; 
    }   
    //ESTE METODO FUNCIONARA PARA SABER SI EXISTE CLIENTES O VEHICULOS DENTRO DEL JSON 
    

    
  
    
    // --------------------------------PEDIDOS-----------------------------------------------------------------------------------------  
    
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE PEDIDOS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    public void sacarDelArchivoJSONPedidos(JSONArray array) {
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
        System.out.println(out);	
    	
        JSONObject jsonPedidos = new JSONObject(); 
        
        jsonPedidos.put("peds", out); 
        
        JSONParser pedido_parser = new JSONParser(); 
        try {
				JSONObject objPedidos = (JSONObject) pedido_parser.parse(jsonPedidos.toJSONString());
				JSONArray arrayPedidos = (JSONArray) objPedidos.get("peds"); 
		    for (int i = 0; i < arrayPedidos.size(); i++) {
				JSONObject pedido = (JSONObject) arrayPedidos.get(i); 
				String idPedido = pedido.get("idVenta").toString();
     			        String placa = pedido.get("placa").toString();	    			
				String PrecioTotalPedido = pedido.get("PrecioTotalPedido").toString();	
				String PagoAbonado = pedido.get("PagoAbonado").toString();	

				System.out.println(idPedido + "\t" + placa + "\t" + PrecioTotalPedido + "\t" + PagoAbonado);
			}

		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE VEHICULOS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    
    
    //ESTE METODO QUE AGREGARA A CADA PEDIDO AL JSON DE VEHICULOS
	public JSONArray agregarPedidoJson(Venta pedido, JSONArray array) {
		 	array.add(pedido);
    	return array;
	}    
    //ESTE METODO QUE AGREGARA A CADA PEDIDO AL JSON DE VEHICULOS

    //ESTE METODO ES PARA MODIFICAR UN PEDIDO (USANDO EL IDEPEDIDO) DEL JSON DE PEDIDOS
	  public JSONArray modificarPedidoJson(JSONArray array, int idPedidoP, Venta pedidoModificado) {
	    	StringWriter out = new StringWriter(); 
			try {
				array.writeJSONString(out);
			} catch (IOException e) {
				e.printStackTrace(); 
			}
	        System.out.println(out);	
	    	
	        JSONObject jsonPedidos = new JSONObject(); 
	        
	        jsonPedidos.put("peds", out); 
	        
	        JSONParser pedido_parser = new JSONParser(); 
	        try {
					JSONObject objPedidos = (JSONObject) pedido_parser.parse(jsonPedidos.toJSONString());
					JSONArray arrayPedidos = (JSONArray) objPedidos.get("peds"); 
			    for (int i = 0; i < arrayPedidos.size(); i++) {

					JSONObject pedido = (JSONObject) arrayPedidos.get(i); 
					String idPedidoString = pedido.get("idPedido").toString();
					int idPedidoInteger = Integer.parseInt(idPedidoString); 
					
					if (idPedidoInteger == idPedidoP ) {
						arrayPedidos.remove(i); 
						
						arrayPedidos.add(pedidoModificado); 
						return arrayPedidos; 
					}
					
			
		    	}

			} catch (org.json.simple.parser.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return array;
		}
	//ESTE METODO ES PARA MODIFICAR UN PEDIDO (USANDO EL IDEPEDIDO) DEL JSON DE PEDIDOS
	  
	//ESTE METODO ES PARA ELIMINAR UN VEHICULO (USANDO LA PLACA) DEL JSON DE VEHICULOS
	  public JSONArray eliminarPedidoJson(JSONArray array, int idPedidoP) {
	    	StringWriter out = new StringWriter(); 
			try {
				array.writeJSONString(out);
			} catch (IOException e) {
				e.printStackTrace(); 
			}
	        System.out.println(out);	
	    	
	        JSONObject jsonPedidos = new JSONObject(); 
	        
	        jsonPedidos.put("peds", out); 
	        
	        JSONParser pedido_parser = new JSONParser(); 
	        try {
					JSONObject objPedidos = (JSONObject) pedido_parser.parse(jsonPedidos.toJSONString());
					JSONArray arrayPedidos = (JSONArray) objPedidos.get("peds"); 
			    for (int i = 0; i < arrayPedidos.size(); i++) {

					JSONObject pedido = (JSONObject) arrayPedidos.get(i); 
					String idPedidoString = pedido.get("idPedido").toString();
					int idPedidoInteger = Integer.parseInt(idPedidoString); 
					
					if (idPedidoInteger == idPedidoP ) {
						arrayPedidos.remove(i); 
						return arrayPedidos; 
					}				
		    	}

			} catch (org.json.simple.parser.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return array;
		}
	//ESTE METODO ES PARA ELIMINAR UN VEHICULO (USANDO LA PLACA) DEL JSON DE VEHICULOS 
	
	
	
	//ESTE METODO ME VERIFICA EL JSON VEHICULO PARA REVISAR LAS PLACAS 

	    
//-------------------------------------------------------------------------------------------------------------------------------------	    
    
   
 
 }
               
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
