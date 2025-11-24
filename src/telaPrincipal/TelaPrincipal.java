package telaPrincipal;

import java.awt.Dimension;
import java.awt.Toolkit;
public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());
    private double alturaParede = 0.0;
    private double paredeLargura = 0.0;
    private double tetoCompri = 0.0;
    private double tetoLargura = 0.0;
    private double rendimento = 0.0;
    private double precoTinta = 0.0;
    
    
    public TelaPrincipal() {
        initComponents();
       this.setExtendedState(MAXIMIZED_BOTH);
     setLocationRelativeTo(null);
     this.setLocationRelativeTo(null);
 
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        // 2. Pega o tamanho da sua janela atual
        int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        
        // 3. Faz a matemática para achar o centro
        int x = (screenSize.width - windowWidth) / 2;
        int y = (screenSize.height - windowHeight) / 2;
        
        //4. Move a janela para lá
        this.setLocation(x, y);
    
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo1 = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        ParedeAltura = new javax.swing.JTextField();
        ParedeLargura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Area_larg = new javax.swing.JTextField();
        Area_Alt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Teto_compri = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Teto_Larg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        Rendimento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ValorTinta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("telabackgraoud");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        titulo1.setText("Preencha os campos abaixo para calcular");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        superficie.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        superficie.setText("Paredes");
        superficie.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(superficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        ParedeAltura.setActionCommand("<Not Set>");
        ParedeAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ParedeAltura.setMaximumSize(new java.awt.Dimension(0, 0));
        ParedeAltura.setMinimumSize(new java.awt.Dimension(0, 0));
        ParedeAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParedeAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(ParedeAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 164, -1));

        ParedeLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParedeLarguraActionPerformed(evt);
            }
        });
        getContentPane().add(ParedeLargura, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 164, -1));

        jLabel3.setText("Altura (digite em metros)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel4.setText("Largura");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Teto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        Area_larg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Area_larg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Area_largActionPerformed(evt);
            }
        });
        getContentPane().add(Area_larg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 164, -1));

        Area_Alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Area_AltActionPerformed(evt);
            }
        });
        getContentPane().add(Area_Alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 164, -1));

        jLabel6.setText("Comprimento(Opcional)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel7.setText("Largura(Opcional)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Área sem pintar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        Teto_compri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teto_compriActionPerformed(evt);
            }
        });
        getContentPane().add(Teto_compri, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 164, -1));

        jLabel9.setText("Altura");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        Teto_Larg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teto_LargActionPerformed(evt);
            }
        });
        getContentPane().add(Teto_Larg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 164, -1));

        jLabel10.setText("Largura");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        Calcular.setText("Calcular");
        Calcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        Rendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendimentoActionPerformed(evt);
            }
        });
        getContentPane().add(Rendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 160, 20));

        jLabel1.setText("Rendimento da tinta (m²/L)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, -1, 20));

        ValorTinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTintaActionPerformed(evt);
            }
        });
        getContentPane().add(ValorTinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 170, -1));

        jLabel2.setText("Preço da Tinta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel11.setText("Quantidade de Litros");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lata 18L", "Lata 3,6L", "Lata 900L" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ParedeAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParedeAlturaActionPerformed

        
        try {
            String alturaEmTexto = ParedeAltura.getText();
            alturaEmTexto = alturaEmTexto.replace(",", ".");
            this.alturaParede = Double.parseDouble(alturaEmTexto);
            System.out.println("Perede Altura armazenada: " + this.alturaParede);
             ParedeLargura.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números na altura!");
        }
    }//GEN-LAST:event_ParedeAlturaActionPerformed

    private void Area_largActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Area_largActionPerformed
        ValorTinta.requestFocus();
    }//GEN-LAST:event_Area_largActionPerformed

    private void Area_AltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Area_AltActionPerformed
     Area_larg.requestFocus();
    }//GEN-LAST:event_Area_AltActionPerformed

    private void Teto_compriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teto_compriActionPerformed
        try {
            String TetoComprimentoEmTexto = Teto_compri.getText();
            TetoComprimentoEmTexto = TetoComprimentoEmTexto.replace(",", ".");
           
            this.tetoCompri = Double.parseDouble(TetoComprimentoEmTexto);
            
            // serve pra diagnosticar se a largura foi armazenada, fellas
            System.out.println("Teto Comprimento armazenada: " + this.tetoCompri);
            Teto_Larg.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números na Comprimento!");
        }
    }//GEN-LAST:event_Teto_compriActionPerformed

    private void Teto_LargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teto_LargActionPerformed
        try {
            String larguraEmTexto = Teto_Larg.getText();
            larguraEmTexto = larguraEmTexto.replace(",", ".");
            this.tetoLargura = Double.parseDouble(larguraEmTexto);
            
            // serve pra diagnosticar se a largura foi armazenada, fellas
            System.out.println("Teto Largura armazenada: " + this.tetoLargura);
            
            Area_Alt.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números na Largura!");
        }
    }//GEN-LAST:event_Teto_LargActionPerformed

   
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        
        // 1. CALCULAR PAREDES
        double altParede = Double.parseDouble(ParedeAltura.getText().replace(",", "."));
        double largParede = Double.parseDouble(ParedeLargura.getText().replace(",", "."));
        double areaParedes = altParede * largParede;
        
        // 2. CALCULAR TETO (Se os campos não estiverem vazios)
        double areaTeto = 0.0;
        if (!Teto_compri.getText().isEmpty() && !Teto_Larg.getText().isEmpty()) {
            double compTeto = Double.parseDouble(Teto_compri.getText().replace(",", "."));
            double largTeto = Double.parseDouble(Teto_Larg.getText().replace(",", "."));
            areaTeto = compTeto * largTeto;
        }
        
         // 3. CALCULAR ÁREA SEM PINTAR (Portas/Janelas)
        double areaSemPintar = 0.0;
        if (!Area_Alt.getText().isEmpty() && !Area_larg.getText().isEmpty()) {
            double altSem = Double.parseDouble(Area_Alt.getText().replace(",", "."));
            double largSem = Double.parseDouble(Area_larg.getText().replace(",", "."));
            areaSemPintar = altSem * largSem;
        }
        
        // 4. CÁLCULO FINAL DA ÁREA TOTAL
        // Soma paredes e teto, e subtrai o que não vai pintar
        double areaTotalPintavel = (areaParedes + areaTeto) - areaSemPintar;
        
        Tela2 novaTela = new Tela2();
        novaTela.mostrarAreaTotal(areaTotalPintavel);
        novaTela.setLocation(this.getLocation());
        novaTela.setVisible(true);
        
        
        
        this.dispose();
    }//GEN-LAST:event_CalcularActionPerformed

    private void ParedeLarguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParedeLarguraActionPerformed
        try {
            String larguraEmTexto = ParedeLargura.getText();
            larguraEmTexto = larguraEmTexto.replace(",", ".");
            this.paredeLargura = Double.parseDouble(larguraEmTexto);
            
            // serve pra diagnosticar se a largura foi armazenada, fellas
            System.out.println("Perede Largura armazenada: " + this.paredeLargura);
            Teto_compri.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números na Largura!");
        }
    }//GEN-LAST:event_ParedeLarguraActionPerformed

    private void RendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendimentoActionPerformed
       
        try {
            String rendimentoEmTexto = Rendimento.getText();
            rendimentoEmTexto = rendimentoEmTexto.replace(",", ".");
            this.rendimento = Double.parseDouble(rendimentoEmTexto);
            System.out.println("Rendimento da tinta Armazendo: " + this.rendimento);
             Rendimento.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números no Rendimento!");
        }
        
        Calcular.requestFocus();
    }//GEN-LAST:event_RendimentoActionPerformed

    private void ValorTintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTintaActionPerformed
        
        try {
            String precoEmTexto = ValorTinta.getText();
            precoEmTexto = precoEmTexto.replace(",", ".");
            this.precoTinta = Double.parseDouble(precoEmTexto);
            System.out.println("Valor da tinta armazenado: " + this.precoTinta);
             ValorTinta.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números no Preço!");
        }
        
        Rendimento.requestFocus();
    }//GEN-LAST:event_ValorTintaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Area_Alt;
    private javax.swing.JTextField Area_larg;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField ParedeAltura;
    private javax.swing.JTextField ParedeLargura;
    private javax.swing.JTextField Rendimento;
    private javax.swing.JTextField Teto_Larg;
    private javax.swing.JTextField Teto_compri;
    private javax.swing.JTextField ValorTinta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
