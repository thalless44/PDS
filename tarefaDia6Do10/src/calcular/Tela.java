package calcular;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textBase;

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
		
		textAltura = new JTextField();
		textAltura.setBounds(99, 59, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textBase = new JTextField();
		textBase.setBounds(99, 90, 86, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblMostrarCalculo = new JLabel("");
		lblMostrarCalculo.setBounds(81, 126, 241, 14);
		contentPane.add(lblMostrarCalculo);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(32, 62, 46, 14);
		contentPane.add(lblAltura);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(32, 93, 46, 14);
		contentPane.add(lblBase);
		
		JLabel lblNewLabel_2 = new JLabel("Calcular Área e perimetro do retangulo");
		lblNewLabel_2.setBounds(118, 21, 204, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCal = new JButton("Calcular");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sAltura = textAltura.getText();
				Float altura = Float.parseFloat(sAltura);
				String sBase = textBase.getText();
				Float  base = Float.parseFloat(sBase);
				
				Float calArea = (float) Retangulo.calcularArea(base, altura);
				Float calPerimetro = (float) Retangulo.calcularPerimetro(base, altura);
				
				lblMostrarCalculo.setText(String.format("Perimetro%.2f  " +"AREA%.2f ", calPerimetro, calArea));
				
				
				
			}
		});
		btnCal.setBounds(145, 172, 89, 23);
		contentPane.add(btnCal);
		
		
	}

}
