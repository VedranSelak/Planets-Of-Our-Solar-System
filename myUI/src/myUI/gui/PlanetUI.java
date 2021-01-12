package myUI.gui;



import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import myUI.app.Planet;

public class PlanetUI implements Runnable {
	private JFrame frame;
	private Planet planet;
	
	public PlanetUI(Planet planet) {
		this.planet = planet;
	}

	@Override
	public void run() {
		this.frame = new JFrame(this.planet.getName());
		this.frame.setPreferredSize(new Dimension(700,400));
		this.frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		createComponents(this.frame.getContentPane());
		
		this.frame.pack();
		this.frame.setResizable(false);
		this.frame.setVisible(true);
	}
	public void createComponents(Container container) {
		GridLayout layout = new GridLayout(1,2);
		container.setLayout(layout);
		ImageIcon image = new ImageIcon("src/" + this.planet.getName().toLowerCase()+ ".jpg");
		JLabel label1 = new JLabel(image);
		container.add(label1);
		JLabel label2 = new JLabel(this.planet.getDescription());
		container.add(label2);
	}
	
}
