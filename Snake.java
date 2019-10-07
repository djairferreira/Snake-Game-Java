package snake.drawables;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import core.BaseLimitedDrawable;
import drawables.Point;

public class Snake extends BaseLimitedDrawable {
	private Point HEAD = new Point(0,0);
	
	private int fluX = -Point.SIZE;
	private int fluY = 0;
	
	public Snake(double xMax, double yMax) {
		super(xMax, yMax);
	}
	@Override
	public void draw(Graphics2D g2d) {
		if(Math.abs(HEAD.X)> this.MAX_X)
			HEAD.X = -HEAD.X;
		if(Math.abs(HEAD.Y)> this.MAX_Y)
			HEAD.Y = -HEAD.Y;
		HEAD.moveIncremental(fluX, fluY);
		HEAD.draw(g2d);
		
	}
	public void listenKey(KeyEvent e) {
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_UP) this.up();
		else if(k == KeyEvent.VK_DOWN) this.down();
		else if(k == KeyEvent.VK_LEFT) this.left();
		else if(k == KeyEvent.VK_RIGHT) this.right();
	}
	private void right() {
		if(fluX == 0) {
			fluY = 0;
			fluX = Point.SIZE;
		}
	}
	private void left() {
		if(fluX == 0) {
			fluY = 0;
			fluX = -Point.SIZE;
		}
	}
	private void down() {
		if(fluY == 0) {
			fluX = 0;
			fluY = -Point.SIZE;
		}
	}
	private void up() {
		if(fluY == 0) {
			fluX = 0;
			fluY = Point.SIZE;
		}
	}
}


