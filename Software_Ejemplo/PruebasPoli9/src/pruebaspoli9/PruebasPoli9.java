/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaspoli9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harol
 */
public class PruebasPoli9 extends JFrame {

    private JTable tablaTareas;
    private JButton botonAgregar, botonMarcar;
    private JTextField campoTarea;
    private DefaultTableModel modeloTabla;

    public PruebasPoli9() {
        setTitle("Gestión de Tareas - PruebasPoli9");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centra la ventana

        // Columnas para la tabla
        String[] columnas = {"Tarea", "Estado"};
        modeloTabla = new DefaultTableModel(null, columnas);
        tablaTareas = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaTareas);
        scrollPane.setBounds(30, 30, 420, 150);
        add(scrollPane);

        // Campo para ingresar la tarea
        JLabel etiquetaTarea = new JLabel("Nueva Tarea:");
        etiquetaTarea.setBounds(30, 190, 100, 25);
        add(etiquetaTarea);

        campoTarea = new JTextField();
        campoTarea.setBounds(130, 190, 150, 25);
        add(campoTarea);

        // Botón para agregar una nueva tarea
        botonAgregar = new JButton("Agregar Tarea");
        botonAgregar.setBounds(290, 190, 150, 30);
        add(botonAgregar);

        // Botón para marcar la tarea como completada
        botonMarcar = new JButton("Marcar como Completada");
        botonMarcar.setBounds(30, 220, 200, 30);
        add(botonMarcar);

        // Acción para agregar tarea
        botonAgregar.addActionListener(e -> agregarTarea());

        // Acción para marcar tarea como completada
        botonMarcar.addActionListener(e -> marcarTareaCompletada());
    }

    // Método para agregar una tarea a la tabla
    private void agregarTarea() {
        String tarea = campoTarea.getText();

        if (tarea.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de tarea no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Agregar tarea con estado "Pendiente"
            String[] nuevaTarea = {tarea, "Pendiente"};
            modeloTabla.addRow(nuevaTarea);
            campoTarea.setText(""); // Limpiar el campo de texto
        }
    }

    // Método para marcar la tarea seleccionada como completada
    private void marcarTareaCompletada() {
        int filaSeleccionada = tablaTareas.getSelectedRow();

        // Verificar si hay una tarea seleccionada
        if (filaSeleccionada != -1) {
            modeloTabla.setValueAt("Completada", filaSeleccionada, 1); // Actualizar el estado a "Completada"
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una tarea para marcar como completada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método principal
    public static void main(String[] args) {
        PruebasPoli9 ventana = new PruebasPoli9();
        ventana.setVisible(true);
    }
}