import javax.swing.JFrame;
import java.awt.Color;

class WordJumbleFrame extends JFrame {//the window
    public WordJumbleFrame() {
        super("WordJumble");
        setBounds(100,100,800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);

        WordJumblePanel myWordJumblePanel = new WordJumblePanel();
        add(myWordJumblePanel);    
    }
}