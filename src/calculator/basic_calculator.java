package calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class basic_calculator {

	private JFrame frame;
	public JTextField textFieldNum1;
	public JTextField textFieldNum2;
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basic_calculator window = new basic_calculator();
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
	public basic_calculator() {
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
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(49, 22, 124, 32);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(198, 22, 124, 32);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2, ans;
				try{
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1+num2;
					textField.setText(Integer.toString(ans));

				}
			catch (Exception e1){
				JOptionPane.showMessageDialog(null, "Please enter valid number");
			}
			
		}});
		btnNewButton.setBounds(49, 94, 89, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2, ans;
				try{
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1-num2;
					textField.setText(Integer.toString(ans));
					
				}
			catch (Exception e1){
				JOptionPane.showMessageDialog(null, "Please enter valid number");
			}
			
		}});
		btnNewButton_1.setBounds(220, 94, 124, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(192, 167, 130, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel.setBounds(72, 170, 92, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
