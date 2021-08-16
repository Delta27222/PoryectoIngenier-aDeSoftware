package modelo;
import java.util.*;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;


public class Cliente extends Persona implements JSONStreamAware  {
	private List<Venta> listaPedido;

	public Cliente() {
		super();
		this.listaPedido = null;
	}
	
	public Cliente(int cedula, String nombre, String apellido, String fechaDeNacimiento, List<Venta> pedido) {
		super(cedula, nombre, apellido, fechaDeNacimiento);
		this.listaPedido = pedido;
	}
	
	// Sin placa
	public Cliente(int cedula, String nombre, String apellido, String fechaDeNacimiento) {
		super(cedula, nombre, apellido, fechaDeNacimiento);
		this.listaPedido = null;
	}
			
	// Se usarï¿½ para testear...
	public void mostrarCliente() {
		System.out.print(this.getNombre() + this.getApellido() + ", CI: " + this.getCedula() + ", nacio: " + this.getFechaDeNacimiento());
		System.out.println();
	}
	
	public void writeJSONString(Writer out) throws IOException {
		LinkedHashMap obj = new LinkedHashMap(); 
		obj.put("cedula", String.valueOf(cedula)); 
		obj.put("nombre", nombre); 
		obj.put("apellido", apellido);
		obj.put("fechaDeNacimiento", fechaDeNacimiento);
		JSONValue.writeJSONString(obj, out);
	} 
	
	
}
