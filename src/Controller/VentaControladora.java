package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;
import modelo.Venta;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class VentaControladora {

        JFrame ventana;
    public VentaControladora() {
		
    }
    
    public VentaControladora(JFrame ventana){
      this.ventana = ventana;
    }
    
         //ESTE METODO SE USA PARA ABRIR TODAD LAS VENTANAS 
    public void iniciaVentana(JFrame ventana, String ruta){
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setIconImage(new ImageIcon(ruta).getImage());        
    } 
         //ESTE METODO SE USA PARA ABRIR TODAD LAS VENTANAS 
    
    //ESTE METODO CREARA EL ARRAYJSON DE LAS VENTAS
    public JSONArray creadorJsonArray() {
    	JSONArray array = new JSONArray(); 
    	return array; 
    }
        //ESTE METODO CREARA EL ARRAYJSON DE LAS VENTAS
    
    //ESTE METODO FUNCIONARA PARA SABER SI EXISTEN VENTAS EN EL JSON 
    public boolean  hayAlguien(JSONArray array) {
        int x = array.size();
        if (x == 0){  //DEVUELVE 0 SI NO HAY NADA
            return false; 
        }
       return true; 
    }   
    //ESTE METODO FUNCIONARA PARA SABER SI EXISTEN VENTAS EN EL JSON 
    
//-------------------------------------------------------------------------------------------------------------VEHICULOS     
    
    
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE VENTAS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    public void sacarDelArchivoJSONVentas(JSONArray array) {
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}    
                
        System.out.println(out);	
     
        JSONObject jsonCars = new JSONObject(); 
        
        jsonCars.put("cars", out); 
        
        JSONParser car_parser = new JSONParser(); 
        try {
				JSONObject objCars = (JSONObject) car_parser.parse(jsonCars.toJSONString());
				JSONArray arrayCars = (JSONArray) objCars.get("cars"); 
		    for (int i = 0; i < arrayCars.size(); i++) {
				JSONObject venta = (JSONObject) arrayCars.get(i); 
                                String idVenta = venta.get("idVenta").toString();
                                System.out.println("id venta ----"+idVenta);
				String montoVenta = venta.get("montoVenta").toString();	
                                System.out.println("montoVenta  ----"+montoVenta );
				String montoAbono = venta.get("montoAbono").toString();
                                System.out.println("montoAbono ----"+montoAbono);
				String placa = venta.get("placa").toString(); 
                                System.out.println("placa ----"+placa);
				String cedulaComprador = venta.get("cedulaComprador").toString(); 
                                System.out.println("cedulaComprador ----"+cedulaComprador);
				String fechaVenta = venta.get("fechaVenta").toString(); 
                                System.out.println("fechaVenta ----"+fechaVenta);
				String userNameVendedor = venta.get("userNameVendedor").toString();
                    System.out.println("userNameVendedor ----"+userNameVendedor);}

		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE VENTAS  (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    
    
    //ESTE METODO QUE AGREGARA A CADA VEHICULO AL JSON DE VENTAS 
    public JSONArray agregarVentaJson(Venta venta, JSONArray array) {
    	array.add(venta);
    	return array;
    }
    //ESTE METODO QUE AGREGARA A CADA VEHICULO AL JSON DE VENTAS 


    //ESTE METODO ES PARA MODIFICAR UNA VENTA(USANDO EL ID VENTA) DEL JSON DE VENTAS 
    public JSONArray modificarVentasJson(JSONArray array, String idVenta, Venta VentaModificada) {
    	
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
    	
        JSONObject jsonCars = new JSONObject(); 
        jsonCars.put("cars", out); 
        
        JSONParser car_parser = new JSONParser(); try {
				JSONObject objCars = (JSONObject) car_parser.parse(jsonCars.toJSONString());
				JSONArray arrayVentas = (JSONArray) objCars.get("cars"); 
			
		    for (int i = 0; i < arrayVentas.size(); i++) {
				JSONObject car = (JSONObject) arrayVentas.get(i); 
				String idVentaString = car.get("idVenta").toString();

				if (idVenta.equals(idVentaString)==true) {
					arrayVentas.remove(i); 
//					           que este clienteEditado, ya tiene las modificaciones-------------------------------------------------------------AQUIIIIIIIIIIII LEEME PRRO
				    
			    	arrayVentas.add(VentaModificada);				
					return arrayVentas; 				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return array;    
	}   
    //ESTE METODO ES PARA MODIFICAR UNA VENTA(USANDO EL ID VENTA) DEL JSON DE VENTAS 
    
    
    //ESTE METODO ES PARA ELIMINAR UN VEHICULO (USANDO LA PLACA) DEL JSON DE VEHICULOS
    public JSONArray eliminarVentaDelJson(JSONArray array, String idVentaString) {
    	
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
    	
        JSONObject jsonCars = new JSONObject(); 
        jsonCars.put("cars", out); 
        
        JSONParser car_parser = new JSONParser(); try {
				JSONObject objCars = (JSONObject) car_parser.parse(jsonCars.toJSONString());
				JSONArray arrayCars = (JSONArray) objCars.get("cars"); 
			
		    for (int i = 0; i < arrayCars.size(); i++) {
				JSONObject car = (JSONObject) arrayCars.get(i); 
				String idVenta = car.get("idVenta").toString();
				if (idVenta.equals(idVentaString)==true) {
					arrayCars.remove(i); 
					return arrayCars; 				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return array;    
	}
    //ESTE METODO ES PARA ELIMINAR UN VEHICULO (USANDO LA PLACA) DEL JSON DE VEHICULOS   
    
    //ESTE METODO ES PARA SABER SI LA PLACA ESTA EN EL SISTEMA
    public boolean verificarPlacaVehiculoJson(JSONArray array, String placaV) {
    	
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}    	
        JSONObject jsonCars = new JSONObject(); 
        jsonCars.put("cars", out);         
        JSONParser car_parser = new JSONParser(); try {
				JSONObject objCars = (JSONObject) car_parser.parse(jsonCars.toJSONString());
				JSONArray arrayCars = (JSONArray) objCars.get("cars"); 
			
		    for (int i = 0; i < arrayCars.size(); i++) {
				JSONObject car = (JSONObject) arrayCars.get(i); 
				String placaString = car.get("placa").toString();

				if (placaV.equals(placaString)==true) {		
					return true;  				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return false;    
	} 
    //ESTE METODO ES PARA SABER SI LA PLACA ESTA EN EL SISTEMA
    
    //ESTEMETODO ES PARA CREAR UN VEHICULO QUE ESTA DENTRO DE JSON
    public Venta crearVentaDelJson(JSONArray array, String idVentaString) {
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
        System.out.println(out);	
    	
        JSONObject jsonCars = new JSONObject(); 
        
        jsonCars.put("cars", out); 
        
        JSONParser car_parser = new JSONParser(); 
        try {
				JSONObject objCars = (JSONObject) car_parser.parse(jsonCars.toJSONString());
				JSONArray arrayCars = (JSONArray) objCars.get("cars"); 
		    for (int i = 0; i < arrayCars.size(); i++) {
				JSONObject venta= (JSONObject) arrayCars.get(i); 
				String idVenta = venta.get("idVenta").toString();
                                if (idVentaString.equals(idVenta)==true) {	
				String montoVenta = venta.get("montoVenta").toString();	
				String montoAbono = venta.get("montoAbono").toString();
				String placa = venta.get("placa").toString(); 
				String cedulaComprador = venta.get("cedulaComprador").toString(); 
				String fechaVenta = venta.get("fechaVenta").toString(); 
				String userNameVendedor = venta.get("userNameVendedor").toString();			 
                                
                                Venta ventaJson = new Venta(Integer.parseInt(montoVenta), Integer.parseInt(montoAbono), Integer.parseInt(cedulaComprador),placa, idVenta,fechaVenta, userNameVendedor);             
                                    return ventaJson; 
				}
                      	}

		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        return null; 
	}
    //ESTEMETODO ES PARA CREAR UN VEHICULO QUE ESTA DENTRO DE JSON
    
    //ESTEMETODO ES PARA SACAR TODOS LO S VEHICULOS DEL .JSON Y METERLOS OTRA VEZ EN EL PROGRAMA
       public JSONArray leerJSONVentas(JSONArray array) throws ParseException, FileNotFoundException, IOException {
            JSONParser parser = new JSONParser(); 
            JSONArray ventasJson = new JSONArray(); 
            VentaControladora control= new VentaControladora (); 
           
           JSONArray a = (JSONArray) parser.parse(new FileReader("src/Archivos/4myJSONVentas.json"));
             for (Object obj : a)
             {                 
                  JSONObject jsonObject = (JSONObject) obj; 
                   String idVenta = (String) jsonObject.get("idVenta"); 
                   
                   String montoVenta = (String) jsonObject.get("montoVenta"); 
                   
                   String montoAbono = (String) jsonObject.get("montoAbono"); 
                   
                   String placa = (String) jsonObject.get("placa"); 
                   
                    String cedulaComprador = (String) jsonObject.get("cedulaComprador"); 
                   
                   String fechaVenta = (String) jsonObject.get("fechaVenta"); 

                   String userNameVendedor = (String) jsonObject.get("userNameVendedor"); 

                  

                   
                   Venta ventaProv = new Venta(Integer.parseInt(montoVenta), Integer.parseInt(montoAbono), Integer.parseInt(cedulaComprador),placa, idVenta,fechaVenta, userNameVendedor);             
                   ventasJson  = control.agregarVentaJson(ventaProv, ventasJson); 
             }             
         return ventasJson; 
        }   
    //ESTEMETODO ES PARA SACAR TODOS LO S VEHICULOS DEL .JSON Y METERLOS OTRA VEZ EN EL PROGRAMA

    //ESTE METODO CREARA EL ID DE LA VENTA DE MANERA AUTOMATICA SIN QUE SE REPITA
    public String crearIdUnico(JSONArray array) {
         Boolean bandera = false; String nuevoID = ""; 
        while(bandera == false){
            String idOne = UUID.randomUUID().toString();               
            for (int i = 0; i < 8; i++) {
                nuevoID += idOne.charAt(i); 
            }         
            if (this.esUnico(array, nuevoID)){
                    bandera = true; 
            }
        }
    return nuevoID;            
    }
    //ESTE METODO CREARA EL ID DE LA VENTA DE MANERA AUTOMATICA SIN QUE SE REPITA

     //ESTE METODO verifica si el id de la venta  es unico
    public Boolean esUnico(JSONArray array, String idVentaS) {

            StringWriter out = new StringWriter(); 
                    try {
                            array.writeJSONString(out);
                    } catch (IOException e) {
                            e.printStackTrace(); 
                    }

            JSONObject jsonUsers = new JSONObject(); 
            jsonUsers.put("users", out); 

            JSONParser user_parser = new JSONParser(); try {
                                    JSONObject objUsers = (JSONObject) user_parser.parse(jsonUsers.toJSONString());
                                    JSONArray arrayUsers = (JSONArray) objUsers.get("users"); 

                        for (int i = 0; i < arrayUsers.size(); i++) {
                             JSONObject user = (JSONObject) arrayUsers.get(i); 
                             String idVentaString = user.get("idVenta").toString();
                             if (idVentaString.equals(idVentaS)){
                                 return false; 
                             }
                        }			
                    } catch (org.json.simple.parser.ParseException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    } 
          return true;            
        
            
	}
     //ESTE METODO verifica si el id de la venta es unico

      //ESTE METODO SIRVE PARA LLENAR LA TABLA CON LAS VENTAS QUE EXISTEN EN EL JSON 
    public DefaultTableModel llenarTablaPrincipal(JSONArray array) {
        DefaultTableModel model = new DefaultTableModel(); 
        model.addColumn("ID de Venta");
        model.addColumn("Monto Venta");
        model.addColumn("UserName Vendedor");
        model.addColumn("Fecha Venta");        
    	StringWriter out = new StringWriter(); 
        try {
            array.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace(); 
        }    
        JSONObject jsonCars = new JSONObject(); 
        jsonCars.put("cars", out); 
        JSONParser car_parser = new JSONParser(); 
        try {
            JSONObject objCars = (JSONObject) car_parser.parse(jsonCars.toJSONString());
            JSONArray arrayCars = (JSONArray) objCars.get("cars"); 
            for (int i = 0; i < arrayCars.size(); i++) {
                        JSONObject venta = (JSONObject) arrayCars.get(i); 
                        String idVenta = venta.get("idVenta").toString();
                        String montoVenta = venta.get("montoVenta").toString();	
                        String fechaVenta = venta.get("fechaVenta").toString(); 
                        String userNameVendedor = venta.get("userNameVendedor").toString();
                        model.addRow(new Object[] {idVenta, montoVenta, userNameVendedor, fechaVenta});
            }
        } catch (org.json.simple.parser.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
    return model;       
}
  //ESTE METODO SIRVE PARA LLENAR LA TABLA CON LAS VENTAS QUE EXISTEN EN EL JSON 

}
