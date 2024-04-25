import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 

public class MyFrame extends JFrame implements ActionListener{
    JButton withdrawal , balanceEnquiry, deposite , button4 , button5 , button6; 
    JLabel label ; 
    MyFrame(){
        withdrawal = new JButton(); 
        balanceEnquiry = new JButton();
        deposite = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        withdrawal.setText("Withdrawal"); 
        withdrawal.setFont(new Font("Comic Sans",Font.BOLD,18)); 
        withdrawal.setFocusable(false);
        withdrawal.setBounds(100,160,250,50); 
        withdrawal.setForeground(Color.white);
        withdrawal.setBackground(Color.red);
        withdrawal.setBorder(BorderFactory.createLineBorder(Color.white));
        withdrawal.addActionListener(this);
       
        balanceEnquiry.setText("Balance Enquiry"); 
        balanceEnquiry.setFont(new Font("Comic Sans",Font.BOLD,18)); 
        balanceEnquiry.setFocusable(false);
        balanceEnquiry.setBounds(550,160,250,50); 
        balanceEnquiry.setForeground(Color.white);
        balanceEnquiry.setBackground(Color.red);
        balanceEnquiry.setBorder(BorderFactory.createLineBorder(Color.white));
        balanceEnquiry.addActionListener(this);

        deposite.setText("Deposite"); 
        deposite.setFont(new Font("Comic Sans",Font.BOLD,18)); 
        deposite.setFocusable(false);
        deposite.setBounds(100,250,250,50); 
        deposite.setForeground(Color.white);
        deposite.setBackground(Color.red);
        deposite.setBorder(BorderFactory.createLineBorder(Color.white));
        deposite.addActionListener(this);

        button4.setText("Options"); 
        button4.setFont(new Font("Comic Sans",Font.BOLD,18)); 
        button4.setFocusable(false);
        button4.setBounds(550,250,250,50); 
        button4.setForeground(Color.white);
        button4.setBackground(Color.red);
        button4.setBorder(BorderFactory.createLineBorder(Color.white));
        button4.addActionListener(this);

        button5.setText("Transfer"); 
        button5.setFont(new Font("Comic Sans",Font.BOLD,18)); 
        button5.setFocusable(false);
        button5.setBounds(100,340,250,50); 
        button5.setForeground(Color.white);
        button5.setBackground(Color.red);
        button5.setBorder(BorderFactory.createLineBorder(Color.white));
        button5.addActionListener(this);

        button6.setText("Preferences"); 
        button6.setFont(new Font("Comic Sans",Font.BOLD,18)); 
        button6.setFocusable(false);
        button6.setBounds(550,340,250,50); 
        button6.setForeground(Color.white);
        button6.setBackground(Color.red);
        button6.setBorder(BorderFactory.createLineBorder(Color.white));
        button6.addActionListener(this);

        label = new JLabel(); 
        label.setText("BANK ACCOUNT");
        label.setBackground(Color.red);
        label.setFont(new Font("Comic Sans",Font.BOLD,40)); 
        label.setBounds(300,20,910,100);
        label.setForeground(Color.WHITE);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setSize(920,530); 
        this.setResizable(false);
        this.setTitle("My Frame"); 
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);

        this.add(withdrawal);
        this.add(balanceEnquiry); 
        this.add(deposite); 
        this.add(button4);
        this.add(button5);
        this.add(button6);

        this.add(label); 
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == withdrawal){
            this.dispose(); new Withdrawal(); 
        }
        if(e.getSource() == balanceEnquiry){
            this.dispose(); new BalanceEnquiry();
        }
        if(e.getSource() == deposite){
            this.dispose(); new Deposite(); 
        }
        if(e.getSource() == button4)
            System.out.println("Options");
        if(e.getSource() == button5)
            System.out.println("transfer");
        if(e.getSource() == button6)
            System.out.println("performence");
    }
}
