import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Converter extends JPanel implements ActionListener{
	
	private JLabel kgLabelIn;
	private JLabel lbsLabelIn;
	private JLabel kgLabelOut;
	private JLabel lbsLabelOut;
	private JLabel mileLabelIn;
	private JLabel kmLabelIn;
	private JLabel mileLabelOut;
	private JLabel kmLabelOut;
	private JLabel inchLabelIn;
	private JLabel cmLabelIn;
	private JLabel inchLabelOut;
	private JLabel cmLabelOut;
	private JLabel cLabelIn;
	private JLabel fLabelIn;
	private JLabel cLabelOut;
	private JLabel fLabelOut;
	private JLabel gLabelIn;
	private JLabel lLabelIn;
	private JLabel gLabelOut;
	private JLabel lLabelOut;
	
	private JTextField kgFieldIn;
	private JTextField lbsFieldOut;
	private JTextField kgFieldOut;
	private JTextField lbsFieldIn;
	private JTextField mileFieldIn;
	private JTextField kmFieldOut;
	private JTextField mileFieldOut;
	private JTextField kmFieldIn;
	private JTextField inchFieldIn;
	private JTextField cmFieldOut;
	private JTextField inchFieldOut;
	private JTextField cmFieldIn;
	private JTextField cFieldIn;
	private JTextField fFieldOut;
	private JTextField cFieldOut;
	private JTextField fFieldIn;
	private JTextField gFieldIn;
	private JTextField lFieldOut;
	private JTextField gFieldOut;
	private JTextField lFieldIn;
	
	private JButton kgLbsBtn;
	private JButton lbsKgBtn;
	private JButton mileKmBtn;
	private JButton kmMileBtn;
	private JButton inchCmBtn;
	private JButton cmInchBtn;
	private JButton cFBtn;
	private JButton fCBtn;
	private JButton gLBtn;
	private JButton lGBtn;
	
	public Converter(){
		setLayout(new GridBagLayout());
		setPreferredSize(new Dimension(370,470));
		
		//===============================================================
		kgLabelIn = new JLabel("kg");
		kgLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		kgLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		lbsLabelIn = new JLabel("lbs");
		lbsLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		lbsLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		kgFieldIn = new JTextField(5);
		kgFieldIn.setEnabled(true);
		kgFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		kgFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		kgFieldIn.setMinimumSize(new Dimension(50,1));
		
		lbsFieldOut = new JTextField(5);
		lbsFieldOut.setEnabled(false);
		lbsFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		lbsFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		lbsFieldOut.setDisabledTextColor(Color.BLACK);
		lbsFieldOut.setMinimumSize(new Dimension(50,1));
		
		
		kgLabelOut = new JLabel("kg");
		kgLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		kgLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		lbsLabelOut = new JLabel("lbs");
		lbsLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		lbsLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		kgFieldOut = new JTextField(10);
		kgFieldOut.setEnabled(false);
		kgFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		kgFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		kgFieldOut.setDisabledTextColor(Color.BLACK);
		
		lbsFieldIn = new JTextField(10);
		lbsFieldIn.setEnabled(true);
		lbsFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		lbsFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		kgLbsBtn = new JButton("Convert");
		kgLbsBtn.addActionListener(this);
		lbsKgBtn = new JButton("Convert");
		lbsKgBtn.addActionListener(this);
		//===============================================================
		
		mileLabelIn = new JLabel("mile");
		mileLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		mileLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		kmLabelIn = new JLabel("km");
		kmLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		kmLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		mileFieldIn = new JTextField(10);
		mileFieldIn.setEnabled(true);
		mileFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		mileFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		kmFieldOut = new JTextField(10);
		kmFieldOut.setEnabled(false);
		kmFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		kmFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		kmFieldOut.setDisabledTextColor(Color.BLACK);

		
		
		mileLabelOut = new JLabel("mile");
		mileLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		mileLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		kmLabelOut = new JLabel("km");
		kmLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		kmLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		mileFieldOut = new JTextField(5);
		mileFieldOut.setEnabled(false);
		mileFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		mileFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		mileFieldOut.setDisabledTextColor(Color.BLACK);
		
		kmFieldIn = new JTextField(5);
		kmFieldIn.setEnabled(true);
		kmFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		kmFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		mileKmBtn = new JButton("Convert");
		mileKmBtn.addActionListener(this);
		kmMileBtn = new JButton("Convert");
		kmMileBtn.addActionListener(this);
		//================================================================
		
		//===============================================================
		
		inchLabelIn = new JLabel("inch");
		inchLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		inchLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		cmLabelIn = new JLabel("cm");
		cmLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		cmLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		inchFieldIn = new JTextField(10);
		inchFieldIn.setEnabled(true);
		inchFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		inchFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		cmFieldOut = new JTextField(10);
		cmFieldOut.setEnabled(false);
		cmFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		cmFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		cmFieldOut.setDisabledTextColor(Color.BLACK);

		
		
		inchLabelOut = new JLabel("inch");
		inchLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		inchLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		cmLabelOut = new JLabel("cm");
		cmLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		cmLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		inchFieldOut = new JTextField(5);
		inchFieldOut.setEnabled(false);
		inchFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		inchFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		inchFieldOut.setDisabledTextColor(Color.BLACK);
		
		cmFieldIn = new JTextField(5);
		cmFieldIn.setEnabled(true);
		cmFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		cmFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		inchCmBtn = new JButton("Convert");
		inchCmBtn.addActionListener(this);
		cmInchBtn = new JButton("Convert");
		cmInchBtn.addActionListener(this);
		//================================================================

		//===============================================================
		cLabelIn = new JLabel("Celcius");
		cLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		cLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		fLabelIn = new JLabel("Fahrenheit");
		fLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		fLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		cFieldIn = new JTextField(10);
		cFieldIn.setEnabled(true);
		cFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		cFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		fFieldOut = new JTextField(10);
		fFieldOut.setEnabled(false);
		fFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		fFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		fFieldOut.setDisabledTextColor(Color.BLACK);

		
		
		cLabelOut = new JLabel("Celcius");
		cLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		cLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		fLabelOut = new JLabel("Fahrenheit");
		fLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		fLabelOut.setFont(new Font("Arial", Font.BOLD, 13));
		
		cFieldOut = new JTextField(5);
		cFieldOut.setEnabled(false);
		cFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		cFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		cFieldOut.setDisabledTextColor(Color.BLACK);
		
		fFieldIn = new JTextField(5);
		fFieldIn.setEnabled(true);
		fFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		fFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		cFBtn = new JButton("Convert");
		cFBtn.addActionListener(this);
		fCBtn = new JButton("Convert");
		fCBtn.addActionListener(this);
		//================================================================
		
		//===============================================================
		gLabelIn = new JLabel("Gallon");
		gLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		gLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		lLabelIn = new JLabel("Liter");
		lLabelIn.setHorizontalAlignment(SwingConstants.CENTER);
		lLabelIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		gFieldIn = new JTextField(10);
		gFieldIn.setEnabled(true);
		gFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		gFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		lFieldOut = new JTextField(10);
		lFieldOut.setEnabled(false);
		lFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		lFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		lFieldOut.setDisabledTextColor(Color.BLACK);

		
		
		gLabelOut = new JLabel("Gallon");
		gLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		gLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		lLabelOut = new JLabel("Liter");
		lLabelOut.setHorizontalAlignment(SwingConstants.CENTER);
		lLabelOut.setFont(new Font("Arial", Font.BOLD, 15));
		
		gFieldOut = new JTextField(5);
		gFieldOut.setEnabled(false);
		gFieldOut.setHorizontalAlignment(SwingConstants.CENTER);
		gFieldOut.setFont(new Font("Arial", Font.BOLD, 15));
		gFieldOut.setDisabledTextColor(Color.BLACK);
		
		lFieldIn = new JTextField(5);
		lFieldIn.setEnabled(true);
		lFieldIn.setHorizontalAlignment(SwingConstants.CENTER);
		lFieldIn.setFont(new Font("Arial", Font.BOLD, 15));
		
		
		gLBtn = new JButton("Convert");
		gLBtn.addActionListener(this);
		lGBtn = new JButton("Convert");
		lGBtn.addActionListener(this);
		//================================================================

		
		
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.fill = GridBagConstraints.BOTH;
		
		//===================================================================
		gc.insets = new Insets(5, 5, 3, 5);
		gc.gridx = 0;
		gc.gridy = 0;
		add(kgLabelIn, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(kgFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		add(kgLbsBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 0;
		add(lbsLabelIn, gc);
		
		gc.gridx = 4;
		gc.gridy = 0;
		add(lbsFieldOut, gc);
		
		
		gc.insets = new Insets(5,5,20,5);
		gc.gridx = 0;
		gc.gridy = 1;
		add(lbsLabelOut, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(lbsFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		add(lbsKgBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 1;
		add(kgLabelOut, gc);
		
		gc.gridx = 4;
		gc.gridy = 1;
		add(kgFieldOut, gc);
		//============================================================
		gc.insets = new Insets(5, 5, 3, 5);
		//===================================================================
		gc.gridx = 0;
		gc.gridy = 2;
		add(mileLabelIn, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(mileFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		add(mileKmBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 2;
		add(kmLabelIn, gc);
		
		gc.gridx = 4;
		gc.gridy = 2;
		add(kmFieldOut, gc);
		
		
		gc.insets = new Insets(5,5,20,5);
		gc.gridx = 0;
		gc.gridy = 3;
		add(kmLabelOut, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		add(kmFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 3;
		add(kmMileBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 3;
		add(mileLabelOut, gc);
		
		gc.gridx = 4;
		gc.gridy = 3;
		add(mileFieldOut, gc);
		//============================================================
		gc.insets = new Insets(5, 5, 3, 5);
		//===================================================================
		gc.gridx = 0;
		gc.gridy = 4;
		add(inchLabelIn, gc);
		
		gc.gridx = 1;
		gc.gridy = 4;
		add(inchFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 4;
		add(inchCmBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 4;
		add(cmLabelIn, gc);
		
		gc.gridx = 4;
		gc.gridy = 4;
		add(cmFieldOut, gc);
		
		
		gc.insets = new Insets(5,5,20,5);
		gc.gridx = 0;
		gc.gridy = 5;
		add(cmLabelOut, gc);
		
		gc.gridx = 1;
		gc.gridy = 5;
		add(cmFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 5;
		add(cmInchBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 5;
		add(inchLabelOut, gc);
		
		gc.gridx = 4;
		gc.gridy = 5;
		add(inchFieldOut, gc);
		//============================================================
		gc.insets = new Insets(5, 5, 3, 5);
		//===================================================================
		gc.gridx = 0;
		gc.gridy = 6;
		add(cLabelIn, gc);
		
		gc.gridx = 1;
		gc.gridy = 6;
		add(cFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 6;
		add(cFBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 6;
		add(fLabelIn, gc);
		
		gc.gridx = 4;
		gc.gridy = 6;
		add(fFieldOut, gc);
		
		
		gc.insets = new Insets(5,5,20,5);
		gc.gridx = 0;
		gc.gridy = 7;
		add(fLabelOut, gc);
		
		gc.gridx = 1;
		gc.gridy = 7;
		add(fFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 7;
		add(fCBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 7;
		add(cLabelOut, gc);
		
		gc.gridx = 4;
		gc.gridy = 7;
		add(cFieldOut, gc);
		//============================================================
		gc.insets = new Insets(5, 5, 3, 5);
		//===================================================================
		gc.gridx = 0;
		gc.gridy = 8;
		add(gLabelIn, gc);
		
		gc.gridx = 1;
		gc.gridy = 8;
		add(gFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 8;
		add(gLBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 8;
		add(lLabelIn, gc);
		
		gc.gridx = 4;
		gc.gridy = 8;
		add(lFieldOut, gc);
		
		
		gc.insets = new Insets(5,5,20,5);
		gc.gridx = 0;
		gc.gridy = 9;
		add(lLabelOut, gc);
		
		gc.gridx = 1;
		gc.gridy = 9;
		add(lFieldIn, gc);
		
		gc.gridx = 2;
		gc.gridy = 9;
		add(lGBtn, gc);
		
		gc.gridx = 3;
		gc.gridy = 9;
		add(gLabelOut, gc);
		
		gc.gridx = 4;
		gc.gridy = 9;
		add(gFieldOut, gc);
		//============================================================
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == kgLbsBtn){
			try{
				double temp = Double.parseDouble(kgFieldIn.getText()) * 2.20462262185;
				lbsFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				lbsFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == lbsKgBtn){
			try{
				double temp = Double.parseDouble(lbsFieldIn.getText()) *  0.45359237;
				kgFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				kgFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == mileKmBtn){
			try{
				double temp = Double.parseDouble(mileFieldIn.getText()) * 1.6103;
				kmFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				kmFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == kmMileBtn){
			try{
				double temp = Double.parseDouble(kmFieldIn.getText()) *  0.621;
				mileFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				mileFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == inchCmBtn){
			try{
				double temp = Double.parseDouble(inchFieldIn.getText()) * 2.54;
				cmFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				cmFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == cmInchBtn){
			try{
				double temp = Double.parseDouble(cmFieldIn.getText()) *  0.3937;
				inchFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				inchFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == cFBtn){
			try{
				double temp = (Double.parseDouble(cFieldIn.getText()) * 9 / 5) + 32;
				fFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				fFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == fCBtn){
			try{
				double temp = (Double.parseDouble(fFieldIn.getText()) - 32) * 5 / 9;
				cFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				cFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == gLBtn){
			try{
				double temp = Double.parseDouble(gFieldIn.getText()) * 3.7854;
				lFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				lFieldOut.setText("N/A");
			}
		}
		
		else if(e.getSource() == lGBtn){
			try{
				double temp = Double.parseDouble(lFieldIn.getText()) * 0.2642;
				gFieldOut.setText(String.format("%.2f", temp) + "");
			} catch(NumberFormatException e1){
				gFieldOut.setText("N/A");
			}
		}
	}
	
}
