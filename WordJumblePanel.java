import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
//import java.awt.Container;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

//Hey man, you saved some videos from mistapotta that can help you with the panels.

class WordJumblePanel extends JPanel{//draws the shape\
    //public static String answer;
    private JTextField wordLabelTextField;
    private JTextField scoreTextField;
    private Word randWord = null;
    private JLabel qWord = null;
    private JLabel rightAns = new JLabel("Correct!");
    private JLabel wrongAns = new JLabel("Incorrect");
    //private Boolean ansCorrect = false;
    final int length = 800;
    final int height = 400;
    //private JLabel userScore = new JLabel(score);
    int score = 0;
    
    

    WordJumblePanel(){
        setLayout(null);//creates specific fields for things to go.
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
                    score++;
                    remove(qWord);
                    System.out.println("Correct!");
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

                    //String userScore = String.valueOf(score);
                    System.out.println(score);


                }else{ System.out.println("Incorrect");
                    score--;
                    remove(rightAns);
                    wrongAns.setFont(new Font("Serif", Font.BOLD, 28));
                    wrongAns.setForeground(Color.RED);
                    wrongAns.setBounds(150,20,200,200);
                    repaint();
                    add(wrongAns);

                    //String userScore = String.valueOf(score);
                    System.out.println(score);
                }
                
            }});
        checkButton.setBounds(350,300, 100,50);
        add(checkButton);

       
        wordLabelTextField = new JTextField("Type here");
        wordLabelTextField.setBounds(300,100,200,50);
        wordLabelTextField.setFont(new Font("Serif", Font.BOLD, 24));
        add(wordLabelTextField);

        /*
        scoreTextField = new JTextField();
        scoreTextField.setBounds(700,3,50,20);
        scoreTextField.setFont(new Font("Serif", Font.BOLD, 12));
        add(scoreTextField);
        */ 

        qWord = new JLabel(randWord.scramble());
        qWord.setFont(new Font("Serif", Font.BOLD, 28));
        qWord.setForeground(Color.blue);
        qWord.setBounds((length/2) - 50,0,200,400);
        add(qWord);

        
    } 

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);
    }    
    
}

   
