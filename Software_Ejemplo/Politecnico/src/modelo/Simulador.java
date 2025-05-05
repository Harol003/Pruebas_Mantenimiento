/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
/**
 *
 * @author Harol
 */
public class Simulador {
    
    public Metrica simularUsuarios(int cantidad) {
        Metrica metrica = new Metrica();
        ArrayList<UsuarioSimulado> usuarios = new ArrayList<>();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < cantidad; i++) {
            UsuarioSimulado u = new UsuarioSimulado();
            usuarios.add(u);
            u.realizarAccion();
            metrica.accionesRealizadas++;
        }

        long fin = System.currentTimeMillis();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        metrica.tiempoTotal = fin - inicio;
        metrica.memoriaUsada = (memoriaDespues - memoriaAntes) / (1024 * 1024); // en MB
        return metrica;
    }
}
