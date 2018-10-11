/*

	jColony

	

	Copyright (c) 2005-2006 Mathew Schofield

	All Rights Reserved.

	

	Distributed under the terms of LICENSE.TXT

*/

package com.schofield.jcolony;

public class Colony

{

	public static final int NORMAL = 0; // growing normally

	public static final int DEAD   = 1; // no living cells

	public static final int STABLE = 2; // identical to the next generation

	public static final int CYCLIC = 3; // repeated within specified generations

	public static final int MAXGEN = 4; // reached maximum generations

	

	private static final int DEFAULT_MAX_GENS = 100;	// Default maximum generations

	private static final int HISTORY_SIZE = 5;		// Number of generations kept in the history array

	private int maxGens; 								// number of generations for the colony

	private int stopStatus;

	private int generationNum; 						// generation number

	private Generation current;

	private Generation[] history; 						// array representing the colony grid

	private int width;

	private int height;

	private Rules rules = new Rules();

	private Preset preset;

	

	// Colony()

	/*!

		\e Purpose

			- To initialize the colony and set the max generations

			  to default.

			

		\e Requirements

			- Width and Height >= 10

			

		\e Promise

			- If width or height < 10, they = 10

	*/

	public Colony( int width_, int height_ )

	{

		if (width_ < 10)

			width_ = 10;

		if (height_ < 10)

			height_ = 10;



		maxGens = DEFAULT_MAX_GENS;

		width = width_;

		height = height_;

		

		initialise();

		

		stopStatus = NORMAL;

		

		preset = new Preset();

	}

	

	

	

	// Generation currentGeneration()

	/*!

		\e Purpose

			- Gets the current generation number

			

		\e Requirements

			- Nothing

			

		\e Promise

			- Returns the current generation

	*/	

	public Generation currentGeneration()

	{

		return history[0];

	}

	

	

	

	// int generateNext()

	/*!

		\e Purpose

			- Generate the next generation based on the current generation by calling

			  Generation(Generation current_, Rules rules_, int width_, int height_)

			- Update status

			- Update the generation history

			- Sets the current generation to next

			

		\e Requirements

			- 

			

		\e Promise

			- Returns the stop status

	*/

	public int generateNext()

	{

	    if (stopStatus == NORMAL || getGenerationNumber() <= 1)

	    {

		    Generation tmpGen = new Generation(currentGeneration(), rules, width, height);

		    updateHistory(tmpGen);

		    checkGenerations();

	    }

	

		return stopStatus;

	}

	

	

	

	// int getGenerationNumber()

	/*!

		\e Purpose

			- Returns the Current Generation Number

	*/	

	public int getGenerationNumber()

	{

		return generationNum;

	}

	

	

	

	// int getMaxGen() 

	/*!

		\e Purpose

			- To retrieve the maximum generations for this colony

			

		\e Requirements

			- Nothing

			

		\e Promise

			- Returns the max generations

	*/

	public int getMaxGen()

	{

		return maxGens;

	}	

	

	

	

	// int getPopulationcount()

	/*!

		\e Purpose

			- Returns the Population Count

	*/	

	public int getPopulationCount()

	{

		return currentGeneration().getPopulationCount();

	}	

	

	

	

	// int getStopStatus()

	/*!

		\e Purpose

			- Returns the stop status

	*/

	public int getStopStatus() 

	{

		return stopStatus;

	}

	

	

	

	public Rules getRules()

	{

		return rules;

	}

	

	

	

	// void initialise()

	/*!

		\e Purpose

			- Creates a new blank generation

			- Creates the history of generations

			- Reset Generation number

			- Sets stopStatus - Dead

			- Calls updateHistory()

			

		\e Requirements

			- Nothing

			

		\e Promise

			- Returns the current generation

	*/

	public Generation initialise()

	{

		history = new Generation[HISTORY_SIZE];

		Generation tmpGeneration = new Generation(width, height);

		

		for (int i = 0 ; i < HISTORY_SIZE ; i++)

		{

			history[i] = new Generation(width, height);

		}



		generationNum = 0;

		stopStatus = DEAD;

		updateHistory(tmpGeneration);

		

		return tmpGeneration;

	}

	

	

	

	// boolean isAlive(int x_, int y_)

	/*!

		\e Purpose

			- Check the state of the Cell at location x_ and y_ in the generation

			

		\e Requirements

			- x_ and y_ >= 0

			- x < width

			- y < height

			

		\e Promise

			- Return the state of the cell

			- Returns false if x_,y_ is not in the grid

	*/		

	public boolean isAlive(int x_, int y_)

	{

		if (x_ < 0)

			return false;

			

		if (y_ < 0)

			return false;

			

		if (x_ >= width)

			return false;

			

		if (y_ >= height)

			return false;

			

		return currentGeneration().isAlive(x_,y_);

	}	

	

	

	

	// boolean loadPreset(String filename_)

	/*!

		\e Purpose

			- Loads the selected preset as the current generation



		\e Promise

			- Return true if it was successful, false otherwise

			- Notifies the Colony of a change if successful

	*/

	public boolean loadPreset(String filename_)

	{

		Generation tmpGen = preset.loadGeneration(filename_);

		

		if (tmpGen != null)

		{

			initialise();

			setSize(tmpGen.getWidth(), tmpGen.getHeight());

			history[0] = tmpGen;

			return true;

		}

		else

			return false;

	}

	

	

	

	// void resetGenerationNumber()

	/*!

		\e Purpose

			- Sets the current Generation Number to 0

	*/

	public void resetGenerationNumber()

	{

		generationNum = 0;

	}

	

	

	

	// boolean savePreset(String filename_)

	/*!

		\e Purpose

			- Exports the current generation to a file



		\e Promise

			- Return true if it was successful, false otherwise

	*/

	public boolean savePreset(String filename_)

	{

		return preset.saveGeneration(filename_, currentGeneration());

	}

	

	

	

	// void setMaxGen( int max_ ) 

	/*!

		\e Purpose

			- To set the maximum generations for this

			  colony.

			

		\e Requirements

			- max_ > 0

	*/

	public void setMaxGen(int max_)

	{

		if (max_ <= 0)

			max_ = DEFAULT_MAX_GENS;

			

		maxGens = max_;

	}

	

	

	

	// boolean setSize(int width_, int height_)

	/*!

		\e Purpose

			- Sets the size of the grid, and resizes all generations in the history

		\e Requirements

			- width_ and height_ >= 10

		\e Promise

			- Updates the size and returns true

			- Returns false if width_ or height_ < 10

	*/

	public boolean setSize(int width_, int height_)

	{

		if (width_ >= 10 && height_ >= 10)

		{	

			for ( int i = 0 ; i < HISTORY_SIZE ; i++)

			{

				history[i].setSize(width_, height_);

			}

			

			width = width_;

			height = height_;

			

			return true;

		}

		

		return false;

	}

	

	

	

	// void setWalkerPreset()

	/*!

		\e Purpose

			- Sets the current generation to the walker preset

			- Calls initialise()

	*/

	public void setWalkerPreset()

	{

		initialise();

		setSize(20, 20);

		

		toggleCell(2, 0);

		toggleCell(2, 1);

		toggleCell(2, 2);

		toggleCell(1, 2);

		toggleCell(0, 1);

	}

	

	

	

	// void toggleCell(int x_, int y_)

	/*!

		\e Purpose

			- Toggles the cell at x_ and y_

			

		\e Requirements

			- x_ and y_ >= 0

			- x < width

			- y < height

			

		\e Promise

			- None

	*/

	public void toggleCell(int x_, int y_)

	{

		if (x_ < 0)

			return;

			

		if (y_ < 0)

			return;

			

		if (x_ >= width)

			return;

			

		if (y_ >= height)

			return;

			

		currentGeneration().toggleCell(x_,y_);

	}

	

	

	

	// void checkGenerations()

	/*!

		\e Purpose

			- Updates Stop Status

			

		\e Requirements

			- None

			

		\e Promise

			- Updates Stop Status

	*/			

	private void checkGenerations()

	{

		if (maxGens <= getGenerationNumber())

			stopStatus = MAXGEN;

		else if (currentGeneration().getPopulationCount() == 0)

			stopStatus = DEAD;

		else if (currentGeneration().equals(history[1]))

			stopStatus = STABLE;

		else if (isCyclic())

			stopStatus = CYCLIC;

		else

			stopStatus = NORMAL;

	}

	

	

	

	// boolean isCyclic()

	/*!

		\e Purpose

			- Determines if the history is cyclic

			

		\e Requirements

			- None

			

		\e Promise

			- Returns true if the history is cyclic, returns false otherwise.

	*/	

	private boolean isCyclic()

	{

		for (int i = 1 ; i < HISTORY_SIZE ; i++)

		{

			if (history[i].getPopulationCount() != 0)

				if (currentGeneration().equals(history[i]))

					return true;

		}

		

		return false;

	}

	

	

	

	// void updateHistory()

	/*!

		\e Purpose

			- Age the History

			- Add generation_ to the history

			- Increment generation number

			

		\e Requirements

			- None

			

		\e Promise

			- Once history is full, last history item will be removed

	*/

	private void updateHistory(Generation generation_)

	{

		for ( int i = (HISTORY_SIZE-1) ; i >= 1 ; i--)

		{

			history[i] = history[i-1];

		}

		

		history[0] = generation_;

		generationNum++;

	}

}		