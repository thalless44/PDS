package aulaPizza;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class Pizzaria extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizzaria frame = new Pizzaria();
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
	public Pizzaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TH DA BROCA");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(161, 21, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PIZZARIA");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(171, 35, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Calabresa");
		chckbxNewCheckBox.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		chckbxNewCheckBox.setBounds(6, 54, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Peperone");
		chckbxNewCheckBox_1.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		chckbxNewCheckBox_1.setBounds(6, 80, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("4 Queijo");
		chckbxNewCheckBox_2.setBackground(new Color(248, 248, 255));
		chckbxNewCheckBox_2.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		chckbxNewCheckBox_2.setBounds(6, 108, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Borda");
		rdbtnNewRadioButton.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton.setBounds(6, 136, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sem borda");
		rdbtnNewRadioButton_1.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton_1.setBounds(127, 136, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Local: R$ 00", "Entrega: R$ 20"}));
		comboBox.setBounds(127, 171, 122, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Retirada");
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(10, 174, 67, 14);
		contentPane.add(lblNewLabel_2);
	}
}
