package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class UsuarioControladora {
    
        JFrame ventana;
    public UsuarioControladora() {
		
    }
    
    public UsuarioControladora(JFrame ventana){
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
    
//-------------------------------------------------------------------------------------------------------------USUARIOS
   //**ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE USUARIOS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
    public void sacarDelArchivoJSONUsuarios(JSONArray array) {
    	
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
    //ESTEMETODO ES PARA BUSCAR DENTRO DEL JSON DE USUARIOS (FUNCINAL PARA BUSACR COSAS Y ESO) AUN NO ES EL FINAL
         
    
    //ESTE METODO QUE AGREGARA A CADA USUARIO AL JSON DE USUARIOS
    public JSONArray agregarUsuarioJson(Usuario usuario, JSONArray array) {		
                             
        array.add(usuario); 

    	return array; 
}
    //ESTE METODO QUE AGREGARA A CADA USUARIO AL JSON DE USUARIOS
    
    
    //**ESTE METODO ES PARA MODIFICAR UN USUARIO (USANDO LA CEDULA) DEL JSON DE USUARIOS
    public JSONArray modificarUsuarioJson(JSONArray array, String cedulaC, Usuario usuarioModificado) {
    	
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
//					           que este UsuarioEditado, ya tiene las modificaciones-------------------------------------------------------------AQUIIIIIIIIIIII LEEME PRRO
				    
			    	arrayUsers.add(usuarioModificado);				
					return arrayUsers; 				
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return array;    
	}
    //ESTE METODO ES PARA MODIFICAR UN USUARIO (USANDO LA CEDULA) DEL JSON DE USUARIOS
    
    
    //ESTE METODO ES PARA ELIMINAR UN USUARIO (USANDO LA CEDULA) DEL JSON DE USUARIOS
    public JSONArray eliminarUsuarioDelJson(JSONArray array, String cedulaC) {
    	
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
    //ESTE METODO ES PARA ELIMINAR UN USUARIO (USANDO LA CEDULA) DEL JSON DE USUARIOS
    
    //ESTE METODO ES PARA ELIMINAR UN USUARIO (USANDO LA CEDULA) DEL JSON DE USUARIOS
    public Boolean verificarCedulaUsuarioJson(JSONArray array, String cedulaC) {
    	
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
    //ESTE METODO ES PARA ELIMINAR UN USUARIO (USANDO LA CEDULA) DEL JSON DE USUARIOS
    
    //**ESTE METODO ES PARA SACAR LOS USUARIOS DEL JSON DE USUARIOS
    public Usuario crearUsuarioDelJson(JSONArray array, String cedulaC) {
    	
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
                                    String tipoCuenta = user.get("tipoDeCuenta").toString(); 
                                    String userName = user.get("userName").toString();
                                    String contrasena = user.get("contrasena").toString();
                                    Usuario usuarioJson = new Usuario(Integer.parseInt(cedulaString),nombre, apellido, fechaDeNacimiento, tipoCuenta, userName, contrasena); 

                                    
                                    System.out.println("cedula usuario-------"+usuarioJson.getCedula());
                                    
                                    
                                    
                                    return usuarioJson;     
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return null;  
	}
    //ESTE METODO ES PARA SACAR LOS USUARIOS DEL JSON DE USUARIOS
    
    //ESTE METODO ES PARA SACAR LOS USUARIOS DEL JSON DE USUARIO
       public JSONArray leerJSONUsuarios(JSONArray array) throws ParseException, FileNotFoundException, IOException {
            JSONParser parser = new JSONParser(); 
            JSONArray usuariosJson = new JSONArray(); 
            UsuarioControladora control= new UsuarioControladora(); 
          try {
              JSONArray a = (JSONArray) parser.parse(new FileReader("src/Archivos/3myJSONUsuarios.json"));

              if (a != null){
              for (Object obj : a)             {                 
                      JSONObject jsonObject = (JSONObject) obj; 
                       String cedula = (String) jsonObject.get("cedula"); 

                       String nombre = (String) jsonObject.get("nombre"); 

                       String apellido = (String) jsonObject.get("apellido"); 

                       String fechaDeNacimiento = (String) jsonObject.get("fechaDeNacimiento"); 

                       String tipoCuenta = (String) jsonObject.get("tipoDeCuenta"); 
                       
                       String userName = (String) jsonObject.get("userName"); 
                       
                       String contrasena = (String) jsonObject.get("contrasena"); 

                      Usuario usuarioProv = new Usuario(Integer.parseInt(cedula),nombre, apellido, fechaDeNacimiento, tipoCuenta, userName, contrasena); 

                      System.out.println("cedula -------"+usuarioProv.getCedula());
                      System.out.println("nombre -------"+usuarioProv.getNombre());
                      System.out.println("apellido -------"+usuarioProv.getApellido());
                      System.out.println("fecha -------"+usuarioProv.getFechaDeNacimiento());
                      System.out.println("tipo cuenta -------"+usuarioProv.getTipoDeCuenta());
                      System.out.println("user name -------"+usuarioProv.getUserName());
                      System.out.println("contrasena -------"+usuarioProv.getContrasena());
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");

                      
                      
                       usuariosJson = control.agregarUsuarioJson(usuarioProv, usuariosJson); 

             }             
             return usuariosJson;            
             }
           } catch (IOException e) {
               e.printStackTrace();
           }
            
    
   return usuariosJson;  
   }
             
    
    //ESTE METODO ES PARA SABER SI EXISTE EN UN USUARIO CON EL USERNAME    
    public Boolean existeUsuario(JSONArray array, String userNameC) {
    	
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
				String userNameString = user.get("userName").toString();
				if (userNameC.equals(userNameString)==true) {
                                    return true;                              
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return false;    
	}
    //ESTE METODO ES PARA SABER SI EXISTE EN UN USUARIO CON EL USERNAME  
    
    
    

        //ESTE METODO ES PARA SABER SI EXISTE EN UN USUARIO CON EL USERNAME    
    public void devuelveUsuario() {
    	String data = null;
        try {
            File myObj = new File("src/Archivos/5myJSONQuienEntra.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            System.out.println(data);
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
      }
        System.out.println("DATA88888888888888888888888"+data);
    	
}
    //ESTE METODO ES PARA SABER SI EXISTE EN UN USUARIO CON EL USERNAME  
    
    

         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        //**ESTE METODO ES PARA SACAR LOS USUARIOS DEL JSON DE USUARIOS (USANDO UN USERNAME)
    public Usuario crearUsuarioDelJsonUserName(JSONArray array, String userNameString) {
    	
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
				String userN = user.get("userName").toString();
				if (userNameString.equals(userN)==true) {
                                    String cedula = user.get("cedula").toString();
                                    String nombre = user.get("nombre").toString(); 
                                    String apellido = user.get("apellido").toString();
                                    String fechaDeNacimiento = user.get("fechaDeNacimiento").toString(); 	
                                    String tipoCuenta = user.get("tipoDeCuenta").toString(); 
                                    String userName = user.get("userName").toString();
                                    String contrasena = user.get("contrasena").toString();
                                    System.out.println("antes ");
                                    System.out.println(user);
                                    System.out.println("despues");
                                    Usuario usuarioJson = new Usuario(Integer.parseInt(cedula),nombre, apellido, fechaDeNacimiento, tipoCuenta, userName, contrasena); 
    
                                    return usuarioJson;     
				}
			}			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
     return null;  
	}
    //ESTE METODO ES PARA SACAR LOS USUARIOS DEL JSON DE USUARIOS   (USANDO UN USERNAME)
     
    
    
  //ESTE METODO SIRVE PARA LLENAR LA TABLA CON LAS VENTAS QUE EXISTEN EN EL JSON 
    public DefaultTableModel llenarTablaPrincipal(JSONArray array) {
        DefaultTableModel model = new DefaultTableModel(); 
        model.addColumn("UserName");
        model.addColumn("Cedula");
        model.addColumn("Nombre");
        model.addColumn("Tipo Cuenta");        
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
                        JSONObject usuario = (JSONObject) arrayCars.get(i); 
                        String userName = usuario.get("userName").toString();
                        String cedula = usuario.get("cedula").toString();	
                        String nombre = usuario.get("nombre").toString(); 
                        String tipoCuenta = usuario.get("tipoDeCuenta").toString();
                        model.addRow(new Object[] {userName, cedula, nombre, tipoCuenta});
            }
        } catch (org.json.simple.parser.ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        } 
    return model;       
}
  //ESTE METODO SIRVE PARA LLENAR LA TABLA CON LAS VENTAS QUE EXISTEN EN EL JSON 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
}
