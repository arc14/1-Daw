package ejercicosGraficos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.UIManager;

public class Ascensor {

	private JFrame frame;
	private JLabel plantaAct;
	
	private JLabel direccion;
	
	private JButton btnPlanta;
	private JButton btnPlanta_1;
	private JButton btnPlanta_2;
	private JButton btnPlanta_3;
	private JButton btnPlanta_4;
	
	private JLabel lblAscensor;
	
	private Canvas cube;
	private Canvas canvas;
	private Canvas windows_1;
	private Canvas windows;
	private Canvas windows_2;
	private Canvas windows_3;
	private Canvas windows_4;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor window = new Ascensor();
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
	public Ascensor() {
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
		
		
		lblAscensor = new JLabel("ASCENSOR");
		lblAscensor.setBounds(180, 0, 86, 15);
		frame.getContentPane().add(lblAscensor);
		
		
		//Boton 0
		
		btnPlanta = new JButton("Planta 0");
		btnPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (plantaAct.getText().equals("0")) {
					direccion.setText("Ya estás en esa planta");
				} else {
					direccion.setText("Bajando...");
					plantaAct.setText("0");
				}
				cube.setBounds(cube.getX(), 194, cube.getWidth(), cube.getHeight());
			}
		});
		btnPlanta.setBounds(34, 46, 117, 25);
		frame.getContentPane().add(btnPlanta);
		
		//Boton 1
		
		btnPlanta_1 = new JButton("Planta 1");
		btnPlanta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int act = Integer.parseInt(plantaAct.getText());
				
				if (act == 1) {
					direccion.setText("Ya estás en esa planta");
				} else if(act > 1){
					direccion.setText("Bajando...");
					plantaAct.setText("1");
					
						
				} else {
					direccion.setText("Subiendo...");
					plantaAct.setText("1");
				}
				cube.setBounds(cube.getX(), 157, cube.getWidth(), cube.getHeight());
				
			}
		});
		btnPlanta_1.setBounds(34, 83, 117, 25);
		frame.getContentPane().add(btnPlanta_1);
		
		//Boton 2
		
		btnPlanta_2 = new JButton("Planta 2");
		btnPlanta_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int act = Integer.parseInt(plantaAct.getText());
				
				if (act == 2) {
					direccion.setText("Ya estás en esa planta");
				} else if(act > 2){
					direccion.setText("Bajando...");
					plantaAct.setText("2");
						
				} else {
					direccion.setText("Subiendo...");
					plantaAct.setText("2");
				}
				cube.setBounds(cube.getX(), 120, cube.getWidth(), cube.getHeight());
			}
		});
		btnPlanta_2.setBounds(34, 120, 117, 25);
		frame.getContentPane().add(btnPlanta_2);
		
		//Boton 3
		
		btnPlanta_3 = new JButton("Planta 3");
		btnPlanta_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int act = Integer.parseInt(plantaAct.getText());
				
				if (act == 3) {
					direccion.setText("Ya estás en esa planta");
				} else if(act > 3){
					direccion.setText("Bajando...");
					plantaAct.setText("3");
						
				} else {
					direccion.setText("Subiendo...");
					plantaAct.setText("3");
				}
				cube.setBounds(cube.getX(), 83, cube.getWidth(), cube.getHeight());
				
			}
		});
		btnPlanta_3.setBounds(34, 157, 117, 25);
		frame.getContentPane().add(btnPlanta_3);
		
		//Boton 4
		
		btnPlanta_4 = new JButton("Planta 4");
		btnPlanta_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (plantaAct.getText().equals("4")) {
					direccion.setText("Ya estás en esa planta");
				} else {
					direccion.setText("Subiendo...");
					plantaAct.setText("4");
					
				}
				cube.setBounds(cube.getX(), 46, cube.getWidth(), cube.getHeight());
			}
		});
		btnPlanta_4.setBounds(34, 194, 117, 25);
		frame.getContentPane().add(btnPlanta_4);
		
		//Label que marca la planta actual
		
		plantaAct = new JLabel("0");
		plantaAct.setBounds(210, 27, 70, 15);
		frame.getContentPane().add(plantaAct);
		
		//Label que muestra si sube, baja o ya esta en esa planta
		
		direccion = new JLabel("");
		direccion.setBounds(76, 231, 291, 20);
		frame.getContentPane().add(direccion);
		
		
		//cubo que simula el ascensor
		
		cube = new Canvas();
		cube.setBackground(Color.BLACK);
		cube.setBounds(325, 194, 25, 25);
		frame.getContentPane().add(cube);
		
		windows = new Canvas();
		windows.setBackground(Color.CYAN);
		windows.setBounds(372, 46, 25, 15);
		frame.getContentPane().add(windows);
		
		windows_2 = new Canvas();
		windows_2.setBackground(Color.CYAN);
		windows_2.setBounds(372, 120, 25, 15);
		frame.getContentPane().add(windows_2);
		
		windows_1 = new Canvas();
		windows_1.setBackground(Color.CYAN);
		windows_1.setBounds(372, 83, 25, 15);
		frame.getContentPane().add(windows_1);
		
		windows_3 = new Canvas();
		windows_3.setBackground(Color.CYAN);
		windows_3.setBounds(372, 157, 25, 15);
		frame.getContentPane().add(windows_3);
		
		windows_4 = new Canvas();
		windows_4.setBackground(Color.CYAN);
		windows_4.setBounds(372, 194, 25, 15);
		frame.getContentPane().add(windows_4);
		
		canvas = new Canvas();
		canvas.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		canvas.setBounds(297, 21, 110, 198);
		frame.getContentPane().add(canvas);
		
	}
}
