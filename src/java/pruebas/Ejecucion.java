/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Dao.Crud_Times;
import Datos.Times;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sary
 */
public class Ejecucion {
    public static void main(String[] args) throws SQLException {
        
        Crud_Times crud_Times = new Crud_Times();
        
        List<List> datosFiltro = crud_Times.datosFiltroGrafica(1, "Mario Bolaños");
        
        System.out.println(datosFiltro);
    }
}
