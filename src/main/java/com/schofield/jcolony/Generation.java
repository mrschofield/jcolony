/*

	jColony

	

	Copyright (c) 2005-2006 Mathew Schofield

	All Rights Reserved.

	

	Distributed under the terms of LICENSE.TXT

*/

package com.schofield.jcolony;

public class Generation

{

	private int width;		// width of the colony grid

	private int height;	// height of the colony grid

	private Cell[][] grid;	// two dimensional grid representing the colony of cells

	

	private Rules rules;

	

	// Generation( int width_, int height_ )

	/*!

		\e Purpose

			- To initialize the generation as blank generation with the default rules.

			

		\e Requirements

			- Width and Height >= 10

			

		\e Promise

			- If width or height < 10, they = 10

	*/

	public Generation( int width_, int height_ )

	{

		if (width_ < 10)

			width_ = 10;

		if (height_ < 10)

			height_ = 10;

	

		rules = new Rules();

		width = width_;

		height = height_;

		

		grid = new Cell[width][height];

		

		for (int x = 0 ; x < width ; x++)

		{

			for (int y = 0 ; y < height ; y++)

			{

				grid[x][y] = new Cell();

			}

		}

	}

	

	



	// Generation( Generation current_, Rules rules_, int width_, int height_ )

	/*!

		\e Purpose

			- Contructs the next generation based on current_, with the set rules.

			

		\e Requirements

			- Width and Height >= 10

			

		\e Promise

			- If width or height < 10, they = 10

	*/

	public Generation( Generation current_, Rules rules_, int width_, int height_ )

	{

		if (width_ < 10)

			width_ = 10;

		if (height_ < 10)

			height_ = 10;

	

		rules = rules_;

		width = width_;

		height = height_;

		

		grid = new Cell[width][height];

		

		for (int x = 0 ; x < width ; x++)

		{

			for (int y = 0 ; y < height ; y++)

			{

				grid[x][y] = rules.applyRules(new Cell( current_.cellAt(x,y) ), current_.neighbours(x,y));

			}

		}

    }

    

    

    

	// Cell cellAt(int x_, int y_)

	/*!

		\e Purpose

			- Returns the Cell at location x, y

	*/

	public Cell cellAt(int x_, int y_)

	{

		if (!withinGrid(x_,y_))

			return null;

			

		return grid[x_][y_];

	}

    

    

    

	// boolean equals(Generation another_)

	/*!

		\e Purpose

			- Checks if this Generation is equal to another_

			

		\e Requirements

			- None

	

		\e Promise

			- Returns true if they are equal, false otherwise.

	*/

	public boolean equals(Generation another_)

	{

		if (another_ == null)

			return false;

			

		for (int x = 0 ; x < width ; x++ )

			for (int y = 0 ; y < height ; y++ )

				if (isAlive(x,y) != another_.isAlive(x,y))

					return false;

		

		return true;

	}

    

	

	

	// int getWidth()

	/*!

		\e Purpose

			- Returns the Width of the grid

	*/

	public int getWidth()

	{

	    return width;

	}

	

	

	

	// int getHeight()

	/*!

		\e Purpose

			- Returns the Height  of the grid

	*/

	public int getHeight()

	{

	    return height;

	}

    

    

	

	// int getPopulationCount()

	/*!

		\e Purpose

			- Returns the current population count

	*/

	public int getPopulationCount()

	{

		int population = 0;

		

		for (int x = 0 ; x < width ; x++)

		{

			for (int y = 0 ; y < height ; y++)

			{

				if (isAlive(x,y))

					population++;

			}

		}

		

		return population;

	}

	

	

	

	// isAlive(int x_, int y_)

	/*!

		\e Purpose

			- Checks if a particular cell at x_,y_ is alive

			

		\e Requirements

			- x_ and y_ are within the grid

	

		\e Promise

			- Returns true if the cell is alive, and false otherwise.

			- Returns false if the cell is outside of the grid.

	*/

	public boolean isAlive(int x_, int y_)

	{

		if (!withinGrid(x_,y_))

			return false;

		if (grid[x_][y_] == null)

			return false;

			

		return grid[x_][y_].isAlive();

	}

	

	

	

	// int neighbours(int x_, int y_)

	/*!

		\e Purpose

			- Gets the number of neighbours near a selected cell

			

		\e Requirements

			- x_ and y_ are within the grid

	

		\e Promise

			- Returns number of neighbours

	*/

	public int neighbours(int x_, int y_)

	{

		int neighbours = 0;

		

		if ( !withinGrid(x_,y_) )

			return 0;

		

		for (int x = (x_-1) ; x <= (x_+1) ; x++)

		{

			for (int y = (y_-1) ; y <= (y_+1) ; y++)

			{

				if ( withinGrid(x,y) && isAlive(x,y) )

					neighbours++;

			}

		}

		

		if ( withinGrid(x_,y_) && isAlive(x_,y_) )

			neighbours--;

			

		return neighbours;

	}

	

	

	

	// void placeCellAt(Cell cell_, int x_, int y_)

	/*!

		\e Purpose

			- Places a particular cell at x_ and y_

			

		\e Requirements

			- x_ and y_ are within the grid

	*/

	public void placeCellAt(Cell cell_, int x_, int y_)

	{

		if (withinGrid(x_,y_))

			grid[x_][y_] = cell_;

	}

	

	

	

	// setSize(int width_, int height_)

	/*!

		\e Purpose

			- Resizes this Generation with width_ and height_

			

		\e Requirements

			- width_ and height_ >= 10

	*/

    public void setSize(int width_, int height_)

    {

		Cell[][] tmpGrid = grid;

		grid = new Cell[width_][height_];

		

		for (int x = 0 ; x < width ; x++)

		{

			for (int y = 0 ; y < height ; y++)

			{

				if (x >= 0 && x < width_ && y >= 0 && y < height_)

					grid[x][y] = tmpGrid[x][y];

			}

		}

		

		for (int x = 0 ; x < width_ ; x++)

		{

			for (int y = 0 ; y < height_ ; y++)

			{

				if (grid[x][y] == null)

					grid[x][y] = new Cell();

			}

		}

		

		width = width_;

		height = height_;

    }

	

	

	

	// void toggleCell( int x_, int y_ )

	/*!

		\e Purpose

			- Toggles a cell at x_ and y_

			

		\e Requirements

			- x_ and y_ are within the grid

	*/

	public void toggleCell( int x_, int y_ )

	{

		if (withinGrid(x_,y_))

			grid[x_][y_].toggleCell();

	}

	

	

	

	// boolean withinGrid( int x_, int y_ )

	/*!

		\e Purpose

			- Checks if the co-ordiantes are within the grid

			

		\e Requirements

			- None

	

		\e Promise

			- Returns true if they are within the grid, false otherwise

	*/

	private boolean withinGrid( int x_, int y_ )

    {

		if ( x_ >= 0 && x_ < width)

			if ( y_ >= 0 && y_ < height)

				return true;

		return false;

	}

}

