/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico;

import vista.VentanaPrincipal;
import modelo.Simulador;
import controlador.ControladorSimulacion;
/**
 *
 * @author Harol
 */
public class Politecnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            VentanaPrincipal vista = new VentanaPrincipal();
            Simulador simulador = new Simulador();
            new ControladorSimulacion(vista, simulador);
            vista.setVisible(true);
        });
    }
    
}
