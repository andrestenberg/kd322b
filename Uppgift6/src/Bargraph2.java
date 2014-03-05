import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Bargraph2 extends JComponent {

	private int women;
	private int men;
	private float total;
	
	
	public void updateValues (int w, int m){
		women = w;
		men = m;
		
		total = men + women;
		float procentM = men/total;
		
		//men = Math.round(total*100);
		
		
		float procentW = women/total;
		
		//women = Math.round(total*100);
		
		System.out.println(String.valueOf(procentW) + String.valueOf(procentM));
		
		this.repaint();
	}
	public void paint(Graphics g){
		int h = getHeight();
		g.setColor(Color.BLUE);
		g.setColor(Color.RED);
	}
	
		
	

}
