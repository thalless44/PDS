package conversão;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFar = new JLabel(" Farenheit:");
		lblFar.setBounds(48, 43, 55, 14);
		contentPane.add(lblFar);
		
		JLabel lblCalCel = new JLabel("");
		lblCalCel.setBounds(113, 68, 110, 14);
		contentPane.add(lblCalCel);
		
		textFar = new JTextField();
		textFar.setBounds(113, 40, 110, 20);
		contentPane.add(textFar);
		textFar.setColumns(10);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textFar.getText();
				Double num = Double.parseDouble(n);
				double convertido = Calculo.farParaCel(num);
				
			lblCalCel.setText(String.format("%.2f",convertido));

				
	
			}
		});
		btnConverter.setBounds(171, 143, 89, 23);
		contentPane.add(btnConverter);
		
		JLabel lblCel = new JLabel("Celsius:");
		lblCel.setBounds(48, 68, 55, 14);
		contentPane.add(lblCel);
		
	
	}
}
