import javax.swing.JOptionPane;
public class WordJumble{    
    public static void main(String[] args) {

        WordJumbleFrame myWordJumbleFrame = new WordJumbleFrame();
        myWordJumbleFrame.setVisible(true);
        JOptionPane.showMessageDialog(myWordJumbleFrame,"Welcome to WordJumble!\nUnscramble the word and earn points!");
        //a small popup is created that welcomes and tells the player what to do.

    }
}