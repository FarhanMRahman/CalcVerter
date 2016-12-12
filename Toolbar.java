import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton calcButton,converterButton;
	
	public Toolbar(){
		setLayout(new FlowLayout(FlowLayout.CENTER));
		calcButton = new JButton("Calculator");
		converterButton = new JButton("Converter");
		calcButton.setFocusable(false);
		converterButton.setFocusable(false);
		add(calcButton);
		add(converterButton);
		calcButton.addActionListener(this);
		converterButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == calcButton){
			MainPanel.converterPanel.setVisible(false);
			MainPanel.calculatorPanel.setVisible(true);
			MainPanel.calcTextPanel.setVisible(true);
		}
		
		else if(e.getSource() == converterButton){
			MainPanel.calculatorPanel.setVisible(false);
			MainPanel.calcTextPanel.setVisible(false);
			MainPanel.converterPanel.setVisible(true);
		}
	}

}
