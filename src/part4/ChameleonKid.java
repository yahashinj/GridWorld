package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class ChameleonKid extends ChameleonCritter {
	public void processActors(ArrayList<Actor> actors) {
		Location loc = getLocation();
		
		Location front = loc.getAdjacentLocation(getDirection());
		Location behind = loc.getAdjacentLocation(getDirection() - 180);
	//	Grid<Actor> gr = getGrid(); 
		
		Actor frontActor = null;
		if (getGrid().isValid(front)) {
			frontActor = getGrid().get(front);
		}
		
		Actor backActor = getGrid().get(behind);
		
		if (frontActor != null) {
			setColor(frontActor.getColor());
			return;
		} else if (backActor != null) {
			setColor(backActor.getColor());
			return;
		}
		super.processActors(actors);
	}
}
