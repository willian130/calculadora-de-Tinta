
package telaPrincipal;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
public class TelaFinal extends javax.swing.JFrame {
      public class GeradorPDF {
    /**
     * Gera um arquivo PDF no caminho especificado com o conteúdo fornecido.
     * @param caminhoCompleto O caminho completo para o novo arquivo PDF (ex: "/home/user/relatorio.pdf")
     * @param resultadosFormatados O texto com os resultados do cálculo (o que ia para o TXT)
     */
    public static void gerarRelatorio(String caminhoCompleto, String resultadosFormatados) throws Exception {
        
        // 1. Cria um novo objeto Documento
        Document documento = new Document();

        try {
            // 2. Cria o PdfWriter, ligando o documento ao FileOutputStream
            PdfWriter.getInstance(documento, new FileOutputStream(caminhoCompleto));

            // 3. Abre o documento para começar a escrever
            documento.open();

            // Adiciona um título ou cabeçalho
            documento.add(new Paragraph("--- RELATÓRIO DA CALCULADORA DE TINTA ---"));
            documento.add(new Paragraph("\n")); // Adiciona uma linha em branco

            // Adiciona o conteúdo do relatório
            String[] linhas = resultadosFormatados.split("\n");
            for (String linha : linhas) {
                // Adiciona a linha (como um parágrafo)
                documento.add(new Paragraph(linha)); 
            }
            
            // Opcional: Adicionar rodapé
            documento.add(new Paragraph("\n"));
            
            
            java.util.Locale localeBrasil = new java.util.Locale("pt", "BR");
            java.text.SimpleDateFormat formatador = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", localeBrasil);
            String dataFormatada = formatador.format(new java.util.Date());
            documento.add(new Paragraph("Gerado em: " + dataFormatada));
            // -------------------------------------------------------------

        } catch (Exception e) {
            // Lança a exceção para ser tratada pelo método que chamou (na classe Swing)
            throw new Exception("Erro interno do iText: " + e.getMessage());
        } finally {
            // 4. Sempre fecha o documento
            if (documento.isOpen()) {
                documento.close();
            }
        }
    }
}
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ExibirArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLableC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FUNDO = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // CORREÇÃO: Adicionei "/Imagens/" antes do nome do arquivo
                java.net.URL imgURL = getClass().getResource("/Imagens/bluePrint.png");

                if (imgURL != null) {
                    javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
                    g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
                } else {
                    System.err.println("Imagem não encontrada: verifique o nome!");
                }
            }
        };
        jPanel3 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // CORREÇÃO: Adicionei "/Imagens/" antes do nome do arquivo
                java.net.URL imgURL = getClass().getResource("/Imagens/bluePrint.jpg");

                if (imgURL != null) {
                    javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
                    g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
                } else {
                    System.err.println("Imagem não encontrada: verifique o nome!");
                }
            }
        };
        jLabel6 = new javax.swing.JLabel();
        baixar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 79, 163));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentHidden(evt);
            }
        });

        jButton1.setText("Recalcular");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fill (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lata selecionada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 200, 690, 200));

        ExibirArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExibirArea.setText("Para área informada de (variavel), a estimativa é de: ");
        getContentPane().add(ExibirArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 490, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("(variavel) litros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 310, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("para 2 demãos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 350, -1));

        jLableC.setBackground(new java.awt.Color(0, 0, 255));
        jLableC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLableC.setText("preço");
        getContentPane().add(jLableC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 310, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Valor por Litro;");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 475, -1, -1));

        FUNDO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FUNDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FUNDO.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 780, 520));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salvar");
        jLabel6.setToolTipText("");
        FUNDO.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 80, 80, 30));

        baixar.setBackground(new java.awt.Color(99, 145, 255));
        baixar.setForeground(new java.awt.Color(0, 51, 51));
        baixar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvamentoBlue.png"))); // NOI18N
        baixar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        baixar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baixar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        baixar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        baixar.addActionListener(this::baixarActionPerformed);
        FUNDO.add(baixar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        getContentPane().add(FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 800));

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

        // O iText (na classe GeradorPDF) usará essas quebras de linha (\n) para formatar o PDF.
        String conteudo = "======================================\n\n" +

        jLabel4.getText() + "\n" +
        ExibirArea.getText() + "\n" +
        jLabel2.getText() + "\n" +
        jLabel5.getText() + "\n" +
        "--------------------------------------\n" +
        jLableC.getText().replace("<html>", "").replace("<br>", "\n").replace("</html>", "") +
        "\n\nGerado automaticamente.";

        // 2. Abre a janela para escolher onde salvar
        javax.swing.JFileChooser arquivo = new javax.swing.JFileChooser();
        arquivo.setDialogTitle("Salvar Relatório PDF");

        // **************** MUDANÇA 1: Nome Padrão do Arquivo ****************
        // Sugere um nome padrão com a extensão .pdf
        arquivo.setSelectedFile(new java.io.File("Orçamento_Pintura.pdf"));

        int escolha = arquivo.showSaveDialog(this);

        // 3. Se o usuário clicou em "Salvar"
        if (escolha == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File file = arquivo.getSelectedFile();
            String caminhoCompleto = file.getAbsolutePath();

            // **************** MUDANÇA 2: Garante que termine com .pdf ****************
            if (!caminhoCompleto.toLowerCase().endsWith(".pdf")) {
                caminhoCompleto += ".pdf";
            }

            // **************** MUDANÇA 3: Substitui a escrita TXT pela chamada PDF ****************
            try {
                // Chama o método estático que você criou na classe GeradorPDF
                GeradorPDF.gerarRelatorio(caminhoCompleto, conteudo);

                // Exibe a mensagem de sucesso
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Relatório PDF salvo com sucesso em:\n" + caminhoCompleto,
                    "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                // (Opcional) Abre o arquivo PDF automaticamente para você ver
                java.awt.Desktop.getDesktop().open(new java.io.File(caminhoCompleto));

            } catch (Exception e) {
                // Trata exceções que possam ocorrer na geração do PDF
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Erro ao gerar o arquivo PDF: " + e.getMessage(),
                    "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
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
    private javax.swing.JPanel FUNDO;
    private javax.swing.JButton baixar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLableC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
