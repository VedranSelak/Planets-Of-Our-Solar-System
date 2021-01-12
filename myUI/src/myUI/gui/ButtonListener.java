package myUI.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import myUI.app.Planet;

public class ButtonListener implements ActionListener{
	private Planet planet;
	public ButtonListener(Planet planet) {
		this.planet = planet;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		PlanetUI pui = new PlanetUI(this.planet);
		SwingUtilities.invokeLater(pui); 
	}
}
