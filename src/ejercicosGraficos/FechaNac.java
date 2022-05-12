package ejercicosGraficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FechaNac {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FechaNac window = new FechaNac();
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
	public FechaNac() {
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
		
		JComboBox<String> boxDia = new JComboBox<String>();
		boxDia.setBounds(50, 78, 64, 24);
		frame.getContentPane().add(boxDia);
		
		
		for (int i = 1; i < 32; i++) {
			boxDia.addItem(Integer.toString(i));
		}
		
		
		
		JComboBox<String> boxMes = new JComboBox<String>();
		boxMes.setBounds(126, 78, 143, 24);
		frame.getContentPane().add(boxMes);
		
		boxMes.addItem("Enero");
		boxMes.addItem("Febrero");
		boxMes.addItem("Marzo");
		boxMes.addItem("Abril");
		boxMes.addItem("Mayo");
		boxMes.addItem("Junio");
		boxMes.addItem("Julio");
		boxMes.addItem("Agosto");
		boxMes.addItem("Septiembre");
		boxMes.addItem("Octubre");
		boxMes.addItem("Noviembre");
		boxMes.addItem("Diciembre");
		
		
		JComboBox<String> boxAno = new JComboBox<String>();
		boxAno.setBounds(281, 78, 91, 24);
		frame.getContentPane().add(boxAno);
		
		for (int j = 2022; j > 1899; j--) {
			boxAno.addItem(Integer.toString(j));
		}
		
		
		JLabel lblIntroduceTuFecha = new JLabel("Introduce tu fecha de nacimiento");
		lblIntroduceTuFecha.setBounds(104, 37, 234, 15);
		frame.getContentPane().add(lblIntroduceTuFecha);
		
		JLabel lblTuFechaDe = new JLabel("Tu fecha de nacimiento es:");
		lblTuFechaDe.setBounds(104, 165, 234, 15);
		frame.getContentPane().add(lblTuFechaDe);
		
		JLabel res = new JLabel("");
		res.setBounds(104, 192, 234, 15);
		frame.getContentPane().add(res);
		
		res.setText("");
		
		
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = boxDia.getSelectedItem() + " de " + boxMes.getSelectedItem() + " de " + boxAno.getSelectedItem();
				
				res.setText(a);
			}
		});
		btnEnviar.setBounds(136, 114, 117, 25);
		frame.getContentPane().add(btnEnviar);
		
	}
}
