package JawaSwing_GUI;

public class Kalkulator extends javax.swing.JFrame {

    String angka;
    double jumlah, persen, bil1, bil2;
    int pilih;
    
    public Kalkulator() {
        initComponents();
        angka = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        tampilText = new javax.swing.JTextField();
        btnHapusSemua = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        btnPersen = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        angka00 = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tampilText.setBackground(new java.awt.Color(0, 0, 0));
        tampilText.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tampilText.setForeground(new java.awt.Color(255, 255, 255));
        tampilText.setBorder(null);
        tampilText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilTextActionPerformed(evt);
            }
        });

        btnHapusSemua.setBackground(new java.awt.Color(51, 51, 51));
        btnHapusSemua.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnHapusSemua.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusSemua.setText("C");
        btnHapusSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusSemuaActionPerformed(evt);
            }
        });

        angka7.setBackground(new java.awt.Color(39, 39, 39));
        angka7.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka7.setForeground(new java.awt.Color(255, 255, 255));
        angka7.setText("7");
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka4.setBackground(new java.awt.Color(39, 39, 39));
        angka4.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka4.setForeground(new java.awt.Color(255, 255, 255));
        angka4.setText("4");
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka1.setBackground(new java.awt.Color(39, 39, 39));
        angka1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka1.setForeground(new java.awt.Color(255, 255, 255));
        angka1.setText("1");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        btnPersen.setBackground(new java.awt.Color(51, 51, 51));
        btnPersen.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnPersen.setForeground(new java.awt.Color(255, 255, 255));
        btnPersen.setText("%");
        btnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersenActionPerformed(evt);
            }
        });

        angka8.setBackground(new java.awt.Color(39, 39, 39));
        angka8.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka8.setForeground(new java.awt.Color(255, 255, 255));
        angka8.setText("8");
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        angka5.setBackground(new java.awt.Color(39, 39, 39));
        angka5.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka5.setForeground(new java.awt.Color(255, 255, 255));
        angka5.setText("5");
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka2.setBackground(new java.awt.Color(39, 39, 39));
        angka2.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka2.setForeground(new java.awt.Color(255, 255, 255));
        angka2.setText("2");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(51, 51, 51));
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("⌂");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        angka9.setBackground(new java.awt.Color(39, 39, 39));
        angka9.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka9.setForeground(new java.awt.Color(255, 255, 255));
        angka9.setText("9");
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        angka6.setBackground(new java.awt.Color(39, 39, 39));
        angka6.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka6.setForeground(new java.awt.Color(255, 255, 255));
        angka6.setText("6");
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka3.setBackground(new java.awt.Color(39, 39, 39));
        angka3.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka3.setForeground(new java.awt.Color(255, 255, 255));
        angka3.setText("3");
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(51, 51, 51));
        btnBagi.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnBagi.setForeground(new java.awt.Color(255, 255, 255));
        btnBagi.setText("÷");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(51, 51, 51));
        btnKali.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnKali.setForeground(new java.awt.Color(255, 255, 255));
        btnKali.setText("×");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnKurang.setBackground(new java.awt.Color(51, 51, 51));
        btnKurang.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnKurang.setForeground(new java.awt.Color(255, 255, 255));
        btnKurang.setText("−");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(51, 51, 51));
        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        angka00.setBackground(new java.awt.Color(39, 39, 39));
        angka00.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka00.setForeground(new java.awt.Color(255, 255, 255));
        angka00.setText("00");
        angka00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka00ActionPerformed(evt);
            }
        });

        angka0.setBackground(new java.awt.Color(39, 39, 39));
        angka0.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        angka0.setForeground(new java.awt.Color(255, 255, 255));
        angka0.setText("0");
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        btnTitik.setBackground(new java.awt.Color(39, 39, 39));
        btnTitik.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnTitik.setForeground(new java.awt.Color(255, 255, 255));
        btnTitik.setText(".");
        btnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitikActionPerformed(evt);
            }
        });

        btnHasil.setBackground(new java.awt.Color(255, 107, 0));
        btnHasil.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnHasil.setText("=");
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kalkulator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tampilText)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapusSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka00, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tampilText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapusSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka00, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
         bil1 = Double.parseDouble(angka);
         tampilText.setText("÷");
         angka = "";
         pilih = 4;
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
         bil1 = Double.parseDouble(angka);
         tampilText.setText("+");
         angka = "";
         pilih = 1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed
         switch (pilih) {
             case 1:
                 bil2 = Double.parseDouble(angka);
                 jumlah = bil1 + bil2;
                 angka = Double.toString(jumlah);
                 tampilText.setText(angka);
                 break;
             case 2:
                 bil2 = Double.parseDouble(angka);
                 jumlah = bil1 - bil2;
                 angka = Double.toString(jumlah);
                 tampilText.setText(angka);
                 break;    
             case 3:
                 bil2 = Double.parseDouble(angka);
                 jumlah = bil1 * bil2;
                 angka = Double.toString(jumlah);
                 tampilText.setText(angka);
                 break;
             case 4:
                 bil2 = Double.parseDouble(angka);
                 jumlah = bil1 / bil2;
                 angka = Double.toString(jumlah);
                 tampilText.setText(angka);
                 break;
             case 5:
                 bil2 = Double.parseDouble(angka);
                 persen = bil1 / 100;
                 jumlah = persen * bil2;
                 angka = Double.toString(jumlah);
                 tampilText.setText(angka);
                 break;
         }
    }//GEN-LAST:event_btnHasilActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
        angka += "0";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void angka00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka00ActionPerformed
        angka += "00";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka00ActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
         bil1 = Double.parseDouble(angka);
         tampilText.setText("−");
         angka = "";
         pilih = 2;
    }//GEN-LAST:event_btnKurangActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
        angka += "1";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        angka += "2";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
        angka += "3";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
        angka += "4";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
        angka += "5";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
        angka += "6";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
        angka += "7";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
        angka += "8";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
        angka += "9";
        tampilText.setText(angka);
    }//GEN-LAST:event_angka9ActionPerformed

    private void btnHapusSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusSemuaActionPerformed
        tampilText.setText(angka);
        bil1 = 0.0;
        bil2 = 0.0;
        jumlah = 0.0;
        angka = "";
    }//GEN-LAST:event_btnHapusSemuaActionPerformed

    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitikActionPerformed
        angka += ".";
        tampilText.setText(angka);
    }//GEN-LAST:event_btnTitikActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
         bil1 = Double.parseDouble(angka);
         tampilText.setText("×");
         angka = "";
         pilih = 3;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersenActionPerformed
         bil1 = Double.parseDouble(angka);
         tampilText.setText("%");
         angka = "";
         pilih = 5;
    }//GEN-LAST:event_btnPersenActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        tampilText.setText(angka);
        bil1 = 0.0;
        bil2 = 0.0;
        jumlah = 0.0;
        angka = "Hello world";
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tampilTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilTextActionPerformed

    }//GEN-LAST:event_tampilTextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka00;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapusSemua;
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnPersen;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTitik;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField tampilText;
    // End of variables declaration//GEN-END:variables
}
