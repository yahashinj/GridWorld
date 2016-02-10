package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug{
	private int steps;
	private int sideLength;
	private int loops;
	
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}
	
	public void act() {
	
		if (loops == 0){
			turn();
			turn();
			loops += 1;
		}
		
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else if (loops == 1 && steps >= sideLength){
			
			turn();
			turn();
			turn();
			steps = 0;
			loops += 1;
		} else if (loops == 2 && steps >= sideLength) {
			turn();
			turn();
			turn();
			turn();
			turn();
			
			steps = 0;
			loops += 1;
		}
			
		
	}
	
}
