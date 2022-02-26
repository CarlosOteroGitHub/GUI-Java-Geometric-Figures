package figgeometrícas;

import javax.swing.JOptionPane;

public class modeloCuadrado extends javax.swing.JFrame {

    public modeloCuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        limpiar = new javax.swing.JButton();
        calculaAreaRectangulo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TextField6 = new javax.swing.JTextField();
        aumentarTamaño = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TextField5 = new javax.swing.JTextField();
        TextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextField8 = new javax.swing.JTextField();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        trasladarCuadrado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dibujaCuadrado = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        calculaAreaRectangulo.setText("Calcula el Area del Cuadrado");
        calculaAreaRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaAreaRectanguloActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel8.setText("             Ingresa el Lado 1:");

        aumentarTamaño.setText("Aumentar Tamaño");
        aumentarTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarTamañoActionPerformed(evt);
            }
        });

        jLabel11.setText("             Ingresa el Lado 2:");

        jLabel12.setText("             El Area es de:");

        trasladarCuadrado.setText("Trasladar Cuadrado");
        trasladarCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasladarCuadradoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 32)); // NOI18N
        jLabel1.setText("Cuadrado.");

        jLabel13.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 18)); // NOI18N
        jLabel13.setText("Otero Ramírez Carlos.");

        dibujaCuadrado.setText("Dibuja un Cuadrado");
        dibujaCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibujaCuadradoActionPerformed(evt);
            }
        });

        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("          X");

        jLabel3.setText("          Y");

        jLabel4.setText("      Lado 1");

        jLabel5.setText("     Lado 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(trasladarCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dibujaCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(aumentarTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextField4)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TextField2)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(calculaAreaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextField6)
                                        .addComponent(TextField7)
                                        .addComponent(TextField8)
                                        .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dibujaCuadrado)
                            .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trasladarCuadrado)
                            .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aumentarTamaño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(calculaAreaRectangulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(TextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiar)
                            .addComponent(salir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    
    //Aqui mandamos llamar el objeto de la Clase Cuadrado , lo que nos da acceso a todos los metodos. 
    Cuadrado cua = new Cuadrado(); 
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    //Metodo heredado para que la figura se dibuje en el Panel. Tomando consideración en asignar el nombre del metodo en el Panel, y los valores a los campos de texto que en este caso serian: (base-TextField1 = Integer.parseInt(TextField1.getText())), (altura-TextField2 = Integer.parseInt(TextField2.getText())); y esto aplica tambien en algunas variables de los demás metodos de abajo como podemos observar.
    public void dibujar (FigGeometrícas p) {
        p.dibujar(Panel.getGraphics(), Integer.parseInt(TextField1.getText()), Integer.parseInt(TextField2.getText()));
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    //Metodo heredado para trasladar la figura en el Panel. 
    public void trasladar (FigGeometrícas g) {
        g.trasladar(Panel.getGraphics(), Integer.parseInt(TextField3.getText()), Integer.parseInt(TextField4.getText())); 
    }
    

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    //Metodo heredado para aumentar el tamaño de la figura en el Panel. (Incompleto).
    public void aumentarTamaño (FigGeometrícas f) {
        f.aumentarTamaño(Panel.getGraphics(),  Integer.parseInt(TextField5.getText())); 
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        //Estas configuraciones se ejecutan una vez que el usuario presiona el boton limpiar, y a la vez se borran completamente todos  los campos de texto llenos.    
        Panel.repaint();
        TextField1.setText("");
        TextField2.setText("");
        TextField3.setText("");
        TextField4.setText("");
        TextField5.setText("");
        TextField6.setText("");
        TextField7.setText("");
        TextField8.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void calculaAreaRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaAreaRectanguloActionPerformed
    //Empezamos con una estructura de control la cual encierra todo el procedimiento de este boton, que se refiere a que si no se ingresaron valores en el "TextField6" y "TextField7" aparecera un mensaje indicandole al usuario que lo haga, para que el procedimiento del programa pueda continuar correctamente.
    if(!TextField6.getText().isEmpty() && !TextField7.getText().isEmpty()) {
        
        float base, altura, res;

        base= Float.parseFloat(TextField6.getText());
        altura= Float.parseFloat(TextField7.getText());
        res=base*altura;
        TextField8.setText("Area de: " + res + " u2");
        
    }else{
        
        //Aqui ponemos una excepción diciendo que si no se ingreso ningun valor, un mensaje de dialogo (JOptionPane) nos dira que ingresemos los valores para que el sistema los pueda procesar.    
        JOptionPane.showMessageDialog(this, "Ingrese los Lados de la Figura Por Favor.");
    }
    }//GEN-LAST:event_calculaAreaRectanguloActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_salirActionPerformed

    private void aumentarTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarTamañoActionPerformed
    //Empezamos con una estructura de control la cual encierra todo el procedimiento de este boton, que se refiere a que si no se ingresaron valores en el "TextField1", "TextField2", y "TextField5" aparecera un mensaje indicandole al usuario que lo haga, para que el procedimiento del programa pueda continuar correctamente. 
    if(!TextField1.getText().isEmpty() && !TextField2.getText().isEmpty() && !TextField5.getText().isEmpty()) {
        
        Panel.paint(Panel.getGraphics());
        aumentarTamaño(cua);
        
    }else{
        
        //Aqui ponemos una excepción diciendo que si no se ingreso ningun valor, un mensaje de dialogo (JOptionPane) nos dira que ingresemos los valores para que el sistema los pueda procesar.    
        JOptionPane.showMessageDialog(this, "Asegurese de que la Figura este Dibujada, además de Ingresar el Valor para Aumentar el Cuadrado de Tamaño.");
    }
    }//GEN-LAST:event_aumentarTamañoActionPerformed

    private void trasladarCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasladarCuadradoActionPerformed
    //Empezamos con una estructura de control la cual encierra todo el procedimiento de este boton, que se refiere a que si no se ingresaron valores en el "TextField1", "TextField2", "TextField3" y "TextField4" aparecera un mensaje indicandole al usuario que lo haga, para que el procedimiento del programa pueda continuar correctamente.      
    if(!TextField1.getText().isEmpty() && !TextField2.getText().isEmpty() && !TextField3.getText().isEmpty() && !TextField4.getText().isEmpty()) {
        Panel.paint(Panel.getGraphics());
        trasladar(cua);
        
    }else{
        
        //Aqui ponemos una excepción diciendo que si no se ingreso ningun valor, un mensaje de dialogo (JOptionPane) nos dira que ingresemos los valores para que el sistema los pueda procesar.    
        JOptionPane.showMessageDialog(this, "Asegurese de que la Figura este Dibujada, además de Ingresar las Cordenadas en X y Y.");
    }
    }//GEN-LAST:event_trasladarCuadradoActionPerformed

    private void dibujaCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibujaCuadradoActionPerformed
    //Empezamos con una estructura de control la cual encierra todo el procedimiento de este boton, que se refiere a que si no se ingresaron valores en el "TextField1" y "TextField2", aparecera un mensaje indicandole al usuario que lo haga, para que el procedimiento del programa pueda continuar correctamente.
    if(!TextField1.getText().isEmpty() && !TextField2.getText().isEmpty()) {
        
        Panel.paint(Panel.getGraphics());
        dibujar(cua);
        
    }else{
        
        //Aqui ponemos una excepción diciendo que si no se ingreso ningun valor, un mensaje de dialogo (JOptionPane) nos dira que ingresemos los valores para que el sistema los pueda procesar.    
        JOptionPane.showMessageDialog(this, "Ingrese los Lados Paralelos del Cuadrado para Dibujar la Figura Por Favor.");
    }
    }//GEN-LAST:event_dibujaCuadradoActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(modeloCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modeloCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modeloCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modeloCuadrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modeloCuadrado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JTextField TextField8;
    private javax.swing.JButton aumentarTamaño;
    private javax.swing.JButton calculaAreaRectangulo;
    private javax.swing.JButton dibujaCuadrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton salir;
    private javax.swing.JButton trasladarCuadrado;
    // End of variables declaration//GEN-END:variables
}

/*

Programa relacionado a la creación de la figura geometríca del cuadrado, el cual nos permite ingresar las medidas para sus lados, calcular el area, girar la figura y cambiar de posicion a la figura en el plano "X" y "Y".

*/