package intro_to_programming;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginPage implements ActionListener {		
	String id = "null";
	String passWord ="null";
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton  = new JButton("Reset");
	JButton newUserButton = new JButton("New User");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("User ID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();

	IDandPasswords idAndPasswords = null; 

	LoginPage (IDandPasswords loginInfoOriginal){
		
		idAndPasswords = loginInfoOriginal;
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		newUserButton.setBounds(175,225,100,25);
		newUserButton.setFocusable(false);
		newUserButton.addActionListener(this);
		
		ImageIcon s_image = new ImageIcon("icon.png");
		
		frame.setIconImage(s_image.getImage());
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(newUserButton);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
			
			
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		/*if(e.getSource()==newUserButton) {
			String newID = JOptionPane.showInputDialog("Enter New UserID: ");
			String newPassword = JOptionPane.showInputDialog("Enter New Password: ");
			*/
	
		if (e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(idAndPasswords.getLoginInfo().containsKey(userID)) {
				if(idAndPasswords.getLoginInfo().get(userID).equals(password)){
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful");
					frame.dispose();
					
					JOptionPane.showMessageDialog(null, "Login Successfull");
					
					WelcomePage welcomePage = new WelcomePage(userID);
					
					}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password!");
					}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("UserID not found!");
			}
			
		}
		if(e.getSource()==newUserButton) {
		    id =JOptionPane.showInputDialog("UserID(Name)");
			passWord = JOptionPane.showInputDialog("Password");
			idAndPasswords.getLoginInfo().put(id, passWord);
			}
		}
		
	}
		 
		 
			

		
	
	

//		