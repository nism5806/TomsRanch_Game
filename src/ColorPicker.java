/**
 * Nick Smith
 * Created: 9/4/2016
 * Last Changed: 9/4/2106
 * Description:
 * Color Picker widget for Art Maker
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class ColorPicker extends JFrame implements ActionListener{
	private ArtMaker parent;
	private Container contentPane;
	private JTextField rText,gText,bText;
	private JButton saveColor;
	ColorPicker(ArtMaker am){
		super();
		contentPane=getContentPane();
		parent=am;
		setUndecorated(true);
		setPreferredSize(new Dimension(100,125));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(screenSize.width/2-50,screenSize.height/2-50);
		contentPane.setLayout(new FlowLayout());
		JPanel rBox=new JPanel();
		rBox.setPreferredSize(new Dimension(100,25));
		rBox.setLayout(new BorderLayout());
		JLabel r=new JLabel("r=");
		rBox.add(r,BorderLayout.WEST);
		rText=new JTextField();
		rText.setText(Integer.toString(parent.getColor().getRed()));
		rBox.add(rText,BorderLayout.CENTER);
		JPanel gBox=new JPanel();
		gBox.setPreferredSize(new Dimension(100,25));
		gBox.setLayout(new BorderLayout());
		JLabel g=new JLabel("g=");
		gBox.add(g,BorderLayout.WEST);
		gText=new JTextField();
		gText.setText(Integer.toString(parent.getColor().getGreen()));
		gBox.add(gText,BorderLayout.CENTER);
		JPanel bBox=new JPanel();
		bBox.setPreferredSize(new Dimension(100,25));
		bBox.setLayout(new BorderLayout());
		JLabel b=new JLabel("b=");
		bBox.add(b,BorderLayout.WEST);
		bText=new JTextField();
		bText.setText(Integer.toString(parent.getColor().getBlue()));
		bBox.add(bText,BorderLayout.CENTER);
		saveColor=new JButton("Save Color");
		saveColor.addActionListener(this);
		contentPane.add(rBox);
		contentPane.add(gBox);
		contentPane.add(bBox);
		contentPane.add(saveColor);
		setVisible(true);
		pack();
	}
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==saveColor){
			int r,g,b;
			try{
				r=Integer.parseInt(rText.getText());
				g=Integer.parseInt(gText.getText());
				b=Integer.parseInt(bText.getText());
				parent.setColor(r, g, b);
				this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
			}catch(Exception e){
			}
		}
	}
}
