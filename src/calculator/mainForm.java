/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Mental
 */
public class mainForm extends javax.swing.JFrame {
    
    public String copy;
    public int commaClick;
    public double firstnum;
    public double secondnum;
    public double result;
    public String operations;

    public mainForm() {
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

        jTextField1 = new javax.swing.JTextField();
        jButtonnum0 = new javax.swing.JButton();
        jButtonnum1 = new javax.swing.JButton();
        jButtonnum2 = new javax.swing.JButton();
        jButtonnum3 = new javax.swing.JButton();
        jButtonnum4 = new javax.swing.JButton();
        jButtonnum5 = new javax.swing.JButton();
        jButtonnum6 = new javax.swing.JButton();
        jButtonnum7 = new javax.swing.JButton();
        jButtonnum8 = new javax.swing.JButton();
        jButtonnum9 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtonMult = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jTextFieldMem = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProvoli = new javax.swing.JMenu();
        jMenuExit = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBoitheia = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);

        jButtonnum0.setLabel("0");
        jButtonnum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum0ActionPerformed(evt);
            }
        });

        jButtonnum1.setLabel("1");
        jButtonnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum1ActionPerformed(evt);
            }
        });

        jButtonnum2.setLabel("2");
        jButtonnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum2ActionPerformed(evt);
            }
        });

        jButtonnum3.setLabel("3");
        jButtonnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum3ActionPerformed(evt);
            }
        });

        jButtonnum4.setLabel("4");
        jButtonnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum4ActionPerformed(evt);
            }
        });

        jButtonnum5.setLabel("5");
        jButtonnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum5ActionPerformed(evt);
            }
        });

        jButtonnum6.setLabel("6");
        jButtonnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum6ActionPerformed(evt);
            }
        });

        jButtonnum7.setLabel("7");
        jButtonnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum7ActionPerformed(evt);
            }
        });

        jButtonnum8.setLabel("8");
        jButtonnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum8ActionPerformed(evt);
            }
        });

        jButtonnum9.setLabel("9");
        jButtonnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum9ActionPerformed(evt);
            }
        });

        jButton21.setLabel(",");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setLabel("+/-");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButtonAdd.setLabel("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonSub.setLabel("-");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });

        jButtonMult.setLabel("*");
        jButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultActionPerformed(evt);
            }
        });

        jButtonDiv.setLabel("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButtonEquals.setLabel("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jButtonMod.setLabel("%");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jButton29.setLabel("log");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setLabel("Sqrt");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setLabel("x^2");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setLabel("x^y");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setLabel("C");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setLabel("<--");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jMenuProvoli.setText("Προβολή");

        jMenuExit.setText("Έξοδος");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuProvoli.add(jMenuExit);

        jMenuItem3.setText("Επιστημονική");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuProvoli.add(jMenuItem3);

        jMenuBar1.add(jMenuProvoli);

        jMenu1.setText("Επεξεργασία");

        jMenuItem1.setText("Αντιγραφή");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Επικόλληση");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenuBoitheia.setText("Βοήθεια");

        jMenuHelp.setText("Βοήθεια για την Αριθμομηχανή");
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });
        jMenuBoitheia.add(jMenuHelp);

        jMenuBar1.add(jMenuBoitheia);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonnum0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1)
                    .addComponent(jTextFieldMem))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jTextFieldMem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonnum0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean checkEmpty()
    {
        if(jTextField1.getText().length()==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    private void jButtonnum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum0ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum0.getText();
        jTextField1.setText(Enternumber);

    }//GEN-LAST:event_jButtonnum0ActionPerformed

    private void jButtonnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum1ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum1.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum1ActionPerformed

    private void jButtonnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum2ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum2.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum2ActionPerformed

    private void jButtonnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum3ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum3.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum3ActionPerformed

    private void jButtonnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum4ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum4.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum4ActionPerformed

    private void jButtonnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum5ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum5.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum5ActionPerformed

    private void jButtonnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum6ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum6.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum6ActionPerformed

    private void jButtonnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum7ActionPerformed
        String Enternumber = jTextField1.getText() + jButtonnum7.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum7ActionPerformed

    private void jButtonnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum8ActionPerformed
       String Enternumber = jTextField1.getText() + jButtonnum8.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum8ActionPerformed

    private void jButtonnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum9ActionPerformed
       String Enternumber = jTextField1.getText() + jButtonnum9.getText();
        jTextField1.setText(Enternumber);
    }//GEN-LAST:event_jButtonnum9ActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
        new Help().setVisible(true);
    }//GEN-LAST:event_jMenuHelpActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(checkEmpty())
        {
            
        }else {
            jTextField1.setText(String.valueOf(Double.parseDouble(jTextField1.getText())*-1));
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if(commaClick==0)
        {
            commaClick=1;
            jTextField1.setText(jTextField1.getText()+".");
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        if(jTextField1.getText().length()==0)
          {
              
          }else
          {
            
            String s = jTextField1.getText();
            s = s.substring(0, s.length() - 1);
            jTextField1.setText(s);
          }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        result = 0;
        jTextField1.setText("");
        firstnum=0;
        secondnum=0;
        commaClick=0;
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operations="^";   
            commaClick=0;
            jTextFieldMem.setText(String.valueOf(firstnum + "^"));
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        if(checkEmpty())
        {
            
        }else {
            String answer;
            secondnum = Double.parseDouble(jTextField1.getText());   
            if (operations == "^")
            {
                result = Math.pow(firstnum , secondnum);
                answer = String.valueOf(result);            
                jTextField1.setText(answer);
                jTextFieldMem.setText(String.valueOf(firstnum + "^" + secondnum));
            }   
            if (operations == "+")
            {
                result = firstnum + secondnum;
                answer = String.valueOf(result);
                jTextField1.setText(answer);
                jTextFieldMem.setText(String.valueOf(firstnum + "+" + secondnum));
            }
            if (operations == "-")
            {
               result = firstnum - secondnum;
                answer = String.valueOf(result);
                jTextField1.setText(answer);
                jTextFieldMem.setText(String.valueOf(firstnum + "-" + secondnum));
            }
            if (operations == "*")
            {
                result = firstnum * secondnum;
                answer = String.valueOf(result);
                jTextField1.setText(answer);
                jTextFieldMem.setText(String.valueOf(firstnum + "*" + secondnum));
            }
            if (operations == "/")
            {
                result = firstnum / secondnum;
                answer = String.valueOf(result);
                jTextField1.setText(answer);
                jTextFieldMem.setText(String.valueOf(firstnum + "/" + secondnum));
            }
            if (operations == "%")
            {
                result = firstnum / secondnum;
                answer = String.valueOf(result);
                jTextField1.setText(answer);
                jTextFieldMem.setText(String.valueOf(firstnum + "%" + secondnum));
            }    
        }
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            String answer;
            result=Math.pow(firstnum,2);
            answer = String.valueOf(result);
            jTextField1.setText(answer);
            jTextFieldMem.setText(String.valueOf(firstnum + "^" + "2"));
            }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            String answer;
            result=Math.sqrt(firstnum);
            answer = String.valueOf(result);
            jTextField1.setText(answer);
            jTextFieldMem.setText(String.valueOf("sqrt " + firstnum ));
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            String answer;
            result=Math.log10(firstnum);
            answer = String.valueOf(result);
            jTextField1.setText(answer);
            jTextFieldMem.setText(String.valueOf("log " + firstnum));
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operations="+";
            commaClick=0;
            jTextFieldMem.setText(String.valueOf(firstnum + "+" ));
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operations="-";
            commaClick=0;
            jTextFieldMem.setText(String.valueOf(firstnum + "-" ));
        }
    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operations="*";
            commaClick=0;
            jTextFieldMem.setText(String.valueOf(firstnum + "*" ));
        }
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operations="/";
            commaClick=0;
            jTextFieldMem.setText(String.valueOf(firstnum + "/" ));
        }
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        if(checkEmpty())
        {
            
        }else {
            firstnum = Double.parseDouble(jTextField1.getText());
            jTextField1.setText("");
            operations="%";
            jTextFieldMem.setText(String.valueOf(firstnum + "%" ));
        }
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        jTextField1.setText(copy);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        copy=jTextField1.getText();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new epistimoniki().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonMult;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JButton jButtonnum0;
    private javax.swing.JButton jButtonnum1;
    private javax.swing.JButton jButtonnum2;
    private javax.swing.JButton jButtonnum3;
    private javax.swing.JButton jButtonnum4;
    private javax.swing.JButton jButtonnum5;
    private javax.swing.JButton jButtonnum6;
    private javax.swing.JButton jButtonnum7;
    private javax.swing.JButton jButtonnum8;
    private javax.swing.JButton jButtonnum9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBoitheia;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenuItem jMenuHelp;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jMenuProvoli;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldMem;
    // End of variables declaration//GEN-END:variables
}
