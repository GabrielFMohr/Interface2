package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Pessoa;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lvlPrimeiroNome = new JLabel("Primeiro Nome:");
	private JTextField txtPrimeiroNome;
	private JTextField txtSobrenome;
	private final JButton btnPrpximo = new JButton("Próximo");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo frame = new Exemplo();
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
	public Exemplo() {
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 298);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lvlPrimeiroNome.setForeground(new Color(255, 255, 0));
		lvlPrimeiroNome.setBounds(79, 49, 95, 14);
		contentPane.add(lvlPrimeiroNome);
		
		txtPrimeiroNome = new JTextField();
		txtPrimeiroNome.setBackground(new Color(255, 255, 0));
		txtPrimeiroNome.setForeground(new Color(255, 255, 0));
		txtPrimeiroNome.setBounds(171, 46, 86, 20);
		contentPane.add(txtPrimeiroNome);
		txtPrimeiroNome.setColumns(10);
		
		JLabel lblSobreNome = new JLabel("Sobrenome:");
		lblSobreNome.setForeground(new Color(255, 255, 0));
		lblSobreNome.setBackground(new Color(255, 255, 0));
		lblSobreNome.setBounds(103, 113, 58, 14);
		contentPane.add(lblSobreNome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBackground(new Color(255, 255, 0));
		txtSobrenome.setBounds(171, 110, 86, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		btnPrpximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome= txtPrimeiroNome.getText();
				String sobreNome= txtSobrenome.getText();
				if(nome.isEmpty()||sobreNome.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Preencha todos os campos!");
				}
				else 
				{
					Pessoa p = new Pessoa();
					p.setPrimeiroNome(nome);
					p.setSobrenome(sobreNome);
				}
			}
		});
		btnPrpximo.setForeground(new Color(0, 255, 255));
		btnPrpximo.setBackground(new Color(255, 255, 0));
		btnPrpximo.setBounds(304, 219, 120, 31);
		contentPane.add(btnPrpximo);
	}

}
