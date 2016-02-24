package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunnger {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		ZBug gury = new ZBug(7);
		world.show();
		world.add(new Location(2, 3), gury);
	}
}
