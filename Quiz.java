/*
@Authors: Manraj Singh and Sajan Hayer
@Version: 3.4
@Since: 1.0
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Quiz extends JFrame implements ActionListener {
    private static JFrame frame1;
    private static JPanel panel2;
    private static JLabel title;
    private static JLabel desc;
    private static JLabel vars;
    private static JLabel partA;
    private static JLabel partAdesc;
    private static JLabel partBdesc;
    private static JLabel partB;
    private static JLabel partC;
    private static JLabel partCdesc;
    private static JLabel close;
    private static JLabel success;
    private static JLabel success2;
    private static JLabel success3;
    public static JTextArea area;
    public static JTextArea area2;
    private static JTextField ans1;
    private static JTextField string1;
    private static JTextField string2;
    private static JTextField ans2;
    private static JTextField ans3;
    private static JTextField ans4;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton exitQuiz;

    private static String probDef = "In this problem, you are tasked with performing various operations on variables" +
            " of different data types. The data type" + "\n" + "variables include the following: int, boolean and Strings." +
            " For Part (A), you must ensure that you reach the target" + "\n" + "value of 2 by performing a SINGLE operation" +
            " on the value stored by 'initialValue'. For Part (B), you must obtain" + "\n" + "the desired string of 'Hello World!'" +
            " by concatenating two strings held by variables 'string1' and 'string2'." + "\n" + "For Part(C), you must use" +
            " a conditional statement to check if a condition is true, and if it is," + "\n" + "set the value of the 'isTrue' variable" +
            " to false.";

    private static String variables = "initialValue = 200;" + "\n" +
            "string1;" + "\n" + "string2;" + "\n" + "isTrue;";

    public Quiz(String lessonName) {
        if (lessonName.equals("Introduction to variables in Java")) {
            Font font1 = new Font(Font.DIALOG, Font.BOLD, 15);
            Font font2 = new Font(Font.DIALOG, Font.BOLD, 20);
            Font font3 = new Font(Font.DIALOG, Font.PLAIN, 15);
            frame1 = new JFrame("Quiz: " + lessonName);
            panel2 = new JPanel();
            frame1.setSize(850, 900);

            Color color = new Color(145, 200, 250);
            Color color2 = new Color(220, 225, 250);
            panel2.setBackground(color);
            frame1.add(panel2);
            panel2.setLayout(null);

            title = new JLabel("Quiz: " + lessonName);
            title.setBounds(10, 30, 400, 25);
            title.setFont(font2);
            panel2.add(title);

            desc = new JLabel("Problem description:");
            desc.setBounds(10, 60, 200, 25);
            desc.setFont(font1);
            panel2.add(desc);

            area = new JTextArea(probDef);
            area.setEditable(false);
            area.setBounds(10, 100, 760, 130);
            area.setBackground(color2);
            area.setFont(font3);
            panel2.add(area);

            vars = new JLabel("Only the following variables are allowed (syntax and spelling are important): ");
            vars.setBounds(10, 250, 700, 25);
            vars.setFont(font1);
            panel2.add(vars);

            area2 = new JTextArea(variables);
            area2.setEditable(false);
            area2.setBounds(10, 280, 200, 90);
            area2.setBackground(color2);
            area2.setFont(font3);
            panel2.add(area2);

            partA = new JLabel("Part (A) - Type an operation to perform in the text-box:");
            partA.setBounds(10, 400, 400, 25);
            partA.setFont(font1);
            panel2.add(partA);

            partAdesc = new JLabel("int value = initialValue         6;");
            partAdesc.setBounds(10, 450, 400, 25);
            partAdesc.setFont(font3);
            panel2.add(partAdesc);

            ans1 = new JTextField(20);
            ans1.setBounds(150, 450, 30, 25);
            panel2.add(ans1);

            partB = new JLabel("Part (B) - Declare the values of string1 and string2, then concatenate them together:");
            partB.setBounds(10, 500, 600, 25);
            partB.setFont(font1);
            panel2.add(partB);

            string1 = new JTextField(150);
            string1.setBounds(10, 530, 150, 28);
            panel2.add(string1);

            string2 = new JTextField(150);
            string2.setBounds(10, 560, 150, 28);
            panel2.add(string2);

            ans2 = new JTextField(20);
            ans2.setBounds(209, 600, 20, 25);
            panel2.add(ans2);

            partBdesc = new JLabel("String concatenation = string1       string2;");
            partBdesc.setBounds(10, 600, 400, 25);
            partBdesc.setFont(font3);
            panel2.add(partBdesc);

            partC = new JLabel("Part (C) - Fill the if statement to check if variable 'a' is less than 'b'. Set the value of 'isTrue' to false.");
            partC.setBounds(10, 630, 900, 25);
            partC.setFont(font1);
            panel2.add(partC);

            partCdesc = new JLabel("if (                 ) {");
            partCdesc.setBounds(10, 660, 400, 25);
            partCdesc.setFont(font3);
            panel2.add(partCdesc);

            ans3 = new JTextField(20);
            ans3.setBounds(26, 660, 68, 25);
            panel2.add(ans3);

            ans4 = new JTextField(20);
            ans4.setBounds(10, 685, 100, 25);
            panel2.add(ans4);

            close = new JLabel("{");
            close.setBounds(10, 710, 20, 25);
            panel2.add(close);

            button1 = new JButton("Check answer");
            button1.setBounds(580, 450, 200, 25);
            button1.setFont(font3);
            button1.addActionListener(this);
            panel2.add(button1);

            button2 = new JButton("Check answer");
            button2.setBounds(580, 580, 200, 25);
            button2.setFont(font3);
            button2.addActionListener(this);
            panel2.add(button2);

            button3 = new JButton("Check answer");
            button3.setBounds(580, 680, 200, 25);
            button3.setFont(font3);
            button3.addActionListener(this);
            panel2.add(button3);

            success = new JLabel();
            success.setFont(font3);
            panel2.add(success);

            success2 = new JLabel();
            success2.setFont(font3);
            panel2.add(success2);

            success3 = new JLabel();
            success3.setFont(font3);
            panel2.add(success3);

            exitQuiz = new JButton("Exit Quiz!");
            exitQuiz.setBounds(10, 800, 200, 25);
            exitQuiz.setFont(font3);
            exitQuiz.addActionListener(this);
            panel2.add(exitQuiz);

            frame1.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String answer1 = "%";
            if (ans1.getText().equals(answer1)) {
                success.setText("Correct!");
                success.setBounds(580, 430, 100, 25);
            }
            if (!(ans1.getText().equals(answer1))) {
                success.setText("Incorrect!");
                success.setBounds(580, 430, 100, 25);
            }
        }
        if (e.getSource() == button2){
            if ((string1.getText().equals("String string1;") && (string2.getText().equals("String string2;")) && ans2.getText().equals("+"))){
                success2.setText("Correct!");
                success2.setBounds(580, 560, 100, 25);
            }
            else{
                success2.setText("Incorrect!");
                success2.setBounds(580, 560, 100, 25);
            }
        }
        if (e.getSource() == button3) {
            if (((ans3.getText().equals("a < b")) || (ans3.getText().equals("a<b"))) && ((ans4.getText().equals("isTrue = false;")) || (ans4.getText().equals("isTrue=false;")))) {
                success3.setText("Correct!");
                success3.setBounds(580, 650, 100, 25);
            }
            else {
                success3.setText("Incorrect!");
                success3.setBounds(580, 650, 100, 25);
            }
        }
        if (e.getSource() == exitQuiz){
            new Lesson1().setVisible(true);
            frame1.setVisible(false);
        }
    }
}



