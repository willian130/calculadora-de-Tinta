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
    private double areaTotalParedesAcumulada = 0.0;
    private int contadorParedes = 0;
    
    class DadosTinta {
    double rendimento;
    double preco20L;
    double preco18L;
    double preco3_6L;
    double preco0_9L;

    public DadosTinta(double r, double p20,double p18, double p36, double p09) {
        this.rendimento = r;
        this.preco20L = p20;
        this.preco18L = p18;
        this.preco3_6L = p36;
        this.preco0_9L = p09;
    }
}
    // Método para pegar os dados baseados na marca escolhida
private DadosTinta obterDadosDaMarca() {
    String marca = comboMarcas.getSelectedItem().toString();
    
    // Exemplo de preços e rendimentos (Você pode alterar os valores)
    if (marca.contains("Lumina Prime")) {
        // Rende 16m²/L | 20L custa 600 18L custa 400 | 3.6L custa 90 | 0.9L custa 30
        return new DadosTinta(16.0,600.00, 400.00, 90.00, 30.00); 
    } 
    else if (marca.contains("EcoViva")) {
        // Rende 10m²/L | 20L custa 450  18L custa 250 | 3.6L custa 60 | 0.9L custa 20
        return new DadosTinta(10.0,450.00,250.00, 60.00, 20.00);
    } 
    else { // Econômica
        // Rende 8m²/L | 20L custa 200 18L custa 150 | 3.6L custa 40 | 0.9L custa 15
        return new DadosTinta(8.0,200.00, 150.00, 40.00, 15.00);
    }
}
    public TelaPrincipal() {
        initComponents();
          this.setSize(800, 600); 
       this.setExtendedState(MAXIMIZED_BOTH);
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // CORREÇÃO: Adicionei "/Imagens/" antes do nome do arquivo
                java.net.URL imgURL = getClass().getResource("/Imagens/pinkPrint (1).png");

                if (imgURL != null) {
                    javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
                    g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
                } else {
                    System.err.println("Imagem não encontrada: verifique o nome!");
                }
            }
        };
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ParedeLargura = new javax.swing.JTextField();
        superficie = new javax.swing.JLabel();
        Area_larg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Teto_compri = new javax.swing.JTextField();
        ParedeAltura = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Teto_Larg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Area_Alt = new javax.swing.JTextField();
        comboMarcas = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        volumeLata1 = new javax.swing.JComboBox<>();
        btnAdicionarParede = new javax.swing.JButton();
        lblTotalParedes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Área sem pintar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Marcas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Teto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel11.setText("Quantidade de Litros");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        jLabel3.setText("Altura (digite em metros)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        ParedeLargura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParedeLarguraActionPerformed(evt);
            }
        });
        jPanel1.add(ParedeLargura, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 230, 30));

        superficie.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        superficie.setText("Paredes");
        superficie.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(superficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        Area_larg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Area_larg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Area_largActionPerformed(evt);
            }
        });
        jPanel1.add(Area_larg, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 321, 230, 30));

        jLabel9.setText("Altura");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        Teto_compri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teto_compriActionPerformed(evt);
            }
        });
        jPanel1.add(Teto_compri, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 242, 230, 30));

        ParedeAltura.setToolTipText("");
        ParedeAltura.setActionCommand("<Not Set>");
        ParedeAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ParedeAltura.setMaximumSize(new java.awt.Dimension(0, 0));
        ParedeAltura.setMinimumSize(new java.awt.Dimension(0, 0));
        ParedeAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParedeAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(ParedeAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 230, 30));

        Calcular.setText("Calcular");
        Calcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel1.add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 110, 30));

        Teto_Larg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teto_LargActionPerformed(evt);
            }
        });
        jPanel1.add(Teto_Larg, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 241, 230, 30));

        jLabel4.setText("Largura");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        jLabel7.setText("Largura(Opcional)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, -1));

        jLabel6.setText("Comprimento(Opcional)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel10.setText("Largura");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, -1, -1));

        Area_Alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Area_AltActionPerformed(evt);
            }
        });
        jPanel1.add(Area_Alt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 230, 30));

        comboMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lumina Prime", "EcoViva", "AceleraCor" }));
        comboMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcasActionPerformed(evt);
            }
        });
        jPanel1.add(comboMarcas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 230, 30));

        jPanel2.setBackground(new java.awt.Color(10, 79, 163));

        titulo1.setBackground(new java.awt.Color(0, 0, 0));
        titulo1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Preencha os campos abaixo para calcular");
        titulo1.setMaximumSize(new java.awt.Dimension(600, 50));
        titulo1.setMinimumSize(new java.awt.Dimension(600, 32));
        jPanel2.add(titulo1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 660, 50));

        volumeLata1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lata 20L", "Lata 18L", "Lata 3,6L", "Lata 900ML" }));
        volumeLata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeLata1ActionPerformed(evt);
            }
        });
        jPanel1.add(volumeLata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 230, 30));

        btnAdicionarParede.setText("Adicionar Parede");
        btnAdicionarParede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarParedeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionarParede, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        lblTotalParedes.setText("Total Paredes: 0.00 m²");
        jPanel1.add(lblTotalParedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 200, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 780, 520));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

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

        
    }//GEN-LAST:event_Area_largActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

        try {
            // --- 1. CÁLCULO DAS PAREDES (COM SOMA ACUMULADA) ---
            
            // Verifica se o usuário digitou algo nos campos mas esqueceu de clicar em "Adicionar Parede"
            double areaParedesUltima = 0.0;
            if (!ParedeAltura.getText().isEmpty() && !ParedeLargura.getText().isEmpty()) {
                 double altP = Double.parseDouble(ParedeAltura.getText().replace(",", "."));
                 double largP = Double.parseDouble(ParedeLargura.getText().replace(",", "."));
                 areaParedesUltima = altP * largP;
            }
            
            // Soma a área acumulada (das paredes já adicionadas) com a área que está nos campos agora
            double areaParedesFinal = this.areaTotalParedesAcumulada + areaParedesUltima;

            // Validação: Se não tiver nenhuma parede, avisa e para.
            if (areaParedesFinal == 0) {
                 javax.swing.JOptionPane.showMessageDialog(this, "Nenhuma parede foi adicionada ou os campos estão vazios!");
                 return;
            }

            // --- 2. TETO (OPCIONAL) ---
            double areaTeto = 0.0;
            String tetoCompText = Teto_compri.getText().trim();
            String tetoLargText = Teto_Larg.getText().trim();

            if (!tetoCompText.isEmpty() && !tetoLargText.isEmpty()) {
                double compT = Double.parseDouble(tetoCompText.replace(",", "."));
                double largT = Double.parseDouble(tetoLargText.replace(",", "."));
                areaTeto = compT * largT;
            }

            // --- 3. ÁREA SEM PINTAR (OPCIONAL) ---
            double areaSemPintar = 0.0;
            String areaAltText = Area_Alt.getText().trim();
            String areaLargText = Area_larg.getText().trim();

            if (!areaAltText.isEmpty() && !areaLargText.isEmpty()) {
                double altS = Double.parseDouble(areaAltText.replace(",", "."));
                double largS = Double.parseDouble(areaLargText.replace(",", "."));
                areaSemPintar = altS * largS;
            }

            // --- CÁLCULOS FINAIS ---
            double areaTotal = (areaParedesFinal + areaTeto) - areaSemPintar;
            
            // Evita área negativa
            if (areaTotal < 0) {
                areaTotal = 0;
            }

            DadosTinta dados = obterDadosDaMarca();
           
            // Cálculo de litros (considerando 2 demãos, conforme seu código original)
            double litrosNecessarios = (areaTotal / dados.rendimento) * 2;
           
            // Tamanho da lata selecionada
            double volLataSelecionada = 20.0; // Valor padrão
            try {
                String item = volumeLata1.getSelectedItem().toString();
                if (item.contains("20")) volLataSelecionada = 20.0;
                else if (item.contains("18")) volLataSelecionada = 18.0;
                else if (item.contains("3,6")) volLataSelecionada = 3.6;
                else if (item.contains("900")) volLataSelecionada = 0.9;
            } catch (Exception e) {}
          
            double latasNecessarias = Math.ceil(litrosNecessarios / volLataSelecionada);
           
            // Define o preço baseada no tamanho da lata
            double precoLataSelecionada = 0.0;
            if (volLataSelecionada == 20.0) precoLataSelecionada = dados.preco20L;
            else if (volLataSelecionada == 18.0) precoLataSelecionada = dados.preco18L;
            else if (volLataSelecionada == 3.6) precoLataSelecionada = dados.preco3_6L;
            else precoLataSelecionada = dados.preco0_9L;

            double custoFinal = latasNecessarias * precoLataSelecionada;
            double precoPorLitro = precoLataSelecionada / volLataSelecionada;
            
            // Gera a sugestão inteligente
            String Sugestao = margemDeRendimento(litrosNecessarios, dados);

            // --- TROCA DE TELA ---
            TelaFinal finall = new TelaFinal();
            finall.setSize(800, 600);
            
            // Passa os dados para a tela final
            finall.atualizarResultados(areaTotal, litrosNecessarios, latasNecessarias, custoFinal, precoPorLitro, volLataSelecionada, Sugestao);

            finall.setLocationRelativeTo(null);
            finall.setVisible(true);

            this.dispose();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: Verifique se digitou apenas números nos campos!");
            e.printStackTrace();
        }
    }//GEN-LAST:event_CalcularActionPerformed

    private void comboMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcasActionPerformed

    }//GEN-LAST:event_comboMarcasActionPerformed

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

    private void volumeLata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeLata1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volumeLata1ActionPerformed

    private void btnAdicionarParedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarParedeActionPerformed
        try {
        // 1. Pega os valores dos campos de texto
        String altText = ParedeAltura.getText().replace(",", ".");
        String largText = ParedeLargura.getText().replace(",", ".");

        if (altText.isEmpty() || largText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha Altura e Largura da parede!");
            return;
        }

        double alt = Double.parseDouble(altText);
        double larg = Double.parseDouble(largText);

        // 2. Calcula a área desta parede específica
        double areaDestaParede = alt * larg;

        // 3. Adiciona ao acumulador total
        this.areaTotalParedesAcumulada += areaDestaParede;
        this.contadorParedes++;

        // 4. Atualiza o Label visual para o usuário saber que funcionou
        lblTotalParedes.setText("Paredes: " + contadorParedes + " | Área: " + String.format("%.2f", this.areaTotalParedesAcumulada) + " m²");

        // 5. Limpa os campos para a próxima parede
        ParedeAltura.setText("");
        ParedeLargura.setText("");
        ParedeAltura.requestFocus(); // Volta o cursor para altura

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Digite apenas números válidos!");
    }
    }//GEN-LAST:event_btnAdicionarParedeActionPerformed
 
    
    private String margemDeRendimento (double litrosNecessarios, DadosTinta dados) {
    // Adiciona 10% de margem de segurança (sobra)
    double litrosComMargem = litrosNecessarios * 1.10;
    
    int latas20 = 0;
    int latas18 = 0;
    int galoes36 = 0;
    int latas09 = 0;
    double volumeAtual = 0.0;

    // 1. Tenta encher com latas grandes (18L)
     while (volumeAtual + 20.0 <= litrosComMargem) {
        latas20++;
        volumeAtual += 20.0;
     }
    while (volumeAtual + 18.0 <= litrosComMargem) {
        latas18++;
        volumeAtual += 18.0;
    }

    // 2. O que faltou, tenta com galões (3.6L)
    while (volumeAtual + 3.6 <= litrosComMargem) {
        galoes36++;
        volumeAtual += 3.6;
    }

    // 3. O restinho, completa com latas pequenas (0.9L)
    while (volumeAtual < litrosComMargem) {
        latas09++;
        volumeAtual += 0.9;
    }
    
    // Monta o texto da sugestão e calcula o preço total dessa combinação
    double precoTotalMix = (latas20 * dados.preco20L) + (latas18 * dados.preco18L) + (galoes36 * dados.preco3_6L) + (latas09 * dados.preco0_9L);
    
    String sugestao = String.format("<html>Sugestão de Compra (com 10%% de sobra):<br>"
             + "%d lata(s) de 20L<br>"
            + "%d lata(s) de 18L<br>"
            + "%d galão(ões) de 3,6L<br>"
            + "%d lata(s) de 0,9L<br>"
            + "<b>Valor Total Estimado: R$ %.2f</b></html>", 
            latas20,latas18, galoes36, latas09, precoTotalMix);
            
    return sugestao;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try{
            // FlatDarkLaf = Escuro (Dark Mode)
            // FlatLightLaf = Claro (Light Mode)
            // FlatIntelliJLaf = Estilo IntelliJ
            // FlatDarculaLaf = Estilo Darcula
        javax.swing.UIManager.setLookAndFeel( new com.formdev.flatlaf.FlatIntelliJLaf() );
    } catch( Exception ex ) {
        System.err.println( "Erro no tema. Usando padrão." );
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
    private javax.swing.JTextField Teto_Larg;
    private javax.swing.JTextField Teto_compri;
    private javax.swing.JButton btnAdicionarParede;
    private javax.swing.JComboBox<String> comboMarcas;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTotalParedes;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel titulo1;
    private javax.swing.JComboBox<String> volumeLata1;
    // End of variables declaration//GEN-END:variables
}
