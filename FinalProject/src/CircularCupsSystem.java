import javax.swing.*;
import java.awt.event.*;

public class CircularCupsSystem {
	public static void main(String[] args) {
		LoginEnrollFrame loginEnrollFrame = new LoginEnrollFrame();
		loginEnrollFrame.setVisible(true);
	}
}

class LoginEnrollFrame extends JFrame implements ActionListener {
	JLabel usernameLabel, passwordLabel, creditCardLabel;
	JTextField usernameField, creditCardField;
	JPasswordField passwordField;
	JButton loginButton, enrollButton, subscribeButton;
	boolean isEnrollMode = false;

	LoginEnrollFrame() {
		setTitle("Login / Enroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 250);
		setLayout(null);

		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(30, 30, 80, 20);
		add(usernameLabel);

		usernameField = new JTextField();
		usernameField.setBounds(120, 30, 150, 20);
		add(usernameField);

		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(30, 60, 80, 20);
		add(passwordLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(120, 60, 150, 20);
		add(passwordField);

		creditCardLabel = new JLabel("Credit Card:");
		creditCardLabel.setBounds(30, 90, 80, 20);
		creditCardLabel.setVisible(false);
		add(creditCardLabel);

		creditCardField = new JTextField();
		creditCardField.setBounds(120, 90, 150, 20);
		creditCardField.setVisible(false);
		add(creditCardField);

		loginButton = new JButton("Login");
		loginButton.setBounds(30, 130, 100, 30);
		loginButton.addActionListener(this);
		add(loginButton);

		enrollButton = new JButton("Enroll");
		enrollButton.setBounds(140, 130, 100, 30);
		enrollButton.addActionListener(this);
		add(enrollButton);

		subscribeButton = new JButton("Subscribe");
		subscribeButton.setBounds(90, 180, 120, 30);
		subscribeButton.addActionListener(this);
		subscribeButton.setVisible(false);
		add(subscribeButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			// Perform login authentication
			// If successful, proceed to the welcome page
			// Otherwise, display an error message
			JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
		} else if (e.getSource() == enrollButton) {
			isEnrollMode = true;
			loginButton.setVisible(false);
			usernameField.setVisible(false);
			usernameLabel.setVisible(false);
			passwordLabel.setVisible(false);
			passwordField.setVisible(false);
			creditCardLabel.setVisible(true);
			creditCardField.setVisible(true);
			subscribeButton.setVisible(true);

			enrollButton.setVisible(false);
		} else if (e.getSource() == subscribeButton) {
			// Perform subscription payment process
			// If successful, proceed to the welcome page
			// Otherwise, display an error message
			JOptionPane.showMessageDialog(this, "Subscription successful! Welcome!", "Success",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
