/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Antonio Muralles
 */
public class Archivos {
    public static void crearArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        try {
            PrintWriter output = new PrintWriter(file);
            output.close();
            System.out.println("Archivo Creado Exitosamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
        public static String LeerArchivo(String nombreArchivo){
            String texto="";
            try{
                BufferedReader bf = new BufferedReader(new FileReader(nombreArchivo));
                String temp ="";
                String bfReader;
                while((bfReader = bf.readLine()) !=null){
                    temp = temp + bfReader;
                }
                texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
            return texto;
        }
        
        
        public static void EscribirArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(file);
            String contenido = "Elementos dentro del HashMap";
            salida.println(contenido);
//            salida.println();
//            salida.println("Fin de Escritura");
            salida.close();
            System.out.println("Se ha escrito el archivo correctamente");
        } catch(FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
