package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValidarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textIdade;
	private JTextField textNome;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarIdade frame = new ValidarIdade();
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
	public ValidarIdade() {
		setTitle("Validador ");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 40, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 91, 46, 14);
		getContentPane().add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setBounds(48, 88, 46, 20);
		getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(48, 37, 163, 20);
		getContentPane().add(textNome);
		textNome.setColumns(15);
		
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(59, 205, 329, 14);
		getContentPane().add(lblResposta);

		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		mostrarResultado();
				String nome = textNome.getText();
				String idadeStr = textIdade.getText();
				
				if(nome.isEmpty()) {
					lblResposta.setText("por favor, coloque um nome valido");
					return;
				}
				
				try {
				int idade = Integer.parseInt(idadeStr);
				if (idade < 0) {
					lblResposta.setText("idade negativa não pode");
					return;
				}
				String menssagem = "nome: " + nome + ", idade: " + idade;
				
				if (idade<18) {
					menssagem += ("Menor de Idade");
					
				}else {
					menssagem += ("Maior de idade");
					
				}
					
				lblResposta.setText(menssagem);
				
				}catch(NumberFormatException ex) {
					lblResposta.setText("Por favor, ensira uma idade validae");
					
				}
			}
		});
		btnValidar.setBounds(165, 156, 89, 23);
		getContentPane().add(btnValidar);
		
	}
//	private void mostrarResultado() {
//		String nome = textNome.getText();
//		String idade = textIdade.getText();
	
//		lblResposta.setText(nome);
//		lblResposta.setText(idade);
//	}
}
