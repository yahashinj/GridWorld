package part2;


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;


public class CircleBugRunner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		CircleBug jum = new CircleBug(4);
		ZBug gury = new ZBug(7);
		world.show();
		world.add(new Location(7, 8), jum);
		world.add(new Location(2, 3), gury);
	}
}
