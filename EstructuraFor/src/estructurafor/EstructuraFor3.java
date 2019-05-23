/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author Granda
 */
public class EstructuraFor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        String mensajeReporte = "";
        String nombre = " ";
        String apellido = " ";
        int edad =0; 
        int sumaedades = 0;
        double promedioEdades = 0;
        
        mensajeReporte = String.format("%s%s\n", mensajeReporte, 
                "Listado de Estudiantes");
        mensajeReporte = String.format("%s%s\t\t%s\t\t%s\n", mensajeReporte,
                "Nombre", "Apellido", "Edad");
      
        for (int i=0; i <= limite; i++){
          System.out.println("Ingrese su nombre:");
          nombre = entrada.nextLine();
          System.out.println("Ingrese su apellido:");
          apellido = entrada.nextLine();
          System.out.println("Ingrese su edad:");
          edad = entrada.nextInt();
          entrada.nextLine();
          sumaedades = sumaedades + edad;
          mensajeReporte = String.format("%s%s\t\t%s\t\t%d\n", 
                  mensajeReporte, nombre, apellido, edad);
          
        }
        promedioEdades = (double)sumaedades / limite;
        mensajeReporte = String.format("%sPromedio de edades: %f\n",
                mensajeReporte, promedioEdades);
        System.out.printf("%s\n", mensajeReporte);
    }
 }
