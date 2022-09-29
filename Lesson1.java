

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Lesson1 extends JFrame implements ActionListener {
    private static JFrame frame2;
    private static JLabel Read1;
    private static JLabel Read;
    private static JLabel title;
    private static JButton quiz2;
    private static JLabel exitLabel;
    private static JTextArea area;
    private static JPanel mainPanel;
    private static JLabel watchLabel;
    private static JLabel quizlabel;
    private static JButton quiz1;
    private static JButton exitLesson;
    private static String description = "Variables are data containers that saves data values during a java programs execution." +
            "\n" + "Each variable is a name given to a memory location. It is the basic unit of storage in a program." + "\n" +
            "Declaring a variable can be done with the general format of variable-type name;.\n" +
            "Intializing variables can be seen with the following examples: int age = 17 or String name = \"" + "john\"\n" +
            "There are three main types of variables: Local (defined within a method),\n " +
            "Static (declared outside a method and less flexible) and Instance (declared outside a method). \n ";
    private static JTextArea textArea;
    private static String description2 = "There are 4 main types of operators: arithmetic, assignment, logical and comparison\n" +
            "Arithmetic operators involve: + (add variables together), - (subtract), * (multiply), / (division), % (modulus)\n" +
            "Assignment operators are used to assign values to variables types, mainly using = but there are others\n" +
            "Logical operators use logic between variables and values and are logical: && (and), || (or), and ! (not)\n" +
            "Comparison operators used to compare values to one other are: ==, !=, >, <, >=, <=. A quick note about\n" +
            "these is that variables that are declared with String use a different set of comparison operators and will\n" +
            "be shown in a later lesson";

    Lesson1(){
        frame2= new JFrame("Lesson 1: Introduction to Variables in Java");
        mainPanel = new JPanel();
        frame2.setSize(600, 600);
        Color color = new Color(145, 200, 250);
        mainPanel.setBackground(color);
        frame2.add(mainPanel);
        mainPanel.setLayout(null);

        Font font = new Font(Font.DIALOG, Font.BOLD, 18);
        title = new JLabel("Lesson 1: Introduction to Variables");
        title.setFont(font);
        title.setBounds(5, 5, 400, 50);
        mainPanel.add(title);

        //labels
        Font font1 = new Font(Font.DIALOG, Font.PLAIN, 14);
        Read = new JLabel("General variable information:");
        Read.setFont(font1);
        Read.setBounds(6,30, 400, 50);
        mainPanel.add(Read);


        Read1 = new JLabel("Operators and operations with Variables: ");
        Read1.setFont(font1);
        Read1.setBounds(6,170, 400, 50);
        mainPanel.add(Read1);


        textArea = new JTextArea(description);
        textArea.setEditable(false);
        textArea.setBounds(5,70, 575, 110);
        mainPanel.add(textArea);

        area = new JTextArea(description2);
        area.setEditable(false);
        area.setBounds(5,210, 575, 120);
        mainPanel.add(area);

        watchLabel = new JLabel("Here are some videos to watch to understand more about variables:");
        watchLabel.setBounds(5,325, 600, 50);
        mainPanel.add(watchLabel);

        JButton button1 = new JButton("Watch");
        button1.setBounds(5, 360, 90, 30);
        mainPanel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.youtube.com/watch?v=N8LDSryePuc");
            }
        });

        JButton button2 = new JButton("Watch");
        button2.setBounds(100, 360, 90, 30);
        mainPanel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.youtube.com/watch?v=snIUtdg0K30");
            }
        });

        JButton button3 = new JButton("Watch");
        button3.setBounds(195, 360, 90, 30);
        mainPanel.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.youtube.com/watch?v=7wWvSn_qiBc");
            }
        });

        quizlabel = new JLabel("Test your knowledge by doing the following quizzes!");
        quizlabel.setBounds(5,373, 400, 50);
        mainPanel.add(quizlabel);

        quiz1 = new JButton("Quiz 1");
        quiz1.setBounds(5, 410, 90, 40);
        quiz1.addActionListener(this);
        mainPanel.add(quiz1);

        quiz2 = new JButton("Quiz 2");
        quiz2.setBounds(100, 410, 90, 40);
        quiz2.addActionListener(this);
        mainPanel.add(quiz2);

        exitLabel = new JLabel("Click below to go back to main menu:");
        exitLabel.setBounds(5,440, 400, 50);
        mainPanel.add(exitLabel);

        exitLesson = new JButton("Exit Lesson 1");
        exitLesson.setBounds(5, 480, 200, 40);
        exitLesson.addActionListener(this);
        mainPanel.add(exitLesson);


        frame2.setVisible(true);
        }


    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quiz1){
            new Quiz("Introduction to variables in Java").setVisible(true);
            frame2.setVisible(false);
        }
        if (e.getSource() == exitLesson){
            new Main().setVisible(true);
            frame2.setVisible(false);
        }

        if(e.getSource() == quiz2){
            new Interface().setVisible(true);
        }
    }
}
