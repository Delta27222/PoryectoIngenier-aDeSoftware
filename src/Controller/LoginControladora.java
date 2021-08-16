package Controller;

import java.io.IOException;
import java.io.StringWriter;
import modelo.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;




public class LoginControladora {
    
    public int comprobarDatos(String userName, String contrasena, JSONArray array){

       if(!comprobarMatch(array,userName, contrasena)){
           return 2;
       }
       return 0;
    }
    
    public int leerDatos(JSONArray array, String userName, String contrasena){
        int caso = comprobarDatos(userName, contrasena, array);
        
        switch(caso){
            case 0: 
                return caso;
            case 1:
                return caso;
            case 2:
                return caso;
        }
return caso;
    }
    

    public boolean comprobarUserName(JSONArray array,String userName) {

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
				String userString = user.get("userName").toString();
                                if( userString.equals(userName)){
                                    return true;
                                }
			}
			return false;
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        return false;
	}
    
        public boolean comprobarContrasena(JSONArray array,String contrasena) {
    	
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
				String contrasenaString = user.get("contrasena").toString();
                                if( contrasenaString.equals(contrasena)){
                                    return true;
                                }
			}
			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return false;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean comprobarMatch(JSONArray array,String userName,String contrasena) {
    	
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
                                String contrasenaString = user.get("contrasena").toString();
				String userString = user.get("userName").toString();
                                if( userString.equals(userName) && contrasenaString.equals(contrasena)){
                                    return true;
                                }
			}
			
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return false;
	}
    
    
}
