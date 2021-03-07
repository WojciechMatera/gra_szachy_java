import java.awt.*;
import java.applet.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
public class Szachy extends Applet implements Runnable
{
// Figury bia³e
	public int pionek1[][] = {{-30,68}}; //= -30;
	public int pionek2[][] = {{45,68}}; //= -30;
	public int pionek3[][] = {{115,68}}; //= -30;
	public int pionek4[][] = {{185,68}}; //= -30;
	public int pionek5[][] = {{255,68}}; //= -30;
	public int pionek6[][] = {{330,68}}; //= -30;
	public int pionek7[][] = {{400,68}}; //= -30;
	public int pionek8[][] = {{475,68}}; //= -30;
	
	public int figura1[][] = {{-30,0}}; //= -30;
	public int figura2[][] = {{30,-10}}; //= -30;
	public int figura3[][] = {{115,0}}; //= -30;
	public int figura4[][] = {{185,0}}; //= -30;
	public int figura5[][] = {{255,0}}; //= -30;
	public int figura6[][] = {{330,0}}; //= -30;
	public int figura7[][] = {{385,-10}}; //= -30;
	public int figura8[][] = {{475,0}}; //= -30;

// Figury czarne	
	public int pionek11[][] = {{-30,390}}; //= -30;
	public int pionek21[][] = {{45,390}}; //= -30;
	public int pionek31[][] = {{115,390}}; //= -30;
	public int pionek41[][] = {{185,390}}; //= -30;
	public int pionek51[][] = {{255,390}}; //= -30;
	public int pionek61[][] = {{330,390}}; //= -30;
	public int pionek71[][] = {{400,390}}; //= -30;
	public int pionek81[][] = {{475,390}}; //= -30;
	
	public int figura11[][] = {{-30,454}}; //= -30;
	public int figura21[][] = {{30,444}}; //= -30;
	public int figura31[][] = {{115,454}}; //= -30;
	public int figura41[][] = {{185,454}}; //= -30;
	public int figura51[][] = {{255,454}}; //= -30;
	public int figura61[][] = {{330,454}}; //= -30;
	public int figura71[][] = {{385,444}}; //= -30;
	public int figura81[][] = {{475,454}}; //= -30;

		
	// Figury bia³e
	boolean pionek_w = false;
	boolean pionek_2 = false;
	boolean pionek_3 = false;
	boolean pionek_4 = false;
	boolean pionek_5 = false;
	boolean pionek_6 = false;
	boolean pionek_7 = false;
	boolean pionek_8 = false;

	boolean figura_1 = false;
	boolean figura_2 = false;
	boolean figura_3 = false;
	boolean figura_4 = false;
	boolean figura_5 = false;
	boolean figura_6 = false;
	boolean figura_7 = false;
	boolean figura_8 = false;
	
// Figury czarne
	
	boolean pionek_w1 = false;
	boolean pionek_21 = false;
	boolean pionek_31 = false;
	boolean pionek_41 = false;
	boolean pionek_51 = false;
	boolean pionek_61 = false;
	boolean pionek_71 = false;
	boolean pionek_81 = false;

	boolean figura_11 = false;
	boolean figura_21 = false;
	boolean figura_31 = false;
	boolean figura_41 = false;
	boolean figura_51 = false;
	boolean figura_61 = false;
	boolean figura_71 = false;
	boolean figura_81 = false;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image dbImage;
	private Graphics dbg;
	boolean isStoped = true;		// Zeigt an, ob das Spiel gestopt ist (true) oder läuft (false)
	public String tekst = "X";
	Cursor c;
	BufferedImage backImage = null;
//Figury bia³e
	public int wart_pionekx1 = 60; public int wart_pionekx2 = 130; public int wart_pioneky1 = 93;public int wart_pioneky2 = 157; //64
	public int wart_pionek2x1 = 130; public int wart_pionek2x2 = 200; public int wart_pionek2y1 = 93;public int wart_pionek2y2 = 157; //64
	public int wart_pionek3x1 = 200; public int wart_pionek3x2 = 270; public int wart_pionek3y1 = 93;public int wart_pionek3y2 = 157; //64
	public int wart_pionek4x1 = 270; public int wart_pionek4x2 = 340; public int wart_pionek4y1 = 93;public int wart_pionek4y2 = 157; //64
	public int wart_pionek5x1 = 340; public int wart_pionek5x2 = 410; public int wart_pionek5y1 = 93;public int wart_pionek5y2 = 157; //64
	public int wart_pionek6x1 = 410; public int wart_pionek6x2 = 480; public int wart_pionek6y1 = 93;public int wart_pionek6y2 = 157; //64
	public int wart_pionek7x1 = 480; public int wart_pionek7x2 = 550; public int wart_pionek7y1 = 93;public int wart_pionek7y2 = 157; //64
	public int wart_pionek8x1 = 550; public int wart_pionek8x2 = 620; public int wart_pionek8y1 = 93;public int wart_pionek8y2 = 157; //64
	
	public int wart_figurax1 = 60; public int wart_figurax2 = 130; public int wart_figuray1 = 0;public int wart_figuray2 = 93; //64
	public int wart_figura2x1 = 130; public int wart_figura2x2 = 200; public int wart_figura2y1 = 0;public int wart_figura2y2 = 93; //64
	public int wart_figura3x1 = 200; public int wart_figura3x2 = 270; public int wart_figura3y1 = 0;public int wart_figura3y2 = 93; //64
	public int wart_figura4x1 = 270; public int wart_figura4x2 = 340; public int wart_figura4y1 = 0;public int wart_figura4y2 = 93; //64
	public int wart_figura5x1 = 340; public int wart_figura5x2 = 410; public int wart_figura5y1 = 0;public int wart_figura5y2 = 93; //64
	public int wart_figura6x1 = 410; public int wart_figura6x2 = 480; public int wart_figura6y1 = 0;public int wart_figura6y2 = 93; //64
	public int wart_figura7x1 = 480; public int wart_figura7x2 = 550; public int wart_figura7y1 = 0;public int wart_figura7y2 = 93; //64
	public int wart_figura8x1 = 550; public int wart_figura8x2 = 620; public int wart_figura8y1 = 0;public int wart_figura8y2 = 93; //64
	
// Figury czarne
	public int wart_pionekx11 = 60; public int wart_pionekx21 = 130; public int wart_pioneky11 = 400;public int wart_pioneky21 = 490; //64
	public int wart_pionek2x11 = 130; public int wart_pionek2x21 = 200; public int wart_pionek2y11 = 400;public int wart_pionek2y21 = 490; //64
	public int wart_pionek3x11 = 200; public int wart_pionek3x21 = 270; public int wart_pionek3y11 = 400;public int wart_pionek3y21 = 490; //64
	public int wart_pionek4x11 = 270; public int wart_pionek4x21 = 340; public int wart_pionek4y11 = 400;public int wart_pionek4y21 = 490; //64
	public int wart_pionek5x11 = 340; public int wart_pionek5x21 = 410; public int wart_pionek5y11 = 400;public int wart_pionek5y21 = 490; //64
	public int wart_pionek6x11 = 410; public int wart_pionek6x21 = 480; public int wart_pionek6y11 = 400;public int wart_pionek6y21 = 490; //64
	public int wart_pionek7x11 = 480; public int wart_pionek7x21 = 550; public int wart_pionek7y11 = 400;public int wart_pionek7y21 = 490; //64
	public int wart_pionek8x11 = 550; public int wart_pionek8x21 = 620; public int wart_pionek8y11 = 400;public int wart_pionek8y21 = 490; //64
	
	public int wart_figurax11 = 60; public int wart_figurax21 = 130; public int wart_figuray11 = 490;public int wart_figuray21 = 550; //64
	public int wart_figura2x11 = 130; public int wart_figura2x21 = 200; public int wart_figura2y11 = 490;public int wart_figura2y21 = 550; //64
	public int wart_figura3x11 = 200; public int wart_figura3x21 = 270; public int wart_figura3y11 = 490;public int wart_figura3y21 = 550; //64
	public int wart_figura4x11 = 270; public int wart_figura4x21 = 340; public int wart_figura4y11 = 490;public int wart_figura4y21 = 550; //64
	public int wart_figura5x11 = 340; public int wart_figura5x21 = 410; public int wart_figura5y11 = 490;public int wart_figura5y21 = 550; //64
	public int wart_figura6x11 = 410; public int wart_figura6x21 = 480; public int wart_figura6y11 = 490;public int wart_figura6y21 = 550; //64
	public int wart_figura7x11 = 480; public int wart_figura7x21 = 550; public int wart_figura7y11 = 490;public int wart_figura7y21 = 550; //64
	public int wart_figura8x11 = 550; public int wart_figura8x21 = 620; public int wart_figura8y11 = 490;public int wart_figura8y21 = 550; //64
	
	
	Thread th;						
	public int xt ;
	public int yt ;
	public void init()
	{

		setSize(700, 600); // ustawienie wielkoci okna
		setVisible(true); // wywietlenie na ekranie

	
		c = new Cursor (Cursor.CROSSHAIR_CURSOR);
		this.setCursor (c);

   try {
           backImage = ImageIO.read(new File("szachownica.jpg"));
       } catch (IOException e) {
       }

	}

	public void start ()
	{
		
		th = new Thread (this);
		th.start ();
	}

	
	
	public void stop ()
	{
		th.stop();
	}

	public void run()
	{
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			while (true)
				{
					if (!isStoped)
					{
					}
					repaint();
				}
//					
	}
	public boolean mouseMove(Event e, int x, int y)
	{
		xt = e.x;
		yt = e.y;
		return false;
	}
	public boolean mouseDrag(Event e, int x, int y)
	{

	//	xt = e.getX();
		tekst = "Naciœniêty";
	//	yt = e.getY();
		xt = e.x;
		yt = e.y;
		repaint();
		return true;
	}
	public boolean mouseDown(Event e, int x, int y)
	{
		System.out.println( "mouseEnter");
		
// Figury bia³e
		if (e.x > wart_pionekx1 && e.x < wart_pionekx2 && e.y > wart_pioneky1 && e.y < wart_pioneky2 )
		{ System.out.println("pionek"); pionek_w = true; }
		else if (e.x > wart_pionek2x1 && e.x < wart_pionek2x2 && e.y > wart_pionek2y1 && e.y < wart_pionek2y2 )
		{ System.out.println("pionek2"); pionek_2 = true; }
		else if (e.x > wart_pionek3x1 && e.x < wart_pionek3x2 && e.y > wart_pionek3y1 && e.y < wart_pionek3y2 )
		{ System.out.println("pionek3"); pionek_3 = true; }
		else if (e.x > wart_pionek4x1 && e.x < wart_pionek4x2 && e.y > wart_pionek4y1 && e.y < wart_pionek4y2 )
		{ System.out.println("pionek4"); pionek_4 = true; }
		else if (e.x > wart_pionek5x1 && e.x < wart_pionek5x2 && e.y > wart_pionek5y1 && e.y < wart_pionek5y2 )
		{ System.out.println("pionek5"); pionek_5 = true; }
		else if (e.x > wart_pionek6x1 && e.x < wart_pionek6x2 && e.y > wart_pionek6y1 && e.y < wart_pionek6y2 )
		{ System.out.println("pionek6"); pionek_6 = true; }
		else if (e.x > wart_pionek7x1 && e.x < wart_pionek7x2 && e.y > wart_pionek7y1 && e.y < wart_pionek7y2 )
		{ System.out.println("pionek7"); pionek_7 = true; }
		else if (e.x > wart_pionek8x1 && e.x < wart_pionek8x2 && e.y > wart_pionek8y1 && e.y < wart_pionek8y2 )
		{ System.out.println("pionek8"); pionek_8 = true; }

		if (e.x > wart_figurax1 && e.x < wart_figurax2 && e.y > wart_figuray1 && e.y < wart_figuray2 )
		{ System.out.println("Figura1"); figura_1 = true; }
		else if (e.x > wart_figura2x1 && e.x < wart_figura2x2 && e.y > wart_figura2y1 && e.y < wart_figura2y2 )
		{ System.out.println("Figura2"); figura_2 = true; }
		else if (e.x > wart_figura3x1 && e.x < wart_figura3x2 && e.y > wart_figura3y1 && e.y < wart_figura3y2 )
		{ System.out.println("Figura3"); figura_3 = true; }
		else if (e.x > wart_figura4x1 && e.x < wart_figura4x2 && e.y > wart_figura4y1 && e.y < wart_figura4y2 )
		{ System.out.println("Figura4"); figura_4 = true; }
		else if (e.x > wart_figura5x1 && e.x < wart_figura5x2 && e.y > wart_figura5y1 && e.y < wart_figura5y2 )
		{ System.out.println("Figura5"); figura_5 = true; }
		else if (e.x > wart_figura6x1 && e.x < wart_figura6x2 && e.y > wart_figura6y1 && e.y < wart_figura6y2 )
		{ System.out.println("Figura6"); figura_6 = true; }
		else if (e.x > wart_figura7x1 && e.x < wart_figura7x2 && e.y > wart_figura7y1 && e.y < wart_figura7y2 )
		{ System.out.println("Figura7"); figura_7 = true; }
		else if (e.x > wart_figura8x1 && e.x < wart_figura8x2 && e.y > wart_figura8y1 && e.y < wart_figura8y2 )
		{ System.out.println("Figura8"); figura_8 = true; }

// Figury czarne		
		if (e.x > wart_pionekx11 && e.x < wart_pionekx21 && e.y > wart_pioneky11 && e.y < wart_pioneky21 )
		{ System.out.println("pionek"); pionek_w1 = true; }
		else if (e.x > wart_pionek2x11 && e.x < wart_pionek2x21 && e.y > wart_pionek2y11 && e.y < wart_pionek2y21 )
		{ System.out.println("pionek21"); pionek_21 = true; }
		else if (e.x > wart_pionek3x11 && e.x < wart_pionek3x21 && e.y > wart_pionek3y11 && e.y < wart_pionek3y21 )
		{ System.out.println("pionek31"); pionek_31 = true; }
		else if (e.x > wart_pionek4x11 && e.x < wart_pionek4x21 && e.y > wart_pionek4y11 && e.y < wart_pionek4y21 )
		{ System.out.println("pionek41"); pionek_41 = true; }
		else if (e.x > wart_pionek5x11 && e.x < wart_pionek5x21 && e.y > wart_pionek5y11 && e.y < wart_pionek5y21 )
		{ System.out.println("pionek51"); pionek_51 = true; }
		else if (e.x > wart_pionek6x11 && e.x < wart_pionek6x21 && e.y > wart_pionek6y11 && e.y < wart_pionek6y21 )
		{ System.out.println("pionek61"); pionek_61 = true; }
		else if (e.x > wart_pionek7x11 && e.x < wart_pionek7x21 && e.y > wart_pionek7y11 && e.y < wart_pionek7y21 )
		{ System.out.println("pionek71"); pionek_71 = true; }
		else if (e.x > wart_pionek8x11 && e.x < wart_pionek8x21 && e.y > wart_pionek8y11 && e.y < wart_pionek8y21 )
		{ System.out.println("pionek81"); pionek_81 = true; }

		if (e.x > wart_figurax11 && e.x < wart_figurax21 && e.y > wart_figuray11 && e.y < wart_figuray21 )
		{ System.out.println("Figura11"); figura_11 = true; }
		else if (e.x > wart_figura2x11 && e.x < wart_figura2x21 && e.y > wart_figura2y11 && e.y < wart_figura2y21 )
		{ System.out.println("Figura21"); figura_21 = true; }
		else if (e.x > wart_figura3x11 && e.x < wart_figura3x21 && e.y > wart_figura3y11 && e.y < wart_figura3y21 )
		{ System.out.println("Figura31"); figura_31 = true; }
		else if (e.x > wart_figura4x11 && e.x < wart_figura4x21 && e.y > wart_figura4y11 && e.y < wart_figura4y21 )
		{ System.out.println("Figura41"); figura_41 = true; }
		else if (e.x > wart_figura5x11 && e.x < wart_figura5x21 && e.y > wart_figura5y11 && e.y < wart_figura5y21 )
		{ System.out.println("Figura51"); figura_51 = true; }
		else if (e.x > wart_figura6x11 && e.x < wart_figura6x21 && e.y > wart_figura6y11 && e.y < wart_figura6y21 )
		{ System.out.println("Figura61"); figura_61 = true; }
		else if (e.x > wart_figura7x11 && e.x < wart_figura7x21 && e.y > wart_figura7y11 && e.y < wart_figura7y21 )
		{ System.out.println("Figura71"); figura_71 = true; }
		else if (e.x > wart_figura8x11 && e.x < wart_figura8x21 && e.y > wart_figura8y11 && e.y < wart_figura8y21 )
		{ System.out.println("Figura81"); figura_81 = true; }

		return true;
	}
	public boolean mouseUp(Event e, int x,int y)
	{

// Figury bia³e		
		if (pionek_w){ pionek_w = false; wart_pionekx1 = e.x-26; wart_pionekx2 = e.x+52; wart_pioneky1 = e.y-36; wart_pioneky2 = e.y+64; }
		else if (pionek_2){ pionek_2 = false; wart_pionek2x1 = e.x-26; wart_pionek2x2 = e.x+52; wart_pionek2y1 = e.y-36; wart_pionek2y2 = e.y+64;}
		else if (pionek_3){ pionek_3 = false; wart_pionek3x1 = e.x-26; wart_pionek3x2 = e.x+52; wart_pionek3y1 = e.y-36; wart_pionek3y2 = e.y+64;}
		else if (pionek_4){ pionek_4 = false; wart_pionek4x1 = e.x-26; wart_pionek4x2 = e.x+52; wart_pionek4y1 = e.y-36; wart_pionek4y2 = e.y+64;}
		else if (pionek_5){ pionek_5 = false; wart_pionek5x1 = e.x-26; wart_pionek5x2 = e.x+52; wart_pionek5y1 = e.y-36; wart_pionek5y2 = e.y+64;}
		else if (pionek_6){ pionek_6 = false; wart_pionek6x1 = e.x-26; wart_pionek6x2 = e.x+52; wart_pionek6y1 = e.y-36; wart_pionek6y2 = e.y+64;}
		else if (pionek_7){ pionek_7 = false; wart_pionek7x1 = e.x-26; wart_pionek7x2 = e.x+52; wart_pionek7y1 = e.y-36; wart_pionek7y2 = e.y+64;}
		else if (pionek_8){ pionek_8 = false; wart_pionek8x1 = e.x-26; wart_pionek8x2 = e.x+52; wart_pionek8y1 = e.y-36; wart_pionek8y2 = e.y+64;}

		else if (figura_1){ figura_1 = false; wart_figurax1 = e.x-26; wart_figurax2 = e.x+52; wart_figuray1 = e.y-36; wart_figuray2 = e.y+64; }
		else if (figura_2){ figura_2 = false; wart_figura2x1 = e.x-26; wart_figura2x2 = e.x+52; wart_figura2y1 = e.y-36; wart_figura2y2 = e.y+64;}
		else if (figura_3){ figura_3 = false; wart_figura3x1 = e.x-26; wart_figura3x2 = e.x+52; wart_figura3y1 = e.y-36; wart_figura3y2 = e.y+64;}
		else if (figura_4){ figura_4 = false; wart_figura4x1 = e.x-26; wart_figura4x2 = e.x+52; wart_figura4y1 = e.y-36; wart_figura4y2 = e.y+64;}
		else if (figura_5){ figura_5 = false; wart_figura5x1 = e.x-26; wart_figura5x2 = e.x+52; wart_figura5y1 = e.y-36; wart_figura5y2 = e.y+64;}
		else if (figura_6){ figura_6 = false; wart_figura6x1 = e.x-26; wart_figura6x2 = e.x+52; wart_figura6y1 = e.y-36; wart_figura6y2 = e.y+64;}
		else if (figura_7){ figura_7 = false; wart_figura7x1 = e.x-26; wart_figura7x2 = e.x+52; wart_figura7y1 = e.y-36; wart_figura7y2 = e.y+64;}
		else if (figura_8){ figura_8 = false; wart_figura8x1 = e.x-26; wart_figura8x2 = e.x+52; wart_figura8y1 = e.y-36; wart_figura8y2 = e.y+64;}

// Figury czarne
		if (pionek_w1){ pionek_w1 = false; wart_pionekx11 = e.x-26; wart_pionekx21 = e.x+52; wart_pioneky11 = e.y-36; wart_pioneky21 = e.y+64; }
		else if (pionek_21){ pionek_21 = false; wart_pionek2x11 = e.x-26; wart_pionek2x21 = e.x+52; wart_pionek2y11 = e.y-36; wart_pionek2y21 = e.y+64;}
		else if (pionek_31){ pionek_31 = false; wart_pionek3x11 = e.x-26; wart_pionek3x21 = e.x+52; wart_pionek3y11 = e.y-36; wart_pionek3y21 = e.y+64;}
		else if (pionek_41){ pionek_41 = false; wart_pionek4x11 = e.x-26; wart_pionek4x21 = e.x+52; wart_pionek4y11 = e.y-36; wart_pionek4y21 = e.y+64;}
		else if (pionek_51){ pionek_51 = false; wart_pionek5x11 = e.x-26; wart_pionek5x21 = e.x+52; wart_pionek5y11 = e.y-36; wart_pionek5y21 = e.y+64;}
		else if (pionek_61){ pionek_61 = false; wart_pionek6x11 = e.x-26; wart_pionek6x21 = e.x+52; wart_pionek6y11 = e.y-36; wart_pionek6y21 = e.y+64;}
		else if (pionek_71){ pionek_71 = false; wart_pionek7x11 = e.x-26; wart_pionek7x21 = e.x+52; wart_pionek7y11 = e.y-36; wart_pionek7y21 = e.y+64;}
		else if (pionek_81){ pionek_81 = false; wart_pionek8x11 = e.x-26; wart_pionek8x21 = e.x+52; wart_pionek8y11 = e.y-36; wart_pionek8y21 = e.y+64;}

		else if (figura_11){ figura_11 = false; wart_figurax11 = e.x-26; wart_figurax21 = e.x+52; wart_figuray11 = e.y-36; wart_figuray21 = e.y+64; }
		else if (figura_21){ figura_21 = false; wart_figura2x11 = e.x-26; wart_figura2x21 = e.x+52; wart_figura2y11 = e.y-36; wart_figura2y21 = e.y+64;}
		else if (figura_31){ figura_31 = false; wart_figura3x11 = e.x-26; wart_figura3x21 = e.x+52; wart_figura3y11 = e.y-36; wart_figura3y21 = e.y+64;}
		else if (figura_41){ figura_41 = false; wart_figura4x11 = e.x-26; wart_figura4x21 = e.x+52; wart_figura4y11 = e.y-36; wart_figura4y21 = e.y+64;}
		else if (figura_51){ figura_51 = false; wart_figura5x11 = e.x-26; wart_figura5x21 = e.x+52; wart_figura5y11 = e.y-36; wart_figura5y21 = e.y+64;}
		else if (figura_61){ figura_61 = false; wart_figura6x11 = e.x-26; wart_figura6x21 = e.x+52; wart_figura6y11 = e.y-36; wart_figura6y21 = e.y+64;}
		else if (figura_71){ figura_71 = false; wart_figura7x11 = e.x-26; wart_figura7x21 = e.x+52; wart_figura7y11 = e.y-36; wart_figura7y21 = e.y+64;}
		else if (figura_81){ figura_81 = false; wart_figura8x11 = e.x-26; wart_figura8x21 = e.x+52; wart_figura8y11 = e.y-36; wart_figura8y21 = e.y+64;}
		
		return false;
	}
	public void paint (Graphics g)
	{
			g.drawImage (backImage, 1, 1, this);
	Figury fig = new Figury();	
// Figury bia³e
// Ustawienie wspó³rzêdnych dla figur 
if (pionek_w){pionek1[0][0] = xt-125; pionek1[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek1[0][0]+98,pionek1[0][1]+29,54,64);}
if (pionek_2){pionek2[0][0] = xt-125; pionek2[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek2[0][0]+98,pionek2[0][1]+29,54,64);}
if (pionek_3){pionek3[0][0] = xt-125; pionek3[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek3[0][0]+98,pionek3[0][1]+29,54,64);}
if (pionek_4){pionek4[0][0] = xt-125; pionek4[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek4[0][0]+98,pionek4[0][1]+29,54,64);}
if (pionek_5){pionek5[0][0] = xt-125; pionek5[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek5[0][0]+98,pionek5[0][1]+29,54,64);}
if (pionek_6){pionek6[0][0] = xt-125; pionek6[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek6[0][0]+98,pionek6[0][1]+29,54,64);}
if (pionek_7){pionek7[0][0] = xt-125; pionek7[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek7[0][0]+98,pionek7[0][1]+29,54,64);}
if (pionek_8){pionek8[0][0] = xt-125; pionek8[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek8[0][0]+98,pionek8[0][1]+29,54,64);}

if (figura_1){figura1[0][0] = xt-125; figura1[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura1[0][0]+98,figura1[0][1]+29,54,64);}
if (figura_2){figura2[0][0] = xt-140; figura2[0][1] = yt-72; g.setColor(Color.RED); g.drawRect(figura2[0][0]+114,figura2[0][1]+38,54,64);}
if (figura_3){figura3[0][0] = xt-125; figura3[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura3[0][0]+98,figura3[0][1]+29,54,64);}
if (figura_4){figura4[0][0] = xt-125; figura4[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura4[0][0]+98,figura4[0][1]+29,54,64);}
if (figura_5){figura5[0][0] = xt-125; figura5[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura5[0][0]+98,figura5[0][1]+29,54,64);}
if (figura_6){figura6[0][0] = xt-125; figura6[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura6[0][0]+98,figura6[0][1]+29,54,64);}
if (figura_7){figura7[0][0] = xt-140; figura7[0][1] = yt-72; g.setColor(Color.RED); g.drawRect(figura7[0][0]+114,figura7[0][1]+38,54,64);}
if (figura_8){figura8[0][0] = xt-125; figura8[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura8[0][0]+98,figura8[0][1]+29,54,64);}

// Figury czarne

if (pionek_w1){pionek11[0][0] = xt-125; pionek11[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek11[0][0]+98,pionek11[0][1]+29,54,64);}
if (pionek_21){pionek21[0][0] = xt-125; pionek21[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek21[0][0]+98,pionek21[0][1]+29,54,64);}
if (pionek_31){pionek31[0][0] = xt-125; pionek31[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek31[0][0]+98,pionek31[0][1]+29,54,64);}
if (pionek_41){pionek41[0][0] = xt-125; pionek41[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek41[0][0]+98,pionek41[0][1]+29,54,64);}
if (pionek_51){pionek51[0][0] = xt-125; pionek51[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek51[0][0]+98,pionek51[0][1]+29,54,64);}
if (pionek_61){pionek61[0][0] = xt-125; pionek61[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek61[0][0]+98,pionek61[0][1]+29,54,64);}
if (pionek_71){pionek71[0][0] = xt-125; pionek71[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek71[0][0]+98,pionek71[0][1]+29,54,64);}
if (pionek_81){pionek81[0][0] = xt-125; pionek81[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(pionek81[0][0]+98,pionek81[0][1]+29,54,64);}

if (figura_11){figura11[0][0] = xt-125; figura11[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura11[0][0]+98,figura11[0][1]+29,54,64);}
if (figura_21){figura21[0][0] = xt-140; figura21[0][1] = yt-72; g.setColor(Color.RED); g.drawRect(figura21[0][0]+114,figura21[0][1]+38,54,64);}
if (figura_31){figura31[0][0] = xt-125; figura31[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura31[0][0]+98,figura31[0][1]+29,54,64);}
if (figura_41){figura41[0][0] = xt-125; figura41[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura41[0][0]+98,figura41[0][1]+29,54,64);}
if (figura_51){figura51[0][0] = xt-125; figura51[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura51[0][0]+98,figura51[0][1]+29,54,64);}
if (figura_61){figura61[0][0] = xt-125; figura61[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura61[0][0]+98,figura61[0][1]+29,54,64);}
if (figura_71){figura71[0][0] = xt-140; figura71[0][1] = yt-72; g.setColor(Color.RED); g.drawRect(figura71[0][0]+114,figura71[0][1]+38,54,64);}
if (figura_81){figura81[0][0] = xt-125; figura81[0][1] = yt-65; g.setColor(Color.RED); g.drawRect(figura81[0][0]+98,figura81[0][1]+29,54,64);}

//			wart_pionekx1 = xt;
//			wart_pionekx2 = pionek1[0][0]-30;
//			wart_pioneky1 = yt;
//			wart_pioneky2 = pionek1[0][1]-20;
//			g.setColor(Color.BLUE);
//			g.drawRect(pionek1[0][0]+98,pionek1[0][1]+29,54,64);
//			g.setColor(Color.BLUE);
//			g.drawRect(wart_pionekx1,wart_pioneky1,wart_pionekx2,wart_pioneky2);
			fig.paint_pionek(g,pionek1[0][0],pionek1[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek2[0][0],pionek2[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek3[0][0],pionek3[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek4[0][0],pionek4[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek5[0][0],pionek5[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek6[0][0],pionek6[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek7[0][0],pionek7[0][1],Color.WHITE,Color.BLACK);
			fig.paint_pionek(g,pionek8[0][0],pionek8[0][1],Color.WHITE,Color.BLACK);

			fig.paint_wieza(g,figura1[0][0],figura1[0][1],Color.WHITE,Color.BLACK);
		    fig.paint_skoczek(g,figura2[0][0],figura2[0][1],Color.WHITE,Color.BLACK);
			fig.paint_goniec(g,figura3[0][0],figura3[0][1],Color.WHITE,Color.BLACK);
			fig.paint_damka(g,figura4[0][0],figura4[0][1],Color.WHITE,Color.BLACK);
			fig.paint_krol(g,figura5[0][0],figura5[0][1],Color.WHITE,Color.BLACK);
			fig.paint_goniec(g,figura6[0][0],figura6[0][1],Color.WHITE,Color.BLACK);
			fig.paint_skoczek(g,figura7[0][0],figura7[0][1],Color.WHITE,Color.BLACK);
			fig.paint_wieza(g,figura8[0][0],figura8[0][1],Color.WHITE,Color.BLACK);
			
// Czarne figury

			fig.paint_pionek(g,pionek11[0][0],pionek11[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek21[0][0],pionek21[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek31[0][0],pionek31[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek41[0][0],pionek41[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek51[0][0],pionek51[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek61[0][0],pionek61[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek71[0][0],pionek71[0][1],Color.BLACK,Color.WHITE);
			fig.paint_pionek(g,pionek81[0][0],pionek81[0][1],Color.BLACK,Color.WHITE);

			fig.paint_wieza(  g,figura11[0][0],figura11[0][1],Color.BLACK,Color.WHITE);
			fig.paint_skoczek(g,figura21[0][0],figura21[0][1],Color.BLACK,Color.WHITE);
			fig.paint_goniec( g,figura31[0][0],figura31[0][1],Color.BLACK,Color.WHITE);
			fig.paint_damka(  g,figura41[0][0],figura41[0][1],Color.BLACK,Color.WHITE);
			fig.paint_krol(   g,figura51[0][0],figura51[0][1],Color.BLACK,Color.WHITE);
			fig.paint_goniec( g,figura61[0][0],figura61[0][1],Color.BLACK,Color.WHITE);
			fig.paint_skoczek(g,figura71[0][0],figura71[0][1],Color.BLACK,Color.WHITE);
			fig.paint_wieza(  g,figura81[0][0],figura81[0][1],Color.BLACK,Color.WHITE);
			g.setColor(Color.BLACK);
			tekst = "Wspó³rzêdne: " + xt + " " + yt;
			g.drawString(tekst,490, 590);
/*				if (isStoped)
			{
				g.setColor (Color.yellow);
				g.drawString ("Doubleclick on Applet to start Game!", 40, 200);
			}
*/
	}
	public void update (Graphics g)
	{
		
		if (dbImage == null)
		{
			dbImage = createImage (this.getSize().width, this.getSize().height);
			dbg = dbImage.getGraphics ();
		}


		dbg.setColor (getBackground ());
		dbg.fillRect (0, 0, this.getSize().width, this.getSize().height);

		
		dbg.setColor (getForeground());
		paint (dbg);

		
		g.drawImage (dbImage, 0, 0, this);
	}


}