package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class jframe_sample extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWelcomeToSupermarket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe_sample frame = new jframe_sample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jframe_sample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToSupermarket = new JTextField();
		txtWelcomeToSupermarket.setBounds(30, 24, 396, 25);
		txtWelcomeToSupermarket.setBackground(new Color(128, 128, 255));
		txtWelcomeToSupermarket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWelcomeToSupermarket.setText("Welcome To Supermarket Billing System");
		contentPane.add(txtWelcomeToSupermarket);
		txtWelcomeToSupermarket.setColumns(30);
		
		JButton btnNewButton = new JButton("Admin login");
		btnNewButton.setBounds(281, 105, 105, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cashier Login");
		btnNewButton_1.setBounds(281, 156, 105, 25);
		contentPane.add(btnNewButton_1);
	}
}
