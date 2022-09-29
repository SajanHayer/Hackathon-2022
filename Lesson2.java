import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Lesson2 extends JFrame implements ActionListener {
    private static JFrame frame2;
    private static JLabel Read1;
    private static JLabel Read;
    private static JButton quiz2;
    private static JLabel title;
    private static JLabel exitLabel;
    private static JTextArea area;
    private static JPanel mainPanel;
    private static JLabel watchLabel;
    private static JLabel quizlabel;
    private static JButton quiz1;
    private static JButton exitLesson;
    private static String description = "There are two main types of loops in java: a while or a for loop." +
            "\n" + "Each loop is used to iterate through a block of code many times until a condition is met" + "\n" +
            "The general design for a while loop is: while(condition){block of code to be executed with an update.\n" +
            "A for loop can be made with the general form of: for(initialization;condition; update)\n" +
            "Here are some examples of these loops: for(int i; i < 10; i++){ code to be run)\n " +
            "a while loop example: while(i < 10){ code with update of i++}.\n ";
    private static JTextArea textArea;
    private static String description2 = "There are 4 main types of conditional statements: if, else, else if and switch.\n" +
            "if, else and else if statements go hand in hand with one another. The if statement is used when a certain\n" +
            "condition is true. It can be demonstrated in the following example: if(x > 6){ add some code here}\n" +
            "The else statement is used if code executed when the if statement is false. The else if statement\n" +
            "adds new conditions if the condition above is false. An example can be seen bellow.\n" +
            "if(condition1){code to be execute}\n" +
            "else if(condition2){code}\n" +
            "else{code}";

    Lesson2(){
        frame2= new JFrame("Lesson 2: Conditional statements and Loops");
        mainPanel = new JPanel();
        frame2.setSize(600, 600);
        Color color = new Color(145, 200, 250);
        mainPanel.setBackground(color);
        frame2.add(mainPanel);
        mainPanel.setLayout(null);

        Font font = new Font(Font.DIALOG, Font.BOLD, 18);
        title = new JLabel("Lesson 2: Conditional statements and Loops");
        title.setFont(font);
        title.setBounds(5, 5, 400, 50);
        mainPanel.add(title);

        //labels
        Font font1 = new Font(Font.DIALOG, Font.PLAIN, 14);
        Read = new JLabel("Loops:");
        Read.setFont(font1);
        Read.setBounds(6,30, 400, 50);
        mainPanel.add(Read);


        Read1 = new JLabel("if and else statements: ");
        Read1.setFont(font1);
        Read1.setBounds(6,170, 400, 50);
        mainPanel.add(Read1);


        textArea = new JTextArea(description);
        textArea.setEditable(false);
        textArea.setBounds(5,70, 575, 110);
        mainPanel.add(textArea);

        area = new JTextArea(description2);
        area.setEditable(false);
        area.setBounds(5,210, 575, 137);
        mainPanel.add(area);

        watchLabel = new JLabel("Here are some videos to watch to learn more about conditional statements:");
        watchLabel.setBounds(5,335, 600, 50);
        mainPanel.add(watchLabel);

        JButton button1 = new JButton("Watch");
        button1.setBounds(5, 370, 90, 30);
        mainPanel.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.youtube.com/watch?v=6djggrlkHY8");
            }
        });

        JButton button2 = new JButton("Watch");
        button2.setBounds(100, 370, 90, 30);
        mainPanel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.youtube.com/watch?v=P6ivQ3QRq0I");
            }
        });

        JButton button3 = new JButton("Watch");
        button3.setBounds(195, 370, 90, 30);
        mainPanel.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.youtube.com/watch?v=LLQVi7kCuTA");
            }
        });

        quizlabel = new JLabel("Test your knowledge by doing the following quizzes!");
        quizlabel.setBounds(5,383, 400, 50);
        mainPanel.add(quizlabel);

        quiz1 = new JButton("Quiz 1");
        quiz1.setBounds(5, 420, 90, 40);
        quiz1.addActionListener(this);
        mainPanel.add(quiz1);

        quiz2 = new JButton("Quiz 2");
        quiz2.setBounds(100, 420, 90, 40);
        quiz2.addActionListener(this);
        mainPanel.add(quiz2);

        exitLabel = new JLabel("Click below to go back to main menu:");
        exitLabel.setBounds(5,450, 400, 50);
        mainPanel.add(exitLabel);

        exitLesson = new JButton("Exit Lesson 2");
        exitLesson.setBounds(5, 490, 200, 40);
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
        if (e.getSource() == exitLesson){
            new Main().setVisible(true);
            frame2.setVisible(false);
        }
        if(e.getSource() == quiz1 || e.getSource() == quiz2){
            new Interface().setVisible(true);
        }
    }
}

