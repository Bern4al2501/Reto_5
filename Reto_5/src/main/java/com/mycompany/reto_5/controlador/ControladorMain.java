
package com.mycompany.reto_5.controlador;

import com.mycompany.reto_5.vista.frmPrincipal;

/**
 *
 * @author Juan
 */
public class ControladorMain {
    public static void main(String[] args){
        //Con esto testereiamos la conexion a la base de datos de esta manera pero debemos de poner
        //La clase ControladorMain como main class en propiedades del proyecto
        //Conexion cc = new Conexion();
        //Connection cn = cc.conectar();
        
        new frmPrincipal().setVisible(true);
    }
}
