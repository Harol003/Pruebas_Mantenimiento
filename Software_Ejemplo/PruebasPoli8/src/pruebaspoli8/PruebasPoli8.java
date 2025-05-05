/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harol
 */
public class PruebasPoli8 extends JFrame {

    private JTable tablaClientes;
    private JButton botonAgregar;
    private JTextField campoNombre, campoCorreo, campoTelefono;
    private DefaultTableModel modeloTabla;

    public PruebasPoli8() {
        setTitle("Registro de Clientes - PruebasPoli8");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana

        // Definir columnas para la tabla
        String[] columnas = {"Nombre", "Correo", "Teléfono"};
        modeloTabla = new DefaultTableModel(null, columnas);
        tablaClientes = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaClientes);
        scrollPane.setBounds(30, 30, 420, 150);
        add(scrollPane);

        // Campos para ingresar datos del cliente
        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(30, 190, 100, 25);
        add(etiquetaNombre);

        campoNombre = new JTextField();
        campoNombre.setBounds(130, 190, 150, 25);
        add(campoNombre);

        JLabel etiquetaCorreo = new JLabel("Correo:");
        etiquetaCorreo.setBounds(30, 220, 100, 25);
        add(etiquetaCorreo);

        campoCorreo = new JTextField();
        campoCorreo.setBounds(130, 220, 150, 25);
        add(campoCorreo);

        JLabel etiquetaTelefono = new JLabel("Teléfono:");
        etiquetaTelefono.setBounds(30, 250, 100, 25);
        add(etiquetaTelefono);

        campoTelefono = new JTextField();
        campoTelefono.setBounds(130, 250, 150, 25);
        add(campoTelefono);

        // Botón para agregar cliente
        botonAgregar = new JButton("Agregar Cliente");
        botonAgregar.setBounds(290, 220, 150, 30);
        add(botonAgregar);

        // Acción del botón
        botonAgregar.addActionListener(e -> agregarCliente());
    }

    // Método para agregar un cliente a la tabla
    private void agregarCliente() {
        String nombre = campoNombre.getText();
        String correo = campoCorreo.getText();
        String telefono = campoTelefono.getText();

        // Verificar que los campos no estén vacíos
        if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Agregar los datos a la tabla
            String[] nuevoCliente = {nombre, correo, telefono};
            modeloTabla.addRow(nuevoCliente);
            
            // Limpiar los campos después de agregar
            campoNombre.setText("");
            campoCorreo.setText("");
            campoTelefono.setText("");
        }
    }

    // Método principal
    public static void main(String[] args) {
        PruebasPoli8 ventana = new PruebasPoli8();
        ventana.setVisible(true);
    }
}