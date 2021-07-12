/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import wsConsumoBanguat.DataVariable;

import wsConsumoBanguat.DataVariable;

/**
 *
 * @author agr12
 */
public class ConsumoWBSBanguat {

    public ConsumoWBSBanguat() {
    }

    public static DataVariable TipoCambioRango(String fechainit, String fechafin) {
        wsConsumoBanguat.TipoCambio service = new wsConsumoBanguat.TipoCambio();
        wsConsumoBanguat.TipoCambioSoap port = service.getTipoCambioSoap();
        // TODO initialize WS operation arguments here
        // TODO process result here
        wsConsumoBanguat.DataVariable result = port.tipoCambioRango(fechainit, fechafin);
        
        return result;

    }
}
