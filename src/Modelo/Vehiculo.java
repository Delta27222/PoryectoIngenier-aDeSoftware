package modelo;

import java.io.IOException;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Vehiculo implements JSONStreamAware{
	private String placa; 
	private String marca;
	private String modelo;
	private int ano; 
	private String paismanufactura; 
	private String tipoMotor; 
	private String numSerieMotor; 
	private String numSerieChasis; 
	private int kilometraje; 
	private String color;
        private int precio;
        private int cedulaDueno; 

    public Vehiculo(String placa, String marca, String modelo, int ano, String paismanufactura, 
            String tipoMotor, String numSerieMotor, String numSerieChasis, int kilometraje, String color, int precio, int cedulaDueno) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.paismanufactura = paismanufactura;
        this.tipoMotor = tipoMotor;
        this.numSerieMotor = numSerieMotor;
        this.numSerieChasis = numSerieChasis;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.cedulaDueno = cedulaDueno; 
    }

    public int getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(int cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }
        

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
	
	public Vehiculo() {
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPaismanufactura() {
		return paismanufactura;
	}

	public void setPaismanufactura(String paismanufactura) {
		this.paismanufactura = paismanufactura;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getNumSerieMotor() {
		return numSerieMotor;
	}

	public void setNumSerieMotor(String numSerieMotor) {
		this.numSerieMotor = numSerieMotor;
	}

	public String getNumSerieChasis() {
		return numSerieChasis;
	}

	public void setNumSerieChasis(String numSerieChasis) {
		this.numSerieChasis = numSerieChasis;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	} 
	
	// Se usará para testear!
	public void mostrarVehiculo() {
		System.out.println(this.getMarca() + " " + this.getModelo() + ". " + this.getAno() + ", País: " + this.getPaismanufactura() + ". Motor: " + this.getTipoMotor() + ", color: " + this.getColor());
		System.out.println("Placa: " + this.getPlaca() + ". Num. Motor: " + this.getNumSerieMotor() + ". Num. Chasis: " + this.getNumSerieChasis());
		System.out.println();
	}
	

	public void writeJSONString(Writer out) throws IOException {
		// TODO Auto-generated method stub
		LinkedHashMap obj = new LinkedHashMap(); 
		obj.put("placa", placa);
		obj.put("marca", marca);
		obj.put("modelo", modelo);
		obj.put("ano", String.valueOf(ano));
		obj.put("paismanufactura", paismanufactura);
		obj.put("tipoMotor", tipoMotor);
		obj.put("numSerieMotor", String.valueOf(numSerieMotor));
		obj.put("numSerieChasis", String.valueOf(numSerieChasis));
		obj.put("kilometraje", String.valueOf(kilometraje));
		obj.put("color", color);
                obj.put("precio", String.valueOf(precio));
                obj.put("cedulaDueno", String.valueOf(cedulaDueno));
		JSONValue.writeJSONString(obj, out);
	}
}
