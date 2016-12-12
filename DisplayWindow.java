import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayWindow extends JFrame{
	private Container c;
	
	public DisplayWindow(){
		super("CalcVerter 1.0");
		c = this.getContentPane();
		
	}
	
	public void add(JPanel p){
		c.add(p);
	}
	
	public void showFrame(){
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
