import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Hey man, you saved some videos from mistapotta that can help you with the panels.

class WordJumblePanel extends JPanel implements ActionListener{//draws the shape\
    //public static String answer;
    private JTextField wordLabelTextField;
    private Word randWord = null;
    private Boolean repaint = false;
    

    WordJumblePanel(){
        setLayout(null);//creates specific fields for things to go.
        randWord = new Word();
        
        
        JLabel label = new JLabel("Word Jumble", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 32));
        label.setForeground(Color.blue);
        add(label);
        

        JButton checkButton = new JButton("Check");
        //Container pane = this.getContentPane();
        checkButton.addActionListener(this);
        add(checkButton);
        

        JLabel wordLabel = new JLabel("Your Answer: ");
        add(wordLabel);//prints label
        
        wordLabelTextField = new JTextField(10);
        
        add(wordLabelTextField);

        
        JLabel qWord = new JLabel(randWord.scramble());
        qWord.setFont(new Font("Serif", Font.BOLD, 18));
        qWord.setForeground(Color.blue);
        add(qWord);
        
   
    } 
    
    public void actionPerformed(ActionEvent e){
        String userAns = wordLabelTextField.getText();
        
        System.out.println("Your Answer:"+userAns);
        System.out.println("Correct? " + randWord.checkAnswer(userAns));

        if(randWord.checkAnswer(userAns) == true){
            repaint = true;
        }
        //System.out.println("Correct Answer: "+ ansWord);

        
       
    
    }

   
}