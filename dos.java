package testfirst;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author XP
 */
public class unoB {
    public static void main(String[] args) {
        //variables
        int cantEstu;//cantidad de estudiantes
        int cantMat;//cantidad de materias
        int cantNot;//cantidad de notas
        String nomEst;//nombre de estudiante
        String mat;//nombre de materia
        double sumN = 0;
        double [] nota;//nota
        double [] sumNot;//suma de notas
        double [] promNot;//promedio de notas
        double promMat;//promedio materias
        
        //entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        //ingreso de datos o inicializacion de variables
        System.out.print("INGRESE CUANTOS ESTUDIANTES HAY EN EL GRUPO:");
        cantEstu = teclado.nextInt();        
        cantMat = 3;//valor constante materias
        cantNot = 3;//valor constante notas
        nota = new double[cantNot];
        sumNot = new double[cantNot];
        promNot = new double[cantNot];
        
        //ciclo estudiantes
        for (int est = 1; est <= cantEstu; est++) {
            System.out.println("-------------------------------------------");
            System.out.print("INGRESE EL NOMBRE DEL ESTUDIANTE " + est + ":");
            nomEst = teclado.next();
            
            //ciclo materias
            for (int mate = 1; mate <= cantMat; mate++) {
                System.out.print("INGRESE LA MATERIA " + mate
                        + " DEL ESTUDIANTE " + nomEst + ":");
                mat = teclado.next();
                
                //ciclo notas
                for (int not = 0; not < nota.length; not++) {
                    System.out.print("INGRESE LA NOTA " + not + " DE LA MATERIA "
                            + mat + " DEL ESTUDIANTE " + nomEst + ":");
                    nota[not] = teclado.nextDouble();
                    
                    sumNot[not] = sumN + nota[not];
                    
//                    if ((not + 1) == nota.length) {
//                        for (int i = 0; i < promNot.length; i++) {
//                            promNot[i] = sumNot / cantNot;
//                            break;
//                        }
//                    }
                }
                
//                promNot = sumNot / cantNot;
//                System.out.print("EL PROMEDIO DE NOTAS DE LA MATERIA "
//                        + mat + " DEL ESTUDIANTE " + nomEst + " "
//                        + "ES: " + promNot + "\n");
            }
        }
    }
}
