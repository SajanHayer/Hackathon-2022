
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener  {
    private static JFrame frame2;
    private static JLabel title;
    private static JPanel mainPanel;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;

    public Main() {
        frame2 = new JFrame("Lesson Screen");
        mainPanel = new JPanel();
        frame2.setSize(600, 500);
        Color color = new Color(145, 200, 250);
        mainPanel.setBackground(color);
        frame2.add(mainPanel);
        //frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setLayout(null);
        Font font = new Font(Font.DIALOG, Font.PLAIN, 18);

        //Buttons
        String lesson1 = "Lesson 1";
        button1 = new JButton(lesson1 + ": Introduction to Variables");
        button1.setBounds(5, 150, 575, 30);
        button1.addActionListener(this);
        mainPanel.add(button1);

        String lesson2 = "Lesson 2";
        button2 = new JButton(lesson2 + ": Conditional Statements and Loops");
        button2.setBounds(5, 225, 575, 30);
        button2.addActionListener(this);
        mainPanel.add(button2);

        String lesson3 = "Lesson 3";
        button3 = new JButton(lesson3 + ": Arrays");
        button3.setBounds(5, 300, 575, 30);
        button3.addActionListener(this);
        mainPanel.add(button3);

        String lesson4 = "";
        button4 = new JButton("More lessons");
        button4.setBounds(5, 375, 575, 30);
        button4.addActionListener(this);
        mainPanel.add(button4);

        //title
        title = new JLabel("Introduction to Java");
        title.setFont(font);
        title.setBounds(225, 50, 400, 50);
        mainPanel.add(title);

        frame2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            new Lesson1().setVisible(true);
            frame2.setVisible(false);
        }

       if (e.getSource() == button2){
            new Lesson2().setVisible(true);
            frame2.setVisible(false);
        }

        if (e.getSource() == button3){
            new Interface().setVisible(true);

        }
        if (e.getSource() == button4){
            new Interface().setVisible(true);
        }

    }
}
