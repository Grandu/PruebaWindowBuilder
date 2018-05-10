import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(335, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxHoras = new JCheckBox("18 horas");
		chckbxHoras.setBounds(26, 117, 97, 23);
		contentPane.add(chckbxHoras);
		
		JCheckBox chckbxHoras_1 = new JCheckBox("25 horas");
		chckbxHoras_1.setBounds(120, 117, 97, 23);
		contentPane.add(chckbxHoras_1);
		
		JCheckBox chckbxHoras_2 = new JCheckBox("30 horas");
		chckbxHoras_2.setBounds(26, 143, 97, 23);
		contentPane.add(chckbxHoras_2);
		
		JCheckBox chckbxHoras_3 = new JCheckBox("39 horas");
		chckbxHoras_3.setBounds(120, 143, 97, 23);
		contentPane.add(chckbxHoras_3);
		
		JLabel lblSeleccionaTipoDe = new JLabel("Selecciona tipo de contrato");
		lblSeleccionaTipoDe.setBounds(26, 22, 130, 14);
		contentPane.add(lblSeleccionaTipoDe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(26, 47, 155, 20);
		contentPane.add(comboBox);
		
		JLabel lblSeleccionaHorasDe = new JLabel("Selecciona horas de contrato");
		lblSeleccionaHorasDe.setBounds(26, 96, 157, 14);
		contentPane.add(lblSeleccionaHorasDe);
		
		textField = new JTextField();
		textField.setBounds(26, 173, 40, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDomingos = new JLabel("Domingos");
		lblDomingos.setBounds(76, 176, 46, 14);
		contentPane.add(lblDomingos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(26, 203, 40, 20);
		contentPane.add(textField_1);
		
		JLabel lblFestivos = new JLabel("Festivos");
		lblFestivos.setBounds(76, 206, 46, 14);
		contentPane.add(lblFestivos);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(246, 42, 46, 14);
		contentPane.add(lblTurno);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(304, 65, 74, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(304, 93, 74, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(304, 118, 74, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(304, 144, 74, 20);
		contentPane.add(textField_5);
		
		JLabel lblH = new JLabel("H1");
		lblH.setBounds(246, 68, 46, 14);
		contentPane.add(lblH);
		
		JLabel lblH_1 = new JLabel("H2");
		lblH_1.setBounds(246, 96, 46, 14);
		contentPane.add(lblH_1);
		
		JLabel lblH_2 = new JLabel("H3");
		lblH_2.setBounds(246, 121, 46, 14);
		contentPane.add(lblH_2);
		
		JLabel lblH_3 = new JLabel("H4");
		lblH_3.setBounds(246, 147, 46, 14);
		contentPane.add(lblH_3);
	}
} 
