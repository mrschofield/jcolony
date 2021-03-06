/*
	jColony
	
	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.
	
	Distributed under the terms of LICENSE
*/

package com.schofield.jcolony;

import java.util.*;

public class ColonyCtlr extends ColonyNotifier implements Runnable
{
	public static final int STOPPED  = 0;
	public static final int PAUSED   = 1;
	public static final int STEPPING = 2;
	public static final int RUNNING  = 3;
	private boolean active;
	private boolean waiting = false;
	private Colony colony;
	private int state;
	
	private volatile Thread colonyThread = null;
	private boolean threadSuspended = true;

	/*!
		\e Purpose
			- Creates a new colony and sets state to STOPPED
		\e Requirements
			- Width and Height >= 10
		\e Promise
			- If width or height < 10, they = 10
	*/
	public ColonyCtlr(ColonyObserver cObserver_, int width_, int height_)
	{
		super(cObserver_);
		
        colonyThread = new Thread(this, "Colony");
		colonyThread.start();
        
		if (width_ < 10)
			width_ = 10;
		if (height_ < 10)
			height_ = 10;

		colony = new Colony(width_,height_);
		state = STOPPED;
	}

	/*!
		\e Purpose
			- Calls colony.initialise() which will clear the history
			  and set the stopStatus to dead
			- Sets the state to STOPPED
	*/
	public void clear()
	{
		colony.initialise();
		state = STOPPED;
	}

	/*!
		\e Purpose
			- Generates the next generation by calling colony.generateNext()
			- Alerts the Colony of a change
	*/
	private void generateNext()
	{
	    colony.generateNext();
		colonyChanged();
	}
	
	/*!
		\e Purpose
			- Returns the number of generations
	*/
	public int getGenerationNumber()
	{
		return colony.getGenerationNumber();
	}
	
	/*!
		\e Purpose
			- Returns the maximum number of generations
	*/
	public int getMaxGen()
	{
		return colony.getMaxGen();
	}

	/*!
		\e Purpose
			- Returns the population count of the current generation
	*/
	public int getPopulationCount()
	{
		return colony.getPopulationCount();
	}
	
	public Rules getRules()
	{
		return colony.getRules();
	}
	
	/*!
		\e Purpose
			- Returns the state of the colony
	*/
	public int getState()
	{
		return state;
	}
	
	/*!
		\e Purpose
			- Returns the stopStatus of the colony
	*/
	public int getStopStatus() 
	{
		return colony.getStopStatus();
	}

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
		return colony.isAlive(x_, y_);
	}

	/*!
		\e Purpose
			- Loads the selected preset as the current generation
		\e Promise
			- Return true if it was successful, false otherwise
			- Notifies the Colony of a change if successful
	*/
	public boolean loadPreset(String filename_)
	{
		boolean result = colony.loadPreset(filename_);
		
		if (result)
			colonyChanged();
		
		return result;
	}

	/*!
		\e Purpose
			- Pauses the Generation process
	*/
	public void pause()
	{
		state = PAUSED;
	}
	
	/*!
		\e Purpose
			- Runs the Colony
	*/
	public void run()
	{
		switch (state)
		{
			case STOPPED:
				threadSuspended = true;
				break;
				
			case PAUSED:
				threadSuspended = true;
				break;
				
			case STEPPING:
				threadSuspended = true;
				generateNext();
				break;
				
			case RUNNING:
				generateNext();
				break;
		}
		
		if (state == RUNNING)
			run();
		
		try
		{
			synchronized(this)
			{
				while (threadSuspended)
				{
					waiting = true;
					wait();
					waiting = false;
				}
			}
		} 
		catch (InterruptedException e_) 
		{
		}
		finally {
			run();
		}
	}
	
	/*!
		\e Purpose
			- Sets the maximum number of generations to max_
			  by calling colony.setMaxGen(max_)
		\e Requirements
			- max_ > 0
		\e Promise
			- if max_ <= 0, max_ = The default
	*/
	public void setMaxGen(int max_)
	{
		colony.setMaxGen( max_ );
	}
	
	/*!
		\e Purpose
			- Exports the current generation to a file
		\e Promise
			- Return true if it was successful, false otherwise
	*/
	public boolean savePreset(String filename_)
	{
		return colony.savePreset(filename_);
	}
	
	/*!
		\e Purpose
			- Sets the size of the Cell grid
	*/
	public boolean setSize(int width_, int height_)
	{
		return colony.setSize(width_, height_);
	}
	
	/*!
		\e Purpose
			- Loads the walker preset as the current generation
	*/
	public void setWalkerPreset()
	{
		colony.setWalkerPreset();
	}
	
	/*!
		\e Purpose
			- Sets state to RUNNING
			- Starts the colonyThread
	*/
	public void start()
	{
		state = RUNNING;
		startThread();
	}
	
	/*!
		\e Purpose
			- Starts the colony's thread if it is not already running
			- interrupts the thread if it is already running
	*/
	private void startThread()
	{
		threadSuspended = false;
		
		if (waiting)
			colonyThread.interrupt();
	}

	/*!
		\e Purpose
			- Sets state to STEPPING
			- Starts the colonyThread
	*/
	public void step()
	{
		generateNext();
	}
	
	/*!
		\e Purpose
			- Sets state to STOPPED
	*/
	public void stop()
	{
		state = STOPPED;
	}
	
	/*!
		\e Purpose
			- Toggles the state of the cell in the current generation at position x_, y_
			  by calling colony.toggleCell(x_,y_)
		\e Requirements
			- x_ and y_ >= 0
			- x < width
			- y < height
	*/
	public void toggleCell(int x_, int y_)
	{
		colony.toggleCell(x_, y_);
	}
}
