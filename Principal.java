

package Gui;

import LogicaNegocio.Convertir;
import java.awt.Color;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Principal extends javax.swing.JFrame {
private int baseNumero=2;// esta es la base del numero ingrsado por teclado

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtABinario = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JScrollPane();
        jtACecimal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAOctal = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtAHexaDecimal = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jtFNumConvertir = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base numerica");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(188, 204, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conversion "));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Binario :");
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentAdded(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 170, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Decimal : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Octal :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hexadecimal :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 100, 22);

        jtABinario.setBackground(new java.awt.Color(152, 250, 177));
        jtABinario.setColumns(20);
        jtABinario.setRows(5);
        jScrollPane1.setViewportView(jtABinario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 20, 520, 40);

        jtACecimal.setEditable(false);
        jtACecimal.setBackground(new java.awt.Color(203, 252, 203));
        jtACecimal.setColumns(20);
        jtACecimal.setRows(5);
        jTextField2.setViewportView(jtACecimal);

        jPanel1.add(jTextField2);
        jTextField2.setBounds(120, 70, 520, 40);

        jtAOctal.setEditable(false);
        jtAOctal.setBackground(new java.awt.Color(203, 252, 203));
        jtAOctal.setColumns(20);
        jtAOctal.setRows(5);
        jScrollPane2.setViewportView(jtAOctal);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(120, 130, 520, 40);

        jtAHexaDecimal.setEditable(false);
        jtAHexaDecimal.setBackground(new java.awt.Color(203, 252, 203));
        jtAHexaDecimal.setColumns(20);
        jtAHexaDecimal.setRows(5);
        jScrollPane3.setViewportView(jtAHexaDecimal);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(120, 180, 520, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 120, 650, 300);

        jPanel2.setBackground(new java.awt.Color(188, 204, 250));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Binario", "Decimal", "Octal", "Hexadecimal" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(540, 40, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Numero a convertir :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 48, 160, 17);

        jtFNumConvertir.setBackground(new java.awt.Color(216, 241, 255));
        jtFNumConvertir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtFNumConvertirFocusGained(evt);
            }
        });
        jtFNumConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFNumConvertirActionPerformed(evt);
            }
        });
        jtFNumConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFNumConvertirKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtFNumConvertirKeyTyped(evt);
            }
        });
        jPanel2.add(jtFNumConvertir);
        jtFNumConvertir.setBounds(170, 40, 360, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 650, 100);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 430, 200, 50);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 430, 220, 50);

        jLabel6.setBackground(new java.awt.Color(236, 250, 247));
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 680, 530);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Convertir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Limpiar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(693, 592));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
            if(!jtFNumConvertir.getText().isEmpty()){
                    Convertir convertir = new Convertir();
                    if(baseNumero == 10){
                       convertir.convertirFormatoBiDeOcHex(new BigInteger(jtFNumConvertir.getText()), new BigInteger("2"),jtABinario);
                       convertir.convertirFormatoBiDeOcHex(new BigInteger(jtFNumConvertir.getText()), new BigInteger("8"),jtAOctal);
                       convertir.convertirFormatoBiDeOcHex(new BigInteger(jtFNumConvertir.getText()), new BigInteger("16"),jtAHexaDecimal);
                       jtACecimal.setText(jtFNumConvertir.getText());
                   }
                    else{
                        convertir.pasarNumeroLetraAentero(jtFNumConvertir.getText());
                        convertir.convertirAdecimal(new BigInteger(""+baseNumero));
                        convertir.convertirFormatoBiDeOcHex(convertir.getNumeroDecimal(), new BigInteger("2"),jtABinario);
                        convertir.convertirFormatoBiDeOcHex(convertir.getNumeroDecimal(), new BigInteger("8"),jtAOctal);
                        convertir.convertirFormatoBiDeOcHex(convertir.getNumeroDecimal(), new BigInteger("16"),jtAHexaDecimal);
                        jtACecimal.setText(""+convertir.getNumeroDecimal());

                    }
            }else{
                jLabel7.setText("Debe ingresar un Numero...");
                jLabel7.setBackground(new Color(255,197,197));
            }
       }catch(Exception e){
           jLabel7.setText("Formato Incorrecto...");
           jLabel7.setBackground(new Color(255,197,197));
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jtFNumConvertir.setText(null);
       jtABinario.setText(null);
       jtACecimal.setText(null);
       jtAHexaDecimal.setText(null);
       jtAOctal.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtFNumConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFNumConvertirKeyTyped
       char c = evt.getKeyChar();
       c = Character.toUpperCase(c); // CONVERTIR EN MAYUSCULA 
        
        if(jComboBox1.getSelectedIndex()==0){
          if(c!='1' && c!='0') evt.consume();
       }
        else if(jComboBox1.getSelectedIndex() == 1){
            if(!Character.isDigit(c)) evt.consume();
        }
        else if(jComboBox1.getSelectedIndex()== 2){
            int d = c-48;
            System.out.println(""+d);
            System.out.println("");
            if(!Character.isDigit(c) ||  c >'7'/*codigo ascii*/) evt.consume();
        }
        else {
            if(!Character.isDigit(c)){
             if(!letraAceptada(c)) evt.consume();
            }
        }
    }//GEN-LAST:event_jtFNumConvertirKeyTyped

    private void jLabel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     System.exit(0);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jButton1ActionPerformed(evt);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jButton2ActionPerformed(evt); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jtFNumConvertirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtFNumConvertirFocusGained
       jtFNumConvertir.selectAll();
       jLabel7.setText(null);
       jLabel7.setBackground(new Color(240,240,240));// TODO add your handling code here:
    }//GEN-LAST:event_jtFNumConvertirFocusGained

    private void jtFNumConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFNumConvertirActionPerformed
       jLabel7.setText(null);
    }//GEN-LAST:event_jtFNumConvertirActionPerformed

    private void jtFNumConvertirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFNumConvertirKeyReleased
        jtFNumConvertir.setText(jtFNumConvertir.getText().toUpperCase()); // TODO add your handling code here:
    }//GEN-LAST:event_jtFNumConvertirKeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       if(jComboBox1.getSelectedIndex() == 0 ) {//binario
            baseNumero=2;
            jtABinario.setBackground(new Color(152,250,177));
            jtACecimal.setBackground(new Color(203,252,203));
            jtAOctal.setBackground(new Color(203,252,203));
            jtAHexaDecimal.setBackground(new Color(203,252,203));
            jtFNumConvertir.setText(null);
       }
       else if(jComboBox1.getSelectedIndex()==1) {//decimal
            baseNumero = 10;
            jtABinario.setBackground(new Color(203,252,203));
            jtACecimal.setBackground(new Color(152,250,177));
            jtAOctal.setBackground(new Color(203,252,203));
            jtAHexaDecimal.setBackground(new Color(203,252,203));
            jtFNumConvertir.setText(null);
       }
       else if(jComboBox1.getSelectedIndex()==2) {// OCTAL
            baseNumero = 8;
            jtABinario.setBackground(new Color(203,252,203));
            jtACecimal.setBackground(new Color(203,252,203));
            jtAOctal.setBackground(new Color(152,250,177));
            jtAHexaDecimal.setBackground(new Color(203,252,203));
            jtFNumConvertir.setText(null);
       }
       else if(jComboBox1.getSelectedIndex()==3) { //hexadecimal
            baseNumero = 16;
            jtABinario.setBackground(new Color(203,252,203));
            jtACecimal.setBackground(new Color(203,252,203));
            jtAOctal.setBackground(new Color(203,252,203));
            jtAHexaDecimal.setBackground(new Color(152,250,177));
            jtFNumConvertir.setText(null);
       }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public boolean letraAceptada(char c){
        if(c < 'A' ||  c>'F') return false;
        else return true;
    }
    public boolean verificarFormato(String cad){
        if(jComboBox1.getSelectedIndex() == 0 )
            if(cad.matches("[0-1]+)")){
                return true;
            }
    return false;
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JScrollPane jTextField2;
    private javax.swing.JTextArea jtABinario;
    private javax.swing.JTextArea jtACecimal;
    private javax.swing.JTextArea jtAHexaDecimal;
    private javax.swing.JTextArea jtAOctal;
    private javax.swing.JTextField jtFNumConvertir;
    // End of variables declaration//GEN-END:variables
}
