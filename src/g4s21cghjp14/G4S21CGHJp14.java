/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21cghjp14;

import ConexionDAO.Conexion;
import DTO.Datos;
/**
 *
 * @author hazae
 */
public class G4S21CGHJp14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion = new Conexion();
        conexion.Abrir();
        
        if(conexion.consultartodos()){
            System.out.println("se consultaron");
        }else{
            System.out.println("no se logro la consulta");
        }
        
        
        conexion.cerrar();
    }
    
}
