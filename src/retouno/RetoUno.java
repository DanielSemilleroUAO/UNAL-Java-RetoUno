/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retouno;

import java.util.Scanner;

/**
 *
 * @author delga
 */
public class RetoUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puntosChumajer = 0;
        int puntosJuanPis = 0;
        int puntosRaiconen = 0;
        String cantidadPatrocinadoresRaiconen = "";
        
        Scanner scanner = new Scanner(System.in);
        puntosChumajer = scanner.nextInt();
    
        puntosJuanPis = (puntosChumajer*2) + 4;
        puntosRaiconen = (puntosJuanPis + puntosChumajer) / 5;
        
        if(puntosRaiconen > 0 && puntosRaiconen <= 20){
            cantidadPatrocinadoresRaiconen = "uno";
        } else if(puntosRaiconen > 20 && puntosRaiconen <= 30){
            cantidadPatrocinadoresRaiconen = "dos";
        } else if(puntosRaiconen > 30 && puntosRaiconen <= 50){
            cantidadPatrocinadoresRaiconen = "tres";
        }else{
            cantidadPatrocinadoresRaiconen = "cuatro";
        }
        
        System.out.println(puntosChumajer + " " + puntosJuanPis + " " 
                + puntosRaiconen);
        System.out.println(cantidadPatrocinadoresRaiconen);
        
    }
    
}
