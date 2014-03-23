package compilador;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;

public class Interface extends javax.swing.JFrame {

    private File arquivo;

    public Interface() {
        initComponents();
      
        addAtalho(jButtonAbrir, KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
        addAtalho(jButtonColar, KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        addAtalho(jButtonCompilar, KeyStroke.getKeyStroke("F8"));
        addAtalho(jButtonCopiar, KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        addAtalho(jButtonEquipe, KeyStroke.getKeyStroke("F1"));
        addAtalho(jButtonGerarCodigo, KeyStroke.getKeyStroke("F9"));
        addAtalho(jButtonNovo, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
        addAtalho(jButtonRecortar, KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
        addAtalho(jButtonSalvar, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        this.jTextAreaEntrada.setBorder(new NumberedBorder());
    }
    
    private void addAtalho(JButton btn, KeyStroke evento){
            
        BotaoAction actBtnNovo = new BotaoAction(btn);
        
        ActionMap actionMap = this.rootPane.getActionMap();  
        actionMap.put(btn.getText(), actBtnNovo);
        
        InputMap imap = this.rootPane.getInputMap(JRootPane.WHEN_IN_FOCUSED_WINDOW);
        imap.put(evento, btn.getText()); 
    }

    private class BotaoAction extends AbstractAction  
    {  
        private JButton Botao;  
  
        public BotaoAction(JButton botao)  
        {  
            super(botao.getText(), botao.getIcon());  
            this.Botao = botao;  
        }  
  
        @Override  
        public void actionPerformed(ActionEvent e) {  
            Botao.getActionListeners()[0].actionPerformed(e);
        }  
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCopiar = new javax.swing.JButton();
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

        jButtonCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Copy-icon.png"))); // NOI18N
        jButtonCopiar.setText("copiar [ctrl-c]");
        jButtonCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCopiar.setMinimumSize(new java.awt.Dimension(0, 75));
        jButtonCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonCopiar);

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
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
            .addComponent(jPanelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_formKeyPressed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextAreaEntrada.setText("");
        jTextAreaSaida.setText("");
        jLabelStatus.setText("Não modificado");
        arquivo = null;
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        JFileChooser seletor = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos da Linguagem", "eli");
        seletor.setFileFilter(filter);
        int returnVal = seletor.showOpenDialog(this);
        arquivo = seletor.getSelectedFile();
        try {
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                BufferedReader leitor = new BufferedReader(new FileReader(arquivo.getAbsolutePath()));
                jLabelStatus.setText(arquivo.getAbsolutePath() + " Não modificado");
                jTextAreaEntrada.setText("");
                jTextAreaSaida.setText("");
                try {
                    while (leitor.ready()) {
                        jTextAreaEntrada.setText(jTextAreaEntrada.getText() + leitor.readLine() + "\n");
                    }
                    leitor.close();
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(arquivo == null){
            arquivo = new File("");
        } else {
            try {
                FileWriter escritorArquivo = new FileWriter(arquivo);
                BufferedWriter escritor = new BufferedWriter(escritorArquivo);
                String texto = jTextAreaEntrada.getText();
                String linhas[] = texto.split("\n");
                for (int i = 0; i < linhas.length; i++) {
                    escritor.write(linhas[i]);
                    escritor.newLine();
                }
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        jTextAreaSaida.setText("Gustavo Sabel \nEli Tonny de Souza");
    }//GEN-LAST:event_jButtonEquipeActionPerformed

    private void jButtonCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCopiarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonColar;
    private javax.swing.JButton jButtonCompilar;
    private javax.swing.JButton jButtonCopiar;
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
