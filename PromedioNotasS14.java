/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedionotass14;

/**
 *
 * @author Iveth
 */

import java.util.Scanner;

public class PromedioNotasS14 {
    // funcion para calcular promedio de 3 notas
    public static double calcularPromedio (double nota1, double nota2, double nota3){
        double promedio = (nota1 + nota2 + nota3)/3;
        return promedio;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la primera nota: ");
        double n1 = entrada.nextDouble();
        
        System.out.print("Ingrese la segunda nota: ");
        double n2 = entrada.nextDouble();
        
        System.out.print("Ingrese la tercera nota: ");
        double n3 = entrada.nextDouble();
        
        double resultado = calcularPromedio (n1, n2, n3);
        
        System.out.print("El promedio es : " +  resultado);
        
    }
}g
