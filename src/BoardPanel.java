import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class BoardPanel extends JPanel{

	private BufferedImage myImage;
	public BoardPanel(BufferedImage img)
	{
		super();
		this.myImage = img;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.drawImage(myImage, 0,0, getWidth(), getHeight(), null);
	}
}
