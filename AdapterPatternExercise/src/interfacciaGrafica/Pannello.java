package interfacciaGrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javafx.scene.effect.BlurType;
import pattern.ElementiInArray;
import pattern.ElementiInMatrice;

public class Pannello extends JPanel{
	
	private ArrayList<BufferedImage> immagini;
	private int x;
	private int y;
	private ElementiInMatrice elementi;
	
	public Pannello(ElementiInMatrice elementiAdattati) {
		super();
		
		x = 0;
		y = 0;
				
		elementi = elementiAdattati;
		
		immagini = new ArrayList<BufferedImage>();
				
		try {
			for (int i = 0;i<3;i++)
				immagini.add(ImageIO.read(new File("immagini" + File.separator  +i+ ".png")));
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setOpaque(true);
		
		this.setBackground(Color.GRAY);
		
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		x = 0;
		
		y = 0;
		
		
		Graphics2D grafica2d = (Graphics2D) g;
		
		for (int i = 0;i<3;i++)
		{
			for (int j = 0;j<3;j++)
			{
				grafica2d.drawImage(immagini.get(elementi.getElemento(i,j)),x,y,this);
				
				x+=90;
			}
				y += 90;
				x = 0;
		}
	}
	
}
