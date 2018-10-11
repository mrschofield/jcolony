/*

	jColony

	

	Copyright (c) 2005-2006 Mathew Schofield

	All Rights Reserved.

	

	Distributed under the terms of LICENSE.TXT

*/

package com.schofield.jcolony;

import javax.swing.*;

import javax.swing.border.*;

import java.awt.*;

import java.util.*;

import java.awt.event.*;



public class CulturePlate extends JPanel

{

	public static final String[] SHAPES = new String[] {

		"Square", "Circle", "Triangle"

	};

	private CellShape[][] cells;	// To hold the cells

	private int xCells;			// Number of cells in X

	private int yCells;			// Number of Cells in Y

	private double width;			// The width of the Plate

	private double height;			// The width of the Plate

	private int cellShape = 0;

	private ColonyCtlr ctrl = null;

	

	/*! CulturePlate(ColonyCtlr ctrl_)

		\e Purpose

			- To initilize the culture plate

			

		\e Requirements

			- A Colony Controller

			

		\e Promise

			- Creates a plate with the default 20x20 Cells

	*/

	public CulturePlate(ColonyCtlr ctrl_)

	{

		ctrl = ctrl_;

		xCells = 20; 

		yCells = 20;

		initPlate();

	}

	

	

	

	/*! CulturePlate(ColonyCtlr ctrl_, int xCells_, int yCells_)

		\e Purpose

			- To initilize the culture plate

			

		\e Requirements

			- The Number of Cells in the X plane

			- The Number of Cells in teh Y plane

			- A Colony Controller

			

		\e Promise

			- Creates a plate with the specificed number of Cells

	*/

	public CulturePlate(ColonyCtlr ctrl_, int xCells_, int yCells_)

	{

		ctrl = ctrl_;

		xCells = xCells_;

		yCells = yCells_;

		initPlate();

	}

	

	

	

	/*! CulturePlate(ColonyCtlr ctrl_, int xCells_, int yCells_, String cellShape_)

		\e Purpose

			- To initilize the culture plate

			

		\e Requirements

			- The Number of Cells in the X plane

			- The Number of Cells in teh Y plane

			- A Colony Controller

			

		\e Promise

			- Creates a plate with the specificed number of Cells

	*/

	public CulturePlate(ColonyCtlr ctrl_, int xCells_, int yCells_, String cellShape_)

	{

		ctrl = ctrl_;

		xCells = xCells_;

		yCells = yCells_;

		

		cellShape = switchCellShape(cellShape_);

		

		initPlate();

	}

	

	

	

	/*! initPlate()

		\e Purpose

			- Sets up the Culture Plate for the first time

			

		\e Requirements

			- None

			

		\e Promise

			- Creates the array of Cells / Cell objects

	*/

	private void initPlate()

	{

		setLayout(null);

		cells = new CellShape[xCells][yCells];

		

		for(int xi = 0 ; xi < xCells ; xi++)

		{

			for(int yi = 0 ; yi < yCells ; yi++)

			{

				switch (cellShape)

				{

					case 0:

							cells[xi][yi] = new CellShape(ctrl,0,0,xi,yi);

						break;

					case 1:

							cells[xi][yi] = new CellCircleShape(ctrl,0,0,xi,yi);

						break;

					case 2:

							cells[xi][yi] = new CellTriangleShape(ctrl,0,0,xi,yi);

						break;

						

					default:

						cells[xi][yi] = new CellShape(ctrl,0,0,xi,yi);

				}

					

				add(cells[xi][yi]);

			}

		}

	}

	

	

	

	/*! paint(Graphics g_)

		\brief DO NOT CALL THIS METHOD DIRECTLY, instead call repaint()

		\e Purpose

			- Paints the CulturePlate, and all cells on it.

			

		\e Requirements

			- A Graphics Context to paint to.

			

		\e Promise

			- Paints the CulturePlate

			- Paints the cells to the culture plate

	*/

	public void paint(Graphics g_)

	{

		super.paint(g_);

		

		if ((int)this.getBounds().getWidth() != width)

			resize();

	}

	

	

	

	/*! pause()

		\e Purpose

			- Pauses the Colony Model

	

		\e Promise

			- Runs the Model's pause method

	*/

	public void pause()

	{

		ctrl.pause();

	}	

	

	

	

	/*! reset()

		\e Purpose

			- Resets the Colony Model

	

		\e Promise

			- Runs the Model's reset method

	*/

	public void reset()

	{

		ctrl.clear();

	}

	

	

	

	/*! resize()

		\e Purpose

			- Sets up the Culture Plate for the first time

			

		\e Requirements

			- None

			

		\e Promise

			- Creates the array of Cells / Cell objects

	*/

	private void resize()

	{

		width  = this.getBounds().getWidth();

		height = this.getBounds().getHeight();



		double aWidth = width/(xCells + 4);

		double aHeight = height/(yCells + 4);

		

		double x = aWidth;

		double y = aHeight;

		

		for(int xi = 0 ; xi < xCells ; xi++)

		{

			for(int yi = 0 ; yi < yCells ; yi++)

			{

				if (cells[xi][yi] != null)

				{

					cells[xi][yi].setHeight((int)aHeight);

					cells[xi][yi].setWidth((int)aWidth);

					

					cells[xi][yi].setLocation((int)x,(int)y);

				}

				x += aWidth + (aWidth/10);

			}

			y += aHeight + (aHeight/10);

			x =  aWidth;

		}

	}

	

	

	

	/*! setColor(Color borderColor_, Color aliveColor_, Color enteredColor_, Color deadColor_)

		\e Purpose

			- Updates each Cell with the new Colours

	*/

	public void setColor(Color borderColor_, Color aliveColor_, Color enteredColor_, Color deadColor_)

	{

		for(int x = 0 ; x < xCells ; x++)

		{

			for(int y = 0 ; y < yCells ; y++)

			{

				cells[x][y].setBorderColor(borderColor_);

				cells[x][y].setAliveColor(aliveColor_);

				cells[x][y].setEnteredColor(enteredColor_);

				cells[x][y].setDeadColor(deadColor_);

			}

		}

	}

	

	

	

	/*!

		\e Purpose

			- Starts the Colony Model

	

		\e Promise

			- Runs the Model's start method

	*/

	public void start()

	{

		ctrl.start();

	}

	

	

	

	/*!

		\e Purpose

			- Steps through one Life Generation Process in the Colony Model

	

		\e Promise

			- Runs the Model's step method

	*/

	public void step()

	{

		ctrl.step();

	}

	

	

	

	/*!

		\e Purpose

			- Stops the Colony Model

	

		\e Promise

			- Runs the Model's stop method

	*/

	public void stop()

	{

		ctrl.stop();

	}

	

	

	

	/*!

		\e Purpose

			- Converts a CellShape's name to an index number

	

		\e Promise

			- Returns an index number

			- Returns 0 if the shape could not be found

	*/

	public int switchCellShape(String cellShape_)

	{

		for (int i = 0 ; i < SHAPES.length ; i++)

		{

			if (cellShape_.compareTo(SHAPES[i]) == 0)

				return i;

		}

		

		return 0;

	}

}