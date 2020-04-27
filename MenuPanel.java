import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

class MenuPanel extends JPanel{


    private WordJumblePanel myWordJumblePanel = null;

    MenuPanel(){
        setLayout(null);

        JLabel titleLabel = new JLabel("Word Jumble");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 36));
        titleLabel.setForeground(Color.blue);
        titleLabel.setBounds(290,-100,400,400);
        add(titleLabel);

        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                removeAll();
                myWordJumblePanel = new WordJumblePanel();
                repaint();
                add(myWordJumblePanel);
                setVisible(true);
            }
        });
        playButton.setBounds(350,150, 100,50);
        add(playButton);


    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
    }    
    
}