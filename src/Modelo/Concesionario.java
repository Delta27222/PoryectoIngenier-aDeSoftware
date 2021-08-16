package modelo;

import java.util.*;

public class Concesionario {
	
	private String nombreConcesionario;
	private List<Cliente> ListaCliente;
	private List<Vehiculo> ListaVehiculo;
	
	public Concesionario() {
		this.nombreConcesionario = "";
		this.ListaCliente = new ArrayList<Cliente>();
		this.ListaVehiculo = new ArrayList<Vehiculo>();
	}
	
	// Getters y setters
	
	public String getNombreConcesionario() {
		return nombreConcesionario;
	}
	
	public void setNombreConcesionario(String nombreConcesionario) {
		this.nombreConcesionario = nombreConcesionario;
	}
	
	public List<Cliente> getListaCliente() {
		return ListaCliente;
	}
	
	public void setListaCliente(List<Cliente> listaCliente) {
		ListaCliente = listaCliente;
	}
	
	public List<Vehiculo> getListaVehiculo() {
		return ListaVehiculo;
	}
	
	public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
		ListaVehiculo = listaVehiculo;
	}
	
	// Funciones para agregar y eliminar de la lista
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.ListaVehiculo.add(vehiculo);
	}
	
	public void eliminarVehiculo(Vehiculo vehiculo) {
		this.ListaVehiculo.remove(vehiculo);
	}
	
	public void agregarCliente(Cliente cliente) {
		this.ListaCliente.add(cliente);
	}
	
	public void eliminarCliente(Cliente cliente) {
		this.ListaCliente.remove(cliente);
	}
	
	
	// Esto se usará para pruebas con la consola y eso, <------ borrar luego 
	public void mostrarClientes() {
		for (Cliente cliente:ListaCliente) {
			cliente.mostrarCliente();
		}
	}
	
	public void mostrarClientes(List<Cliente> listaCliente) {
		// Esta muestra clientes de una lista que le pases
		for (Cliente cliente:listaCliente) {
			cliente.mostrarCliente();
		}
	}
	
	public void mostrarVehiculos() {
		for (Vehiculo vehiculo:ListaVehiculo) {
			vehiculo.mostrarVehiculo();
		}
	}
	
	public void mostrarVehiculos(List<Vehiculo> listaVehiculo) {
		// Muestra una lista que le pases
		for (Vehiculo vehiculo:ListaVehiculo) {
			vehiculo.mostrarVehiculo();
		}
	}
	
	// Funciones para búsqueda ---> Habrá una fución al buscar nombre/apellido que devuelva una lista, y otra que devuelva solo un resultado
	// Será mucho más útil usar la lista, luego podrá elegirse el resultado que se quiera entre varios.
	
	// Clientes
	
	public Cliente buscarClienteNombre(String nombre) {
	// Devuelve el cliente por el nombre, si no lo consigue devuelve null. 
		for (Cliente cliente:ListaCliente) {
			if (cliente.getNombre() == nombre)
				return cliente;
		}
		return null; // si no encontró nada, manda null
	}
	
	public List<Cliente> listaBuscarClienteNombre(String nombre) {
	// Esta sería devolviendo una lista con todo lo que coincida, si no hubo ninguno devuelve null.
		List<Cliente> auxListaCliente = new ArrayList<Cliente>();
		for (Cliente cliente:ListaCliente) {
			if (cliente.getNombre() == nombre)
				auxListaCliente.add(cliente);
		}
		return auxListaCliente; // si no encontró nada, manda null
	}
	
	public Cliente buscarClienteApellido(String apellido) {
		for (Cliente cliente:ListaCliente) {
			if (cliente.getApellido() == apellido)
				return cliente;
		}
		return null; // si no encontró nada, manda null
	}
		
	public List<Cliente> listaBuscarClienteApellido(String apellido) {
		List<Cliente> auxListaCliente = new ArrayList<Cliente>();
		for (Cliente cliente:ListaCliente) {
			if (cliente.getApellido() == apellido)
				auxListaCliente.add(cliente);
		}
		return auxListaCliente; // si no encontró nada, manda null
	}
	
	public Cliente buscarClienteCedula(int cedula) {
		
		for (Cliente cliente:ListaCliente) {
			if (cliente.getCedula() == cedula)
				return cliente;
		}
		return null;
	}
	
	// Vehículos
	
	// Estas devuelven resultados únicos
	
	public Vehiculo buscarPlacaVehiculo(String placa) {
		
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getPlaca() == placa)
				return vehiculo;
		}
		return null;
	}
	
	public Vehiculo buscarSerieMotorVehiculo(String serieMotor) {
		
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getNumSerieMotor() == serieMotor)
				return vehiculo;
		}
		return null;
	}
	
	public Vehiculo buscarSerieChasisVehiculo(String serieChasis) {
		
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getNumSerieChasis() == serieChasis)
				return vehiculo;
		}
		return null;
	}
	
	// Estas pueden devolver bastantes resultados
	
	public List<Vehiculo> buscarYearVehiculo(int year) {
		List<Vehiculo> auxListaVeh = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getAno() == year)
				auxListaVeh.add(vehiculo);
		}
		return auxListaVeh;
	}
	
	public List<Vehiculo> buscarPaisVehiculo(String pais) {
		List<Vehiculo> auxListaVeh = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getPaismanufactura() == pais)
				auxListaVeh.add(vehiculo);
		}
		return auxListaVeh;
	}
	
	public List<Vehiculo> buscarMarcaVehiculo(String marca) {
		List<Vehiculo> auxListaVeh = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getMarca() == marca)
				auxListaVeh.add(vehiculo);
		}
		return auxListaVeh;
	}
	
	public List<Vehiculo> buscarModeloVehiculo(String modelo) {
		List<Vehiculo> auxListaVeh = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getModelo() == modelo)
				auxListaVeh.add(vehiculo);
		}
		return auxListaVeh;
	}
	
	public List<Vehiculo> buscarMotorVehiculo(String motor) {
		List<Vehiculo> auxListaVeh = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo:ListaVehiculo) {
			if (vehiculo.getTipoMotor() == motor)
				auxListaVeh.add(vehiculo);
		}
		return auxListaVeh;
	}
	
	
	
	
	
}
