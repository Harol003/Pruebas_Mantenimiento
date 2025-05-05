/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class UsuarioSimulado {
    public void realizarAccion() {
        try {
            // Simula tiempo de respuesta entre 100 y 500 ms
            Thread.sleep((int)(Math.random() * 400 + 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}