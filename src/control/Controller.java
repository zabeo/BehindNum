package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model.Richiesta;
import view.Finestra;

public class Controller implements ActionListener{

	private Finestra f;
	private Richiesta r;
	
	public Controller(Finestra f, Richiesta r) {
		this.f = f;
		this.r = r;
		this.f.ascoltatore(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==f.getBtnInvia()) {
			String indirizzo="http://numbersapi.com/";
			indirizzo=indirizzo+f.getT_numero().getText()+"/";
			if(f.getRdbtnMatematico().isSelected()) {
				indirizzo=indirizzo+"math";
			}
			else {
				if(f.getRdbtnData().isSelected())
					indirizzo=indirizzo+"date";
				else {
					if(f.getRdbtnAnno().isSelected())
						indirizzo=indirizzo+"year";
					else {
						if(f.getRdbtnTrivia().isSelected())
							indirizzo=indirizzo+"trivia";
					}
				}
			}
			if(f.getComboBox().getSelectedItem().toString().equals("original"))
				f.getTextAreaStampa().setText(r.send(indirizzo));
			else {				
				f.getTextAreaStampa().setText(r.send_Tradotto(indirizzo, f.getComboBox().getSelectedItem().toString()));
			}
		}
	}
	
	
}
