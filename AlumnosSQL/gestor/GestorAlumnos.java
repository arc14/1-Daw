package gestor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Window.Type;

public class GestorAlumnos {

	private JFrame frmGestorAlumnos;
	private JTextField nombre;
	private JTextField grupo;
	private JTextField textList;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorAlumnos window = new GestorAlumnos();
					window.frmGestorAlumnos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestorAlumnos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmGestorAlumnos = new JFrame();
		frmGestorAlumnos.setType(Type.POPUP);
		frmGestorAlumnos.setTitle("Gestor Alumnos");
		frmGestorAlumnos.setBounds(100, 100, 458, 360);
		frmGestorAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestorAlumnos.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 447, 323);
		frmGestorAlumnos.getContentPane().add(tabbedPane);

		// Insertar

		JPanel insert = new JPanel();
		tabbedPane.addTab("Insertar", null, insert, null);
		insert.setLayout(null);

		JLabel lblIntroduceUnAlumno = new JLabel("Introduce un Alumno");
		lblIntroduceUnAlumno.setFont(new Font("Dialog", Font.BOLD, 16));
		lblIntroduceUnAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceUnAlumno.setBounds(10, 23, 422, 15);
		insert.add(lblIntroduceUnAlumno);

		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(258, 62, 70, 15);
		insert.add(lblGrupo);

		grupo = new JTextField();
		grupo.setBounds(258, 85, 114, 25);
		insert.add(grupo);
		grupo.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(64, 60, 70, 15);
		insert.add(lblNombre);

		nombre = new JTextField();
		nombre.setBounds(64, 85, 114, 25);
		insert.add(nombre);
		nombre.setColumns(10);

		JLabel check = new JLabel("");
		check.setForeground(Color.RED);
		check.setHorizontalAlignment(SwingConstants.CENTER);
		check.setBounds(107, 271, 221, 15);
		insert.add(check);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(167, 145, 100, 25);
		insert.add(btnRegistrar);

		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("insert into Alumnos values (?,?,?)");

					pst.setString(1, "0");
					pst.setString(2, nombre.getText());
					pst.setString(3, grupo.getText());

					pst.executeUpdate();

					check.setText("Inserccion correcta");

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check.setText("Los datos introducidos no son correctos, intentelo de nuevo");

				}
			}
		});

		// Listar x busqueda

		JPanel list = new JPanel();
		tabbedPane.addTab("Búsqueda", null, list, null);
		list.setLayout(null);

		textList = new JTextField();
		textList.setText("");
		textList.setBounds(157, 39, 123, 27);
		list.add(textList);
		textList.setColumns(10);

		JLabel check_List = new JLabel("");
		check_List.setHorizontalAlignment(SwingConstants.CENTER);
		check_List.setForeground(Color.RED);
		check_List.setBounds(78, 269, 281, 15);
		list.add(check_List);

		JLabel lblListarAlumnos = new JLabel("Listar Alumnos");
		lblListarAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListarAlumnos.setFont(new Font("Dialog", Font.BOLD, 16));
		lblListarAlumnos.setBounds(78, 12, 281, 15);
		list.add(lblListarAlumnos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(89, 115, 262, 142);
		list.add(scrollPane);
		scrollPane.setViewportView(table);

		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(new Object[] { "ID", "Nombre", "Curso" }, 0));
		table_1.setBounds(354, 209, -265, -101);

		JButton btnIDList = new JButton("ID");
		btnIDList.setBounds(79, 78, 117, 25);
		list.add(btnIDList);
		btnIDList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("select * from Alumnos where ID=?");

					int a = Integer.parseInt(textList.getText());
					pst.setInt(1, a);
					ResultSet rs = pst.executeQuery();

					DefaultTableModel model = (DefaultTableModel) table_1.getModel();

					while (rs.next()) {

						Object[] ob = { rs.getInt("ID"), rs.getString("Nombre"), rs.getInt("Curso") };

						model.addRow(ob);

					}

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_List.setText("El termino de busqueda no es correcto para ese campo");

				}
			}
		});

		JButton btnNomList = new JButton("Nombre");
		btnNomList.setBounds(246, 78, 117, 25);
		list.add(btnNomList);

		btnNomList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("select * from Alumnos WHERE Nombre LIKE ?");
					
					pst.setString(1, textList.getText() + "%");
					ResultSet rs = pst.executeQuery();

					DefaultTableModel model = (DefaultTableModel) table_1.getModel();

					model.setRowCount(0);
					
					while (rs.next()) {

						Object[] ob = { rs.getInt("ID"), rs.getString("Nombre"), rs.getInt("Curso") };

						model.addRow(ob);

					}

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_List.setText("El termino de busqueda no es correcto para ese campo");

				}
				
			}
		});

		// Modificar

		JPanel mod = new JPanel();
		tabbedPane.addTab("Modificar", null, mod, null);
	}
}

