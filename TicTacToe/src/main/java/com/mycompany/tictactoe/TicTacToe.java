/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nadee
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    
    private String startGame = "X"; //chi inizia il gioco
    private int xCount = 0;
    private int oCount = 0;
    
    public TicTacToe() {
        initComponents();
    }

    private void gameScore(){  //mette in display(lable) score 
        jLableScoreX.setText(String.valueOf(xCount)); 
        jLableScoreO.setText(String.valueOf(oCount));
    }
    
    private void chooseAPlayer(){  //switch giocatori X e O ogni turno
        if (startGame.equalsIgnoreCase("X")){ // controlla chi inizia
            startGame = "O"; //se ha iniziato X inizia O adesso
        }else{
            startGame = "X";
        }
    }
    
    
    private void resetGame() {
    
        //clears buttons
        jButtonTic1.setText("");
        jButtonTic2.setText("");
        jButtonTic3.setText("");
        jButtonTic4.setText("");
        jButtonTic5.setText("");
        jButtonTic6.setText("");
        jButtonTic7.setText("");
        jButtonTic8.setText("");
        jButtonTic9.setText("");
      
        //reser BG colors
        jButtonTic1.setBackground(Color.LIGHT_GRAY);
        jButtonTic2.setBackground(Color.LIGHT_GRAY);
        jButtonTic3.setBackground(Color.LIGHT_GRAY);
        jButtonTic4.setBackground(Color.LIGHT_GRAY);
        jButtonTic5.setBackground(Color.LIGHT_GRAY);
        jButtonTic6.setBackground(Color.LIGHT_GRAY);
        jButtonTic7.setBackground(Color.LIGHT_GRAY);
        jButtonTic8.setBackground(Color.LIGHT_GRAY);
        jButtonTic9.setBackground(Color.LIGHT_GRAY);
  
}
    
    private void winningGame(){
        
        // get X o O di 
        String b1 = jButtonTic1.getText();
        String b2 = jButtonTic2.getText();
        String b3 = jButtonTic3.getText();
        String b4 = jButtonTic4.getText();
        String b5 = jButtonTic5.getText();
        String b6 = jButtonTic6.getText();
        String b7 = jButtonTic7.getText();
        String b8 = jButtonTic8.getText();
        String b9 = jButtonTic9.getText();
        
        //tutte le possibili combinazioni
        if (b1.equals("X") && b2.equals("X") && b3.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            jButtonTic1.setBackground(Color.GREEN);
            jButtonTic2.setBackground(Color.GREEN);
            jButtonTic3.setBackground(Color.GREEN);
            xCount++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }
            gameScore(); //display score in labls
            resetGame();    
        }
        
        if (b4.equals("X") && b5.equals("X") && b6.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic4.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic6.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();    
        }
        
        if (b7.equals("X") && b8.equals("X") && b9.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic7.setBackground(Color.GREEN);
            jButtonTic8.setBackground(Color.GREEN);
            jButtonTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();
        }
        
        if (b1.equals("O") && b2.equals("O") && b3.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic1.setBackground(Color.GREEN);
            jButtonTic2.setBackground(Color.GREEN);
            jButtonTic3.setBackground(Color.GREEN);
            oCount++;
            gameScore(); 
            resetGame();
        }
        if (b4.equals("O") && b5.equals("O") && b6.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic4.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic6.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();    
        }
        if (b7.equals("O") && b8.equals("O") && b9.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic7.setBackground(Color.GREEN);
            jButtonTic8.setBackground(Color.GREEN);
            jButtonTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();
        }
        
        if (b1.equals("O") && b5.equals("O") && b9.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic1.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();
        }
        
        if (b1.equals("X") && b5.equals("X") && b9.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic1.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();
        }
        
        if (b3.equals("X") && b5.equals("X") && b7.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic3.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic7.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();
        }
        
        if (b3.equals("O") && b5.equals("O") && b7.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic3.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();
        }
        if (b1.equals("O") && b4.equals("O") && b7.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic1.setBackground(Color.GREEN);
            jButtonTic4.setBackground(Color.GREEN);
            jButtonTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();
        }
        if (b2.equals("O") && b5.equals("O") && b8.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic2.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic8.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();
        }
        if (b3.equals("O") && b6.equals("O") && b9.equals("O")){
            
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic3.setBackground(Color.GREEN);
            jButtonTic6.setBackground(Color.GREEN);
            jButtonTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            resetGame();
        }
        if (b1.equals("X") && b4.equals("X") && b7.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic1.setBackground(Color.GREEN);
            jButtonTic4.setBackground(Color.GREEN);
            jButtonTic7.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();
        }
        if (b2.equals("X") && b5.equals("X") && b8.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic2.setBackground(Color.GREEN);
            jButtonTic5.setBackground(Color.GREEN);
            jButtonTic8.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();
        }
        
        if (b3.equals("X") && b6.equals("X") && b9.equals("X")){
            
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButtonTic3.setBackground(Color.GREEN);
            jButtonTic6.setBackground(Color.GREEN);
            jButtonTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            resetGame();
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
        jPanel3 = new javax.swing.JPanel();
        jButtonTic9 = new javax.swing.JButton();
        jButtonTic1 = new javax.swing.JButton();
        jButtonTic2 = new javax.swing.JButton();
        jButtonTic3 = new javax.swing.JButton();
        jButtonTic4 = new javax.swing.JButton();
        jButtonTic5 = new javax.swing.JButton();
        jButtonTic6 = new javax.swing.JButton();
        jButtonTic7 = new javax.swing.JButton();
        jButtonTic8 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLableScoreX = new javax.swing.JLabel();
        jLabelPlayerX = new javax.swing.JLabel();
        jLabelPlayerO = new javax.swing.JLabel();
        jLableScoreO = new javax.swing.JLabel();
        jButtonNewgame = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTic9.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 160, 150));

        jButtonTic1.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 150));

        jButtonTic2.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 160, 150));

        jButtonTic3.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 160, 150));

        jButtonTic4.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, 150));

        jButtonTic5.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 150));

        jButtonTic6.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, 150));

        jButtonTic7.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 160, 150));

        jButtonTic8.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        jButtonTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 160, 150));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 640, 610));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 640, 740));

        jPanel11.setBackground(new java.awt.Color(153, 153, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 640, 740));

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel17.setBackground(new java.awt.Color(153, 153, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(153, 153, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 640, 740));

        jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 560, 270));

        jLableScoreX.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLableScoreX.setForeground(new java.awt.Color(255, 153, 102));
        jLableScoreX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLableScoreX.setText("0");
        jLableScoreX.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel11.add(jLableScoreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 240, 50));

        jLabelPlayerX.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 36)); // NOI18N
        jLabelPlayerX.setForeground(new java.awt.Color(255, 153, 51));
        jLabelPlayerX.setText("Player X : ");
        jPanel11.add(jLabelPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 210, 60));

        jLabelPlayerO.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 36)); // NOI18N
        jLabelPlayerO.setForeground(new java.awt.Color(102, 255, 255));
        jLabelPlayerO.setText("Player O : ");
        jPanel11.add(jLabelPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 190, 50));

        jLableScoreO.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLableScoreO.setForeground(new java.awt.Color(51, 255, 255));
        jLableScoreO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLableScoreO.setText("0");
        jPanel11.add(jLableScoreO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 240, 50));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 560, 270));

        jButtonNewgame.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        jButtonNewgame.setText("New Game");
        jButtonNewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewgameActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonNewgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 560, 90));

        jButtonReset.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 270, 90));

        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 51, 51));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 260, 90));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 640, 610));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 640, 740));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 640, 740));

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel4.setText("Tic Tac Toe");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private JFrame frame;
    private void jButtonNewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewgameActionPerformed
        // TODO add your handling code here:
        jButtonTic1.setEnabled(true);
        jButtonTic2.setEnabled(true);
        jButtonTic3.setEnabled(true);
        jButtonTic4.setEnabled(true);
        jButtonTic5.setEnabled(true);
        jButtonTic6.setEnabled(true);
        jButtonTic7.setEnabled(true);
        jButtonTic8.setEnabled(true);
        jButtonTic9.setEnabled(true);
        
        jLableScoreX.setText("0");
        jLableScoreO.setText("0");
        
        jButtonTic1.setText("");
        jButtonTic2.setText("");
        jButtonTic3.setText("");
        jButtonTic4.setText("");
        jButtonTic5.setText("");
        jButtonTic6.setText("");
        jButtonTic7.setText("");
        jButtonTic8.setText("");
        jButtonTic9.setText("");
        
        jButtonTic1.setBackground(Color.LIGHT_GRAY);
        jButtonTic2.setBackground(Color.LIGHT_GRAY);
        jButtonTic3.setBackground(Color.LIGHT_GRAY);
        jButtonTic4.setBackground(Color.LIGHT_GRAY);
        jButtonTic5.setBackground(Color.LIGHT_GRAY);
        jButtonTic6.setBackground(Color.LIGHT_GRAY);
        jButtonTic7.setBackground(Color.LIGHT_GRAY);
        jButtonTic8.setBackground(Color.LIGHT_GRAY);
        jButtonTic9.setBackground(Color.LIGHT_GRAY);
        
        xCount = 0;
        oCount = 0;
        gameScore();
        
        startGame = "X";
    }//GEN-LAST:event_jButtonNewgameActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit"); 
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        { //chiede al utente la conferma
            System.exit(0); //yes(termina)
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jButtonTic1.setEnabled(true);
        jButtonTic2.setEnabled(true);
        jButtonTic3.setEnabled(true);
        jButtonTic4.setEnabled(true);
        jButtonTic5.setEnabled(true);
        jButtonTic6.setEnabled(true);
        jButtonTic7.setEnabled(true);
        jButtonTic8.setEnabled(true);
        jButtonTic9.setEnabled(true);
        
        jButtonTic1.setText("");
        jButtonTic2.setText("");
        jButtonTic3.setText("");
        jButtonTic4.setText("");
        jButtonTic5.setText("");
        jButtonTic6.setText("");
        jButtonTic7.setText("");
        jButtonTic8.setText("");
        jButtonTic9.setText("");
        
        jButtonTic1.setBackground(Color.LIGHT_GRAY);
        jButtonTic2.setBackground(Color.LIGHT_GRAY);
        jButtonTic3.setBackground(Color.LIGHT_GRAY);
        jButtonTic4.setBackground(Color.LIGHT_GRAY);
        jButtonTic5.setBackground(Color.LIGHT_GRAY);
        jButtonTic6.setBackground(Color.LIGHT_GRAY);
        jButtonTic7.setBackground(Color.LIGHT_GRAY);
        jButtonTic8.setBackground(Color.LIGHT_GRAY);
        jButtonTic9.setBackground(Color.LIGHT_GRAY);

        
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic1ActionPerformed
        // TODO add your handling code here:
        jButtonTic1.setText(startGame);//X o O
       
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic1ActionPerformed

    private void jButtonTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic2ActionPerformed
        // TODO add your handling code here:
        jButtonTic2.setText(startGame);
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic2ActionPerformed

    private void jButtonTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic3ActionPerformed
        // TODO add your handling code here:
        jButtonTic3.setText(startGame);
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic3ActionPerformed

    private void jButtonTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic4ActionPerformed
        // TODO add your handling code here:
        jButtonTic4.setText(startGame);

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic4ActionPerformed

    private void jButtonTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic5ActionPerformed
        // TODO add your handling code here:
        jButtonTic5.setText(startGame);
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic5ActionPerformed

    private void jButtonTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic6ActionPerformed
        // TODO add your handling code here:
        jButtonTic6.setText(startGame);

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic6ActionPerformed

    private void jButtonTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic7ActionPerformed
        // TODO add your handling code here:
        jButtonTic7.setText(startGame);

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic7ActionPerformed

    private void jButtonTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic8ActionPerformed
        // TODO add your handling code here:
        jButtonTic8.setText(startGame);

        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic8ActionPerformed

    private void jButtonTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTic9ActionPerformed
        // TODO add your handling code here:
        jButtonTic9.setText(startGame);
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jButtonTic9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonNewgame;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTic1;
    private javax.swing.JButton jButtonTic2;
    private javax.swing.JButton jButtonTic3;
    private javax.swing.JButton jButtonTic4;
    private javax.swing.JButton jButtonTic5;
    private javax.swing.JButton jButtonTic6;
    private javax.swing.JButton jButtonTic7;
    private javax.swing.JButton jButtonTic8;
    private javax.swing.JButton jButtonTic9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPlayerO;
    private javax.swing.JLabel jLabelPlayerX;
    private javax.swing.JLabel jLableScoreO;
    private javax.swing.JLabel jLableScoreX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
