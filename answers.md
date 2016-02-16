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


