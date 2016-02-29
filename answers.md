# Part 1. 
1. No, if he hits something then he just turns
2. Clockwise
3. It moves 45 degrees clockwise
4. flowers
5. It turns just as it would if hit something
6. It turns 45 degrees clockwise
7. no
8. it fades after a bit
9. no
10. yes, bug on flower

# Part 2.
1. how far it does
2. how many steps it takes
3. it will move 90 ot 45 then
4. move is declared somewhere else
5. yes because it moves based on length not size of box
6. not after it comepletes one cycle
7. yes

# Part 3.

#### Set 3.
1. public int getRow()
2. False
3. (4,4)
4. South East or 135 degrees
5. The closest to the direction to its target

#### Set 4.

1. Starting with the 2nd, go down 3 all the way and get 2nd from the bottom.
2. boolean isValid(Location loc)
3. Because it is an interface 
4. Yes because then you have all the locations in one spot that you can call later.

#### Set 5.

1. color direction and location
2. north and red
3. because we aren't puling from it, we use and change it as a class
4. Not it only has one location
5. An actor can move 90 degrees with 2 moves

#### Set 6.

1. Thee comparison of if(gr == null) return false keeps the bg form moving outside the grid
2. The return statement return (neighbor == instanceOfRock) which checks whether the meighbor is a rock
3. canMove must use the isValid method from Grid in order to determine whether adjacent squares are null or not.
4. The canMove method uses the method uses the getAdjacentLocation method to find the next location to check.
5. the accessor methods like getGrid and getLocation are inherited and utilized.
6. The move method will return false due to the canMove method. If that method returns true somehow, then the bug will move off the screen.
7. It could be avoided by using getLocation over and over again, but that would be way too redundant and sloppy.
8. The color is inherited from the class
9. It should, the bug places flowers in spaces where the bug was and is no longer.
10. The flower.putSelfInGrid(gr, loc) places the flower onto the grid.
11. four times

# Part 4.

#### Part 7.
1. Critter has the methods act, getActors, processActors, getMoveLocations, selectMoveLocation, and makeMove.
2. In order to act, the critter must getActors(), processActors(), getMoveLocations(), selectMoveLocations(), makeMove().
3. No, they should not override the method. The getActors method just returns the actors around the critter.
4. There would be no reason to override that method, but I suppose it could if we wanted to.
5. It can check whether there is a rock or a critter, and if there is it can remove the actor.
6. The getLocation method to find the actor, the getMoveLocation method to decide where to move, and finally the move method to carry out the move.
7. Critter is not the Elder Parent class, it inherits its constructor from another class.

#### Part 8.
1. Because rather than overriding act, the Chameleon overrides the processActors method which is used in the Critters act method. This changes only the part required, and not the entire process as a whole.
2. In order to turn itself, it changes its direction and then moves in that direction. Therefore, when super is called it uses the makeMove method of the parent.
3. You could override the makeMove method again and in making the Chameleon move, place a flower in its previous place.
4. Because the getActors method will serve the same purpose for both critters. The Chameleon will use it just the same.
5. The Actor class must contian the getLocation method.
6. Through the getGrid() method which it inherits from the Actor class.

#### Part 9.
1. Because the CrabCritter does not need to use the processaActors method any differently than the other critters. The processActors method only removes actors from the grid if there is a conflict.
2. A CrabCritter will, after moving, test to see if there is an actor in the three spaces in front of it. If there is, it will check what type of actor it is, and if its not a rock or another critter, then it will remove that actor from the grid.
3. To get not only the direction in which it intends to move, but to find the locations in the directions 45 degrees to the left or right of the forward square such that it can test if those locations contian an edible item.
4. (4,3), (4,4), and (4,5)
5. They move one space at a time. Crabs only move sideways while criters can move in any direction. 
6. If it is up against something, and can't move.
7. It will not destro an instance of itself. 


