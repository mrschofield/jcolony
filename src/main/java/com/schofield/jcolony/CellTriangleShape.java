/*
	jColony

	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.

	Distributed under the terms of LICENSE
*/

package com.schofield.jcolony;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CellTriangleShape extends CellShape
{
	/*!
		\e Purpose
			- Initialises this shape
	*/
	public CellTriangleShape(ColonyCtlr ctrl_, int w_, int h_, int iamX_, int iamY_)
	{
			super(ctrl_, w_, h_, iamX_, iamY_);
	}

	/*!
		\e Purpose
			- Draws this cell onto the selected graphics context
		\e Requirements
			- A Graphics context to draw to
		\e Promise
			- Draws to the context.
			- Returns early if there was an error.
	*/
	public void draw(Graphics g_)
	{       
		if (g_ == null)
			return;

		if (state)
			g_.setColor(aliveColor);
		else
			g_.setColor(deadColor);

		if (overMe)
			g_.setColor(enteredColor);

		g_.fillPolygon(new int[] {(int)(w*0.5), 0, w, (int)(w*0.5)}, 
					   new int[] {0, h, h, 0}, 
					   4);
	}
}