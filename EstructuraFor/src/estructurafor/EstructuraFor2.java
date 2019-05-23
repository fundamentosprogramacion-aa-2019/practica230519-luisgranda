/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurafor;

/**
 *
 * @author Granda
 */
public class EstructuraFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 10;
        String mensaje1 = "reporte 1";
        String mensajeFinal = "Fin del Reporte";
        String mensajeReporte = "";
        
        // System.out.print("€s", mensaje1);
        mensajeReporte = String.format("%s%s\n", mensajeReporte, mensaje1);
        for (int i=0; i <= limite; i++){
            // System.out,printf("contador %d\n", i);
            mensajeReporte = String.format("%scontador %d\n", mensajeReporte,
                    i);
        }
        mensajeReporte = String.format("%s%s\n", mensajeReporte, mensajeFinal);
        System.out.printf("%s\n", mensajeReporte);
    }
 }
