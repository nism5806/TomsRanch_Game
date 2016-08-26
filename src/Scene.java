/**
 * Nick Smith
 * Created: 8/26/2016
 * Last Changed: 8/26/2016
 * Description:
 * Abstract class to modify JPanel. Adds a condition variable telling if the JPanel is "done"
 * Ideally can send Scenes to MasterWindow to be queued, the next in queue won't be shown until the 
 * last is "done"
 * Fixed size to fit MasterWindow.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public abstract class Scene extends JPanel{
	private final int width=960;
	private final int height=600;
	private boolean finished=false;
	Scene(){
		super();
		setPreferredSize(new Dimension(width,height));
		setVisible(true);
	}
	private void endScene(){
		finished=true;
	}
	private boolean isFinished(){
		return finished;
	}
}
