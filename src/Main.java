import control.Controller;
import model.Richiesta;
import view.Finestra;

public class Main {

	public static void main(String[] args) {
		Finestra f=new Finestra();
		Richiesta r=new Richiesta();
		new Controller(f, r);
		f.setVisible(true);
	}

}