/*

	jColony

	

	Copyright (c) 2005-2006 Mathew Schofield

	All Rights Reserved.

	

	Distributed under the terms of LICENSE.TXT

*/

package com.schofield.jcolony;

import javax.swing.*;

import java.awt.*;

import java.util.*;

import java.awt.event.*;



public class CellShape extends JComponent implements MouseListener

{

	protected int h;

	protected int w;

	protected int iamX;

	protected int iamY;

	protected boolean state = false;

	protected boolean overMe = false;

	protected Color borderColor = new Color(0,0,0);

	protected Color aliveColor = new Color(255,0,0);

	protected Color enteredColor = new Color(0,255,0);

	protected Color deadColor = new Color(0,0,255);

	private ColonyCtlr ctrl = null;

	

	public CellShape(ColonyCtlr ctrl_, int w_, int h_, int iamX_, int iamY_)

	{

		ctrl = ctrl_;

	

		setHeight(h_);

		setWidth(w_);

		state = false;

		borderColor = new Color(0,0,0);

		aliveColor = new Color(255,0,0);

		deadColor = new Color(0,0,255);

		

		iamX = iamX_;

		iamY = iamY_;

		

		addMouseListener(this);

	}

	

	

	

	//! draw(Graphics g_)

	/*!

		\e Purpose

			- Draws this cell onto the selected graphics context

	

		\e Requirements

			- A Graphics context to draw to

	

		\e Promise

			- Draws to the context.

			- Returns early if there was an error.

	*/

	public void paint(Graphics g_)

	{

		super.paint(g_);



		setState(ctrl.isAlive(iamX, iamY));



		if (g_ == null)

			return;

		draw(g_);

	}

	

	

	

	//! getRandom(int min_, int max_)

	/*!

		\e Purpose

			- To return a random number between min_ and max_ inclusively.

	

		\e Requirements

			- A minimum number.

			- A maximum number.

	

		\e Promise

			- Returns a number that is lower or equal to max_ and above or equal

			  to min_

	*/

	public int getRandom(int min_, int max_)

	{

		int r = min_ + (int)(Math.random()*max_);

		if (r < min_)

			return min_;

			

		if (r > max_)

			return max_;

			

		return r;

	}

	

	

	

	//! draw(Graphics g_)

	/*!

		\e Purpose

			- Draws this cell onto the selected graphics context

	

		\e Requirements

			- A Graphics context to draw to

	

		\e Promise

			- Draws to the context.

			- Returns early if there was an error.

	*/

	protected void draw(Graphics g_)

	{       

		if (g_ == null)

			return;

		

		if (state)

			g_.setColor(aliveColor);

		else

			g_.setColor(deadColor);

			

		if (overMe)

			g_.setColor(enteredColor);

		

		g_.fillRect(0,0,w,h);

	}

	

	

	

	//! inBounds(int x_, int y_)

	/*!

		\e Purpose

			- Calculates if the co-ordinates are inside the shape

	

		\e Requirements

			- X and Y Co-Ordinates

	

		\e Promise

			- Calculates and returns true if they are in bounds

			- Returns false if otherwise.

	*/

	public boolean inBounds(int x_, int y_)

	{

		return true;

	}

	

	

	

	//! mousePressed(MouseEvent e_)

	/*!

		\e Purpose

			- Accepts a Mouse Pressed Event

	*/

	public void mousePressed(MouseEvent e_)

	{

		toggle();

	}

	

	

	

	//! mouseExited(MouseEvent e_)

	/*!

		\e Purpose

			- Accepts a Mouse Exited Event

	*/

	public void mouseExited(MouseEvent e_)

	{

		overMe = false;

		repaint();

		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

	}

	

	

	

	//! mouseEntered(MouseEvent e_)

	/*!

		\e Purpose

			- Accepts a Mouse Entered Event

	*/

	public void mouseEntered(MouseEvent e_)

	{

		overMe = true;

		setCursor(new Cursor(Cursor.HAND_CURSOR));

		

		if (e_.getModifiersEx() != 0)

		{

			if ( inBounds(e_.getX(), e_.getY()) )

				toggle();

		}

		

		repaint();

	}

	

	

	

	//! mouseReleased(MouseEvent e_)

	/*!

		\e Purpose

			- Accepts a Mouse Released Event

	*/

	public void mouseReleased(MouseEvent e_)

	{

	}

	

	

	

	//! mouseClicked(MouseEvent e_)

	/*!

		\e Purpose

			- Accepts a Mouse Clicked Event

	*/

	public void mouseClicked(MouseEvent e_)

	{

	}

	

	



	//! setAliveColor(Color color_)

	/*!

		\e Purpose

			- Sets the Colour of Alive Cells

	*/

	public void setAliveColor(Color color_)

	{

		if (color_ != null)

			aliveColor = color_;

	}

	

	

	

	//! setBorderColor(Color color_)

	/*!

		\e Purpose

			- Sets the Colour of the border

	*/

	public void setBorderColor(Color color_)

	{

		if (color_ != null)

			borderColor = color_;

	}

	

	

	

	//! void setDeadColor(Color color_)

	/*!

		\e Purpose

			- Sets the Colour of Dead Cells

	*/

	public void setDeadColor(Color color_)

	{

		if (color_ != null)

			deadColor = color_;

	}

	

	

	

	// void setEnteredColor(Color color_)

	/*!

		\e Purpose

			- Sets the Active cell colour in terms of where the mouse is

	*/

	public void setEnteredColor(Color color_)

	{

		if (color_ != null)

			enteredColor = color_;

	}

	

	

	

	//! void setHeight(int h_)

	/*!

		\e Purpose

			- Sets the Height of the Cell

	*/

	public void setHeight(int h_)

	{

		super.setSize(w, h_);

		h = h_;

	}

	

	

	

	//! setState(boolean state_)

	/*!

		\e Purpose

			- Sets the state of the Cell

	*/

	public boolean setState(boolean state_)

	{

		state = state_;

		return state;

	}

	

	

	

	//! setWidth(int w_)

	/*!

		\e Purpose

			- Sets the width of the Cell

	*/

	public void setWidth(int w_)

	{

		super.setSize(w_, h);

		w = w_;

	}

	

	

	

	//! toggle()

	/*!

		\e Purpose

			- Toggles the model of the cells state

			- Repaints this cell

	*/

	public void toggle()

	{

		ctrl.toggleCell(iamX, iamY);

		repaint();

	}

}