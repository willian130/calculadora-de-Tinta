package telaPrincipal;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());
    private double alturaParede = 0.0;
    private double paredeLargura = 0.0;
    private double tetoCompri = 0.0;
    private double tetoLargura = 0.0;
    private double rendimento = 0.0;
    private double precoTinta = 0.0;
    private double areaLarg = 0.0;
    private double areaAlt = 0.0;
    
    
    public TelaPrincipal() {
        initComponents();
          this.setSize(800, 600); 
       this.setExtendedState(MAXIMIZED_BOTH);
       this.setLocationRelativeTo(null);
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
        volumeLata = new javax.swing.JComboBox<>();

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

        ParedeAltura.setToolTipText("");
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
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 533, -1, 20));

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

        volumeLata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lata 18L", "Lata 3,6L", "Lata 900L" }));
        volumeLata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeLataActionPerformed(evt);
            }
        });
        getContentPane().add(volumeLata, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 130, -1));
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
         try {
            String alturaEmTexto = Area_larg.getText();
            alturaEmTexto = alturaEmTexto.replace(",", ".");
            this.areaLarg = Double.parseDouble(alturaEmTexto);
            System.out.println(" largura sem pintar armazenada: " + this.areaLarg);
             Area_larg.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números na altura!");
        }
        
        ValorTinta.requestFocus();
    }//GEN-LAST:event_Area_largActionPerformed

    private void Area_AltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Area_AltActionPerformed
    
         try {
            String alturaEmTexto = Area_Alt.getText();
            alturaEmTexto = alturaEmTexto.replace(",", ".");
            this.areaAlt = Double.parseDouble(alturaEmTexto);
            System.out.println(" largura sem pintar armazenada: " + this.areaAlt);
             Area_Alt.requestFocus();
        } catch (NumberFormatException e) {
            // galerinha, o catch evita que o user digite um numero invalido
            javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números na altura!");
        }
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
                                     
    try {
        // --- MÉTODOS SEGUROS DE CAPTURA (Se estiver vazio, vale 0) ---
        
        // 1. Paredes (Obrigatório - se vazio, vai dar erro e cair no catch)
        double altP = Double.parseDouble(ParedeAltura.getText().replace(",", "."));
        double largP = Double.parseDouble(ParedeLargura.getText().replace(",", "."));
        double areaParedes = altP * largP;

        // 2. Teto (OPCIONAL - Proteção adicionada)
        double areaTeto = 0.0;
        String tetoCompText = Teto_compri.getText().trim(); // .trim() remove espaços
        String tetoLargText = Teto_Larg.getText().trim();
        
        if (!tetoCompText.isEmpty() && !tetoLargText.isEmpty()) {
            double compT = Double.parseDouble(tetoCompText.replace(",", "."));
            double largT = Double.parseDouble(tetoLargText.replace(",", "."));
            areaTeto = compT * largT;
        }

        // 3. Área sem pintar (OPCIONAL - Proteção adicionada)
        double areaSemPintar = 0.0;
        String areaAltText = Area_Alt.getText().trim();
        String areaLargText = Area_larg.getText().trim();
        
        if (!areaAltText.isEmpty() && !areaLargText.isEmpty()) {
            double altS = Double.parseDouble(areaAltText.replace(",", "."));
            double largS = Double.parseDouble(areaLargText.replace(",", "."));
            areaSemPintar = altS * largS;
        }

        // --- CÁLCULOS ---
        double areaTotal = (areaParedes + areaTeto) - areaSemPintar;
        
        // Proteção para Rendimento e Preço
        double rendimentoVal = Rendimento.getText().trim().isEmpty() ? 10.0 : Double.parseDouble(Rendimento.getText().replace(",", "."));
        double precoVal = ValorTinta.getText().trim().isEmpty() ? 0.0 : Double.parseDouble(ValorTinta.getText().replace(",", "."));
        
        // Tamanho da lata (usando valor padrão se der erro)
        double volLata = 18.0;
        try {
             // Verifica se o item selecionado contém o texto
             String item = volumeLata.getSelectedItem().toString();
             if(item.contains("3,6")) volLata = 3.6;
             else if(item.contains("900")) volLata = 0.9;
        } catch (Exception e) {}

        double litrosNecessarios = areaTotal / rendimentoVal;
        double latasNecessarias = Math.ceil(litrosNecessarios / volLata);
        double custoFinal = latasNecessarias * precoVal;

        // --- TROCA DE TELA ---
        TelaFinal finall = new TelaFinal();
        
        // Define tamanho fixo para garantir que não abra minúscula
        finall.setSize(800, 600); 
        
        // Passa os dados
        finall.atualizarResultados(areaTotal, litrosNecessarios, latasNecessarias, custoFinal);
        
        finall.setLocationRelativeTo(null); // Centraliza
        finall.setVisible(true);
        
        this.dispose();

    } catch (NumberFormatException e) {
        // Esse erro aparece se escrever letras ou deixar PAREDES vazias
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: Verifique se digitou apenas números nos campos obrigatórios!");
        e.printStackTrace(); // Mostra o erro no console para ajudar a debugar
    
}
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

    private void volumeLataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeLataActionPerformed
    
    }//GEN-LAST:event_volumeLataActionPerformed

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
    private javax.swing.JComboBox<String> volumeLata;
    // End of variables declaration//GEN-END:variables
}
