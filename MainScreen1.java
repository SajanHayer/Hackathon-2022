

import javax.swing.*;
import java.awt.*;

public class MainScreen1 {
    private static JFrame frame;
    private static JPanel topPanel;
    private static JPanel leftPanel;
    private static JLabel title;
    private static JButton lesson1IntroToButton;
    private static JPanel mainPanel;
    private static JButton lesson2ConditionalStatementsButton;
    private static JButton lesson3ArraysButton;
    private static JButton moreLessonsButton;

    public static void main(String[] args){
        frame = new JFrame("Lesson Screen");
        mainPanel = new JPanel();
        frame.setSize(600,400);
        Color color = new Color(145, 200, 250);
        mainPanel.setBackground(color);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Font font = new Font(Font.DIALOG, Font.PLAIN, 15);
        title = new JLabel("Introduction to Java");
        title.setFont(font);
        title.setBounds(200, 5, 300, 50);
        mainPanel.add(title);



        frame.setVisible(true);
        /*
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = new Color(145,200,250);
        mainPanel.setBackground(color);
        topPanel.setBackground(color);
        leftPanel.setBackground(color);
        this.pack();

         */
    }

}
