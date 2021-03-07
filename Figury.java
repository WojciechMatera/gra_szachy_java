
import java.applet.*;
import java.awt.*;

public class Figury extends Applet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint_pionek (Graphics g , int x, int y, Color kolor,Color kolor2 )
	{
	        g.setColor(kolor);
		g.fillOval(110+x, 59+y, 30, 22); // dolne ko這 
		g.fillRoundRect(100+x,80+y,50,12, 20, 20); //dolny kwadrat
		g.fillRoundRect(110+x,48+y,30,12,20,20); // g鏎ny kwadrat
		g.fillOval(118+x, 30+y, 15, 20); // g鏎ne ko這

	        g.setColor(kolor2);
		g.drawOval(110+x, 59+y, 30, 22); // dolne ko這 
		g.drawRoundRect(100+x,80+y,50,12, 20, 20); //dolny kwadrat
		g.drawRoundRect(110+x,48+y,30,12,20,20); // g鏎ny kwadrat
		g.drawOval(118+x, 30+y, 15, 20); // g鏎ne ko這

	}
	
	public void paint_skoczek(Graphics g,int x, int y,Color kolor, Color kolor2)
	{
		g.setColor(kolor);
		int tabX1[] = {110+x,135+x,150+x,170+x,
					   170+x,160+x,170+x,170+x,
					   110+x,110+x,155+x,155+x,
					   135+x,120+x 
					  };
		int tabY1[] = {59+y,40+y,40+y,50+y,
					  60+y,90+y,90+y,100+y,
					  100+y,90+y,60+y,52+y,
					  58+y,70+y
				      };
		
		g.fillPolygon(tabX1, tabY1,14);
		g.setColor(kolor2);
		g.drawPolygon(tabX1, tabY1,14);
	}
	public void paint_goniec(Graphics g,int x,int y,Color kolor, Color kolor2){
		
		g.setColor(kolor);
		g.fillOval(110+x, 59+y, 30, 22);
		g.fillRoundRect(100+x,80+y,50,12, 20, 20);
		g.fillRoundRect(112+x,48+y,28,12,20,20);
		
		int tabX2[] = {117+x,123+x,128+x,134+x,130+x,120+x};
		int tabY1[] = {45+y,27+y,27+y,45+y,48+y,48+y};
		g.fillPolygon(tabX2, tabY1, 6);

		g.setColor(kolor2);
		g.drawOval(110+x, 59+y, 30, 22);
		g.drawRoundRect(100+x,80+y,50,12, 20, 20);
		g.drawRoundRect(112+x,48+y,28,12,20,20);
		g.drawPolygon(tabX2, tabY1, 6);

	}
	public void paint_wieza (Graphics g,int x,int y, Color kolor, Color kolor2)
	{
		g.setColor(kolor);
		g.fillRect(110+x, 59+y, 30, 22);
		g.fillRect(100+x,80+y,50,12);
		g.fillRect(110+x,48+y,30,12);
		g.fillRect(120+x, 30+y, 12, 20);
		g.fillRect(102+x, 30+y, 12, 20);
		g.fillRect(138+x, 30+y, 12, 20);

		g.setColor(kolor2);
		g.drawRect(110+x, 59+y, 30, 22);
		g.drawRect(100+x,80+y,50,12);
		g.drawRect(110+x,48+y,30,12);
		g.drawRect(120+x, 30+y, 12, 20);
		g.drawRect(102+x, 30+y, 12, 20);
		g.drawRect(138+x, 30+y, 12, 20);

	}
	
	public void paint_damka (Graphics g, int x,int y,Color kolor, Color kolor2)
	{
		g.setColor(kolor);
		g.fillOval(110+x, 59+y, 30, 22);
		g.fillRoundRect(100+x,80+y,50,12, 20, 20);
		g.fillRoundRect(110+x,48+y,30,12,20,20);
		
		int tabX2[] = {110+x,105+x,120+x,125+x,
					   130+x,145+x,140+x};
		int tabY1[] = {48+y,30+y,42+y,30+y,
					   42+y,30+y,48+y};
		g.fillPolygon(tabX2, tabY1, 7);

		g.setColor(kolor2);
		g.drawOval(110+x, 59+y, 30, 22);
		g.drawRoundRect(100+x,80+y,50,12, 20, 20);
		g.drawRoundRect(110+x,48+y,30,12,20,20);
		g.drawPolygon(tabX2, tabY1, 7);

	}
	
	public void paint_krol (Graphics g, int x, int y,Color kolor, Color kolor2)
	{
		g.setColor(kolor);
		g.fillOval(110+x, 59+y, 30, 22);
		g.fillRoundRect(100+x,80+y,50,12, 20, 20);
		g.fillRoundRect(110+x,48+y,30,12,20,20);
		

		int tabX2[] = {122+x,122+x,115+x,115+x,
			    	   122+x,122+x,129+x,129+x,
			    	   136+x,136+x,129+x,129+x};
     	int tabY1[] = {48+y,40+y,40+y,35+y,
		     		   35+y,30+y,30+y,35+y,
		     		   35+y,40+y,40+y,48+y};
	    g.fillPolygon(tabX2, tabY1, 12);


		g.setColor(kolor2);
		g.drawOval(110+x, 59+y, 30, 22);
		g.drawRoundRect(100+x,80+y,50,12, 20, 20);
		g.drawRoundRect(110+x,48+y,30,12,20,20);
        	g.drawPolygon(tabX2, tabY1, 12);

	}
	
	
	
}