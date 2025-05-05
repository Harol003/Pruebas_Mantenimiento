/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli;

// Importamos las librerias necesarias para la interfaz grafica
import javax.swing.*;
/**
 *
 * @author Harol
 */
public class PruebasPoli extends JFrame {

    // Declaramos los componentes de la interfaz
    private JTextField campoNombre;
    private JTextField campoEdad;
    private JButton botonProbar;
    private JLabel etiquetaResultado;

    // Constructor de la ventana
    public PruebasPoli() {
        // Titulo de la ventana
        setTitle("Simulacion de Pruebas - PruebasPoli");
        setSize(350, 250); // Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // Usamos posicionamiento absoluto

        // Creamos y colocamos los componentes

        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(20, 20, 80, 25);
        add(etiquetaNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(100, 20, 200, 25);
        add(campoNombre);

        JLabel etiquetaEdad = new JLabel("Edad:");
        etiquetaEdad.setBounds(20, 60, 80, 25);
        add(etiquetaEdad);

        campoEdad = new JTextField();
        campoEdad.setBounds(100, 60, 200, 25);
        add(campoEdad);

        botonProbar = new JButton("Probar Datos");
        botonProbar.setBounds(100, 100, 150, 30);
        add(botonProbar);

        etiquetaResultado = new JLabel("");
        etiquetaResultado.setBounds(20, 140, 300, 25);
        add(etiquetaResultado);

        // Agregamos la logica al boton
        botonProbar.addActionListener(e -> probarDatos());
    }

    // Metodo para simular la prueba de validacion de datos
    private void probarDatos() {
        String nombre = campoNombre.getText();
        String edadTexto = campoEdad.getText();

        // Validamos que el nombre no este vacio
        if (nombre.isEmpty()) {
            etiquetaResultado.setText("Error: el nombre esta vacio");
            return;
        }

        // Validamos que la edad sea un numero valido
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad < 0 || edad > 120) {
                etiquetaResultado.setText("Error: edad fuera de rango");
            } else {
                etiquetaResultado.setText("Prueba exitosa: datos correctos");
            }
        } catch (NumberFormatException ex) {
            etiquetaResultado.setText("Error: edad no es un numero valido");
        }
    }

    // Metodo principal para ejecutar la aplicacion
    public static void main(String[] args) {
        PruebasPoli ventana = new PruebasPoli();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}