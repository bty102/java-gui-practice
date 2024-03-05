package thucHanh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMayTinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_A;
	private JTextField textField_B;
	private JTextField textField_ANS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMayTinh frame = new frmMayTinh();
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
	public frmMayTinh() {
		setTitle("calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_A = new JLabel("A =");
		lblNewLabel_A.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_A.setBounds(99, 62, 52, 30);
		contentPane.add(lblNewLabel_A);
		
		JLabel lblNewLabel_B = new JLabel("B =");
		lblNewLabel_B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_B.setBounds(99, 129, 52, 30);
		contentPane.add(lblNewLabel_B);
		
		JLabel lblNewLabel_ANS = new JLabel("ANS");
		lblNewLabel_ANS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_ANS.setBounds(99, 198, 52, 30);
		contentPane.add(lblNewLabel_ANS);
		
		textField_A = new JTextField();
		textField_A.setBounds(142, 62, 175, 30);
		contentPane.add(textField_A);
		textField_A.setColumns(10);
		
		textField_B = new JTextField();
		textField_B.setColumns(10);
		textField_B.setBounds(142, 129, 175, 30);
		contentPane.add(textField_B);
		
		textField_ANS = new JTextField();
		textField_ANS.setColumns(10);
		textField_ANS.setBounds(142, 198, 175, 30);
		contentPane.add(textField_ANS);
		
		JButton btnNewButton_plus = new JButton("+");
		btnNewButton_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double A = Double.parseDouble(textField_A.getText());
				Double B = Double.parseDouble(textField_B.getText());
				Double ANS = A + B;
				textField_ANS.setText(ANS.toString());
			}
		});
		btnNewButton_plus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_plus.setBounds(66, 275, 120, 53);
		contentPane.add(btnNewButton_plus);
		
		JButton btnNewButton_mis = new JButton("-");
		btnNewButton_mis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double A = Double.parseDouble(textField_A.getText());
				Double B = Double.parseDouble(textField_B.getText());
				Double ANS = A - B;
				textField_ANS.setText(ANS.toString());
			}
		});
		btnNewButton_mis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_mis.setBounds(261, 275, 120, 53);
		contentPane.add(btnNewButton_mis);
		
		JButton btnNewButton_mul = new JButton("x");
		btnNewButton_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double A = Double.parseDouble(textField_A.getText());
				Double B = Double.parseDouble(textField_B.getText());
				Double ANS = A * B;
				textField_ANS.setText(ANS.toString());
			}
		});
		btnNewButton_mul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_mul.setBounds(66, 357, 120, 53);
		contentPane.add(btnNewButton_mul);
		
		JButton btnNewButton_div = new JButton("/");
		btnNewButton_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double B = Double.parseDouble(textField_B.getText());
				if(B==0) {
					JOptionPane.showMessageDialog(null, "Khong chia duoc!!!");
				} 
				else {
					Double A = Double.parseDouble(textField_A.getText());
					Double ANS = A / B;
					textField_ANS.setText(ANS.toString());
				}
			}
		});
		btnNewButton_div.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_div.setBounds(261, 357, 120, 53);
		contentPane.add(btnNewButton_div);
	}
}
