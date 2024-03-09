/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Operaciones {
    public int nose()
    {
        //Se esta instanciando una variable/clase
        Scanner sc = new Scanner(System.in);
        //Pide que ingresemos un numero
        System.out.println("Ingrese su numero");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            //Si 'numero' es par, mostrar en pantalla que 'numero' es par
            System.out.println("El numero es Par");
        } else {
            //Sino mostrar en pantalla que 'numero' es impar
            System.out.println("El numero es Impar");
        }  
        return 0;
}
}
