
import java.util.Random;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class trabalhorafa01 extends javax.swing.JFrame {

    /**
     * Creates new form trabalhorafa01
     */
    public trabalhorafa01() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btFem = new javax.swing.JRadioButton();
        btMasc = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textDia = new javax.swing.JTextField();
        textMes = new javax.swing.JTextField();
        textAno = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        textAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textResumo1 = new javax.swing.JTextField();
        textResumo2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textPeso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("GURU ON-LINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setText("NOME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        jPanel1.add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 354, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel3.setText("SEXO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        buttonGroup1.add(btFem);
        btFem.setSelected(true);
        btFem.setText("FEMININO");
        btFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFemActionPerformed(evt);
            }
        });
        jPanel1.add(btFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 85, -1));

        buttonGroup1.add(btMasc);
        btMasc.setText("MASCULINO");
        btMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMascActionPerformed(evt);
            }
        });
        jPanel1.add(btMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setText("DIA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setText("MÊS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel6.setText("ANO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));
        jPanel1.add(textDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 32, -1));
        jPanel1.add(textMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 37, -1));
        jPanel1.add(textAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 40, -1));

        btConsultar.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        btLimpar.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setText("ALTURA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel1.add(textAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 50, 30));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel8.setText("RESUMO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        textResumo1.setBackground(new java.awt.Color(204, 204, 255));
        textResumo1.setCaretColor(new java.awt.Color(204, 204, 255));
        textResumo1.setDisabledTextColor(new java.awt.Color(204, 204, 255));
        jPanel1.add(textResumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 630, -1));

        textResumo2.setBackground(new java.awt.Color(204, 204, 255));
        textResumo2.setCaretColor(new java.awt.Color(204, 204, 255));
        textResumo2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textResumo2.setDisabledTextColor(new java.awt.Color(204, 204, 255));
        textResumo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResumo2ActionPerformed(evt);
            }
        });
        jPanel1.add(textResumo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 630, -1));

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel9.setText("PESO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
        jPanel1.add(textPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        textNome.setText(null);
        textDia.setText(null);
        textMes.setText(null);
        textAno.setText(null);
        textAltura.setText(null);
        textPeso.setText(null);
        JOptionPane.showMessageDialog(null, "Limpo com sucesso! ");
      
    }//GEN-LAST:event_btLimparActionPerformed

    public String gerarCor() {
        String cor[] = {"Roxo", "Vermelho", "Preto", "Branco", "Rosa", "Azul", "Laranja", "Verde", "Amarelo"};
        Random r = new Random();
        int numero = r.nextInt(9);
        return cor[numero];

    }

    public String fazerTratamento() {
        String trato = " ";

        if (btFem.isSelected()) {
            trato = "Sra. ";
        } else {
            if (btMasc.isSelected()) {
                trato = " ";

                trato = "Sr. ";
            }
        }
        return trato;
    }

    public String gerarSigno(int dia, int mes) {
        String signo = "";
        if (dia >= 21 && dia <= 31 && mes == 3 || dia >= 01 && dia <= 20 && mes == 4) {
            signo = "Áries";
        } else if (dia >= 21 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5) {
            signo = "Touro";
        } else if (dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 20 && mes == 6) {
            signo = "Gêmeos";
        } else if (dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 21 && mes == 7) {
            signo = "Cancêr";
        } else if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8) {
            signo = "Leão";
        } else if (dia >= 23 && dia <= 30 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9) {
            signo = "Virgem";
        } else if (dia >= 23 && dia <= 31 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10) {
            signo = "Libra";
        } else if (dia >= 23 && dia <= 30 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11) {
            signo = "Escorpião";
        } else if (dia >= 22 && dia <= 31 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12) {
            signo = "Sagitário";
        } else if (dia >= 22 && dia <= 30 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1) {
            signo = "Capricórnio";
        } else if (dia >= 21 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2) {
            signo = "Aquário";
        } else if (dia >= 20 && dia <= 30 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
        }
        return signo;
    }

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        String nome, signo;
        double altura, peso;
        boolean terminou=false;
        int diaNasc, mesNasc, anoNasc, idade, sorte, caracte = 8;
        nome = textNome.getText();
        altura = Double.parseDouble(textAltura.getText());
        peso = Double.parseDouble(textPeso.getText());
        anoNasc = Integer.parseInt(textAno.getText());
        mesNasc = Integer.parseInt(textMes.getText());
        diaNasc = Integer.parseInt(textDia.getText());

        idade = 2024 - anoNasc;

        if (mesNasc >= 1 && mesNasc <= 12) {

        } else {
            JOptionPane.showMessageDialog(null, "Mês inválido!");
        }
        if (anoNasc >= 1900 && anoNasc <= 2024) {
        } else {
            JOptionPane.showMessageDialog(null, "Ano inválido!");
        }
        if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 3) {

        } else if (diaNasc >= 01 && diaNasc <= 30 && mesNasc == 4) {

        } else if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 5) {

        } else if (diaNasc >= 01 && diaNasc <= 30 && mesNasc == 6) {
          
        } else if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 7) {

        } else if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 8) {

        } else if (diaNasc >= 01 && diaNasc <= 30 && mesNasc == 9) {

        } else if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 10) {

        } else if (diaNasc >= 01 && diaNasc <= 30 && mesNasc == 11) {

        } else if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 12) {

        } else if (diaNasc >= 01 && diaNasc <= 31 && mesNasc == 1) {

        } else if (diaNasc >= 01 && diaNasc <= 28 && mesNasc == 2) {
        } else {
            terminou = true;
            
            JOptionPane.showMessageDialog(null, "Dia inválido, digete novamente!");
            textDia.setText(null);
            textMes.setText(null);
            textAno.setText(null);
            textResumo1.setText(null);
            textResumo2.setText(null);
        }
        if(!terminou){
            
        if (nome.length() > caracte) {
        } else {
            JOptionPane.showMessageDialog(null, "Legal se o seu nome fosse verdadeiro!");
        }

        sorte = (int) ((int) 1 + Math.random() * 99);

        textResumo1.setText(fazerTratamento() + nome + " nascida no dia " + diaNasc + "/" + mesNasc + "/" + anoNasc + " é do signo " + gerarSigno(diaNasc, mesNasc) + " seu número da sorte é " + sorte + " sua cor é " + gerarCor());

        textResumo2.setText("Você tem " + idade + " anos e seu peso é " + peso + " kg sua altura é " + altura + " m. ");

        JOptionPane.showMessageDialog(null, "OBRIGADA POR SUA PARTICIPAÇÃO!");
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed

    }//GEN-LAST:event_textNomeActionPerformed

    private void btFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFemActionPerformed

    }//GEN-LAST:event_btFemActionPerformed

    private void btMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMascActionPerformed

    }//GEN-LAST:event_btMascActionPerformed

    private void textResumo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResumo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textResumo2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(trabalhorafa01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabalhorafa01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabalhorafa01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabalhorafa01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabalhorafa01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JRadioButton btFem;
    private javax.swing.JButton btLimpar;
    private javax.swing.JRadioButton btMasc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textAltura;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textDia;
    private javax.swing.JTextField textMes;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textResumo1;
    private javax.swing.JTextField textResumo2;
    // End of variables declaration//GEN-END:variables
}
