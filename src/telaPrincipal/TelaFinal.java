
package telaPrincipal;

public class TelaFinal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFinal.class.getName());

    
    public TelaFinal() {
        initComponents();
      
         // FORÇA UM TAMANHO MÍNIMO (Isso resolve o problema dela ficar minúscula)
         this.setSize(800, 600); 
         this.setExtendedState(MAXIMIZED_BOTH);
         this.setMinimumSize(new java.awt.Dimension(600, 400));
    
    this.setLocationRelativeTo(null);
    // this.setExtendedState(MAXIMIZED_BOTH); // Pode deixar maximizado se quiser
}

    TelaFinal(double areaTotalPintavel, double litrosNecessarios, double custoFinal) {
       
    }
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLableC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ExibirArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        baixar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(225, 145, 164));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentHidden(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/paint-bucket_588431_resized.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLableC.setBackground(new java.awt.Color(0, 0, 255));
        jLableC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLableC.setText("preço");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor por Litro;");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Lata selecionada");

        jButton1.setText("Recalcular");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("para 2 demãos");

        ExibirArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExibirArea.setText("Para área informada de (variavel), a estimativa é de: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("(variavel) litros");

        baixar.setText("Salvar");
        baixar.addActionListener(this::baixarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLableC, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExibirArea, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(baixar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(baixar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(ExibirArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jLableC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(109, 109, 109)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void atualizarResultados(double area, double litros, double latas, double custoFinal, double precoPorLitro,double volLata,String sugestao) {
    // Verifica se as variáveis (ExibirArea, etc) estão com o nome certo no seu Design
    ExibirArea.setText("Área Total: " + String.format("%.2f", area) + " m²");
    jLabel2.setText("Litros Necessários: " + String.format("%.2f", litros) + " L");
    jLabel5.setText("Latas Necessárias: " + String.format("%.0f", latas)); // Usando jLabel5 para latas
    jLableC.setText("Custo Estimado: R$ " + String.format("%.2f", custoFinal));
    jLabel3.setText("Custo Estimado por Litro: R$ " + String.format("%.2f", precoPorLitro));
    jLabel4.setText("Lata selecionada: " + volLata + "L");
    //dica.setText("Lata selecionada: " + sugestao);
    
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        TelaPrincipal principal = new TelaPrincipal();
    
    principal.setLocation(this.getLocation());
    principal.setVisible(true);
        
        this.dispose();
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void baixarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixarActionPerformed
       
        // 1. Prepara o conteúdo do texto (Pega o que está escrito nos Labels)
    String conteudo = "=== RELATÓRIO CALCULADORA DE TINTA ===\n\n" +
                      ExibirArea.getText() + "\n" +
                      jLabel2.getText() + "\n" +
                      jLabel5.getText() + "\n" +
                      "--------------------------------------\n" +
                      jLableC.getText().replace("<html>", "").replace("<br>", "\n").replace("</html>", "") + // Limpa o HTML do preço
                      "\n\nGerado automaticamente.";

    // 2. Abre a janela para escolher onde salvar
    javax.swing.JFileChooser arquivo = new javax.swing.JFileChooser();
    arquivo.setDialogTitle("Salvar Relatório");
    
    // Sugere um nome padrão
    arquivo.setSelectedFile(new java.io.File("Orcamento_Pintura.txt"));

    int escolha = arquivo.showSaveDialog(this);

    // 3. Se o usuário clicou em "Salvar"
    if (escolha == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File file = arquivo.getSelectedFile();
        
        // Garante que termine com .txt
        if (!file.getName().toLowerCase().endsWith(".txt")) {
            file = new java.io.File(file.getParentFile(), file.getName() + ".txt");
        }

        // 4. Escreve o arquivo no computador
        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
            writer.write(conteudo);
            writer.close(); // Fecha o arquivo
            
            javax.swing.JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso em:\n" + file.getAbsolutePath());
            
            // (Opcional) Abre o arquivo automaticamente para você ver
            java.awt.Desktop.getDesktop().open(file);
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + e.getMessage());
        }
    }

        
        
        
        
        
    }//GEN-LAST:event_baixarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            // FlatDarkLaf = Escuro (Dark Mode)
            // FlatLightLaf = Claro (Light Mode)
            // FlatIntelliJLaf = Estilo IntelliJ
            // FlatDarculaLaf = Estilo Darcula
            com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme.setup();
    } catch( Exception ex ) {
        System.err.println( "Erro no tema. Usando padrão." );
    }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaFinal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExibirArea;
    private javax.swing.JButton baixar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLableC;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
