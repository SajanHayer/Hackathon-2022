

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label;
    private static JTextField usernameText;
    private static JLabel label2;
    private static JPasswordField passText;
    private static JButton loginButton;
    private static JLabel success;
    private static JLabel title;

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException exception){
            exception.printStackTrace();
        }
        panel = new JPanel();
        frame = new JFrame("Login Screen");
        Font font = new Font(Font.DIALOG, Font.PLAIN, 15);

        frame.setSize(350,200);
        Color color = new Color(145, 200, 250);
        panel.setBackground(color);
        frame.add(panel);
        panel.setLayout(null);

        title = new JLabel("Welcome! Please login!");
        title.setFont(font);
        title.setBounds(100,5,300,25);
        panel.add(title);

        label = new JLabel("Username:");
        label.setFont(font);
        label.setBounds(10,30,80,25);
        panel.add(label);

        usernameText = new JTextField(20);
        usernameText.setBounds(100,30,165,25);
        panel.add(usernameText);

        label2 = new JLabel("Password:");
        label2.setFont(font);
        label2.setBounds(10,60,80,25);
        panel.add(label2);

        passText = new JPasswordField(20);
        passText.setBounds(100,60,165,25);
        panel.add(passText);

        loginButton = new JButton("Login");
        loginButton.setFont(font);
        loginButton.setBounds(100,100,120,30);
        loginButton.addActionListener(new Login());
        panel.add(loginButton);

        success = new JLabel();
        success.setFont(font);
        success.setBounds(10, 130, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = usernameText.getText();
        String password = passText.getText();

        if (userName.equals("demo") && password.equals("HYL2022")){
            success.setText("Login successful!");
            new Main().setVisible(true);
            //new Quiz("Introduction to variables in Java").setVisible(true);
            /*
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

             */
            frame.setVisible(false);
        }
        else{
            success.setText("Incorrect username or password!");
        }

    }
}
