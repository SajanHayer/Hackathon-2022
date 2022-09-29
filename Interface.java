import javax.swing.*;

import javax.swing.*;
import java.awt.*;



public class Interface {
    JFrame frame = new JFrame("Sorry");
    JLabel label = new JLabel("Sorry this area still needs to be worked on!");


    Interface(){
        label.setBounds(100,75,200,50);
        frame.add(label);
    }


    public void setVisible(boolean b) {
        frame.setSize(400, 150);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
