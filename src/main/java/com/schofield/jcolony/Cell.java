/*
	jColony

	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.

	Distributed under the terms of LICENSE

*/

package com.schofield.jcolony;

public class Cell
{
	private boolean state;

	/*!
		\e Purpose
			- Initialises a Dead Cell
	*/
	public Cell()
	{
		state = false;
	}

	/*!
		\e Purpose
			- Initialises a Cell with the same state fo cell_
	*/
	public Cell(Cell cell_)
	{
		state = cell_.isAlive();
	}

	/*!
		\e Purpose
			- Returns whether the Cell is Alive or Dead
		\e Promise
			- Returns true if the Cell is alive, false otherwise
	*/
	public boolean isAlive()
	{
		return state;
	}

	/*!
		\e Purpose
			- Toggles the Cell
	*/
	public void toggleCell()
	{
		state = !state;
	}
}