import javax.swing.JFrame;

public class fenetre extends JFrame {
	
	public fenetre() {
	
	
	javax.swing.JFrame fenetre = new JFrame();
	// definition du titre de ma fenetre //
	fenetre.setTitle("conversionFC");
	// taille fenetre //
	fenetre.setSize(500,200);
	// position de l'objet //
	fenetre.setLocationRelativeTo(null);
	// la croix rouge arrête le processus //
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// rendre la fenetre visible //		
	fenetre.setVisible(true);
	}

}
