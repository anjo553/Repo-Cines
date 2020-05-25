/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author Antonio Muralles
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int caso, op;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("------Gestion de Cine------");
        System.out.println("1. Adminiistracion ");
        System.out.println("2. Ventas ");
        System.out.println("Ingresar Opcion: ");
        caso = ingreso.nextInt();
        switch(caso)
        {
            case 1:
        for (int i = 0; i < 15; ++i) System.out.println();
        System.out.println("------Gestion Administrador------");
        System.out.println("1. Gestion de Categorias y Salas ");
        System.out.println("2. Gestion de Empleados (Agregar o eliminar empleado)");
        System.out.println("3. Reportes de sistema");
        System.out.println("4. Solo es una prueba..");
        op = ingreso.nextInt();
        switch(op){
            case 1:
            for (int i = 0; i < 15; ++i) System.out.println();
            System.out.println("------Gestion Administrador------");
            break;
            case 2:
                break;
            case 3:
        for (int i = 0; i < 15; ++i) System.out.println();
        System.out.println("------ Administrador Reportes------");
        System.out.println("1. Total de ventas por caja () ");//Tambien lo recaudado por cada caja
        System.out.println("2. Gestion de Empleados (Agregar o eliminar empleado)");
        System.out.println("3. Planilla de empleados");
        System.out.println("4. Reporte de ventas por pelicula");// cuanto ha recaudado cada una, total de tiquetes por película y una distribución de porcentajes de clientes por genero.
                break;
            }
                break;
            case 2:
        for (int i = 0; i < 15; ++i) System.out.println();
        System.out.println("------Gestion Ventas------");
        System.out.println("1. Tickets");
        System.out.println("2. Membresia");  
        System.out.println("2. Paquetes");
                break;
        }
    }
    
}
