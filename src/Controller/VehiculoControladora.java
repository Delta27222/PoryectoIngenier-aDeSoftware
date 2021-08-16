
package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




//sacarDelArchivoJSONVehiculos ES SIMPLEMENTE UN METODO PARA SACAR DATOS DEL JSON, POR LO MENOS LA PLACA Y CON ELLA BUSCAR UN CARRO O YO QUE SE






public class VehiculoControladora {
    
        JFrame ventana;
    public VehiculoControladora() {
		
    }
    
    public VehiculoControladora(JFrame ventana){
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
    
//-------------------------------------------------------------------------------------------------------------VEHICULOS     
    
    
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE VEHICULOS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    public void sacarDelArchivoJSONVehiculos(JSONArray array) {
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
				JSONObject car = (JSONObject) arrayCars.get(i); 
				String placa = car.get("placa").toString();	
				String marca = car.get("marca").toString();
				String ano = car.get("ano").toString(); 
				String paismanufactura = car.get("paismanufactura").toString(); 
				String modelo = car.get("modelo").toString(); 
				String tipomotor = car.get("tipoMotor").toString(); 
				String numSerieMotor = car.get("numSerieMotor").toString(); 
				String numSerieChasis = car.get("numSerieChasis").toString(); 
				String kilometraje = car.get("kilometraje").toString(); 
				String color = car.get("color").toString(); 
                                String precio = car.get("color").toString(); 
				System.out.println(placa + "\t" + marca + "\t" + ano + "\t" + paismanufactura + "\t" + modelo+ "\t" + tipomotor + "\t" + numSerieMotor + "\t" + numSerieChasis + "\t" + kilometraje+ "\t" + color + "\t" + precio );
			}

		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE VEHICULOS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    
    
    //ESTE METODO QUE AGREGARA A CADA VEHICULO AL JSON DE VEHICULOS
    public JSONArray agregarVehiculoJson(Vehiculo vehiculo, JSONArray array) {
    	array.add(vehiculo);
    	return array;
    }
    //ESTE METODO QUE AGREGARA A CADA VEHICULO AL JSON DE VEHICULOS


    //ESTE METODO ES PARA MODIFICAR UN VEHICULO (USANDO LA PLACA) DEL JSON DE VEHICULOS
    public JSONArray modificarVehiculoJson(JSONArray array, String placaV, Vehiculo vehiculoModificado) {
    	
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
					arrayCars.remove(i); 
//					           que este clienteEditado, ya tiene las modificaciones-------------------------------------------------------------AQUIIIIIIIIIIII LEEME PRRO
				    
			    	arrayCars.add(vehiculoModificado);				
					return arrayCars; 				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return array;    
	}   
    //ESTE METODO ES PARA MODIFICAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE VEHICULOS
    
    
    //ESTE METODO ES PARA ELIMINAR UN VEHICULO (USANDO LA PLACA) DEL JSON DE VEHICULOS
    public JSONArray eliminarVehiculoDelJson(JSONArray array, String placaString) {
    	
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
				String placa = car.get("placa").toString();
				if (placa.equals(placaString)==true) {
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
    public Vehiculo crearVehiculoDelJson(JSONArray array, String placaS) {
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
				JSONObject car = (JSONObject) arrayCars.get(i); 
				String placa = car.get("placa").toString();
                                if (placaS.equals(placa)==true) {	                                                                      
                                String marca = car.get("marca").toString();
				String ano = car.get("ano").toString(); 
				String paismanufactura = car.get("paismanufactura").toString(); 
				String modelo = car.get("modelo").toString(); 
				String tipomotor = car.get("tipoMotor").toString(); 
				String numSerieMotor = car.get("numSerieMotor").toString(); 
				String numSerieChasis = car.get("numSerieChasis").toString(); 
				String kilometraje = car.get("kilometraje").toString(); 
				String color = car.get("color").toString();
                                String precio = car.get("precio").toString();
                                String cedulaDueno = car.get("cedulaDueno").toString(); 
                                
                                Vehiculo vehiculoJson = new Vehiculo(placaS, marca, modelo,Integer.parseInt(ano), paismanufactura,tipomotor, numSerieMotor, numSerieChasis, Integer.parseInt(kilometraje), color, Integer.parseInt(precio), Integer.parseInt(cedulaDueno));             
                                    return vehiculoJson; 
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
       public JSONArray leerJSONVehiculos(JSONArray array) throws ParseException, FileNotFoundException, IOException {
            JSONParser parser = new JSONParser(); 
            JSONArray vehiculosJson = new JSONArray(); 
            VehiculoControladora control= new VehiculoControladora(); 
           
           JSONArray a = (JSONArray) parser.parse(new FileReader("src/Archivos/2myJSONVehiculos.json"));
             for (Object obj : a)
             {                 
                  JSONObject jsonObject = (JSONObject) obj; 
                   String placa = (String) jsonObject.get("placa"); 
                   
                   String marca = (String) jsonObject.get("marca"); 
                   
                   String modelo = (String) jsonObject.get("modelo"); 
                   
                   String ano = (String) jsonObject.get("ano"); 
                   
                    String paismanufactura = (String) jsonObject.get("paismanufactura"); 
                   
                   String tipoMotor = (String) jsonObject.get("tipoMotor"); 

                   String numSerieMotor = (String) jsonObject.get("numSerieMotor"); 

                   String numSerieChasis = (String) jsonObject.get("numSerieChasis");                  

                   String kilometraje = (String) jsonObject.get("kilometraje"); 

                   
                   String color = (String) jsonObject.get("color"); 

                   
                   String precio = (String) jsonObject.get("precio"); 
                   
                   String cedula = (String) jsonObject.get("cedulaDueno"); 

                   
                   Vehiculo vehiculoProv = new Vehiculo(placa, marca, modelo, Integer.parseInt(ano), paismanufactura, tipoMotor, numSerieMotor, numSerieChasis, Integer.parseInt(kilometraje), color, Integer.parseInt(precio), Integer.parseInt(cedula)); 
                   vehiculosJson = control.agregarVehiculoJson(vehiculoProv, vehiculosJson); 
             }             
         return vehiculosJson; 
        }   
       //ESTEMETODO ES PARA SACAR TODOS LO S VEHICULOS DEL .JSON Y METERLOS OTRA VEZ EN EL PROGRAMA
    
    public boolean validarFormato(String item, String formato) {
           Pattern pat = Pattern.compile(formato);
            Matcher mat = pat.matcher(item);
            return mat.matches();
    }  
    
    //ESTE METODO ES PARA SABER SI EXISTE EN UN VEHICULO CON LA PLACA QUE DA EL USUARIO       
	public boolean existeVehiculo(JSONArray array, String placaS) {
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
					JSONObject car = (JSONObject) arrayCars.get(i); 
					String placaString = car.get("placa").toString();

					if (placaS.equals(placaString)==true) {
						return true; 
					}		    
			    }

			} catch (org.json.simple.parser.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    return false; 
		}
    //ESTE METODO ES PARA SABER SI EXISTE EN UN VEHICULO CON LA PLACA QUE DA EL USUARIO     
        public DefaultTableModel llenarTablaPrincipal(JSONArray array) {
        DefaultTableModel model = new DefaultTableModel(); 
        model.addColumn("Placa");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        model.addColumn("AÃ±o");
        model.addColumn("Cedula");           
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
                        JSONObject vehiculo = (JSONObject) arrayCars.get(i); 
                        String placa = vehiculo.get("placa").toString();
                        String marca = vehiculo.get("marca").toString();	
                        String modelo = vehiculo.get("modelo").toString(); 
                        String ano = vehiculo.get("ano").toString();
                        String cedula = vehiculo.get("cedulaDueno").toString();
                        model.addRow(new Object[] {placa, marca, modelo, ano, cedula});
            }
        } catch (org.json.simple.parser.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
    return model;
        }
    
}
