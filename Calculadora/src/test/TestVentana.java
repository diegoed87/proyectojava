package test;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import presentation.Ventana;

public class TestVentana {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		UIManager.put("nimbusOrange", new Color(0, 170, 255));
		Ventana v = new Ventana();
		v.setVisible(true);
	}
}
