/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploBotones extends JFrame {
    private JButton btnAceptar;
    private JButton btnCancelar;

    public EjemploBotones() {
        // Configuración de la ventana
        setTitle("Ejemplo de Botones");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creación de los botones
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        // Configuración de la posición y tamaño de los botones
        btnAceptar.setBounds(50, 50, 100, 30);
        btnCancelar.setBounds(160, 50, 100, 30);

        // Agregar ActionListener a btnAceptar
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón Aceptar presionado.");
                // Coloca aquí el código que deseas que se ejecute cuando se presione el botón Aceptar
            }
        });

        // Agregar ActionListener a btnCancelar
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón Cancelar presionado.");
                // Coloca aquí el código que deseas que se ejecute cuando se presione el botón Cancelar
            }
        });

        // Agregar los botones a la ventana
        add(btnAceptar);
        add(btnCancelar);

        // Configuración del diseño de la ventana
        setLayout(null);
    }

    public static void main(String[] args) {
        // Creación y visualización de la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemploBotones().setVisible(true);
            }
        });
    }
}

