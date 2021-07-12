/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetRangos;

/**
 *
 * @author agr12
 */
public class ResponseJSON {

    int moneda;
    String fecha;
    float venta;
    float compra;

    public ResponseJSON() {
    }

    public ResponseJSON(int moneda, String fecha, float venta, float compra) {
        this.moneda = moneda;
        this.fecha = fecha;
        this.venta = venta;
        this.compra = compra;
    }

    public ResponseJSON(int moneda, String fechaXml, float venta, float compra, int rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResponseJSON(int moneda, String fechaXml, float venta, float compra, String foundType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }

    public float getCompra() {
        return compra;
    }

    public void setCompra(float compra) {
        this.compra = compra;
    }

}
