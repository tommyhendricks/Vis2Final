/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import main.Letter;
import main.PromptGetter;

/**
 *
 * @author Tommy Hendricks
 */
public class TypeSomethingVinillaRaceWin extends javax.swing.JFrame {
    private Color black = Color.WHITE;
    private Color green = Color.GREEN;
    private Color red = new Color(100, 40, 60);
    private int currentLetterNumber;
    private String prompt;
    main.TypeSomethingVinillaRace raceData;
    UI.MainScreenWin msw;
    /**
     * Creates new form TypeSomethingVinillaRaceWin
     */
    public TypeSomethingVinillaRaceWin(MainScreenWin msw) {
        this.msw = msw;
        currentLetterNumber = 0;
        
        PromptGetter pg = new PromptGetter();
        prompt = pg.getPrompt();
        raceData = new main.TypeSomethingVinillaRace(prompt);
        
        initComponents();
        
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        this.panePromptArea.setCharacterAttributes(attributeSet, true);
                
        Font font = new Font("Serif", Font.BOLD, 18);
        this.panePromptArea.setFont(font);
        raceData.setNormalLetters(prompt);
        this.setPaneAreaPrompt();
    }
    
    /**
     * This will set the text of the prompt area to match the current inputs.
     * This will be updated should be updated every time a key is pressed.
     */
    public void setPaneAreaPrompt(){
        StyledDocument doc = this.panePromptArea.getStyledDocument();
        Style style = this.panePromptArea.addStyle("", null);
        panePromptArea.setText("");
        try{
            StyleConstants.setForeground(style, green);
            StyleConstants.setBackground(style, Color.BLACK);
            doc.insertString(doc.getLength(), raceData.getCorrectLetters(), style);
            StyleConstants.setForeground(style, Color.white);
            StyleConstants.setBackground(style, red);
            doc.insertString(doc.getLength(), raceData.getIncorrectLetters(), style);
            StyleConstants.setForeground(style, black);
            StyleConstants.setBackground(style, Color.BLACK);
            doc.insertString(doc.getLength(), raceData.getNormalLetters(), style);
        }
        catch(Exception e){
            
        }
        
        
    }
    
    public void setTextPaneText(){
        
        
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
        NextRace = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paneUserInputArea = new javax.swing.JTextPane();
        MainMenu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TypeSpeed = new javax.swing.JTextPane();
        correctColorShowerPannel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panePromptArea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        NextRace.setText("Next Race >>");
        NextRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextRaceActionPerformed(evt);
            }
        });

        paneUserInputArea.setBackground(new java.awt.Color(0, 0, 0));
        paneUserInputArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        paneUserInputArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paneUserInputArea.setForeground(new java.awt.Color(255, 255, 255));
        paneUserInputArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paneUserInputAreaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paneUserInputAreaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paneUserInputAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(paneUserInputArea);

        MainMenu.setText("<< Main Menu");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });

        TypeSpeed.setEditable(false);
        TypeSpeed.setBackground(new java.awt.Color(0, 0, 0));
        TypeSpeed.setBorder(null);
        TypeSpeed.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(TypeSpeed);

        correctColorShowerPannel.setBackground(new java.awt.Color(255, 255, 255));
        correctColorShowerPannel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout correctColorShowerPannelLayout = new javax.swing.GroupLayout(correctColorShowerPannel);
        correctColorShowerPannel.setLayout(correctColorShowerPannelLayout);
        correctColorShowerPannelLayout.setHorizontalGroup(
            correctColorShowerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        correctColorShowerPannelLayout.setVerticalGroup(
            correctColorShowerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        panePromptArea.setEditable(false);
        panePromptArea.setBackground(new java.awt.Color(0, 0, 0));
        panePromptArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panePromptArea.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(panePromptArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MainMenu)
                        .addGap(500, 500, 500)
                        .addComponent(NextRace))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                        .addComponent(correctColorShowerPannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(correctColorShowerPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenu)
                    .addComponent(NextRace))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRaceActionPerformed
     
    }//GEN-LAST:event_NextRaceActionPerformed

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        this.setVisible(false);
        
        msw.setVisible(true);
    }//GEN-LAST:event_MainMenuActionPerformed

    private void paneUserInputAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paneUserInputAreaKeyTyped
        if(raceData.getCurrentWrong() <= 6 && !raceData.getPromptcompleted())
            this.paneUserInputArea.setEditable(true);
        else
            this.paneUserInputArea.setEditable(false);

        if(evt.getKeyChar() == KeyEvent.VK_SPACE){
            this.raceData.checkCorrect(' ');
            this.TypeSpeed.setText(String.format("%.0f", raceData.getTypingSpeed()));
        }
        else if(evt.getKeyChar() == KeyEvent.VK_BACKSPACE && raceData.getIsWrong()){
            this.raceData.backSpace();
        }
        else if(evt.getKeyChar() != KeyEvent.VK_BACKSPACE){
            this.raceData.checkCorrect(evt.getKeyChar()); 
        }
        this.setPaneAreaPrompt();    
        this.paneUserInputArea.setText(raceData.getDisplayString());
        
        if(!raceData.getIsWrong())
            this.correctColorShowerPannel.setBackground(green);
        else
            this.correctColorShowerPannel.setBackground(red);
    }//GEN-LAST:event_paneUserInputAreaKeyTyped

    private void paneUserInputAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paneUserInputAreaKeyReleased
       
        
    }//GEN-LAST:event_paneUserInputAreaKeyReleased

    private void paneUserInputAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paneUserInputAreaKeyPressed
         
    }//GEN-LAST:event_paneUserInputAreaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenu;
    private javax.swing.JButton NextRace;
    private javax.swing.JTextPane TypeSpeed;
    private javax.swing.JPanel correctColorShowerPannel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane panePromptArea;
    private javax.swing.JTextPane paneUserInputArea;
    // End of variables declaration//GEN-END:variables
}
