package interfacciaGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.AncestorListener;

import org.omg.CORBA.TIMEOUT;

import pattern.ElementiInArray;
import pattern.ElementiInMatrice;

public class Output {

	private JFrame frame;
	
	private Pannello panel;
	
	public Output(ElementiInMatrice elementiAdattati) {
		frame = new JFrame("Output");
		
		panel = new Pannello(elementiAdattati);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(350, 350);
		
		frame.setLocation(500, 0);
		
		frame.setVisible(true);
	}

}
