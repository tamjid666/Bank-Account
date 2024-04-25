import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AgainConfirm implements ActionListener{
    JFrame frame = new JFrame(); 
    JLabel label = new JLabel("Are You Sure!!"); 
    JButton button1 = new JButton("NO"); 
    JButton button2 = new JButton("YES"); 

    AgainConfirm(){
        label.setBounds(80,70,250,40);
        label.setFont(new Font(null,Font.PLAIN,35)); 
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        button1.setBounds(30,190,100,50);
        button1.setBackground(Color.WHITE);
        button1.setFocusable(false);
        button1.setFont(new Font(null,Font.PLAIN,25));
        button1.setForeground(Color.BLACK);
        button1.addActionListener(this);
        button1.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
       
        button2.setBounds(300,190,100,50);
        button2.setFocusable(false);
        button2.setBackground(Color.WHITE);
        button2.setFont(new Font(null,Font.PLAIN,25));
        button2.setForeground(Color.BLACK);
        button2.addActionListener(this);
        button2.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
       
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,300); 
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(label); 
        frame.add(button1); 
        frame.add(button2); 
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            frame.dispose(); 
        }
        if(e.getSource() == button2){
            frame.dispose(); new MyFrame(); 
        }
    }
}
