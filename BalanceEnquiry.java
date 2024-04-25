import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BalanceEnquiry implements ActionListener{
    JFrame frame = new JFrame("Balance Enquiry");

    JLabel label1 = new JLabel("Account Number    : "); 
    JLabel label2 = new JLabel("Available Balance  : "); 
    JLabel label3 = new JLabel("Current Balance     : "); 

    JPanel panel1 = new JPanel(); 

    JButton button1 = new JButton("<  Back"); 

    BalanceEnquiry(){
        label1.setBounds(240,80,910,100);
        label1.setFont(new Font(null,Font.PLAIN,35));

        label2.setBounds(240,135,910,100); 
        label2.setFont(new Font(null,Font.PLAIN,35)); 
        
        label3.setBounds(240,190,910,100); 
        label3.setFont(new Font(null,Font.PLAIN,35)); 

        panel1.setBounds(10,400,880,5);
        panel1.setBackground(Color.RED);

        button1.setBounds(20,420,220,60); 
        button1.setBackground(Color.WHITE);
        button1.setFocusable(false);
        button1.setFont(new Font(null,Font.PLAIN,25));
        button1.setForeground(Color.BLACK);
        button1.addActionListener(this);
        button1.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(920,530); 
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.add(label1); 
        frame.add(label2); 
        frame.add(label3); 
        frame.add(panel1); 
        frame.add(button1);
        frame.setLayout(null); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            frame.dispose();
            new MyFrame(); 
        }
    }
}