
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author shrey
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount =0;
    private int oCount =0;
    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    
    private  void gameScore()
    {
        playerxx.setText(String.valueOf(xCount));
        playeroo.setText(String.valueOf(oCount));
    }
    private void choose_a_player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }else{
            startGame = "X";
        }       
    }
    private void WinnigGame(){
        String b1 = txtbt1.getText();
        String b2 = txtbt2.getText();
        String b3 = txtbt3.getText();
        
        String b4 = txtbt4.getText();
        String b5 = txtbt5.getText();
        String b6 = txtbt6.getText();
        
        String b7 = txtbt7.getText();
        String b8 = txtbt8.getText();
        String b9 = txtbt9.getText();
          
        // player x coding
        if(b1==("X")&& b2==("X")&& b3==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt1.setBackground(java.awt.Color.ORANGE);
            txtbt2.setBackground(java.awt.Color.ORANGE);
            txtbt3.setBackground(java.awt.Color.ORANGE);
        }
        if(b4==("X")&& b5==("X")&& b6==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt4.setBackground(java.awt.Color.ORANGE);
            txtbt5.setBackground(java.awt.Color.ORANGE);
            txtbt6.setBackground(java.awt.Color.ORANGE);
        }
        if(b7==("X")&& b8==("X")&& b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt7.setBackground(java.awt.Color.ORANGE);
            txtbt8.setBackground(java.awt.Color.ORANGE);
            txtbt9.setBackground(java.awt.Color.ORANGE);
        }
        if(b1==("X")&& b4==("X")&& b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt1.setBackground(java.awt.Color.ORANGE);
            txtbt4.setBackground(java.awt.Color.ORANGE);
            txtbt7.setBackground(java.awt.Color.ORANGE);
        }
        if(b2==("X")&& b5==("X")&& b8==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt2.setBackground(java.awt.Color.ORANGE);
            txtbt5.setBackground(java.awt.Color.ORANGE);
            txtbt8.setBackground(java.awt.Color.ORANGE);
        }
        if(b3==("X")&& b6==("X")&& b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt3.setBackground(java.awt.Color.ORANGE);
            txtbt6.setBackground(java.awt.Color.ORANGE);
            txtbt9.setBackground(java.awt.Color.ORANGE);
        }
        if(b1==("X")&& b5==("X")&& b9==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt1.setBackground(java.awt.Color.ORANGE);
            txtbt5.setBackground(java.awt.Color.ORANGE);
            txtbt9.setBackground(java.awt.Color.ORANGE);
        }
        if(b3==("X")&& b5==("X")&& b7==("X")){
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbt3.setBackground(java.awt.Color.ORANGE);
            txtbt5.setBackground(java.awt.Color.ORANGE);
            txtbt7.setBackground(java.awt.Color.ORANGE);
        }
        
         // player O coding
        if(b1==("O")&& b2==("O")&& b3==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt1.setBackground(java.awt.Color.BLUE);
            txtbt2.setBackground(java.awt.Color.BLUE);
            txtbt3.setBackground(java.awt.Color.BLUE);
        }
        if(b4==("O")&& b5==("O")&& b6==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt4.setBackground(java.awt.Color.BLUE);
            txtbt5.setBackground(java.awt.Color.BLUE);
            txtbt6.setBackground(java.awt.Color.BLUE);
        }
        if(b7==("O")&& b8==("O")&& b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt7.setBackground(java.awt.Color.BLUE);
            txtbt8.setBackground(java.awt.Color.BLUE);
            txtbt9.setBackground(java.awt.Color.BLUE);
        }
        if(b1==("O")&& b4==("O")&& b7==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt1.setBackground(java.awt.Color.BLUE);
            txtbt4.setBackground(java.awt.Color.BLUE);
            txtbt7.setBackground(java.awt.Color.BLUE);
        }
        if(b2==("O")&& b5==("O")&& b8==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt2.setBackground(java.awt.Color.BLUE);
            txtbt5.setBackground(java.awt.Color.BLUE);
            txtbt8.setBackground(java.awt.Color.BLUE);
        }
        if(b3==("O")&& b6==("O")&& b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt3.setBackground(java.awt.Color.BLUE);
            txtbt6.setBackground(java.awt.Color.BLUE);
            txtbt9.setBackground(java.awt.Color.BLUE);
        }
        if(b1==("O")&& b5==("O")&& b9==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt1.setBackground(java.awt.Color.BLUE);
            txtbt5.setBackground(java.awt.Color.BLUE);
            txtbt9.setBackground(java.awt.Color.BLUE);
        }
        if(b3==("O")&& b5==("O")&& b7==("O")){
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbt3.setBackground(java.awt.Color.BLUE);
            txtbt5.setBackground(java.awt.Color.BLUE);
            txtbt7.setBackground(java.awt.Color.BLUE);
        }
        
        
        
        
        
        

    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbt2 = new javax.swing.JButton();
        txtbt3 = new javax.swing.JButton();
        txtbt1 = new javax.swing.JButton();
        txtbt5 = new javax.swing.JButton();
        txtbt6 = new javax.swing.JButton();
        txtbt4 = new javax.swing.JButton();
        txtbt8 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbt7 = new javax.swing.JButton();
        txtbt9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        playerooo = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerxx = new javax.swing.JLabel();
        playeroo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(336, 336, 336))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtbt2.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt2.setToolTipText("");
        txtbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt2ActionPerformed(evt);
            }
        });

        txtbt3.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt3.setToolTipText("");
        txtbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt3ActionPerformed(evt);
            }
        });

        txtbt1.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt1.setToolTipText("");
        txtbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt1ActionPerformed(evt);
            }
        });

        txtbt5.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt5.setToolTipText("");
        txtbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt5ActionPerformed(evt);
            }
        });

        txtbt6.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt6.setToolTipText("");
        txtbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt6ActionPerformed(evt);
            }
        });

        txtbt4.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt4.setToolTipText("");
        txtbt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt4ActionPerformed(evt);
            }
        });

        txtbt8.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt8.setToolTipText("");
        txtbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt8ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 0, 0));
        txtexit.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.setToolTipText("");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbt7.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt7.setToolTipText("");
        txtbt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt7ActionPerformed(evt);
            }
        });

        txtbt9.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        txtbt9.setToolTipText("");
        txtbt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(51, 51, 255));
        txtreset.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.setToolTipText("");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        playerooo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray));

        playerx.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        playerx.setText("PLAYER  X :");

        playero.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        playero.setText("PLAYER O :");

        playerxx.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        playerxx.setForeground(new java.awt.Color(0, 0, 255));
        playerxx.setText("XXXXXXX");

        playeroo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        playeroo.setForeground(new java.awt.Color(0, 0, 255));
        playeroo.setText("XXXXXXX");

        javax.swing.GroupLayout playeroooLayout = new javax.swing.GroupLayout(playerooo);
        playerooo.setLayout(playeroooLayout);
        playeroooLayout.setHorizontalGroup(
            playeroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playeroooLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(playeroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playero)
                    .addComponent(playerx))
                .addGap(31, 31, 31)
                .addGroup(playeroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerxx)
                    .addComponent(playeroo))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        playeroooLayout.setVerticalGroup(
            playeroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playeroooLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(playeroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(playerxx))
                .addGap(42, 42, 42)
                .addGroup(playeroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(playeroo))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jLabel2.setText("@shrey");

        txtrestart.setBackground(new java.awt.Color(255, 153, 255));
        txtrestart.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        txtrestart.setText("RESTART");
        txtrestart.setToolTipText("");
        txtrestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtrestart, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(618, Short.MAX_VALUE)
                    .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(263, 263, 263)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtrestart, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(471, Short.MAX_VALUE)
                    .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(119, 119, 119)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbt1.setText(null);
        txtbt2.setText(null);
        txtbt3.setText(null);
        
        txtbt4.setText(null);
        txtbt5.setText(null);
        txtbt6.setText(null);
        
        txtbt7.setText(null);
        txtbt8.setText(null);
        txtbt9.setText(null);
        
        txtbt1.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt2.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt3.setBackground(java.awt.Color.LIGHT_GRAY);
        
        txtbt4.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt5.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt6.setBackground(java.awt.Color.LIGHT_GRAY);
        
        txtbt7.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt8.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt9.setBackground(java.awt.Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==
                JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt1ActionPerformed
        // TODO add your handling code here:
         txtbt1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt1.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt1.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt1ActionPerformed

    private void txtbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt2ActionPerformed
        // TODO add your handling code here:
        txtbt2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt2.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt2.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt2ActionPerformed

    private void txtbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt3ActionPerformed
        // TODO add your handling code here:
          txtbt3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt3.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt3.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt3ActionPerformed

    private void txtbt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt4ActionPerformed
        // TODO add your handling code here:
          txtbt4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt4.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt4.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt4ActionPerformed

    private void txtbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt5ActionPerformed
        // TODO add your handling code here:
          txtbt5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt5.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt5.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt5ActionPerformed

    private void txtbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt6ActionPerformed
        // TODO add your handling code here:
          txtbt6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt6.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt6.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt6ActionPerformed

    private void txtbt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt7ActionPerformed
        // TODO add your handling code here:
          txtbt7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt7.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt7.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt7ActionPerformed

    private void txtbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt8ActionPerformed
        // TODO add your handling code here:
          txtbt8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt8.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt8.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt8ActionPerformed

    private void txtbt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt9ActionPerformed
        // TODO add your handling code here:
          txtbt9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbt9.setForeground(java.awt.Color.RED);
              
        }else{
             txtbt9.setForeground(java.awt.Color.MAGENTA);
            
        }
        choose_a_player();
        WinnigGame();
    }//GEN-LAST:event_txtbt9ActionPerformed

    private void txtrestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrestartActionPerformed
        // TODO add your handling code here:
          txtbt1.setText(null);
        txtbt2.setText(null);
        txtbt3.setText(null);
        
        txtbt4.setText(null);
        txtbt5.setText(null);
        txtbt6.setText(null);
        
        txtbt7.setText(null);
        txtbt8.setText(null);
        txtbt9.setText(null);
        
        txtbt1.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt2.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt3.setBackground(java.awt.Color.LIGHT_GRAY);
        
        txtbt4.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt5.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt6.setBackground(java.awt.Color.LIGHT_GRAY);
        
        txtbt7.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt8.setBackground(java.awt.Color.LIGHT_GRAY);
        txtbt9.setBackground(java.awt.Color.LIGHT_GRAY);
        
        
        playerxx.setText("0");
        xCount = 0;
        playeroo.setText("0");
        oCount = 0;
        
        
        
        
    }//GEN-LAST:event_txtrestartActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playeroo;
    private javax.swing.JPanel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxx;
    private javax.swing.JButton txtbt1;
    private javax.swing.JButton txtbt2;
    private javax.swing.JButton txtbt3;
    private javax.swing.JButton txtbt4;
    private javax.swing.JButton txtbt5;
    private javax.swing.JButton txtbt6;
    private javax.swing.JButton txtbt7;
    private javax.swing.JButton txtbt8;
    private javax.swing.JButton txtbt9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    private javax.swing.JButton txtrestart;
    // End of variables declaration//GEN-END:variables
}
