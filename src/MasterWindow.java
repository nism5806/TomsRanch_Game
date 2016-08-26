/**
 * Nick Smith
 * Created: 8/25/16
 * Last Changed: 8/25/16
 * Description: 
 * Decorated JFrame that will handle closing 
 * Ideally gives have-you-saved warning before closing with a checkbox do not show this again option
 * Can be passed a JPanel/Frame and displays it or queues it to be displayed
 *
 */
//quick refresher on the imports: http://www.wideskills.com/java-tutorial/java-frame-class-example
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MasterWindow extends JFrame{
	final int width=960;
	final int height=600;
	//Constructor. Sets window name.
	MasterWindow(){
		super("Tom's Ranch");
		setPreferredSize(new Dimension(width,height));
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setVisible(true);
		pack();
	}
	//displays panel argument
	//returns -1 if fails, 0 otherwise
	public int showPanel(JPanel panel){
		if(panel.getWidth()>width || panel.getHeight()>height){
			//JPanel too large
			return -1;
		}
		
		return 0;
	}
	

	public static void main(String[] args) {
		new MasterWindow();
	}

}
