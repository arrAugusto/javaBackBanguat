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
public class Rango {
    int moneda;
    String fechaXml;
    float venta;
    float compra;
    
    public Rango() {
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public String getFechaXml() {
        return fechaXml;
    }

    public void setFechaXml(String fechaXml) {
        this.fechaXml = fechaXml;
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
