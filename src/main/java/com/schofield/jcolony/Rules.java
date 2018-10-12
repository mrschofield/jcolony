/*
	jColony

	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.

	Distributed under the terms of LICENSE
*/

package com.schofield.jcolony;

public class Rules
{	
	private int maxBirth = 3;
	private int maxSurvival = 3;
	private int minBirth = 3;
	private int minSurvival = 2;

	/*!
		\e Purpose
			- Controls whether the cell will die, or a new cell
			  to be created.
		\e Requirements
			- Neighbours >= 0
		\e Promise
			- Returns a cell
	*/	
	public Cell applyRules(Cell cell_, int neighbours_)
	{
		Cell cell = new Cell(cell_);

		if (!cell.isAlive())
			birth( cell, neighbours_ );
		else
			survives( cell, neighbours_ );

		return cell;
	}

	/*!
		\e Purpose
			- Sets the Minimum required Neighbours for Birth
		\e Requirements
			- None
		\e Promise
			- None
	*/
	public void setMinBirth(int min_)
	{
		minBirth = min_;
	}

	/*!
		\e Purpose
			- Sets the Minimum required Neighbours for Survival
		\e Requirements
			- None
		\e Promise
			- None
	*/
	public void setMinSurvival(int min_)
	{
		minSurvival = min_;
	}

	/*!
		\e Purpose
			- Sets the Maximum allowed Neighbours for Birth
		\e Requirements
			- None
		\e Promise
			- None
	*/
	public void setMaxBirth(int max_)
	{
		maxBirth = max_;
	}

	/*!
		\e Purpose
			- Sets the Maximum allowed Neighbours for Survival
		\e Requirements
			- None
		\e Promise
			- None
	*/
	public void setMaxSurvival(int max_)
	{
		maxSurvival = max_;
	}

	/*!
		\e Purpose
			- Controls whether the cell is eligable for Birth
		\e Requirements
			- Neighbours >= Minimum for Birth
			- Neighbours <= Maximum for Birth
		\e Promise
			- Toggles the Cell if it is eligable for Birth
	*/
	private void birth(Cell cell_, int neighbours_)
	{
		if (neighbours_ >= minBirth && neighbours_ <= maxBirth)
			cell_.toggleCell();
	}

	/*!
		\e Purpose
			- Controls whether the cell is eligable for Birth
		\e Requirements
			- Neighbours >= Minimum for Birth
			- Neighbours <= Maximum for Birth
		\e Promise
			- Toggles the Cell if it is eligable for Birth
	*/	
	private void survives(Cell cell_, int neighbours_)
	{
		if (neighbours_ < minSurvival || neighbours_ > maxSurvival)
			cell_.toggleCell();
	}
}