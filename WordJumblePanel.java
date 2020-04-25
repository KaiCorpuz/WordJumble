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

class WordJumblePanel extends JPanel implements ActionListener{//draws the shape\
    //public static String answer;
    private JTextField wordLabelTextField;
    private Word randWord = null;
    //private Boolean repaint = false;
    final int length = 800;
    final int height = 400;

    

    WordJumblePanel(){
        setLayout(null);//creates specific fields for things to go.
        randWord = new Word();
        
        
        JLabel label = new JLabel("Word Jumble");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setForeground(Color.blue);
        label.setBounds(0,-140,300,300);
        add(label);
        

        JButton checkButton = new JButton("Check");
        //Container pane = this.getContentPane();
        checkButton.addActionListener(this);
        checkButton.setBounds(350,300, 100,50);
        add(checkButton);
        

        JLabel wordLabel = new JLabel("Your Answer: ");
        add(wordLabel);//prints label
       
        wordLabelTextField = new JTextField("Type here");
        wordLabelTextField.setBounds(300,100,200,50);
        wordLabelTextField.setFont(new Font("Serif", Font.BOLD, 24));
        add(wordLabelTextField);

        
        JLabel qWord = new JLabel(randWord.scramble());
        qWord.setFont(new Font("Serif", Font.BOLD, 28));
        qWord.setForeground(Color.blue);
        qWord.setBounds((length/2) - 50,0,200,400);
        add(qWord);

        
    } 

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);

       
    }
    
    public void actionPerformed(ActionEvent e){
        String userAns = wordLabelTextField.getText();
        
        System.out.println("Your Answer:"+userAns);
        System.out.println("Correct? " + randWord.checkAnswer(userAns));

       
        //System.out.println("Correct Answer: "+ ansWord);

        
       
    
    }

   
}