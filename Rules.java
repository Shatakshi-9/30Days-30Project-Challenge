
package simple.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    
    JButton b1,b2;
    String username;
    Rules(String username){ 
        this.username = username;
    
    setBounds(500, 100, 800, 670);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    JLabel l1 = new JLabel("Welcome " + username + " to easy exam");
    l1.setForeground(new Color(30, 144, 254));
    l1.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
    l1.setBounds(55, 25, 700, 30);
    add(l1);
    
    JLabel l2 = new JLabel("");
    l2.setFont(new Font("Tahoma", Font.PLAIN,18));
    l2.setBounds(35, 5, 720, 600);
    l2.setText(
            "<html>"+
            "1. You must use a functioning webcam and microphone."+"<br><br>"+
            "2. No cell phones or other secondary devices in the room or test area."+"<br><br>"+
            "3. Your desk/table must be clear or any materials except your test-taking device."+"<br><br>"+
            "4. No one else can be in the room with you."+"<br><br>"+
            "5. No talking. "+"<br><br>"+
            "6. The testing room must be well-lit and you must be clearly visible"+"<br><br>"+
            "7. No use of additional applications or internet."+"<br><br>"+
            "8. Good Luck for quiz contest."+"<br><br>"+
            "<html>"
    );
    
    add(l2);
    
    b1 = new JButton("Back");
    b1.setBounds(250, 550, 79, 30);
    b1.setBackground(new Color(30, 144, 254));
    b1.setForeground(Color.WHITE);
    b1.addActionListener(this);
    add(b1);
   
    
    b2 = new JButton("Start");
    b2.setBounds(400, 550, 79, 30);
    b2.setBackground(new Color(30, 144, 254));
    b2.setForeground(Color.WHITE);
    b2.addActionListener(this);
    add(b2);
    
    
    
    setVisible(true);
            
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
            
        }else if(ae.getSource() == b2){
            this.setVisible(false);
          new Quiz(username).setVisible(true);
    }
    }
    

    public static void main(String[]args){
    new Rules("");
}
}