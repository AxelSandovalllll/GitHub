/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.guilford.recursivecircles;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author rmw
 */
public class ControlPanel extends javax.swing.JPanel {

    // add an attribute for the color used in the background of the recursive
    // circles
    private Color circleBackgroundColor;
    // need an attribute for a RecursiveCirclePanel so that we can send messages to
    // it
    private RecursiveCirclePanel circlePanel;

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundChange = new javax.swing.JButton();
        initialSizeSelect = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        initialSizeList = new javax.swing.JList<>();

        backgroundChange.setText("Change Background Color");
        backgroundChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundChangeActionPerformed(evt);
            }
        });

        initialSizeSelect.setMajorTickSpacing(100);
        initialSizeSelect.setMaximum(800);
        initialSizeSelect.setMinimum(50);
        initialSizeSelect.setMinorTickSpacing(25);
        initialSizeSelect.setPaintLabels(true);
        initialSizeSelect.setPaintTicks(true);
        initialSizeSelect.setValue(200);
        initialSizeSelect.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                initialSizeSelectStateChanged(evt);
            }
        });

        initialSizeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Small", "Medium", "Large", "Window Size" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        initialSizeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        initialSizeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                initialSizeListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(initialSizeList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(backgroundChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(initialSizeSelect, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(initialSizeSelect, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backgroundChange))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)));
    }// </editor-fold>//GEN-END:initComponents

    // Setters and getters
    public Color getCircleBackgroundColor() {
        return circleBackgroundColor;
    }

    public void setCircleBackgroundColor(Color circleBackgroundColor) {
        this.circleBackgroundColor = circleBackgroundColor;
    }

    public RecursiveCirclePanel getCirclePanel() {
        return circlePanel;
    }

    public void setCirclePanel(RecursiveCirclePanel circlePanel) {
        this.circlePanel = circlePanel;
    }

    private void backgroundChangeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backgroundChangeActionPerformed
        // TODO add your handling code here:
        // Show a dialog with the color we want to use
        // When the user click OK, the method returns the selected color
        circleBackgroundColor = JColorChooser.showDialog(
                this, "Select a Color", circleBackgroundColor);
        // tell circlePanel to update its background color
        circlePanel.setBackground(circleBackgroundColor);
        circlePanel.repaint();
    }// GEN-LAST:event_backgroundChangeActionPerformed

    private void initialSizeSelectStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_initialSizeSelectStateChanged
        // TODO add your handling code here:
        // send a message to the circle panel to set the value of radius
        int newRadius = initialSizeSelect.getValue();
        circlePanel.setRadius(newRadius);
        // send another message to draw circles
        circlePanel.drawAllCircles();
    }// GEN-LAST:event_initialSizeSelectStateChanged

    private void initialSizeListValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_initialSizeListValueChanged
        // TODO add your handling code here:
        System.out.println(evt);
        String choice = initialSizeList.getSelectedValue();
        int size = 0;
        if (!evt.getValueIsAdjusting()) {
            switch (choice) {
                case "Small" ->
                    size = 50;
                case "Medium" ->
                    size = 150;
                case "Large" ->
                    size = 400;
                case "Window Size" ->
                    size = circlePanel.getWidth();
                default ->
                    size = 50;
            }
            circlePanel.setRadius(size);
            initialSizeSelect.setValue(size);
            circlePanel.drawAllCircles();
        }
    }// GEN-LAST:event_initialSizeListValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backgroundChange;
    private javax.swing.JList<String> initialSizeList;
    private javax.swing.JSlider initialSizeSelect;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}