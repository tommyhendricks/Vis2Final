/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Tommy Hendricks
 */
public class TypeSomethingInstantDeathWin extends javax.swing.JFrame implements ActionListener{
    private MainScreenWin mw;
    private int loop;
    private final int speed = 1000;
    private boolean startRace;
    private Timer timer;
    
    private main.TypeSomethingInstantDeath raceData;
    
    private final Color black = Color.WHITE;
    private final Color green = Color.GREEN;
    private final Color red = new Color(100, 40, 60);
    
    /**
     * Creates new form TypeSomethingInstantDeathWin
     */
    public TypeSomethingInstantDeathWin(MainScreenWin mw) {
        loop = 4;
        startRace = false;
        
        raceData = new main.TypeSomethingInstantDeath();
        this.mw = mw;
        
        initComponents();
        raceData.startRace();
        
        //Setting up the jTextArea so that it will work correctly 
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        panePromptArea.setCharacterAttributes(attributeSet, true);
                
        Font font = new Font("Arial", Font.BOLD, 26);
        panePromptArea.setFont(font);
        
        this.setPaneAreaPrompt();
        
        timer = new Timer(speed, this);
        timer.setInitialDelay(0);
        timer.start(); 
        
        paneUserInputArea.setEditable(false);
        nextRace.setEnabled(false);
        //this.paneUserInputArea.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.loop == 4)
            startLight.setIcon(new ImageIcon(getClass().getResource("/RedLight.png")));
        else if (loop == 2)
           startLight.setIcon(new ImageIcon(getClass().getResource("/YellowLight.png")));
        else if(loop == 0){
            startLight.setIcon(new ImageIcon(getClass().getResource("/GreenLight.png")));
            startRace = true;
            paneUserInputArea.setEditable(true);
            paneUserInputArea.requestFocus();
            raceData.startTimer();
            timer.stop();
        }
        TimeLeftTillRace.setText(String.valueOf(loop));
        loop--;
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
            
            StyleConstants.setForeground(style, Color.WHITE);
            StyleConstants.setBackground(style, Color.GRAY);
            doc.insertString(doc.getLength(), raceData.getCurrentLetterToDisplay(), style);
            
            StyleConstants.setForeground(style, black);
            StyleConstants.setBackground(style, Color.BLACK);
            doc.insertString(doc.getLength(), raceData.getNormalLetters(), style);
        }
        catch(Exception e){
            
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panePromptArea = new javax.swing.JTextPane();
        correct = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paneUserInputArea = new javax.swing.JTextPane();
        nextRace = new javax.swing.JButton();
        mainMenu = new javax.swing.JButton();
        startLight = new javax.swing.JLabel();
        TimeLeftTillRace = new javax.swing.JLabel();
        TypeSpeed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(789, 550));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(825, 550));

        panePromptArea.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(panePromptArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );

        correct.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout correctLayout = new javax.swing.GroupLayout(correct);
        correct.setLayout(correctLayout);
        correctLayout.setHorizontalGroup(
            correctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        correctLayout.setVerticalGroup(
            correctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        paneUserInputArea.setBackground(new java.awt.Color(0, 0, 0));
        paneUserInputArea.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        paneUserInputArea.setForeground(new java.awt.Color(255, 255, 255));
        paneUserInputArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paneUserInputAreaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(paneUserInputArea);

        nextRace.setText("Next Race >>");
        nextRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRaceNextRaceActionPerformed(evt);
            }
        });

        mainMenu.setText("<< Main Menu");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuNextRaceActionPerformed(evt);
            }
        });

        startLight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RedLight.png"))); // NOI18N

        TimeLeftTillRace.setBackground(new java.awt.Color(0, 0, 0));
        TimeLeftTillRace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TimeLeftTillRace.setForeground(new java.awt.Color(255, 255, 255));
        TimeLeftTillRace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLeftTillRace.setText("0");
        TimeLeftTillRace.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TypeSpeed.setBackground(new java.awt.Color(0, 0, 0));
        TypeSpeed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TypeSpeed.setForeground(new java.awt.Color(255, 255, 255));
        TypeSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeSpeed.setText("0 WPM");
        TypeSpeed.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(255, Short.MAX_VALUE)
                        .addComponent(startLight, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(TypeSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(correct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mainMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextRace))
                            .addComponent(jScrollPane2))))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(352, Short.MAX_VALUE)
                    .addComponent(TimeLeftTillRace, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startLight, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(correct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextRace, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(90, Short.MAX_VALUE)
                    .addComponent(TimeLeftTillRace)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextRaceNextRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRaceNextRaceActionPerformed
        this.raceData.raceReset();

        raceData.setNormalLetters(raceData.getPrompt());
        TimeLeftTillRace.setText("4");
        TypeSpeed.setText("0");
        correct.setBackground(Color.GRAY);
        paneUserInputArea.setText("");
        setPaneAreaPrompt();
        paneUserInputArea.setEditable(false);

        loop = 4;
        timer.start();
        nextRace.setEnabled(false);
    }//GEN-LAST:event_nextRaceNextRaceActionPerformed

    private void mainMenuNextRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuNextRaceActionPerformed
        this.setVisible(false);
        mw.setVisible(true);
    }//GEN-LAST:event_mainMenuNextRaceActionPerformed

    private void paneUserInputAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paneUserInputAreaKeyTyped
        if(!raceData.getPromptcompleted() && startRace && !raceData.getIsWrong()){
            if(evt.getKeyChar() == KeyEvent.VK_SPACE){
                raceData.checkCorrect(' ');
                TypeSpeed.setText(String.format("%.0f", raceData.getTypingSpeed()) + " WPM");
            }
            else if(evt.getKeyChar() != KeyEvent.VK_BACKSPACE){
                raceData.checkCorrect(evt.getKeyChar());
            }
            this.setPaneAreaPrompt();
            paneUserInputArea.setText(raceData.getDisplayString());

            if(!raceData.getIsWrong())
                correct.setBackground(green);
            else
                correct.setBackground(red);
        }
        
        if(raceData.getPromptcompleted()){
            startRace = false;
            TypeSpeed.setText(String.format("%.0f", raceData.getTypingSpeed()) + " WPM");
            nextRace.setEnabled(true);
        }
        
        if(raceData.getIsWrong()){
            paneUserInputArea.setEditable(false);
            nextRace.setEnabled(true);
            System.out.println("here");
            JOptionPane.showMessageDialog(this, "You typed the letter: " + String.valueOf(raceData.getWrongLetter()) + " instead of: " + String.valueOf(raceData.getActualLetter()), "Prompt Failed" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_paneUserInputAreaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeLeftTillRace;
    private javax.swing.JLabel TypeSpeed;
    private javax.swing.JPanel correct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mainMenu;
    private javax.swing.JButton nextRace;
    private javax.swing.JTextPane panePromptArea;
    private javax.swing.JTextPane paneUserInputArea;
    private javax.swing.JLabel startLight;
    // End of variables declaration//GEN-END:variables
}
