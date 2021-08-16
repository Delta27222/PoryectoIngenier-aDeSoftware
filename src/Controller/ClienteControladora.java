
package Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ClienteControladora {
    
    
        JFrame ventana;
    public ClienteControladora() {
		
    }
    
    public ClienteControladora(JFrame ventana){
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
    
//-------------------------------------------------------------------------------------------------------------CLIENTES    
    
   //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE CLIENTES (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    public void sacarDelArchivoJSONClientes(JSONArray array) {
    	
    	StringWriter out = new StringWriter(); 
		try {
			array.writeJSONString(out);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
      System.out.println(out);	
    	
        JSONObject jsonUsers = new JSONObject(); 
        jsonUsers.put("users", out); 
        
        JSONParser user_parser = new JSONParser(); 
        try {
				JSONObject objUsers = (JSONObject) user_parser.parse(jsonUsers.toJSONString());
				JSONArray arrayUsers = (JSONArray) objUsers.get("users"); 
			
		    for (int i = 0; i < arrayUsers.size(); i++) {
				JSONObject user = (JSONObject) arrayUsers.get(i); 
				String cedulaString = user.get("cedula").toString();
				int cedula = Integer.parseInt(cedulaString); 
				String nombre = user.get("nombre").toString(); 
				String apellido = user.get("apellido").toString();
				String fechaDeNacimiento = user.get("fechaDeNacimiento").toString(); 
				
				System.out.println(cedula + "\t" + nombre + "\t" + apellido + "\t" + fechaDeNacimiento + "\t");
			}
			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE CLIENTES (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
         
    
    //ESTE METODO QUE AGREGARA A CADA CLIENTE AL JSON DE CLIENTES
    public JSONArray agregarClienteJson(Cliente cliente, JSONArray array) {		
                             
        array.add(cliente); 

    	return array; 
}
    //ESTE METODO QUE AGREGARA A CADA CLIENTE AL JSON DE CLIENTES
    
    
    //ESTE METODO ES PARA MODIFICAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE CLIENTES
    public JSONArray modificarClienteJson(JSONArray array, String cedulaC, Cliente clienteModificado) {
    	
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
				String cedulaString = user.get("cedula").toString();

				if (cedulaC.equals(cedulaString)==true) {
				  	arrayUsers.remove(i); 
//					           que este clienteEditado, ya tiene las modificaciones-------------------------------------------------------------AQUIIIIIIIIIIII LEEME PRRO
				    
			    	arrayUsers.add(clienteModificado);				
					return arrayUsers; 				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return array;    
	}
    //ESTE METODO ES PARA MODIFICAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE CLIENTES
    
    
    //ESTE METODO ES PARA ELIMINAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE CLIENTES
    public JSONArray eliminarClienteDelJson(JSONArray array, String cedulaC) {
    	
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
				String cedulaString = user.get("cedula").toString();
				if (cedulaC.equals(cedulaString)==true) {
					arrayUsers.remove(i); 
					return arrayUsers; 				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return array;    
	}
    //ESTE METODO ES PARA ELIMINAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE CLIENTES
    
    //ESTE METODO ES PARA SABER SI EXISTE EN UN CLIENTE CON LA CEDULA QUE DA EL USUARIO    
    public Boolean existeCliente(JSONArray array, String cedulaC) {
    	
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
				String cedulaString = user.get("cedula").toString();
				if (cedulaC.equals(cedulaString)==true) {
                                    return true;                              
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return false;    
	}
   //ESTE METODO ES PARA SABER SI EXISTE EN UN CLIENTE CON LA CEDULA QUE DA EL USUARIO    
    
        //ESTE METODO ES PARA MODIFICAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE CLIENTES
    public Cliente crearClienteDelJson(JSONArray array, String cedulaC) {
    	
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
				String cedulaString = user.get("cedula").toString();
				if (cedulaC.equals(cedulaString)==true) {
				String nombre = user.get("nombre").toString(); 
				String apellido = user.get("apellido").toString();
				String fechaDeNacimiento = user.get("fechaDeNacimiento").toString(); 	
                                Cliente clienteJson = new Cliente(Integer.parseInt(cedulaC), nombre, apellido, fechaDeNacimiento);      
                                    
                                return clienteJson;     
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return null;  
	}
    //ESTE METODO ES PARA MODIFICAR UN CLIENTE (USANDO LA CEDULA) DEL JSON DE CLIENTES
    
       public JSONArray leerJSONClientes(JSONArray array) throws ParseException, FileNotFoundException, IOException {
           JSONParser parser = new JSONParser(); 
            JSONArray clientesJson = new JSONArray(); 
            ClienteControladora control= new ClienteControladora(); 
          try {
              JSONArray a = (JSONArray) parser.parse(new FileReader("src/Archivos/1myJSONClientes.json"));

              if (a != null){
              for (Object obj : a)             {                 
                      JSONObject jsonObject = (JSONObject) obj; 
                       String cedula = (String) jsonObject.get("cedula"); 


                       String nombre = (String) jsonObject.get("nombre"); 


                       String apellido = (String) jsonObject.get("apellido"); 


                       String fechaDeNacimiento = (String) jsonObject.get("fechaDeNacimiento"); 


                       Cliente clienteProv = new Cliente(Integer.parseInt(cedula), nombre, apellido, fechaDeNacimiento); 
                       clientesJson = control.agregarClienteJson(clienteProv, clientesJson); 

             }             
             return clientesJson;            
             }
           } catch (IOException e) {
               e.printStackTrace();
           }
            
    
   return clientesJson;  
   }
             

     public DefaultTableModel llenarTablaPrincipal(JSONArray array) {
        DefaultTableModel model = new DefaultTableModel(); 
        model.addColumn("Cédula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha de nacimiento");        
    	StringWriter out = new StringWriter(); 
        try {
            array.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace(); 
        }    
        JSONObject jsonCliente = new JSONObject(); 
        jsonCliente.put("cliente", out); 
        JSONParser car_parser = new JSONParser(); 
        try {
            JSONObject objCliente = (JSONObject) car_parser.parse(jsonCliente.toJSONString());
            JSONArray arrayClientes = (JSONArray) objCliente.get("cliente"); 
            for (int i = 0; i < arrayClientes.size(); i++) {
                        JSONObject cliente = (JSONObject) arrayClientes.get(i); 
                        String cedula = cliente.get("cedula").toString();
                        String nombre = cliente.get("nombre").toString();	
                        String apellido = cliente.get("apellido").toString(); 
                        String fechaDeNacimiento = cliente.get("fechaDeNacimiento").toString();
                        model.addRow(new Object[] {cedula, nombre, apellido, fechaDeNacimiento});
            }
        } catch (org.json.simple.parser.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
    return model;       
}
  //ESTE METODO SIRVE PARA LLENAR LA TABLA CON Los clientes QUE EXISTEN EN EL JSON
       
  public DefaultTableModel llenarTablaConsultarCliente(JSONArray array, String caracteristica, String ValorCaracteristica) {
        /*if (caracteristica=="Cédula")
            Integer.parseInt(ValorCaracteristica);*/
        DefaultTableModel model = new DefaultTableModel(); 
        model.addColumn("Cédula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha de nacimiento");        
    	StringWriter out = new StringWriter(); 
        try {
            array.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace(); 
        }    
        JSONObject jsonCliente = new JSONObject(); 
        jsonCliente.put("cliente", out); 
        JSONParser car_parser = new JSONParser(); 
        try {
            JSONObject objCliente = (JSONObject) car_parser.parse(jsonCliente.toJSONString());
            JSONArray arrayClientes = (JSONArray) objCliente.get("cliente"); 
            for (int i = 0; i < arrayClientes.size(); i++) {
                        JSONObject cliente = (JSONObject) arrayClientes.get(i); 
                        String cedula = cliente.get("cedula").toString();
                        String nombre = cliente.get("nombre").toString();	
                        String apellido = cliente.get("apellido").toString(); 
                        String fechaDeNacimiento = cliente.get("fechaDeNacimiento").toString();
                        if ((caracteristica.equalsIgnoreCase("Cédula")) && (ValorCaracteristica.equalsIgnoreCase(cedula)))
                        model.addRow(new Object[] {cedula, nombre, apellido, fechaDeNacimiento});
                        if ((caracteristica.equalsIgnoreCase("Nombre")) && (ValorCaracteristica.equalsIgnoreCase(nombre)))
                        model.addRow(new Object[] {cedula, nombre, apellido, fechaDeNacimiento});
                        if ((caracteristica.equalsIgnoreCase("Apellido")) && (ValorCaracteristica.equalsIgnoreCase(apellido)))
                        model.addRow(new Object[] {cedula, nombre, apellido, fechaDeNacimiento});
                        if ((caracteristica.equalsIgnoreCase("Fecha de nacimiento")) && (ValorCaracteristica.equalsIgnoreCase(fechaDeNacimiento)))
                        model.addRow(new Object[] {cedula, nombre, apellido, fechaDeNacimiento});
            }
        } catch (org.json.simple.parser.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
    return model;       
}
  //ESTE METODO SIRVE PARA LLENAR LA TABLA CON Los clientes que se consulten  
       
       
       
}
