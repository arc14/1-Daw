package ejercicosGraficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 413, 284);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblC = new JLabel("CALCULADORA");
		lblC.setBounds(161, 0, 124, 15);
		frame.getContentPane().add(lblC);
		
		num1 = new JTextField();
		num1.setBounds(161, 37, 114, 19);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(161, 59, 114, 19);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		
		JLabel lblN = new JLabel("Nº 1");
		lblN.setBounds(73, 39, 70, 15);
		frame.getContentPane().add(lblN);
		
		JLabel lblN_1 = new JLabel("Nº 2");
		lblN_1.setBounds(73, 61, 70, 15);
		frame.getContentPane().add(lblN_1);
		
		JLabel lblResultado = new JLabel("RESULTADO: ");
		lblResultado.setBounds(78, 107, 91, 15);
		frame.getContentPane().add(lblResultado);
		
		label = new JLabel("");
		label.setBounds(181, 97, 207, 35);
		frame.getContentPane().add(label);
		
		JButton buttonSuma = new JButton("SUMAR");
		buttonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1Int = Integer.parseInt(num1.getText());
				int num2Int = Integer.parseInt(num2.getText());
				
				label.setText(Integer.toString(num1Int + num2Int));
				
			}
		});
		buttonSuma.setBounds(73, 154, 130, 25);
		frame.getContentPane().add(buttonSuma);
		
		JButton buttonResta= new JButton("RESTAR");
		buttonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1Int = Integer.parseInt(num1.getText());
				int num2Int = Integer.parseInt(num2.getText());
				
				label.setText(Integer.toString(num1Int - num2Int));
				
			}
		});
		buttonResta.setBounds(222, 154, 130, 25);
		frame.getContentPane().add(buttonResta);
		
		JButton buttonMult = new JButton("MULTIPLICAR");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1Int = Integer.parseInt(num1.getText());
				int num2Int = Integer.parseInt(num2.getText());
				
				label.setText(Integer.toString(num1Int * num2Int));
			}
		});
		buttonMult.setBounds(73, 191, 130, 25);
		frame.getContentPane().add(buttonMult);
		
		JButton buttonDiv = new JButton("DIVIDIR");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1Int = Integer.parseInt(num1.getText());
				int num2Int = Integer.parseInt(num2.getText());
				
				try {
					label.setText(Double.toString((double)num1Int / (double)num2Int));
				} catch (Exception e2) {
					label.setText("Imposible dividir por cero");
				}
				
				
			}
		});
		buttonDiv.setBounds(222, 191, 130, 25);
		frame.getContentPane().add(buttonDiv);
		
		
		

		
		
		
		
	}
	
	
	
	
	
	
	
}
