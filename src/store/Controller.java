package store;
import frame.Mainframe;
public class Controller {
	
		public static void main(String[] args) {
			Controller c = new Controller();
		}
		
		Mainframe mainframe;
		
		public Controller() {
			mainframe= new Mainframe(null);
			mainframe.setLocationRelativeTo(null);
			mainframe.setVisible(true);
		}

}
