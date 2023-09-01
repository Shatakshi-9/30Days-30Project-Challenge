
package simple.minds;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        
       setBounds(500, 150, 750, 550);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(20, 240, 200, 200);
        add(l1);
        
        
        JLabel l2 = new JLabel("Thank you " + username + " to Playing easy exam");
        l2.setFont(new Font("Railway", Font.PLAIN, 26));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(40, 30, 700, 35);
        add(l2);      
        
         
        JLabel l3 = new JLabel("Your Score is" + score);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        l3.setBounds(300, 200, 300, 35);
        add(l3);
        
        
        JButton b1 = new JButton("Play Again");
        b1.setBounds(350, 250, 120, 35);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
    }  
    
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
       
    }
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
  
        
    }
    
}
    

