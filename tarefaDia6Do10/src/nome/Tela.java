package nome;

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
	private JTextField textSoNome;
	private JTextField textNome;

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
		
		textNome = new JTextField();
		textNome.setBounds(111, 59, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textSoNome = new JTextField();
		textSoNome.setBounds(111, 90, 86, 20);
		contentPane.add(textSoNome);
		textSoNome.setColumns(10);
		
		JLabel lblVerNome = new JLabel("");
		lblVerNome.setBounds(68, 131, 255, 14);
		contentPane.add(lblVerNome);
		
		JLabel lblNome = new JLabel("Nome ");
		lblNome.setBounds(41, 62, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobreNome = new JLabel("Sobrenome");
		lblSobreNome.setBounds(41, 93, 81, 14);
		contentPane.add(lblSobreNome);
		
		JLabel lblNewLabel_2 = new JLabel("Insira seu Nome e sobrenome");
		lblNewLabel_2.setBounds(68, 23, 215, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnMostraNome = new JButton("Mostrar");
		btnMostraNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String sobrenome = textSoNome.getText();
				
				
				lblVerNome.setText(nome + " " + sobrenome);
			}
		});
		btnMostraNome.setBounds(137, 156, 89, 23);
		contentPane.add(btnMostraNome);
		
		
	}

}
