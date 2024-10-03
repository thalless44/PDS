package Fomelândia;

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


    private JPanel contentPane;
    private JTextField textPeso; 
    private JLabel lblMostrar; 

    

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
        
        JLabel lblTitulo = new JLabel("Restaurante Fomelândia");
        lblTitulo.setBounds(165, 11, 150, 14);
        contentPane.add(lblTitulo);
        
        textPeso = new JTextField();
        textPeso.setBounds(81, 72, 86, 20);
        contentPane.add(textPeso);
        textPeso.setColumns(10);
        
        JLabel lblPeso = new JLabel("Peso (kg):");
        lblPeso.setBounds(25, 75, 80, 14);
        contentPane.add(lblPeso);
        
        JLabel lblInfoPreco = new JLabel("Preço por quilo: R$ 9,95");
        lblInfoPreco.setBounds(25, 36, 150, 14);
        contentPane.add(lblInfoPreco);
        
        lblMostrar = new JLabel("");
        lblMostrar.setBounds(191, 111, 150, 14);
        contentPane.add(lblMostrar);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sPeso = textPeso.getText();
                    double peso = Double.parseDouble(sPeso); 
                    double valorTotal = peso * 9.95; 
                    lblMostrar.setText(String.format("Total: R$ %.2f", valorTotal)); 
                
    
                
            }
        });
        btnCalcular.setBounds(147, 136, 89, 23);
        contentPane.add(btnCalcular);
    }
}
