import java.awt.*;

public class begin
{
	public static void main(String[] args)
	{
		Frame w= new Frame();
		w.setSize(1024,768);
		w.setBackground(Color.BLACK);
		MP mp = new MP();
		w.add(mp);
		w.show();
	}
}

class MP extends Panel
{
	public void paint(Graphics g)
	{
		g.setColor(Color.WHITE);
		for(int i = 0;i < 300;i++)
		{
			g.drawString("*",(int)(Math.random()*1024),(int)(Math.random()*768));
		}
	}
}
