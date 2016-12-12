
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventsHandler implements KeyListener{

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("1"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("1");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("2"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("2");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("3"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("3");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_NUMPAD4){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("4"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("4");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("5"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("5");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("6"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("6");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("7"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("7");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("8"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("8");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("9"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("9");
				Calculator.clear = false; 
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("0"));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText("0");
				Calculator.clear = false; 
			}
		}
		
		
		
		else if(e.getKeyCode() == KeyEvent.VK_DECIMAL){
			if(!Calculator.clear){
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				MainPanel.calcTextPanel.getTextField().setText(temp.concat("."));
			}
			
			else{
				MainPanel.calcTextPanel.getTextField().setText(".");
				Calculator.clear = false; 
			}
		}
		
		
		
		//======================================================================
		
			
		else if(e.getKeyCode() == KeyEvent.VK_ADD){
			if(!Calculator.operation.equals("add") && !Calculator.operation.equals("none")){
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(Calculator.operation){
					case "sub":
						Calculator.ans = Calculator.num1 - Calculator.num2;
						break;
						
					case "mul":
						Calculator.ans = Calculator.num1 * Calculator.num2;
						break;
						
					case "div":
						Calculator.ans = Calculator.num1 / Calculator.num2;
						break;
				}
				
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "add";
				Calculator.clear = true;
			}
			
			else if(Calculator.operation.equals("none")){
				
				//doFunction
				
				Calculator.num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.operation = "add";
				Calculator.clear = true;
			}
			
			else{
				//addNum(num1, );
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 + Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "add";
				Calculator.clear = true;
			}
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
			if(!Calculator.operation.equals("sub") && !Calculator.operation.equals("none")){
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(Calculator.operation){
					case "add":
						Calculator.ans = Calculator.num1 + Calculator.num2;
						break;
						
					case "mul":
						Calculator.ans = Calculator.num1 * Calculator.num2;
						break;
						
					case "div":
						Calculator.ans = Calculator.num1 / Calculator.num2;
						break;
				}
				
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "sub";
				Calculator.clear = true;
			}
			
			else if(Calculator.operation.equals("none")){
				
				//doFunction
				
				Calculator.num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.operation = "sub";
				Calculator.clear = true;
			}
			
			else{
				//addNum(num1, );
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 - Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "sub";
				Calculator.clear = true;
			}
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_MULTIPLY){
			
			if(!Calculator.operation.equals("mul") && !Calculator.operation.equals("none")){
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(Calculator.operation){
					case "add":
						Calculator.ans = Calculator.num1 + Calculator.num2;
						break;
						
					case "sub":
						Calculator.ans = Calculator.num1 - Calculator.num2;
						break;
						
					case "div":
						Calculator.ans = Calculator.num1 / Calculator.num2;
						break;
				}
				
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "mul";
				Calculator.clear = true;
			}
			
			
			else if(Calculator.operation.equals("none")){
				
				//doFunction
				
				Calculator.num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.operation = "mul";
				Calculator.clear = true;
			}

			else{
				//addNum(num1, );
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 * Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "mul";
				Calculator.clear = true;
			}
			
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DIVIDE){
			
			if(!Calculator.operation.equals("div") && !Calculator.operation.equals("none")){
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				switch(Calculator.operation){
					case "add":
						Calculator.ans = Calculator.num1 + Calculator.num2;
						break;
						
					case "sub":
						Calculator.ans = Calculator.num1 - Calculator.num2;
						break;
						
					case "mul":
						Calculator.ans = Calculator.num1 * Calculator.num2;
						break;
				}
				
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "div";
				Calculator.clear = true;
			}
			
			
			else if(Calculator.operation.equals("none")){
				
				//doFunction
				
				Calculator.num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.operation = "div";
				Calculator.clear = true;
			}

			else{
				//addNum(num1, );
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 / Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
				Calculator.operation = "div";
				Calculator.clear = true;
			}
		}
		//=======================================================================
		
		
		else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			
			try{
				String temp = MainPanel.calcTextPanel.getTextField().getText();
				int len = temp.length();
				
				MainPanel.calcTextPanel.getTextField().setText(temp.substring(0, len - 1));
				
				
				Calculator.num1 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				Calculator.operation = "none";
				Calculator.clear = false;
			} catch(Exception e1) {}
		} 
		
		
		//=======================================================================
		
			
		else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			if(Calculator.operation.equals("add")){
				//addNums(num1, num2);
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 + Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
			}
			
			else if(Calculator.operation.equals("sub")){
				//subNums(num1, num2);
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 - Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
			}
			
			else if(Calculator.operation.equals("mul")){
				//mulNums(num1, num2);
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 * Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
			}
			
			else if(Calculator.operation.equals("div")){
				//divNums(num1, num2);
				
				Calculator.num2 = Double.parseDouble(MainPanel.calcTextPanel.getTextField().getText());
				
				Calculator.ans = Calculator.num1 / Calculator.num2;
				Calculator.num1 = Calculator.ans;
				
				if(Calculator.ans == (long) Calculator.ans){
					MainPanel.calcTextPanel.getTextField().setText(String.format("%d", (long) Calculator.ans) + "");
				}
				
				else{
					MainPanel.calcTextPanel.getTextField().setText(String.format("%.5f" ,(Calculator.ans)) + "");
				}
				
			}
			
			Calculator.num1 = 0;
			Calculator.num2 = 0;
			Calculator.ans = 0;
			Calculator.clear = true;
			Calculator.operation = "none";
		}
	}

	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}

}
