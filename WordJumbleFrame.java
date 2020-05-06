import javax.swing.JFrame;

class WordJumbleFrame extends JFrame {//the window
    public WordJumbleFrame() {
        super("WordJumble");
        setBounds(100,100,800,400);//length, height of the frame
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        WordJumblePanel myWordJumblePanel = new WordJumblePanel();
        add(myWordJumblePanel);//instantiates a new panel
    }
}