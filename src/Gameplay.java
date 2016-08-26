
/**
 * Nick Smith
 * Created: 8/26/2016
 * Last Changed: 8/26/2016
 * Descripition:
 * Scene that acts as basis of gameplay. Contains Player object that will move by arrow keys
 * Must be able to easily change background (moving around the world)
 * 
 *
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Gameplay extends Scene implements KeyListener{
	Gameplay(){
		super();
		addKeyListener(this);
		setFocusable(true);
		
	}
	public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped: "+e);
    }
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed: "+e);
    }
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased: "+e);
    }
}
