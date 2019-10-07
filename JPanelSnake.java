package snake;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class AppMain extends JFrame {
	public AppMain() {
		int largura = 400, altura = 430;
		this.setTitle("Snake 2D");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new JPanelSnake(largura, altura));
		this.setSize(largura, altura);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AppMain().setVisible(true);
			}
		});
	}
}
