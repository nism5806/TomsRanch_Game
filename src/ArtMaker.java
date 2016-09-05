/**
 * Nick Smith
 * Created: 8/28/2016
 * Last Changed: 9/4/2016
 * Description:
 * Tool to make art for game. Will save files to be loaded later and whatnot.
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class ArtMaker extends JFrame implements ActionListener{
	private Container contentPane;
	private JButton pickColor,save,preview;
	private Canvas canvas;
	private ColorPicker colorPicker;
	ArtMaker(){
		super("Art Maker");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(screenSize.width/2-350, screenSize.height/2-310);
		contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		canvas=new Canvas();
		contentPane.add(canvas,BorderLayout.CENTER);
		JPanel buttonPanel=new JPanel();
		buttonPanel.setPreferredSize(new Dimension(100, 600));
		buttonPanel.setLayout(new FlowLayout());
		pickColor=new JButton();
		pickColor.setBackground(canvas.getColor());
		pickColor.setPreferredSize(new Dimension(75,75));
		pickColor.addActionListener(this);
		buttonPanel.add(pickColor);
		contentPane.add(buttonPanel,BorderLayout.EAST);
		setVisible(true);
		pack();
		
	}
	public void setColor(int r, int g, int b){
		Color c=new Color(r,g,b);
		canvas.setColor(c);
		pickColor.setBackground(c);
	}
	public Color getColor(){
		return canvas.getColor();
	}
	public static void main(String[] args){
		new ArtMaker();
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==pickColor){
			colorPicker=new ColorPicker(this);
		}
		
	}
}
