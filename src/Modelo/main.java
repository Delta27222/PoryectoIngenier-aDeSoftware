package modelo;

import Controller.ClienteControladora;
import Controller.UsuarioControladora;
import Controller.VehiculoControladora;
import Controller.VentaControladora;
import Vista.AALogin;
import Vista.AMenu;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import controller.Controladora;
import org.json.simple.parser.ParseException;


public class main {

	public static void main(String[] args) throws ParseException, IOException {
// LAS NUEVAS CONTROLADORES QUE ESTOY AGREGANDO
            ClienteControladora controlCliente = new ClienteControladora(); 
            VehiculoControladora controlVehiculo = new VehiculoControladora(); 
            UsuarioControladora controlUsuario = new UsuarioControladora(); 
            VentaControladora controlVenta = new VentaControladora(); 
// LAS NUEVAS CONTROLADORES QUE ESTOY AGREGANDO

            
            
            //SUPONEMOS QUE ESTE ES EL ARRAY QUE VA DESDE EL INICIO DE TODO
            JSONArray arrayClientes, arrayVehiculos, arrayUsuarios,arrayVentas; 		

            arrayClientes = controlCliente.creadorJsonArray(); 
            arrayVehiculos = controlVehiculo.creadorJsonArray(); 
            arrayUsuarios = controlUsuario.creadorJsonArray(); 
            arrayVentas = controlVenta.creadorJsonArray(); 
  
            arrayClientes = controlCliente.leerJSONClientes(arrayClientes);
            arrayVehiculos = controlVehiculo.leerJSONVehiculos(arrayVehiculos); 
            arrayUsuarios = controlUsuario.leerJSONUsuarios(arrayUsuarios); 
            arrayVentas = controlVenta.leerJSONVentas(arrayVentas); 

            AALogin login = new AALogin(arrayVehiculos,arrayClientes, arrayUsuarios, arrayVentas);  
            login.setVisible(true);
			
	}

}
