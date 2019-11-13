import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    public static Rock rock = new Rock();
    public static Bug bug = new Bug();
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife(int initialRows, int initialCols)
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(initialRows, initialCols);

        // create a world based on the grid
        world = new ActorWorld(grid);
        
    }
    
    public GameOfLife()
    {
        UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
        
        world = new ActorWorld(grid);
        
    }
    

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 2, Y1 = 1;
        final int X2 = 1, Y2 = 2;
        final int X3 = 2, Y3 = 2;
        final int X4 = 3, Y4 = 2;
        final int X5 = 1, Y5 = 3;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add rocks (a type of Actor) to the three intial locations

        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, rock);

        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, rock);

        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, rock);

        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, rock);

        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, rock);
        
        //nested for loop to fill all non-rock spaces with bugs
        
        
        
        for (int row = 0; row < grid.getNumRows(); row++)
        {
            for (int col = 0; col < grid.getNumRows(); col++)
            {
                Location coordinate = new Location(row, col);
                if (grid.get(coordinate) != rock)
                {
                    grid.put(coordinate, bug);
                }
            }
        }

        // display the newly constructed and populated world
        world.show();
    }
    
    public void randomPopulateGame()
    {
        Grid<Actor> grid = world.getGrid();
        
        for (int row = 0; row < grid.getNumRows(); row++)
        {
            for (int col = 0; col < grid.getNumRows(); col++)
            {
                Location coordinate = new Location(row, col);
                double random = Math.random();
                if (random < .5)
                {
                    grid.put(coordinate, rock);
                }
                else
                {
                    grid.put(coordinate, bug);
                }
                
            }
        }
        
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(grid.getNumRows(), grid.getNumCols());
        ActorWorld newWorld = new ActorWorld(newGrid);
        /*
         * !!! insert your Game of Life algorithm here...
         */ 

        // put into a new grid, not the current one

        for(int row = 0; row < grid.getNumRows(); row++)
        {
            for(int col = 0; col < grid.getNumCols(); col++)
            {
                /*
                 * 1. check if cell is alive or dead
                 * 2. check for number of alive cells around using getOccupiedAdjacentLocations
                 * 3. do a switch/if statement for each case
                 */
                Location coordinate = new Location(row, col);
                int rockCounter = 0;

                //counting the rocks adjacent to that location
                for (int i = 0; i <= grid.getNeighbors(coordinate).size() - 1; i++)
                {
                    if (grid.getNeighbors(coordinate).get(i) == rock)
                    {
                        rockCounter++;
                    }
                }
                //algorithm

                if (grid.get(coordinate) == rock)
                {

                    //count the number of rocks around it and do the algorithm that way instead
                    if (rockCounter == 2 || rockCounter == 3)
                    {
                        newGrid.put(coordinate, rock);
                    }
                    else
                    {
                        newGrid.put(coordinate, bug);
                    }
                }
                else if (grid.get(coordinate) == bug)
                {
                    if (rockCounter == 3)
                    {
                        newGrid.put(coordinate, rock);
                    }
                    else
                    {
                        newGrid.put(coordinate, bug);
                    }
                }

            }
        }

        world = newWorld;
        world.show();
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world for an unbounded grid
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGenerationUnbounded()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */

        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        UnboundedGrid<Actor> newGrid = new UnboundedGrid<Actor>();
        ActorWorld newWorld = new ActorWorld(newGrid);
        /*
         * !!! insert your Game of Life algorithm here...
         */ 

        // put into a new grid, not the current one
        // check that there are no rocks exposed to the outside - increment rows and columns until you hit empty space
        // which would return a null actor. Then check along the column/row one less from it for rocks.
        // The grid should always be a square.
        
        
        // change bounds from 30 to whatever the maximum rows/columns are, given by the previous loop
        
        for(int row = 0; row < 30; row++)
        {
            for(int col = 0; col < 30; col++)
            {
                /*
                 * 1. check if cell is alive or dead
                 * 2. check for number of alive cells around using getOccupiedAdjacentLocations
                 * 3. do a switch/if statement for each case
                 */
                Location coordinate = new Location(row, col);
                int rockCounter = 0;

                //counting the rocks adjacent to that location
                for (int i = 0; i <= grid.getNeighbors(coordinate).size() - 1; i++)
                {
                    if (grid.getNeighbors(coordinate).get(i) == rock)
                    {
                        rockCounter++;
                    }
                }
                //algorithm

                if (grid.get(coordinate) == rock)
                {

                    //count the number of rocks around it and do the algorithm that way instead
                    if (rockCounter == 2 || rockCounter == 3)
                    {
                        newGrid.put(coordinate, rock);
                    }
                    else
                    {
                        newGrid.put(coordinate, bug);
                    }
                }
                else if (grid.get(coordinate) == bug)
                {
                    if (rockCounter == 3)
                    {
                        newGrid.put(coordinate, rock);
                    }
                    else
                    {
                        newGrid.put(coordinate, bug);
                    }
                }

            }
        }

        world = newWorld;
        world.show();
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return this.world.getGrid().getNumRows();
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return this.world.getGrid().getNumCols();
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife(30, 30);

        // populate the game
        game.randomPopulateGame();

        /*
         * !!! Create a loop to repeatedly invoke the createNextGeneration method.
         *      You can have your program pause between each invocation:
         *          Thread.sleep(1000); // sleep 1000 milliseconds (1 second)
         */ 

        do
        {
            game.createNextGeneration();
            Thread.sleep(1000);

        }
        while (true);
    }

}
