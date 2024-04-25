import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Withdrawal implements ActionListener{
    JFrame frame = new JFrame("Withdraws");
    JLabel label1 = new JLabel("How much would you like to withdraw ? "); 
    JLabel label2 = new JLabel("From : Checking"); 
    JPanel panel1 = new JPanel(); 
    JButton button1 = new JButton("<  Back"); 
    JButton button2 = new JButton(">  Confirm");
    JTextPane textPane = new JTextPane(); 

    Withdrawal(){
        label1.setBounds(200,20,910,100);
        label1.setFont(new Font(null,Font.PLAIN,35));

        label2.setBounds(370,75,910,100); 
        label2.setFont(new Font(null,Font.PLAIN,30)); 

        textPane.setBounds(370, 185,220,50);
        textPane.setFont(new Font(null,Font.PLAIN,33));

        panel1.setBounds(10,400,880,5);
        panel1.setBackground(Color.RED);

        button1.setBounds(20,420,220,60); 
        button1.setBackground(Color.WHITE);
        button1.setFocusable(false);
        button1.setFont(new Font(null,Font.PLAIN,25));
        button1.setForeground(Color.BLACK);
        button1.addActionListener(this);
        button1.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));

        button2.setFont(new Font("Comic Sans",Font.BOLD,25)); 
        button2.setFocusable(false);
        button2.setBounds(660,420,220,60); 
        button2.setForeground(Color.white);
        button2.setBackground(Color.red);
        button2.setBorder(BorderFactory.createLineBorder(Color.white));
        button2.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(920,530); 
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.add(label1); 
        frame.add(label2); 
        frame.add(panel1); 
        frame.add(button1);
        frame.add(button2);
        frame.add(textPane); 
        frame.setLayout(null); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            frame.dispose();
            new MyFrame(); 
        }
        if(e.getSource() == button2){
            new AgainConfirm(); 
        }
    }
}