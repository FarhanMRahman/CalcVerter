
public class CalcVerter {
	
	public static void main(String[] args) {
		KeyEventsHandler k = new KeyEventsHandler();
		DisplayWindow d = new DisplayWindow();
		d.addKeyListener(k);
		d.setFocusable(true);
		MainPanel m = new MainPanel();
		d.add(m);
		d.showFrame();
	}

}
