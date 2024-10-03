package postoDeGasolina;

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
	private JTextField textValor;

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
		
		JLabel lblNewLabel = new JLabel("Posto de Gasolina");
		lblNewLabel.setBounds(165, 11, 104, 14);
		contentPane.add(lblNewLabel);
		
		textValor = new JTextField();
		textValor.setBounds(81, 72, 86, 20);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(25, 75, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblInfoGasolina = new JLabel("Preço da Gasolina: 5,00");
		lblInfoGasolina.setBounds(25, 36, 142, 14);
		contentPane.add(lblInfoGasolina);
		
		JLabel lblMostrar = new JLabel("");
		lblMostrar.setBounds(191, 111, 109, 14);
		contentPane.add(lblMostrar);
		
		JLabel lblQuantidade = new JLabel("Quantidade de gasolina:");
		lblQuantidade.setBounds(25, 111, 152, 14);
		contentPane.add(lblQuantidade);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sValor = textValor.getText();
				float valor = Float.parseFloat(sValor);
				valor = (valor/5);
				
				if (valor >= 1) {
                    lblMostrar.setText(String.format("%.3f L", valor)); 
                } else {
                    lblMostrar.setText(String.format("%.2f ml", valor )); 
                }
				
			}
		});
		btnCalcular.setBounds(147, 136, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}

}
