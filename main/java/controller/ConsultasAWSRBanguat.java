/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ObjetRangos.Rango;
import ObjetRangos.ResponseJSON;
import com.google.gson.Gson;
    import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import models.ConsumoWBSBanguat;
import sqlConection.ConexionMysql;
import wsConsumoBanguat.DataVariable;
import java.sql.Connection;

/**
 *
 * @author agr12
 */
public class ConsultasAWSRBanguat {

    public ConsultasAWSRBanguat() {
    }

    public static ArrayList<String> TipoCambioRango(String fechaInicio, String fechaFinal) throws SQLException, ParseException {
        String error = "Error";
        String response = null;
        ArrayList<String> lista = new ArrayList<String>();
        ConsumoWBSBanguat consumoWEBServiceBanguat = new ConsumoWBSBanguat();
        DataVariable result = consumoWEBServiceBanguat.TipoCambioRango(fechaInicio, fechaFinal);
        //INSTANCIANDO LA CONEXION ALA DB
        ConexionMysql conectar = new ConexionMysql();
        //HACIENDO LA CONEXION
        Connection reg = conectar.getConnection();
        Gson g = new Gson();
        //
        Rango objetRangos = new Rango();

        //UTILIZANDO UN CATCH PARA ERRORES NO ESPERADOS
        int contador = 0;

        for (int i = 0; i < result.getVars().getVar().size(); i++) {
            contador = contador++;
            objetRangos.setMoneda(result.getVars().getVar().get(i).getMoneda());
            objetRangos.setFechaXml(result.getVars().getVar().get(i).getFecha());
            objetRangos.setVenta(result.getVars().getVar().get(i).getVenta());
            objetRangos.setCompra(result.getVars().getVar().get(i).getCompra());
            String query = "CALL `ws_banguat`.`spNewTipoCambioRango` (" + objetRangos.getMoneda() + ", '" + objetRangos.getFechaXml() + "', " + objetRangos.getVenta() + ", " + objetRangos.getCompra() + ")";
            Statement statement = reg.createStatement();
            statement.executeUpdate(query);

            ResponseJSON responseJSON = new ResponseJSON(objetRangos.getMoneda(), objetRangos.getFechaXml(), objetRangos.getVenta(), objetRangos.getCompra());

            response = g.toJson(responseJSON);
            lista.add(response);
        }

        return lista;

    }

}
