/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.gfj
 */
package EscrituraArchivos3;

import java.io.FileNotFoundException;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
     public static void main( String args[] ) throws FileNotFoundException
   {   
       Calificaciones a = new Calificaciones();
       a.abrir_archivo();
       a.agregar_informacion();
       a.cerrar_archivo();
   }        
}
