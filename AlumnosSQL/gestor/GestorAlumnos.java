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
import java.awt.SystemColor;

public class GestorAlumnos {

	private JFrame frmGestorAlumnos;
	private JTextField nombre;
	private JTextField curso;
	private JTextField textList;
	private JTextField textMod;
	private JTable table;
	private JTable table_1;
	private JTextField nomField;
	private JTextField cursoField;

	private int IDstorage;

	private JTextField textFieldRvm;
	private JTextField textRmvNom;
	private JTextField textRmvGrp;

	private JButton btnRvmConfirm;

	private int IDremove;

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
		check_List.setBounds(41, 269, 352, 15);
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
					model.setRowCount(0);

					while (rs.next()) {

						Object[] ob = { rs.getInt("ID"), rs.getString("Nombre"), rs.getInt("Curso") };

						model.addRow(ob);

					}

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_List.setText("El termino de busqueda no es correcto para ese campo");

				} catch (NumberFormatException e2) {
					e2.printStackTrace();
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

				}  catch (NumberFormatException e2) {
					e2.printStackTrace();
					check_List.setText("El termino de busqueda no es correcto para ese campo");
				}

			}
		});

		// Insertar

		JPanel insert = new JPanel();
		tabbedPane.addTab("Insertar", null, insert, null);
		insert.setLayout(null);

		JLabel lblIntroduceUnAlumno = new JLabel("Introduce un Alumno");
		lblIntroduceUnAlumno.setFont(new Font("Dialog", Font.BOLD, 16));
		lblIntroduceUnAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntroduceUnAlumno.setBounds(10, 23, 422, 15);
		insert.add(lblIntroduceUnAlumno);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(258, 62, 70, 15);
		insert.add(lblCurso);

		curso = new JTextField();
		curso.setBounds(258, 85, 114, 25);
		insert.add(curso);
		curso.setColumns(10);

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
		check.setBounds(33, 271, 365, 15);
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
					pst.setString(3, curso.getText());

					pst.executeUpdate();

					check.setText("Inserccion correcta");

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check.setText("Los datos introducidos no son correctos, intentelo de nuevo");

				}
			}
		});

		// Modificar

		JPanel mod = new JPanel();
		tabbedPane.addTab("Modificar", null, mod, null);
		mod.setLayout(null);

		JLabel check_Mod = new JLabel("");
		check_Mod.setHorizontalAlignment(SwingConstants.CENTER);
		check_Mod.setForeground(Color.RED);
		check_Mod.setBounds(37, 254, 357, 15);
		mod.add(check_Mod);

		textMod = new JTextField();
		textMod.setText("");
		textMod.setBounds(91, 80, 105, 27);
		mod.add(textMod);
		textMod.setColumns(10);

		JLabel lblModAlumnos = new JLabel("Modificar Alumno");
		lblModAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblModAlumnos.setFont(new Font("Dialog", Font.BOLD, 16));
		lblModAlumnos.setBounds(109, 29, 182, 21);
		mod.add(lblModAlumnos);

		JButton btnListMod = new JButton("Buscar ID");
		btnListMod.setBounds(221, 79, 114, 28);
		mod.add(btnListMod);

		nomField = new JTextField();
		nomField.setBounds(91, 154, 105, 27);
		mod.add(nomField);
		nomField.setColumns(10);

		cursoField = new JTextField();
		cursoField.setBounds(220, 154, 115, 27);
		mod.add(cursoField);
		cursoField.setColumns(10);

		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(91, 129, 70, 15);
		mod.add(lblNombre_1);

		JLabel lblCurso_1 = new JLabel("Grupo:");
		lblCurso_1.setBounds(221, 129, 70, 15);
		mod.add(lblCurso_1);

		JButton btnUpdate = new JButton("Modificar");
		btnUpdate.setBounds(156, 193, 105, 27);
		mod.add(btnUpdate);

		btnListMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("select * from Alumnos where ID=?");

					IDstorage = Integer.parseInt(textMod.getText());
					pst.setInt(1, IDstorage);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {

						nomField.setText(rs.getString("Nombre"));
						cursoField.setText(rs.getString("Curso"));
					}

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_Mod.setText("El termino de busqueda no es correcto para ese campo");

				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					check_List.setText("El termino de busqueda no es correcto para ese campo");
				}
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("UPDATE Alumnos SET Nombre=?, Curso=? where ID=?");

					check_Mod.setText("");
					
					pst.setString(1, nomField.getText());
					pst.setInt(2, Integer.parseInt(cursoField.getText()));
					pst.setInt(3, IDstorage);

					pst.executeUpdate();

					check_Mod.setText("Modificacion correcta");

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_Mod.setText("El termino de busqueda no es correcto para ese campo");
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					check_Mod.setText("El termino de busqueda no es correcto para ese campo");
				}
			}
		});

		// eliminar

		btnUpdate.setForeground(SystemColor.desktop);

		JPanel remove = new JPanel();
		remove.setLayout(null);
		tabbedPane.addTab("Eliminar", null, remove, null);

		textFieldRvm = new JTextField();
		textFieldRvm.setText("");
		textFieldRvm.setColumns(10);
		textFieldRvm.setBounds(73, 41, 123, 27);
		remove.add(textFieldRvm);

		JLabel check_Rvm = new JLabel("");
		check_Rvm.setHorizontalAlignment(SwingConstants.CENTER);
		check_Rvm.setForeground(Color.RED);
		check_Rvm.setBounds(52, 269, 343, 15);
		remove.add(check_Rvm);

		JLabel lblEliminar = new JLabel("Eliminar Alumno");
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEliminar.setBounds(78, 12, 281, 15);
		remove.add(lblEliminar);

		JLabel lblNombreRvm = new JLabel("Nombre:");
		lblNombreRvm.setBounds(97, 105, 70, 15);
		remove.add(lblNombreRvm);

		JLabel lblCursoRvm = new JLabel("Grupo:");
		lblCursoRvm.setBounds(227, 105, 70, 15);
		remove.add(lblCursoRvm);

		textRmvNom = new JTextField();
		textRmvNom.setEditable(false);
		textRmvNom.setColumns(10);
		textRmvNom.setBounds(97, 130, 105, 27);
		remove.add(textRmvNom);

		textRmvGrp = new JTextField();
		textRmvGrp.setEditable(false);
		textRmvGrp.setColumns(10);
		textRmvGrp.setBounds(226, 130, 115, 27);
		remove.add(textRmvGrp);

		JLabel check_RvmConfirm = new JLabel("¿Estás seguro?");
		check_RvmConfirm.setVisible(false);
		check_RvmConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		check_RvmConfirm.setForeground(Color.RED);
		check_RvmConfirm.setBounds(78, 175, 281, 15);
		remove.add(check_RvmConfirm);

		JButton btnIDRvm = new JButton("ID");
		btnIDRvm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("select * from Alumnos where ID=?");

					IDremove = Integer.parseInt(textFieldRvm.getText());
					pst.setInt(1, IDremove);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {

						textRmvNom.setText(rs.getString("Nombre"));
						textRmvGrp.setText(rs.getString("Curso"));

					}

					check_RvmConfirm.setVisible(true);
					btnRvmConfirm.setVisible(true);
					
					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_Rvm.setText("El termino de busqueda no es correcto para ese campo");

				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					check_Rvm.setText("El termino de busqueda no es correcto para ese campo");
				}
			}
		});
		btnIDRvm.setBounds(236, 42, 123, 26);
		remove.add(btnIDRvm);

		btnRvmConfirm = new JButton("Eliminar Definitivamente");
		btnRvmConfirm.setVisible(false);
		btnRvmConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Alumno", "root", "");
					PreparedStatement pst = cn.prepareStatement("DELETE FROM Alumnos where ID=?");

					pst.setInt(1, IDremove);

					pst.executeUpdate();

					check_Rvm.setText("Eliminación correcta");

					cn.close();

				} catch (SQLException e1) {
					e1.printStackTrace();
					check_Rvm.setText("El termino de busqueda no es correcto para ese campo");
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					check_Rvm.setText("El termino de busqueda no es correcto para ese campo");
				}
			}
		});
		btnRvmConfirm.setBounds(117, 200, 206, 26);
		remove.add(btnRvmConfirm);

	}
}
