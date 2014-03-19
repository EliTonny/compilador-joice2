package compilador;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        jButtonNovo.setMnemonic(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK).getKeyCode());
        
        jButtonNovo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "evento");  
        jButtonNovo.getActionMap()
                .put("evento", new AbstractAction() {
           @Override  
           public void actionPerformed(ActionEvent e){  
              jButtonNovoActionPerformed(e);
           }  
        });  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonColar = new javax.swing.JButton();
        jButtonRecortar = new javax.swing.JButton();
        jButtonCompilar = new javax.swing.JButton();
        jButtonGerarCodigo = new javax.swing.JButton();
        jButtonEquipe = new javax.swing.JButton();
        jPanelEntrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEntrada = new javax.swing.JTextArea();
        jPanelSaida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jPanelStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanelBotoes.setLayout(new java.awt.GridLayout(1, 0));

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/File-add-icon.png"))); // NOI18N
        jButtonNovo.setText("novo [ctrl-n]");
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Folder-icon.png"))); // NOI18N
        jButtonAbrir.setText("abrir [ctrl-a]");
        jButtonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAbrir.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonAbrir);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Save-icon.png"))); // NOI18N
        jButtonSalvar.setText("salvar [ctrl-s]");
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonSalvar);

        jButtonColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Paste-icon.png"))); // NOI18N
        jButtonColar.setText("colar [ctrl-v]");
        jButtonColar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonColar.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonColar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonColar);

        jButtonRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cut-icon.png"))); // NOI18N
        jButtonRecortar.setText("recortar [ctrl-x]");
        jButtonRecortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRecortar.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonRecortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecortarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonRecortar);

        jButtonCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Actions-arrow-right-double-icon.png"))); // NOI18N
        jButtonCompilar.setText("compilar [F8]");
        jButtonCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCompilar.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompilarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCompilar);

        jButtonGerarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Wheels-icon.png"))); // NOI18N
        jButtonGerarCodigo.setText("gerar código [F9]");
        jButtonGerarCodigo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGerarCodigo.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonGerarCodigo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarCodigoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonGerarCodigo);

        jButtonEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Users-icon.png"))); // NOI18N
        jButtonEquipe.setText("equipe [F1]");
        jButtonEquipe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEquipe.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonEquipe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipeActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonEquipe);

        jPanelEntrada.setLayout(new java.awt.GridLayout(1, 0));

        jTextAreaEntrada.setColumns(20);
        jTextAreaEntrada.setRows(5);
        jTextAreaEntrada.setText("Soh tem q trocar esse cara por um componente com linhas\nacho q a Joice vai passar isso\n\\\\Gostei dis icones");
        jScrollPane1.setViewportView(jTextAreaEntrada);

        jPanelEntrada.add(jScrollPane1);

        jPanelSaida.setLayout(new java.awt.GridLayout(1, 0));

        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSaida);

        jPanelSaida.add(jScrollPane2);

        jLabelStatus.setText("Não modificado");

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
            .addComponent(jPanelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonColarActionPerformed

    private void jButtonRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRecortarActionPerformed

    private void jButtonCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompilarActionPerformed
        jTextAreaSaida.setText("compilação de programas ainda não foi implementada");
    }//GEN-LAST:event_jButtonCompilarActionPerformed

    private void jButtonGerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarCodigoActionPerformed
        jTextAreaSaida.setText("geração de código ainda não foi implementada");
    }//GEN-LAST:event_jButtonGerarCodigoActionPerformed

    private void jButtonEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipeActionPerformed
        jTextAreaSaida.setText("Gustavo Sabel \nEli Tony de Souza");
    }//GEN-LAST:event_jButtonEquipeActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonColar;
    private javax.swing.JButton jButtonCompilar;
    private javax.swing.JButton jButtonEquipe;
    private javax.swing.JButton jButtonGerarCodigo;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRecortar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelEntrada;
    private javax.swing.JPanel jPanelSaida;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaEntrada;
    private javax.swing.JTextArea jTextAreaSaida;
    // End of variables declaration//GEN-END:variables

}
