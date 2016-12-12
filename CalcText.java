import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcText extends JPanel {
	
	private JTextField textField;
	
	public CalcText(){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		textField = new JTextField(5);
		textField.setMaximumSize(new Dimension(350, 80));
		
		textField.setFont(new Font("Arial", Font.BOLD, 50));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(textField);
		
	}
	
	public JTextField getTextField(){
		return textField;
	}
	
}
