
import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {

    public float primerNumero;
    public float segundoNumero;
    public String operador;
    private float resultado;
  
   
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        borra = new javax.swing.JButton();
        parenabre = new javax.swing.JButton();
        parenCierra = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        dividiendo = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        SIete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        Nueve = new javax.swing.JButton();
        Mutiplicacion = new javax.swing.JButton();
        expo = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Uno = new javax.swing.JButton();
        Dos = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        Cero = new javax.swing.JButton();
        Coma = new javax.swing.JButton();
        porciento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setColumns(20);
        pantalla.setRows(5);
        jScrollPane1.setViewportView(pantalla);

        borra.setBackground(new java.awt.Color(210, 30, 37));
        borra.setText("<= ");
        borra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraActionPerformed(evt);
            }
        });

        parenabre.setText("(");
        parenabre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenabreActionPerformed(evt);
            }
        });

        parenCierra.setText(")");
        parenCierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenCierraActionPerformed(evt);
            }
        });

        mod.setText("mod");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        pi.setText("π");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        dividiendo.setText("÷");
        dividiendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividiendoActionPerformed(evt);
            }
        });

        Raiz.setText("√");
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        SIete.setText("7");
        SIete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIeteActionPerformed(evt);
            }
        });

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        Nueve.setText("9");
        Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NueveActionPerformed(evt);
            }
        });

        Mutiplicacion.setText("x");
        Mutiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MutiplicacionActionPerformed(evt);
            }
        });

        expo.setText("^");
        expo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expoActionPerformed(evt);
            }
        });

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        Resta.setText("-");
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        Uno.setText("1");
        Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnoActionPerformed(evt);
            }
        });

        Dos.setText("2");
        Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosActionPerformed(evt);
            }
        });

        Tres.setText("3");
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });

        Suma.setText("+");
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(20, 202, 23));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        Cero.setText("0");
        Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeroActionPerformed(evt);
            }
        });

        Coma.setText(",");
        Coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComaActionPerformed(evt);
            }
        });

        porciento.setText("%");
        porciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcientoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 229, 126));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(borra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parenabre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parenCierra, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SIete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dividiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mutiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Coma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(porciento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(parenabre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(parenCierra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SIete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dividiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mutiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Uno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tres, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Coma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(porciento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
      this.pantalla.setText(this.pantalla.getText()+"3");
       
    }//GEN-LAST:event_TresActionPerformed

    private void UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnoActionPerformed
       this.pantalla.setText(this.pantalla.getText()+"1");
    
    }//GEN-LAST:event_UnoActionPerformed

    private void DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosActionPerformed
       this.pantalla.setText(this.pantalla.getText()+"2");
 
    }//GEN-LAST:event_DosActionPerformed

    private void CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeroActionPerformed
       this.pantalla.setText(this.pantalla.getText()+"0");
   
    }//GEN-LAST:event_CeroActionPerformed

    private void ComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComaActionPerformed
       this.pantalla.setText(this.pantalla.getText()+",");
  
    }//GEN-LAST:event_ComaActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"4");
       
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"5");
        
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
    this.pantalla.setText(this.pantalla.getText()+"6");
   
    }//GEN-LAST:event_seisActionPerformed

    private void SIeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIeteActionPerformed
       this.pantalla.setText(this.pantalla.getText()+"7");
    
    }//GEN-LAST:event_SIeteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
       this.pantalla.setText(this.pantalla.getText()+"8");
     
    }//GEN-LAST:event_ochoActionPerformed

    private void NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NueveActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"9");
        
    }//GEN-LAST:event_NueveActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        primerNumero = Float.parseFloat(pantalla.getText());
        operador ="+";
        pantalla.setText("");
    }//GEN-LAST:event_SumaActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        primerNumero = Float.parseFloat(pantalla.getText());
        operador ="-";
        pantalla.setText("");

    }//GEN-LAST:event_RestaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
                segundoNumero = Float.parseFloat(pantalla.getText());
        float resultado = 0;
                switch(operador){
                    case "+":
                    resultado = primerNumero + segundoNumero;
                    break;
                    case "-":
                    resultado = primerNumero - segundoNumero;
                    break;
                    case "*":
                    resultado = primerNumero * segundoNumero;
                    break;
                    case "mod":
                   resultado = primerNumero % segundoNumero;
                   break;
                  case "/":
                        if (segundoNumero !=0){
                            resultado = primerNumero / segundoNumero;
                        }else {
                            pantalla.setText("Error: Division por cero");
                            return;
                        }
                        break;
        default:
            pantalla.setText("Operacion descococida");
                }
                pantalla.setText(String.valueOf(resultado));
                

    }//GEN-LAST:event_igualActionPerformed

    private void borraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraActionPerformed
        this.pantalla.setText("");
    }//GEN-LAST:event_borraActionPerformed

    private void MutiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MutiplicacionActionPerformed
        primerNumero = Float.parseFloat(pantalla.getText());
        operador ="*";
        pantalla.setText("");
    }//GEN-LAST:event_MutiplicacionActionPerformed

    private void dividiendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividiendoActionPerformed
        primerNumero = Float.parseFloat(pantalla.getText());
        operador ="/";
        pantalla.setText("");

    }//GEN-LAST:event_dividiendoActionPerformed

    private void porcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcientoActionPerformed
        primerNumero = Float.parseFloat(pantalla.getText());
           float resultado = primerNumero / 100;
           pantalla.setText(String.valueOf(resultado));
    }//GEN-LAST:event_porcientoActionPerformed

    private void expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expoActionPerformed
     try {
                double numero = Double.parseDouble(pantalla.getText());
                double exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exponente:"));
                if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "Error: No se admiten exponentes negativos.");
                    return;
                }
                double resultado = Math.pow(numero, exponente);
                pantalla.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
            }

    }//GEN-LAST:event_expoActionPerformed
    @SuppressWarnings("null")
    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
if (Float.parseFloat(pantalla.getText()) < 0) {
    JOptionPane.showMessageDialog(null, "Error: no se puede encontrar la raíz cuadrada de un número negativo.");
    return;
  }
  resultado = (float) Math.sqrt(Float.parseFloat(pantalla.getText()));
  pantalla.setText(String.valueOf(resultado));
    }//GEN-LAST:event_RaizActionPerformed

    private void parenCierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenCierraActionPerformed
       this.pantalla.setText(this.pantalla.getText()+")");   // TODO add your handling code here:
    }//GEN-LAST:event_parenCierraActionPerformed

    private void parenabreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenabreActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"(");  // TODO add your handling code here:
    }//GEN-LAST:event_parenabreActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
         pantalla.setText(String.valueOf(Math.PI));// TODO add your handling code here:
    }//GEN-LAST:event_piActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
           primerNumero = Float.parseFloat(pantalla.getText());
           operador = "mod";
           pantalla.setText("");
    }//GEN-LAST:event_modActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cero;
    private javax.swing.JButton Coma;
    private javax.swing.JButton Dos;
    private javax.swing.JButton Mutiplicacion;
    private javax.swing.JButton Nueve;
    private javax.swing.JButton Raiz;
    private javax.swing.JButton Resta;
    private javax.swing.JButton SIete;
    private javax.swing.JButton Suma;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Uno;
    private javax.swing.JButton borra;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividiendo;
    private javax.swing.JButton expo;
    private javax.swing.JButton igual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mod;
    private javax.swing.JButton ocho;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JButton parenCierra;
    private javax.swing.JButton parenabre;
    private javax.swing.JButton pi;
    private javax.swing.JButton porciento;
    private javax.swing.JButton seis;
    // End of variables declaration//GEN-END:variables

}
