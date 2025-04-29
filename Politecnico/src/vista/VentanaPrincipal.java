/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import javax.swing.*;
import java.awt.*;
import modelo.Metrica;

public class VentanaPrincipal extends JFrame {
    public JButton btn10, btn100, btn1000;
    public JTextArea areaResultado;

    public VentanaPrincipal() {
        setTitle("Simulador de Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centra la ventana

        getContentPane().setBackground(new Color(200, 220, 255)); // Fondo azul claro

        JLabel mensaje = new JLabel("Politécnico Internacional - Asignatura: Pruebas y Mantenimiento de Software", JLabel.CENTER);
        mensaje.setForeground(Color.DARK_GRAY);
        mensaje.setFont(new Font("Arial", Font.BOLD, 14));
        add(mensaje, BorderLayout.SOUTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(220, 230, 240)); // Color gris claro azulado
        btn10 = new JButton("Simular 10");
        btn100 = new JButton("Simular 100");
        btn1000 = new JButton("Simular 1000");
        panelBotones.add(btn10);
        panelBotones.add(btn100);
        panelBotones.add(btn1000);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setBackground(Color.WHITE);
        areaResultado.setForeground(Color.BLACK);

        add(panelBotones, BorderLayout.NORTH);
        add(new JScrollPane(areaResultado), BorderLayout.CENTER);
    }

    public void mostrarResultado(Metrica m, int usuarios) {
        areaResultado.setText("Usuarios simulados: " + usuarios +
                "\nTiempo total: " + m.tiempoTotal + " ms" +
                "\nMemoria usada: " + m.memoriaUsada + " MB" +
                "\nAcciones realizadas: " + m.accionesRealizadas);
    }
}
