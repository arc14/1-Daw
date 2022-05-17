package ejercicosGraficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conversor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversor window = new conversor();
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
	public conversor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 593, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel Titulo = new JLabel("CONVERSOR");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		Titulo.setBounds(190, 34, 159, 33);
		frame.getContentPane().add(Titulo);

		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(85, 119, 124, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(85, 178, 124, 26);
		frame.getContentPane().add(comboBox);

		comboBox.addItem("EURO");
		comboBox.addItem("DOLAR");
		comboBox.addItem("RUBLO");
		comboBox.addItem("BOLIVAR");

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setBounds(329, 178, 124, 26);
		frame.getContentPane().add(comboBox_1);

		comboBox_1.addItem("EURO");
		comboBox_1.addItem("DOLAR");
		comboBox_1.addItem("RUBLO");
		comboBox_1.addItem("BOLIVAR");

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(329, 119, 124, 26);
		frame.getContentPane().add(textField_1);

		JButton btnNewButton = new JButton("CONVERTIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String a = (String) comboBox.getSelectedItem();
				String b = (String) comboBox_1.getSelectedItem();

				textField_1.setText(Float.toString(convertir(a, b, textField)));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(209, 256, 124, 26);
		frame.getContentPane().add(btnNewButton);
	}

	private static float convertir(String a, String b, JTextField value) {

		float fValue = Float.valueOf(value.getText());
		
		switch (a) {
		case "EURO":
			float res1 = (fValue * valorEur(b));
			return res1;
		case "DOLAR":
			float res2 = (fValue * valorDolar(b));
			return res2;
		case "RUBLO":
			float res3 = (fValue * valorRublo(b));
			return res3;
		case "BOLIVAR":
			float res4 = (fValue * valorBolivar(b));
			return res4;
		default:
			return -1;
		}
	}

	private static float valorEur(String b) {
		switch (b) {
		case "EURO":
			return 1f;
		case "DOLAR":
			return 1.04f;
		case "RUBLO":
			return 67.31f;
		case "BOLIVAR":
			return 7.13f;
		default:
			break;
		}
		return -1;
	}	
	
	private static float valorDolar(String b) {
		switch (b) {
		case "EURO":
			return 0.96f;
		case "DOLAR":
			return 1f;
		case "RUBLO":
			return 64.75f;
		case "BOLIVAR":
			return 4.64f;
		default:
			break;
		}
		return -1;
	}	
	
	private static float valorRublo(String b) {
		switch (b) {
		case "EURO":
			return 0.015f;
		case "DOLAR":
			return 0.015f;
		case "RUBLO":
			return 1f;
		case "BOLIVAR":
			return 0.072f;
		default:
			break;
		}
		return -1;
	}	
	
	private static float valorBolivar(String b) {
		switch (b) {
		case "EURO":
			return 0.21f;
		case "DOLAR":
			return 0.22f;
		case "RUBLO":
			return 13.96f;
		case "BOLIVAR":
			return 1f;
		default:
			break;
		}
		return -1;
	}	
	
	
}
