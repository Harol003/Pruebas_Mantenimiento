/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora.avanzada;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAppTest {

    @Test
    public void testSuma() {
        assertEquals(7, CalculadoraApp.sumar(3, 4));
        assertEquals(0, CalculadoraApp.sumar(-2, 2));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(12, CalculadoraApp.multiplicar(3, 4));
        assertEquals(0, CalculadoraApp.multiplicar(0, 5));
    }
    
    @Test
    public void testResta() {
        assertEquals(12, CalculadoraApp.restar(3, 4));
        assertEquals(0, CalculadoraApp.restar(0, 5));
    }
    
    
}