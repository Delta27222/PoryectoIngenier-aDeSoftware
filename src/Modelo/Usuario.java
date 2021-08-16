package modelo;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Usuario extends Persona implements JSONStreamAware  {

    String tipoDeCuenta, userName, contrasena;

    public Usuario(int cedula, String nombre, String apellido, String fechaDeNacimiento, String tipoDeCuenta, String userName, String contrasena) {
        super(cedula, nombre, apellido, fechaDeNacimiento);
        this.tipoDeCuenta = tipoDeCuenta;
        this.userName = userName;
        this.contrasena = contrasena;
    }   

    public Usuario() {
        super(27222633, "Pepito", "peres", "87");
        this.tipoDeCuenta = "Administrador";
        this.userName = "hola";
        this.contrasena = "2dasd";
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }
   
    @Override
    public void writeJSONString(Writer out) throws IOException {
        LinkedHashMap obj = new LinkedHashMap(); 
        obj.put("cedula", String.valueOf(cedula)); 
        obj.put("nombre", nombre); 
        obj.put("apellido", apellido);
        obj.put("fechaDeNacimiento", fechaDeNacimiento);
        obj.put("userName", userName); 
        obj.put("contrasena", contrasena);
        obj.put("tipoDeCuenta", tipoDeCuenta);
         JSONValue.writeJSONString(obj, out);      
        
    }

}
