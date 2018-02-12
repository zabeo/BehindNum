package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JTextField t_numero;
	private JButton btnInvia;
	private JRadioButton rdbtnMatematico;
	private JRadioButton rdbtnData;
	private JRadioButton rdbtnAnno;
	private JRadioButton rdbtnTrivia;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JLabel lblLingua;
	private JComboBox comboBox;
	private JLabel lblNewLabel;
	private JLabel l_data;
	private JTextArea textAreaStampa;
	/**
	 * Create the frame.
	 */
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNumero.setForeground(SystemColor.textHighlight);
		lblNumero.setBounds(72, 72, 79, 21);
		contentPane.add(lblNumero);
		
		t_numero = new JTextField();
		t_numero.setBackground(Color.LIGHT_GRAY);
		t_numero.setForeground(SystemColor.textHighlight);
		t_numero.setFont(new Font("Arial Black", Font.PLAIN, 13));
		t_numero.setBounds(187, 70, 130, 26);
		contentPane.add(t_numero);
		t_numero.setColumns(10);
		
		btnInvia = new JButton("Invia");
		btnInvia.setForeground(SystemColor.textHighlight);
		btnInvia.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnInvia.setBackground(Color.LIGHT_GRAY);
		btnInvia.setBounds(566, 395, 130, 37);
		contentPane.add(btnInvia);
		
		rdbtnMatematico = new JRadioButton("matematico");
		rdbtnMatematico.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnMatematico.setBackground(Color.GRAY);
		rdbtnMatematico.setSelected(true);
		buttonGroup.add(rdbtnMatematico);
		rdbtnMatematico.setBounds(68, 125, 106, 23);
		contentPane.add(rdbtnMatematico);
		
		rdbtnData = new JRadioButton("data");
		rdbtnData.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnData.setBackground(Color.GRAY);
		buttonGroup.add(rdbtnData);
		rdbtnData.setBounds(207, 125, 61, 23);
		contentPane.add(rdbtnData);
		
		rdbtnAnno = new JRadioButton("anno");
		rdbtnAnno.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnAnno.setBackground(Color.GRAY);
		buttonGroup.add(rdbtnAnno);
		rdbtnAnno.setBounds(327, 125, 73, 23);
		contentPane.add(rdbtnAnno);
		
		rdbtnTrivia = new JRadioButton("trivia");
		rdbtnTrivia.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnTrivia.setBackground(Color.GRAY);
		buttonGroup.add(rdbtnTrivia);
		rdbtnTrivia.setBounds(450, 125, 73, 23);
		contentPane.add(rdbtnTrivia);
		
		rdbtnNewRadioButton = new JRadioButton("other");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(Color.GRAY);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(557, 125, 79, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		lblLingua = new JLabel("Lingua");
		lblLingua.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblLingua.setForeground(SystemColor.textHighlight);
		lblLingua.setBounds(460, 72, 63, 21);
		contentPane.add(lblLingua);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Arial Black", Font.PLAIN, 13));
		comboBox.setForeground(SystemColor.textHighlight);
		comboBox.setBounds(549, 69, 135, 27);
		String[] lingue= {"en-be","en-ca","en-cs","en-da","en-de","en-el","en-es","en-et","en-fi","en-fr","en-hu","en-it","en-lt","en-lv","en-mk","en-nl","en-no","en-pt","en-ru","en-sk","en-sl","en-sq","en-sv","en-tr","en-uk"};
		comboBox.addItem("original");
		for(int i=0;i<lingue.length;i++)
			comboBox.addItem(lingue[i]);
		contentPane.add(comboBox);
		
		lblNewLabel = new JLabel("Fatti dietro ai numeri");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 709, 50);
		contentPane.add(lblNewLabel);
		
		l_data = new JLabel("se vuoi utilizzare data devi esprimerla nel formato mm/gg ");
		l_data.setFont(new Font("Dialog", Font.ITALIC, 13));
		l_data.setBounds(6, 404, 394, 21);
		contentPane.add(l_data);
		
		textAreaStampa = new JTextArea();
		textAreaStampa.setFont(new Font("Arial", Font.PLAIN, 15));
		textAreaStampa.setBackground(Color.LIGHT_GRAY);
		textAreaStampa.setForeground(SystemColor.textHighlight);
		textAreaStampa.setBounds(16, 155, 680, 204);
		contentPane.add(textAreaStampa);
		textAreaStampa.setEditable(false);
		textAreaStampa.setLineWrap(true);
	}
	
	public JLabel getL_data() {
		return l_data;
	}

	public void setL_data(JLabel l_data) {
		this.l_data = l_data;
	}

	public JTextArea getTextAreaStampa() {
		return textAreaStampa;
	}

	public void setTextAreaStampa(JTextArea textAreaStampa) {
		this.textAreaStampa = textAreaStampa;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton;
	}

	public void setRdbtnNewRadioButton(JRadioButton rdbtnNewRadioButton) {
		this.rdbtnNewRadioButton = rdbtnNewRadioButton;
	}



	public JRadioButton getRdbtnMatematico() {
		return rdbtnMatematico;
	}

	public void setRdbtnMatematico(JRadioButton rdbtnMatematico) {
		this.rdbtnMatematico = rdbtnMatematico;
	}

	public JRadioButton getRdbtnData() {
		return rdbtnData;
	}

	public void setRdbtnData(JRadioButton rdbtnData) {
		this.rdbtnData = rdbtnData;
	}

	public JRadioButton getRdbtnAnno() {
		return rdbtnAnno;
	}

	public void setRdbtnAnno(JRadioButton rdbtnAnno) {
		this.rdbtnAnno = rdbtnAnno;
	}

	public JRadioButton getRdbtnTrivia() {
		return rdbtnTrivia;
	}

	public void setRdbtnTrivia(JRadioButton rdbtnTrivia) {
		this.rdbtnTrivia = rdbtnTrivia;
	}

	public JTextField getT_numero() {
		return t_numero;
	}
	public void setT_numero(JTextField t_numero) {
		this.t_numero = t_numero;
	}
	public JButton getBtnInvia() {
		return btnInvia;
	}
	public void setBtnInvia(JButton btnInvia) {
		this.btnInvia = btnInvia;
	}
	
	public void ascoltatore(ActionListener a) {
		btnInvia.addActionListener(a);
	}
}
