import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Calculator extends JPanel implements ActionListener{
	
	private JButton sinInv;
	private JButton sin;
	private JButton sqrt;
	private JButton seven;
	private JButton four;
	private JButton one;
	private JButton plusMinus;
	
	private JButton cononev;
	private JButton cos;
	private JButton xSqared;
	private JButton eight;
	private JButton five;
	private JButton two;
	private JButton zero;
	
	private JButton tanInv;
	private JButton tan;
	private JButton backspace;
	private JButton nine;
	private JButton six;
	private JButton three;
	private JButton point;
	
	private JButton ce;
	private JButton log;
	private JButton div;
	private JButton mul;
	private JButton sub;
	private JButton add;
	private JButton equal;
	
	
	protected static double num1;
	protected static double num2;
	protected static double ans = 0;
	protected static String operation = "none"; // determines current operation
	protected static boolean clear = false; // determines if the screen would be cleared for new calculation after next stroke
	
	public Calculator(){
		setLayout(new GridLayout(7, 4, 1, 1));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		sinInv = new JButton("<html>sin<sup>-1</sup></html>");
		sinInv.setPreferredSize(new Dimension(50, 49));
		sinInv.setFont(new Font("Arial", Font.BOLD, 20));
		sinInv.addActionListener(this);
		sinInv.setFocusable(false);
		
		sin = new JButton("sin");
		sin.setFont(new Font("Arial", Font.BOLD, 20));
		sin.addActionListener(this);
		sin.setFocusable(false);
		
		sqrt = new JButton("√");
		sqrt.setFont(new Font("Arial", Font.BOLD, 20));
		sqrt.addActionListener(this);
		sqrt.setFocusable(false);
		
		seven = new JButton("7");
		seven.setFont(new Font("Arial", Font.BOLD, 20));
		seven.addActionListener(this);
		seven.setFocusable(false);
		
		four = new JButton("4");
		four.setFont(new Font("Arial", Font.BOLD, 20));
		four.addActionListener(this);
		four.setFocusable(false);
		
		one = new JButton("1");
		one.setFont(new Font("Arial", Font.BOLD, 20));
		one.addActionListener(this);
		one.setFocusable(false);
		
		plusMinus = new JButton("±");
		plusMinus.setFont(new Font("Arial", Font.BOLD, 20));
		plusMinus.addActionListener(this);
		plusMinus.setFocusable(false);
		
		
		cononev = new JButton("<html>cos<sup>-1</sup></html>");
		cononev.setFont(new Font("Arial", Font.BOLD, 20));
		cononev.addActionListener(this);
		cononev.setFocusable(false);
		
		cos = new JButton("cos");
		cos.setFont(new Font("Arial", Font.BOLD, 20));
		cos.addActionListener(this);
		cos.setFocusable(false);
		
		xSqared = new JButton("<html>x<sup>2</sup></html>");
		xSqared.setFont(new Font("Arial", Font.BOLD, 20));
		xSqared.addActionListener(this);
		xSqared.setFocusable(false);
		
		eight = new JButton("8");
		eight.setFont(new Font("Arial", Font.BOLD, 20));
		eight.addActionListener(this);
		eight.setFocusable(false);
		
		five = new JButton("5");
		five.setFont(new Font("Arial", Font.BOLD, 20));
		five.addActionListener(this);
		five.setFocusable(false);
		
		two = new JButton("2");
		two.setFont(new Font("Arial", Font.BOLD, 20));
		two.addActionListener(this);
		two.setFocusable(false);
		
		zero = new JButton("0");
		zero.setFont(new Font("Arial", Font.BOLD, 20));
		zero.addActionListener(this);
		zero.setFocusable(false);
		
		
		tanInv = new JButton("<html>tan<sup>-1</sup></html>");
		tanInv.setFont(new Font("Arial", Font.BOLD, 20));
		tanInv.addActionListener(this);
		tanInv.setFocusable(false);
		
		tan = new JButton("tan");
		tan.setFont(new Font("Arial", Font.BOLD, 20));
		tan.addActionListener(this);
		tan.setFocusable(false);
		
		backspace = new JButton("←");
		backspace.setFont(new Font("Arial", Font.BOLD, 20));
		backspace.addActionListener(this);
		backspace.setFocusable(false);
		
		nine = new JButton("9");
		nine.setFont(new Font("Arial", Font.BOLD, 20));
		nine.addActionListener(this);
		nine.setFocusable(false);
		
		six = new JButton("6");
		six.setFont(new Font("Arial", Font.BOLD, 20));
		six.addActionListener(this);
		six.setFocusable(false);
		
		three = new JButton("3");
		three.setFont(new Font("Arial", Font.BOLD, 20));
		three.addActionListener(this);
		three.setFocusable(false);
		
		point = new JButton(".");
		point.setFont(new Font("Arial", Font.BOLD, 20));
		point.addActionListener(this);
		point.setFocusable(false);
		
		
		ce = new JButton("CE");
		ce.setFont(new Font("Arial", Font.BOLD, 20));
		ce.addActionListener(this);
		ce.setFocusable(false);
		
		log = new JButton("log");
		log.setFont(new Font("Arial", Font.BOLD, 20));
		log.addActionListener(this);
		log.setFocusable(false);
		
		zero = new JButton("0");
		zero.setFont(new Font("Arial", Font.BOLD, 20));
		zero.addActionListener(this);
		zero.setFocusable(false);
		
		div = new JButton("÷");
		div.setFont(new Font("Arial", Font.BOLD, 20));
		div.addActionListener(this);
		div.setFocusable(false);
		
		mul = new JButton("×");
		mul.setFont(new Font("Arial", Font.BOLD, 20));
		mul.addActionListener(this);
		mul.setFocusable(false);
		
		sub = new JButton("—");
		sub.setFont(new Font("Arial", Font.BOLD, 20));
		sub.addActionListener(this);
		sub.setFocusable(false);
		
		add = new JButton("+");
		add.setFont(new Font("Arial", Font.BOLD, 20));
		add.addActionListener(this);
		add.setFocusable(false);
		
		equal = new JButton("=");
		equal.setFont(new Font("Arial", Font.BOLD, 20));
		equal.addActionListener(this);
		equal.setFocusable(false);
		

		add(sinInv);
		add(cononev);
		add(tanInv);
		add(ce);
		
		add(sin);
		add(cos);
		add(tan);
		add(backspace);
		
		add(sqrt);
		add(xSqared);
		add(log);
		add(div);
		
		add(seven);
		add(eight);
		add(nine);
		add(mul);
		
		add(four);
		add(five);
		add(six);
		add(sub);
		
		add(one);
		add(two);
		add(three);
		add(add);
		
		add(plusMinus);
		add(zero);
		add(point);
		add(equal);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == one){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("1"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("1");
				clear = false; 
			}
		}
		
		else if(e.getSource() == two){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("2"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("2");
				clear = false; 
			}
		}
		
		else if(e.getSource() == three){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("3"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("3");
				clear = false; 
			}
		}
		
		else if(e.getSource() == four){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("4"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("4");
				clear = false; 
			}
		}
		
		else if(e.getSource() == five){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("5"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("5");
				clear = false; 
			}
		}
		
		else if(e.getSource() == six){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("6"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("6");
				clear = false; 
			}
		}
		
		else if(e.getSource() == seven){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("7"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("7");
				clear = false; 
			}
		}
		
		else if(e.getSource() == eight){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("8"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("8");
				clear = false; 
			}
		}
		
		else if(e.getSource() == nine){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("9"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("9");
				clear = false; 
			}
		}
		
		else if(e.getSource() == zero){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("0"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("0");
				clear = false; 
			}
		}
		
		//======================================================================
		
		
		else if(e.getSource() == point){
			if(!clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("."));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText(".");
				clear = false; 
			}
			
		}
		
		else if(e.getSource() == plusMinus){
			if(MainPanel.calcTextPanel.getTextField().getText().length() == 0){
				MainPanel.calcTextPanel.getTextField().setText("-");
				clear = false;
			}
			
			else{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText()) * -1;
				if(num1 == (long) num1){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) num1) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(num1 + "");
				}
				
				clear = true;
			}
			
		}
		//=======================================================================
		
		
		else if(e.getSource() == add){
			if(!operation.equals("add") && !operation.equals("none")){
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(operation){
					case "sub":
						ans = num1 - num2;
						break;
						
					case "mul":
						ans = num1 * num2;
						break;
						
					case "div":
						ans = num1 / num2;
						break;
				}
				
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				operation = "add";
				clear = true;
			}
			
			else if(operation.equals("none")){
				
				//doFunction
				
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				operation = "add";
				clear = true;
			}
			
			else{
				//addNum(num1, );
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 + num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				operation = "add";
				clear = true;
			}
			
		}
		
		else if(e.getSource() == sub){
			if(!operation.equals("sub") && !operation.equals("none")){
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(operation){
					case "add":
						ans = num1 + num2;
						break;
						
					case "mul":
						ans = num1 * num2;
						break;
						
					case "div":
						ans = num1 / num2;
						break;
				}
				
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				
				operation = "sub";
				clear = true;
			}
			
			else if(operation.equals("none")){
				
				//doFunction
				
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				operation = "sub";
				clear = true;
			}
			
			else{
				//subNum(num1, );
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 - num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				operation = "sub";
				clear = true;
			}

		}
		
		else if(e.getSource() == mul){
			if(!operation.equals("mul") && !operation.equals("none")){
				
				//doFunction
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(operation){
					case "sub":
						ans = num1 - num2;
						break;
						
					case "add":
						ans = num1 + num2;
						break;
						
					case "div":
						ans = num1 / num2;
						break;
				}
				
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				
				operation = "mul";
				clear = true;
			}
			
			else if(operation.equals("none")){
				
				//doFunction
				
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				operation = "mul";
				clear = true;
			}
			
			else{
				//mulNum(num1, num2);
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 * num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				operation = "mul";
				clear = true;
			}
		}
		
		else if(e.getSource() == div){
			if(!operation.equals("div") && !operation.equals("none")){
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(operation){
					case "sub":
						ans = num1 - num2;
						break;
						
					case "mul":
						ans = num1 * num2;
						break;
						
					case "add":
						ans = num1 + num2;
						break;
				}
				
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				
				operation = "div";
				clear = true;
			}
			
			else if(operation.equals("none")){
				
				//doFunction
				
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				operation = "div";
				clear = true;
			}
			
			
			else{
				//divNum(num1, );
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 / num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
				operation = "div";
				clear = true;
			}
		}
		//=======================================================================
		
		
		else if(e.getSource() == sin){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,Math.sin(num1)) + "");
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == cos){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,Math.cos(num1)) + "");
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == tan){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,Math.tan(num1)) + "");
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == sinInv){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,Math.asin(num1)) + "");
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == cononev){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,Math.acos(num1)) + "");
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == tanInv){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,Math.atan(num1)) + "");
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		//=======================================================================
		
		
		else if(e.getSource() == sqrt){
			try{
				num1 = Math.sqrt(Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText()));
				if(num1 == (long) num1){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) num1) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(num1)) + "");
				}
				
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == xSqared){
			try{
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				num1 *= num1;
				if(num1 == (long) num1){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) num1) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(num1)) + "");
				}
				
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		
		else if(e.getSource() == backspace){
			try{
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				int len = temp.length();
				
				MainPanel.calcTextPanel.getTextField().setText(temp.substring(0, len - 1));
					
				
				num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				operation = "none";
				clear = false;
			} catch(Exception e1) {}
		}
		
		else if(e.getSource() == log){
			try{
				num1 = Math.log10(Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText()));
				if(num1 == (long) num1){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) num1) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(num1)) + "");
				}
				
			} catch(Exception e1){
				MainPanel.calcTextPanel.getTextField().setText("N/A");
			}
			num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
			operation = "none";
			clear = true;
		}
		//=======================================================================
		
		
		else if(e.getSource() == ce){
			MainPanel.calcTextPanel.getTextField().setText("");
			num1 = 0;
			num2 = 0;
			ans = 0;
			clear = false;
			operation = "none";
		}
			
		else if(e.getSource() == equal){
			if(operation.equals("add")){
				//addNums(num1, num2);
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 + num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
			}
			
			else if(operation.equals("sub")){
				//subNums(num1, num2);
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 - num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
			}
			
			else if(operation.equals("mul")){
				//mulNums(num1, num2);
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 * num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
			}
			
			else if(operation.equals("div")){
				//divNums(num1, num2);
				
				num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				ans = num1 / num2;
				num1 = ans;
				
				if(ans == (long) ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(ans)) + "");
				}
				
			}
			
			num1 = 0;
			num2 = 0;
			ans = 0;
			clear = true;
			operation = "none";
		}
	}

}
