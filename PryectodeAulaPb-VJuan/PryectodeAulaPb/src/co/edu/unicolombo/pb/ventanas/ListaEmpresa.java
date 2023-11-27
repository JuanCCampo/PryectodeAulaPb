/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;

/**
 *
 * @author LINA PEÑA
 */
public class ListaEmpresa extends JFrame {

    private DefaultListModel<String> model;
    private JList<String> jListEmpresas;

    public ListaEmpresa() {
        initComponents();
    }

    private void initComponents() {
        // Crear el modelo para la JList
        model = new DefaultListModel<>();
        
        // Agregar algunas empresas de ejemplo al modelo
         

        // Crear la JList con el modelo
        jListEmpresas = new JList<>(model);

        // Crear un botón para agregar empresas
        JButton btnAgregarEmpresa = new JButton("Agregar Empresa");
        btnAgregarEmpresa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simular la adición de una nueva empresa
                String nuevaEmpresa = JOptionPane.showInputDialog("Nombre de la nueva empresa:");
                if (nuevaEmpresa != null && !nuevaEmpresa.isEmpty()) {
                    model.addElement(nuevaEmpresa);
                }
            }
        });

        // Configuración del diseño
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jListEmpresas, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAgregarEmpresa)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jListEmpresas, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarEmpresa)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListaEmpresa().setVisible(true);
            }
        });
    }
} 