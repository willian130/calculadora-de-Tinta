
package telaPrincipal;

public class TelaMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenu.class.getName());

    
    public TelaMenu() {
        initComponents();
         this.setSize(800, 600); 
       this.setExtendedState(MAXIMIZED_BOTH);
       this.setLocationRelativeTo(null);
       
       
       texto1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        texto1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margem
        texto1.setText("<html>"
                
                + "<font size=\"5\"><b>SOBRE A CALCULADORA DE TINTA 4K:</b></Arial><b></b><br><br>"
                + "A calculadora serve para ajudar qualquer pessoa a entender exatamente o quanto será pintado em um cômodo<br>"
                + "Ela considera paredes, portas e janelas, calcula a área total de pintura e informa a quantidade<br>"
                + "de tinta que será necessário com base no rendimento por galão. <br>"
                + "No final, ela mostra tanto a área total pintada quanto o custo estimado da tinta."
                + "</html>");

        // ABA 2: Sobre a calculadora (jLabel2)
        texto2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        texto2.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margem
        texto2.setText
                   ("<html>"
                + "<font size=\"5\"><b>Como Usar:</b></Arial><b></b><br>"
                + "É simples, nos campos determinados você irá preencher da seguinte forma:<br>"
                + "<br>"
                + "<b>Paredes: </b> Você colocará tanto a altura dela quanto a sua largura. <br>"
                + "caso não saiba, veja o modelo da marca onde você <br>"
                + "comprou ou pegue uma fita métrica e faça as medidas."
                + "<br>"
                + "<b>Teto:</b> O teto seguirá do mesmo formato, onde você colocará a largura dele e o comprimento,"
                + " e vale ressaltar que essa opção é opcional, onde você só precisará colocar se for pintar o teto,"
                + " caso não vá, essa opção pode ser preenchida com 0."
                + "<br>"
                + "<b>Área sem Pintar:</b> Esta opção é um pouco mais de sua escolha, aqui você irá colocar as"  
                + " medidas da área onde você não vai pintar, pode acabar sendo tanto"
                + " portas quanto janelas, caso não vá, essa opção pode ser preenchida com 0."
                + "<br>"
                + "<b>Marcas: </b> As marcas disponíveis para ser selecionada, cada marca tem seu "
                + "preço e rendimento diferentes, e ao lado a"
                + " quantidade de litros escolhido."
                + "</html>");
    
       
       
       
       
       
       
       
       
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comecar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tabela = new javax.swing.JTabbedPane();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 79, 163));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comecar.setText("Calcular");
        comecar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comecar.addActionListener(this::comecarActionPerformed);
        jPanel1.add(comecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 189, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/paint-bucket (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 610, 850));

        tabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabela.addTab("Sobre a calculadora", texto1);
        tabela.addTab("Como usar", texto2);

        getContentPane().add(tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 635, 555));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("Calculadora de Tinta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 559, 67));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comecarActionPerformed

        TelaPrincipal principal = new TelaPrincipal();

        principal.setLocation(this.getLocation());
        principal.setVisible(true);

        this.dispose();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_comecarActionPerformed

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
        
        java.awt.EventQueue.invokeLater(() -> new TelaMenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comecar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane tabela;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
