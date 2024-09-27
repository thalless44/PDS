package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class thalles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thalles frame = new thalles();
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
	public thalles() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnFechar = new JButton("fechar");
		btnFechar.setBounds(298, 185, 63, 17);
		btnFechar.setHorizontalAlignment(SwingConstants.TRAILING);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JLabel lblSauda = new JLabel("Ola mundo");
		lblSauda.setBounds(169, 13, 69, 17);
		lblSauda.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblSauda);
		
		JButton btnButtonTeste = new JButton("teste 1");
		btnButtonTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(null, " bom dia amigos");
			}
		});
		btnButtonTeste.setBounds(82, 185, 79, 17);
		contentPane.add(btnButtonTeste);
		
		JButton btnButtonTeste2 = new JButton("teste 2 ");
		btnButtonTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showInternalConfirmDialog(null, "vc está gostando de ser garoto de programa", "Confirmação", JOptionPane.YES_NO_OPTION );
				System.out.println(resposta);
				if (resposta == 0) {
					JOptionPane.showInternalMessageDialog(null, "legal, eu tbm gosto de ser garoto de programa", "resposta", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showInternalMessageDialog(null, "bah que triste, ", "resposta", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnButtonTeste2.setBounds(195, 185, 69, 17);
		contentPane.add(btnButtonTeste2);
		
		JButton btnTeste3 = new JButton("Teste 3");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog(null, "qual é seu nome", "entrada de nomme", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, nome);
			}
		});
		btnTeste3.setBounds(187, 228, 89, 23);
		contentPane.add(btnTeste3);
	}
}
