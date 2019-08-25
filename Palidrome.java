import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Palidrome {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palidrome window = new Palidrome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Palidrome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				int number = Integer.parseInt(textField.getText());
				try {
					int a = number;
					int temp;
					int palidrome = 0;
					int d = 1;
					while (number > 0) {
						temp = number % 10;
						number = number / 10;
						palidrome = palidrome*10 + temp;
										
					}
					if (palidrome == a) {
						JOptionPane.showMessageDialog(null, "The number is a palidrome");
					} else {
						JOptionPane.showMessageDialog(null, "The number is not a palidrome");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Enter a Valid number");
				}
			}
		});
		textField.setBounds(134, 83, 181, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterANumber = new JLabel("Enter a number");
		lblEnterANumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEnterANumber.setBounds(182, 118, 100, 16);
		frame.getContentPane().add(lblEnterANumber);
	}
}
