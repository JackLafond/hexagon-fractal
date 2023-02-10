import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class Fractal extends JFrame{
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.add(new makeFractal());
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	static class makeFractal extends Component{
		
		public void paint(Graphics g) {
			
			Graphics2D g2d = (Graphics2D)g;
			
			int n = 100000;
			
			Point a = new Point(250, 100);
			Point b = new Point(423, 200);
			Point c = new Point(423, 400);
			Point d = new Point(250, 500);
			Point e = new Point(77, 400);
			Point f = new Point(77, 200);
			Point[] points = new Point[] {a, b, c, d, e, f};
			for(int i = 0; i < 6; i++) {
				Point cur = points[i];
				g2d.drawOval(cur.x, cur.y, 1, 1);
			}
			int rand = 0;
			int prevX = 250;
			int prevY = 100;
			for(int i = 0; i < n; i++) {
				rand = (int)(Math.random() * 6);
				Point randP = points[rand];
				int dotX = prevX + (int)((.66666)*(randP.x - prevX));
				int dotY = prevY + (int)((.66666)*(randP.y - prevY));
				g2d.drawOval(dotX, dotY, 1, 1);
				prevX = dotX;
				prevY = dotY;
			}
		}
	}
}
