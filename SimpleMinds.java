
package simple.minds;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleMinds extends JFrame implements ActionListener{
    
    JButton b1,b2;
    JTextField t1;
    
    SimpleMinds(){
        setBounds(300, 200, 1000, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 500, 500);
        add(l1);
        
        JLabel l2 = new JLabel("easy exam");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        l2.setForeground(new Color(255, 0, 0));
        l2.setBounds(625, 55, 300, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Candidate Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(255,0,0));
        l3.setBounds(675, 150, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(635, 190, 250, 20);
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(635, 230, 90, 20);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(795, 230, 90, 20);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
                
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
            
        }else{
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) {
        new SimpleMinds();
        
    }
    
}
