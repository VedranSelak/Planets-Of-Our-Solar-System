package myUI.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import myUI.app.Planet;

public class UserInterface implements Runnable{
	private JFrame frame;
	private ArrayList<Planet> planets;
	public UserInterface(ArrayList<Planet> planets) {
		this.planets = planets;
	}
	@Override
	public void run() {
		this.frame = new JFrame("Planets Of Our Solar System");
		this.frame.setPreferredSize(new Dimension(700,300));
		this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.frame.setBackground(Color.BLACK);
		
		createComponents(this.frame.getContentPane());
		
		this.frame.pack();
		this.frame.setResizable(false);
		this.frame.setVisible(true);
	}
	public void createComponents(Container container) {
		GridLayout layout = new GridLayout(2,4);
		container.setLayout(layout);
		ImageIcon mercury = new ImageIcon("src/mercury.jpg");
		JButton b1 = new JButton(mercury);
		b1.addActionListener(new ButtonListener(this.planets.get(0)));
		container.add(b1);
		
		ImageIcon venus = new ImageIcon("src/venus.jpg");
		JButton b2 = new JButton(venus);
		b2.addActionListener(new ButtonListener(this.planets.get(1)));
		container.add(b2);
		
		ImageIcon earth = new ImageIcon("src/earth.jpg");
		JButton b3 = new JButton(earth);
		b3.addActionListener(new ButtonListener(this.planets.get(2)));
		container.add(b3);
		
		ImageIcon mars = new ImageIcon("src/mars.jpg");
		JButton b4 = new JButton(mars);
		b4.addActionListener(new ButtonListener(this.planets.get(3)));
		container.add(b4);
		
		ImageIcon jupiter = new ImageIcon("src/jupiter.jpg");
		JButton b5 = new JButton(jupiter);
		b5.addActionListener(new ButtonListener(this.planets.get(4)));
		container.add(b5);
		
		ImageIcon saturn = new ImageIcon("src/saturn.jpg");
		JButton b6 = new JButton(saturn);
		b6.addActionListener(new ButtonListener(this.planets.get(5)));
		container.add(b6);
		
		ImageIcon uranus = new ImageIcon("src/uranus.jpg");
		JButton b7 = new JButton(uranus);
		b7.addActionListener(new ButtonListener(this.planets.get(6)));
		container.add(b7);
		
		ImageIcon neptun = new ImageIcon("src/neptune.jpg");
		JButton b8 = new JButton(neptun);
		b8.addActionListener(new ButtonListener(this.planets.get(7)));
		container.add(b8);
	}
}
