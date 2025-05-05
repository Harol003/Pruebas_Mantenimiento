/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora.avanzada;

import static com.mycompany.calculadora.avanzada.CalculadoraApp.multiplicar;
import static com.mycompany.calculadora.avanzada.CalculadoraApp.sumar;
import java.util.Scanner;

/**
 *
 * @author Harol
 */
public class CalculadoraAvanzada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("POLITECNICO INTERNACIONAL: PRUEBAS Y MANTENIMIENTO");
        System.out.println("------------------------------------------------");
        System.out.println("Este programa permite sumar y multiplicar dos numeros.");
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Hola " + nombre + ", ingresa el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();

        int suma = sumar(num1, num2);
        int producto = multiplicar(num1, num2);
        int resta = num1 - num2;

        System.out.println("\nResultados para las operaciones, segun tu solicitud: " + nombre);
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 +" - " + num2 + " =" + resta);
    }
}
