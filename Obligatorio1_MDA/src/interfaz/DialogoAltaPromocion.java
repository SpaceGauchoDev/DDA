package interfaz;
import utilidades.Consola;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import logica.Promocion;
public class DialogoAltaPromocion extends javax.swing.JDialog {
    private Promocion promocion;
    
    public DialogoAltaPromocion(java.awt.Frame parent, boolean modal, Promocion promocion) {
        super(parent, modal);
        initComponents();
        this.promocion = promocion;
        addEditListener_nombre();
        addEditListener_codigo();
        addEditListener_descuento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        codigoLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        codigoInput = new javax.swing.JTextField();
        nombreInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        descuentoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        descuentoInput = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Obligatorio 1 - MDA");
        setLocation(new java.awt.Point(760, 390));
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        codigoLabel.setText("Codigo:");

        nombreLabel.setText("Nombre:");

        codigoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoInputActionPerformed(evt);
            }
        });

        nombreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreInputActionPerformed(evt);
            }
        });

        jLabel4.setText("Datos de promocion");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        descuentoLabel.setText("Descuento:");

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        descuentoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentoInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(codigoLabel)
                                    .addGap(36, 36, 36)
                                    .addComponent(codigoInput))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(nombreLabel)
                                    .addGap(32, 32, 32)
                                    .addComponent(nombreInput))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(descuentoLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(descuentoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descuentoLabel)
                    .addComponent(descuentoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarButton)
                    .addComponent(cancelarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        Consola.logMsg("Aceptar clicked!");
        this.cancelar();
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        Consola.logMsg("Cancelar clicked!");
        this.cancelar();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void nombreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreInputActionPerformed
        //Consola.logMsg("Nombre edited!");
    }//GEN-LAST:event_nombreInputActionPerformed

    private void codigoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoInputActionPerformed
        //Consola.logMsg("Codigo edited!");
    }//GEN-LAST:event_codigoInputActionPerformed

    private void descuentoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentoInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField codigoInput;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField descuentoInput;
    private javax.swing.JLabel descuentoLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextArea outputTextArea;
    // End of variables declaration//GEN-END:variables

    private void cancelar() {
        this.dispose();
    }

    private void addEditListener_nombre(){
        nombreInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                onChangeNombre();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               onChangeNombre();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               onChangeNombre();
            } 
        });        
    }
    
    private void addEditListener_codigo(){
        codigoInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                onChangeCodigo();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               onChangeCodigo();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               onChangeCodigo();
            } 
        });        
    }
    
    
    private void addEditListener_descuento(){
        descuentoInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                onChangeDescuento();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               onChangeDescuento();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               onChangeDescuento();
            } 
        });        
    }    
   
    private void onChangeNombre(){
        Consola.logMsg("Nombre edited!");
    }
    
    private void onChangeCodigo(){
        Consola.logMsg("Codigo edited!");
    }
    
    private void onChangeDescuento(){
        Consola.logMsg("Descuento edited!");
    }    
    
}
