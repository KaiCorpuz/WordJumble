import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

//import java.util.Timer;
//import java.util.TimerTask;
//import java.lang.System;



class WordJumblePanel extends JPanel{//draws the shape
    
    private JTextField wordLabelTextField;
    //private JTextField timeLabel;
    private Word randWord = null;
    private JLabel qWord = null;
    private JLabel rightAns = new JLabel("Correct!");
    private JLabel wrongAns = new JLabel("Incorrect");
    private JLabel userScore = null;
    private JLabel livesLabel  = null;
    private JLabel lifeNumber = null;
    private JLabel youLose = null;
    
    final int length = 800;
    final int height = 400;
    private int score = 0;
    private int lives = 5;
    
    //private WordTimer minTimer = null;

    
    WordJumblePanel(){
        
        setLayout(null);//creates specific fields for things to go.
        

        livesLabel = new JLabel("Lives: ");
        livesLabel.setFont(new Font("Serif", Font.BOLD, 24));
        livesLabel.setForeground(Color.blue);
        livesLabel.setBounds(600,300,150,30);
        add(livesLabel);

        String lifeString = String.valueOf(lives);
        lifeNumber = new JLabel(lifeString);
        lifeNumber.setFont(new Font("Serif", Font.BOLD, 24));
        lifeNumber.setForeground(Color.WHITE);
        lifeNumber.setBounds(675,300,100,30);
        add(lifeNumber);

        
        randWord = new Word();
        
        JLabel label = new JLabel("Word Jumble");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setForeground(Color.blue);
        label.setBounds(0,-140,300,300);
        add(label);

        JLabel printScore = new JLabel("Score: ");
        printScore.setFont(new Font("Serif", Font.BOLD, 24));
        printScore.setForeground(Color.blue);
        printScore.setBounds(600,-140,300,300);
        add(printScore);

        JButton checkButton = new JButton("Check");
        
        checkButton.addActionListener(new ActionListener() {//This is the code for the button
            public void actionPerformed(ActionEvent e){
                
                String userAns = wordLabelTextField.getText();
                if(randWord.checkAnswer(userAns) == true){
                    
                    remove(qWord);
                    //System.out.println("Correct!");
                    randWord = new Word();
                    qWord = new JLabel(randWord.scramble());
                    qWord.setFont(new Font("Serif", Font.BOLD, 28));
                    qWord.setForeground(Color.blue);
                    qWord.setBounds((length/2) - 50,0,200,400);
                    repaint();
                    add(qWord);

                    wordLabelTextField.setText("");

                    remove(wrongAns);
                    rightAns.setFont(new Font("Serif", Font.BOLD, 28));
                    rightAns.setForeground(Color.GREEN);
                    rightAns.setBounds(550,75,100,100);
                    repaint();
                    add(rightAns);

                    remove(userScore);
                    score++;
                    String userScoreString = String.valueOf(score);
                    userScore = new JLabel(userScoreString);
                    userScore.setFont(new Font("Serif", Font.BOLD, 24));
                    userScore.setForeground(Color.WHITE);
                    userScore.setBounds(675,-140,300,300);
                    repaint();
                    add(userScore);

                }else{ //System.out.println("Incorrect");
                    
                    remove(rightAns);
                    wrongAns.setFont(new Font("Serif", Font.BOLD, 28));
                    wrongAns.setForeground(Color.RED);
                    wrongAns.setBounds(150,20,200,200);
                    repaint();
                    add(wrongAns);

                    remove(userScore);
                    score--;
                    String userScoreString = String.valueOf(score);
                    userScore = new JLabel(userScoreString);
                    userScore.setFont(new Font("Serif", Font.BOLD, 24));
                    userScore.setForeground(Color.WHITE);
                    userScore.setBounds(675,-140,300,300);
                    repaint();
                    add(userScore);

                    remove(lifeNumber);
                    lives--;
                    String lifeString = String.valueOf(lives);
                    lifeNumber = new JLabel(lifeString);
                    lifeNumber.setFont(new Font("Serif", Font.BOLD, 24));
                    lifeNumber.setForeground(Color.WHITE);
                    lifeNumber.setBounds(675,300,100,30);
                    repaint();
                    add(lifeNumber);

                    if(lives == 0){
                        removeAll();

                        youLose = new JLabel("YOU LOSE!");
                        youLose.setFont(new Font("Serif", Font.BOLD, 38));
                        youLose.setForeground(Color.RED);
                        youLose.setBounds(300,0,300,300);
                        repaint();
                        add(youLose);
                    }
                }
                
            }});
        checkButton.setBounds(350,300, 100,50);
        add(checkButton);

       
        wordLabelTextField = new JTextField("Type here");
        wordLabelTextField.setBounds(300,100,200,50);
        wordLabelTextField.setFont(new Font("Serif", Font.BOLD, 24));
        add(wordLabelTextField);


        qWord = new JLabel(randWord.scramble());
        qWord.setFont(new Font("Serif", Font.BOLD, 28));
        qWord.setForeground(Color.blue);
        qWord.setBounds((length/2) - 50,0,200,400);
        add(qWord);

        String userScoreString = String.valueOf(score);
        userScore = new JLabel(userScoreString);
        userScore.setFont(new Font("Serif", Font.BOLD, 24));
        userScore.setForeground(Color.WHITE);
        userScore.setBounds(675,-140,300,300);
        add(userScore);

        


    } 

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);
    }    
    
}

   
