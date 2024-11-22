package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(25, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel heading1 = new JLabel("Rules & Instruction");
        heading1.setBounds(270, 80, 700, 30);
        heading1.setFont(new Font("Tahoma", Font.BOLD, 28));
        heading1.setForeground(new Color(30, 144, 254));
        add(heading1);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 125, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer so proved it. " + "<br><br>" +
                "2. Quizzes should be organized into different categories to make it easier for users to find the quizzes they are interested in." + "<br><br>" +
                "3. Users should be able to take the quizzes, view the questions and answers, and submit their answers." + "<br><br>" +
                "4. Don't use ChatGpt and other application at the time of quizes." + "<br><br>" +
                "5. You can use only one time 50-50 lifetime so we carefully use it." + "<br><br>" +
                "6. Each question have a perticular time to answer it." + "<br><br>" +
                "7. follow the all instruction that given above." + "<br><br>" +
                "8. Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quizes(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
