import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	private Toolbar toolbar;
	protected static Converter converterPanel;
	protected static Calculator calculatorPanel;
	protected static CalcText calcTextPanel;
	
	public MainPanel(){
		setPreferredSize(new Dimension(370, 470));
		
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		calcTextPanel = new CalcText();
		converterPanel = new Converter();
		calculatorPanel = new Calculator();

		add(toolbar, BorderLayout.NORTH);
		
		calcTextPanel.setVisible(true);
		converterPanel.setVisible(false);
		
		add(calcTextPanel, BorderLayout.CENTER);
		add(converterPanel, BorderLayout.EAST);
		
		add(calculatorPanel, BorderLayout.SOUTH);
	}
	
}
