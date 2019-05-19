package exercises;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2.  out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. AddFigure another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {

	public static void main(String[] args) {
		World<Actor> world = new World<Actor>();
		world.show();
		Bug bug = new Bug();
		Location loc = new Location(3, 4);
		world.add(loc, bug);
		Bug bug1 = new Bug();
		Location loc1 = world.getRandomEmptyLocation();
		bug1.setColor(Color.blue);
		world.add(loc1, bug1);
		bug1.turn();
		bug1.turn();
		Flower flowerR = new Flower();
		Location locR = new Location(loc1.getRow(), loc1.getCol() + 1);
		world.add(locR, flowerR);
		Flower flowerL = new Flower();
		Location locL = new Location(loc1.getRow(), loc1.getCol() - 1);
		world.add(locL, flowerL);

		Flower flowers[] = new Flower[96];
		Location locations[] = new Location[96];

		for (int i = 0; i < flowers.length; i++) {
			locations[i] = world.getRandomEmptyLocation();
			flowers[i] = new Flower();
			world.add(locations[i], flowers[i]);
		}

	}
}
