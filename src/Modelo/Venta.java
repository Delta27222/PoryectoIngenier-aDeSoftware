package modelo;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class Venta implements JSONStreamAware  {
    
    int montoVenta, montoAbono, cedulaComprador; 
    String placa, idVenta, fechaVenta, userNameVendedor; 

    public Venta(int montoVenta, int montoAbonado, int cedula, String placa, String idVenta, String fechaVenta, String userNameVendedor) {
        this.montoVenta = montoVenta;
        this.montoAbono = montoAbonado;
        this.cedulaComprador = cedula;
        this.placa = placa;
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.userNameVendedor = userNameVendedor;
    }


    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }

    public int getMontoAbono() {
        return montoAbono;
    }

    public void setMontoAbono(int montoAbono) {
        this.montoAbono = montoAbono;
    }

    public int getCedulaComprador() {
        return cedulaComprador;
    }

    public void setCedulaComprador(int cedulaComprador) {
        this.cedulaComprador = cedulaComprador;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getUserNameVendedor() {
        return userNameVendedor;
    }

    public void setUserNameVendedor(String userNameVendedor) {
        this.userNameVendedor = userNameVendedor;
    }

    public void writeJSONString(Writer out) throws IOException {
	LinkedHashMap obj = new LinkedHashMap(); 

        obj.put("idVenta", idVenta);
        obj.put("montoVenta", String.valueOf(montoVenta));
        obj.put("montoAbono", String.valueOf(montoAbono));
        obj.put("placa", placa);
        obj.put("cedulaComprador", String.valueOf(cedulaComprador));
        obj.put("fechaVenta", fechaVenta);
        obj.put("userNameVendedor", userNameVendedor);

        JSONValue.writeJSONString(obj, out);
    }


	
	
	
	
	
	
	
	
}
