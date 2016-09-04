/**
 * Nick Smith
 * Created: 8/25/16
 * Last Changed: 8/26/16
 * Description: 
 * Decorated JFrame that will handle closing 
 * Ideally gives have-you-saved warning before closing with a checkbox do not show this again option
 * Can be passed a JPanel/Frame and displays it or queues it to be displayed
 * 960 by 600
 * 40 pixel blocks
 * I want 8 bit arcade feel so images will be made with 5x5 pixels. 5*8
 *
 */
//quick refresher on the imports: http://www.wideskills.com/java-tutorial/java-frame-class-example
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MasterWindow extends JFrame{
	private final int width=960;
	private final int height=600;
	private JPanel currentScene;
	//Constructor. Sets window name. Builds empty window.
	MasterWindow(){
		super("Tom's Ranch");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		JPanel empty=new JPanel();
		empty.setPreferredSize(new Dimension(width,height));
		getContentPane().add(empty);
		currentScene=empty;
		setVisible(true);
		pack();
	}
	//displays panel argument
	//returns -1 if fails, 0 otherwise
	public int showPanel(Scene panel){
		if(panel.getWidth()>width || panel.getHeight()>height){
			//Scene too large
			System.out.println("Scene too large");
			return -1;
		}
		//TODO: check if current scene is finished
		//must change init panel to Scene but I don't want to code in an empty Scene
		getContentPane().remove(getCurrentScene());
		getContentPane().add(panel);
		panel.setVisible(true);
		pack();
		return 0;
	}
	public JPanel getCurrentScene(){
		return currentScene;
	}

	public static void main(String[] args) {
		MasterWindow mw=new MasterWindow();
		mw.showPanel(new Gameplay());
		System.out.println("test");
	}

}
