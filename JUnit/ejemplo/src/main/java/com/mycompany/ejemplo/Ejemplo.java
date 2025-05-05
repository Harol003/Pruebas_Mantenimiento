/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo;

import java.util.Scanner;

/**
 *
 * @author Harol
 */
public class Ejemplo {

    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("------------------------------------------------");
        System.out.println("POLITECNICO INTERNACIONAL : PRUEBAS Y MANTENIMIENTO DE SOFTWARE");
        System.out.println("------------------------------------------------");
        System.out.println("Este programa permite sumar y multiplicar dos numeros.");
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Hola " + nombre + ", ingresa el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();

        int suma = calc.sumar(num1, num2);
        int multiplicacion = calc.multiplicar(num1, num2);

        System.out.println("\nResultados para " + nombre + ":");
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
    }
}
