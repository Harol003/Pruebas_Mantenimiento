/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harol
 */
public class PruebasPoli6 extends JFrame {

    private JTable tablaUsuarios;
    private JButton botonEliminar;
    private DefaultTableModel modeloTabla;

    public PruebasPoli6() {
        setTitle("Mantenimiento de Usuarios - PruebasPoli6");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana

        // Datos de prueba para la tabla
        String[] columnas = {"ID", "Nombre", "Correo"};
        String[][] datos = {
            {"1", "Juan Perez", "juanp@correo.com"},
            {"2", "Maria Lopez", "marial@correo.com"},
            {"3", "Carlos Gomez", "carlosg@correo.com"}
        };

        modeloTabla = new DefaultTableModel(datos, columnas);
        tablaUsuarios = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        scrollPane.setBounds(30, 30, 420, 150);
        add(scrollPane);

        botonEliminar = new JButton("Eliminar Usuario");
        botonEliminar.setBounds(160, 200, 160, 30);
        add(botonEliminar);

        botonEliminar.addActionListener(e -> eliminarUsuario());
    }

    // Metodo para eliminar el usuario seleccionado
    private void eliminarUsuario() {
        int filaSeleccionada = tablaUsuarios.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            modeloTabla.removeRow(filaSeleccionada); // Eliminar fila seleccionada
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un usuario para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Metodo principal
    public static void main(String[] args) {
        PruebasPoli6 ventana = new PruebasPoli6();
        ventana.setVisible(true);
    }
}