import javax.swing.*;
        
public class SwingFirstExample {
  public static void main(String[] args) {  
JFrame frame = new JFrame("My First Swing Example");
 
  frame.setSize(350, 200);
JPanel panel = new JPanel();  
     frame.add(panel);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


panel.setLayout(null);
 JLabel userLabel = new JLabel("User");
userLabel.setBounds(10,20,80,25);
    panel.add(userLabel);

JTextField userText = new JTextField( 20);
    userText.setBounds(100,20,165,25);
    panel.add(userText);

JLabel passwordLabel = new JLabel("Password");
   passwordLabel.setBounds(10,50,80,25);
    panel.add(passwordLabel);
JPasswordField passwordText = new JPasswordField(20);
    passwordText.setBounds(100,50,165,25);
    panel.add(passwordText);
JButton loginButton = new JButton("login");
    loginButton.setBounds(10, 80, 80, 25);
    panel.add(loginButton);
frame.setVisible(true);
  }
  }

