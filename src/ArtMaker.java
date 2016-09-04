/**
 * Nick Smith
 * Created: 8/28/2016
 * Last Changed: 8/28/2016
 * Description:
 * Tool to make art for game. Will save files to be loaded later and whatnot.
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ArtMaker extends JFrame{
	private Container contentPane;
	ArtMaker(){
		super("Art Maker");
		contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new Canvas(),BorderLayout.CENTER);
		JPanel buttonPanel=new JPanel();
		
		setVisible(true);
		pack();
		
	}
	public static void main(String[] args){
		new ArtMaker();
	}
}
