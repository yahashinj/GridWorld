/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains chameleon critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ChameleonRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
//		world.add(new Location(7, 8), new Rock());
//		world.add(new Location(3, 3), new Rock());
		
//		world.add(new Location(5, 5), new Rock(Color.PINK));
//		world.add(new Location(1, 5), new Rock(Color.RED));
//		world.add(new Location(7, 2), new Rock(Color.YELLOW));
//		world.add(new Location(4, 4), new ChameleonCritter());
//		world.add(new Location(5, 8), new ChameleonCritter());
		for (int i=0; i<10; i++){
			for(int n=0; n<10;n++){
				world.add(new Location(i, n), new ChameleonCritter());
			}
			
		}
		world.add(new Location(0, 9), new Rock(Color.RED));
		world.add(new Location(9, 0), new Rock(Color.CYAN));
		world.add(new Location(0, 0), new Rock(Color.GREEN));
		world.add(new Location(9, 9), new Rock(Color.WHITE));
		world.show();
	}
}