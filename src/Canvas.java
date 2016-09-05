/**
 * Nick Smith
 * Created: 8/28/2016
 * Last Changed: 9/4/2016
 * Description:
 * Grid Canvas to for ArtMaker. Set color and click.
 * Used https://github.com/haxxorsid/Swing-Paint-Application for A LOT OF help
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Canvas extends JComponent{
	private Graphics2D g;
	private BufferedImage img;
	private Color color;
	private Color[][] colorGrid=new Color[8][8];
	Canvas(){
		this.setPreferredSize(new Dimension(600,600));
		color=Color.green;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				colorGrid[i][j]=Color.white;
			}
		}
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int X = e.getX()/75;
				int Y = e.getY()/75;
				colorGrid[X][Y]=color;
				g.setColor(color);
				g.fillRect(X*75, Y*75, 75, 75);
				paintGrid();
				repaint();
			}
		});

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				/**
				X1 = e.getX();
				Y1 = e.getY();

				if (g != null) {
					g.drawLine(X2, Y2, X1, Y1);
					repaint();
					X2 = X1;
					Y2 = Y1;
				}
				**/
			}
		});
	}
	private void paintGrid(){
		int h=getSize().height;
		int w=getSize().width;
		g.setPaint(Color.black);
		for(int i=0;i<=w;i+=75){
			g.drawLine(i, 0, i, h);
		}
		for(int j=0;j<=h;j+=75){
			g.drawLine(0,j,w,j);
		}
		repaint();
	}
	public void paintComponent(Graphics g1){
		if(img == null){
			img = (BufferedImage) createImage(getSize().width, getSize().height);
			g = (Graphics2D) img.getGraphics();
			clear();
		}
		g1.drawImage(img,0,0,null);
	}
	public void clear() {
		int h=getSize().height;
		int w=getSize().width;
		g.setPaint(Color.white);
		g.fillRect(0, 0, w, h);
		paintGrid();
		repaint();
	}
	
	public Color getColor(){
		return color;
	}
	public void setColor(Color c){
		color=c;
	}
	public void setColor(int r, int g, int b){
		color=new Color(r,g,b);
	}
	
}
