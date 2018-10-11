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



public class ColourPanel extends JPanel implements ActionListener

{

	private JColorChooser clrChooser;

	private JComboBox cmbColour;

	private Color borderColor = new Color(0,0,0);

	private Color aliveColor = new Color(255,0,0);

	private Color deadColor = new Color(0,0,255);

	private Color enteredColor = new Color(0,255,0);

	private int index = 0;

	

	/*! ColourPanel()

	\e Purpose

		- To initilize this class

		

	\e Requirements

		- None

		

	\e Promise

		- Adds buttons to this panel in an appropriate fashion.

	*/

	public ColourPanel()

	{

		super();

		setLayout(new BorderLayout());

		

		cmbColour = new JComboBox();

		cmbColour.addItem("Border Colour");

		cmbColour.addItem("Alive Colour");

		cmbColour.addItem("Entered Colour");

		cmbColour.addItem("Dead Colour");

		

		clrChooser = new JColorChooser();

		clrChooser.setColor(enteredColor);

		

		cmbColour.addActionListener(this);

		

		add(cmbColour, BorderLayout.NORTH);

		add(clrChooser, BorderLayout.CENTER);

	}

	

	

	

	/*! actionPerformed(ActionEvent e_)

		\e Purpose

			- Accepts a change in the Colour Combo Box

	*/

	public void actionPerformed(ActionEvent e_)

	{

		if (e_.getSource() == cmbColour)

		{

			String it = cmbColour.getSelectedItem().toString();

			if (it.compareTo("Border Colour") == 0)

				setChooser(1);

			else if (it.compareTo("Alive Colour") == 0)

				setChooser(2);

			else if (it.compareTo("Entered Colour") == 0)

				setChooser(3);

			else if (it.compareTo("Dead Colour") == 0)

				setChooser(4);

		}

	}

	

	

	

	/*! Color getAliveColor()

		\e Purpose

			- Returns a copy of the selected Alive colour

	*/

	public Color getAliveColor()

	{

		Color tmp = copyColor(aliveColor);

		return tmp;

	}

	

	

	

	/*! Color getBorderColor()

		\e Purpose

			- Returns a copy of the selected Border colour

	*/

	public Color getBorderColor()

	{

		Color tmp = copyColor(deadColor);

		return tmp;

	}

	

	

	

	/*! Color getDeadColor()

		\e Purpose

			- Returns a copy of the selected Dead colour

	*/

	public Color getDeadColor()

	{

		Color tmp = copyColor(deadColor);

		return tmp;

	}

	

	

	

	/*! Color getEnteredColor()

		\e Purpose

			- Returns a copy of the selected Dead colour

	*/

	public Color getEnteredColor()

	{

		Color tmp = copyColor(enteredColor);

		return tmp;

	}

	

	

	

	/*! setChooser(int i_)

		\e Purpose

			- Changes the context of the colour chooser to the

			  specified Colour.

			

		\e Requirements

			- A Colour Index

				(1 - borderColor, 2 - aliveColor, 3 - enteredColor,

				 4 - deadColor).

			

		\e Promise

			- Changes context and returns 0. Returns 1 if index out

			  of bounds.

	*/

	public int setChooser(int i_)

	{

		update();

		index = i_;

		

		switch (i_)

		{

			case 1:

					clrChooser.setColor(borderColor);

					break;

			case 2:

					clrChooser.setColor(aliveColor);

					break;

			case 3:

					clrChooser.setColor(enteredColor);

					break;

			case 4:

					clrChooser.setColor(deadColor);

					break;

			default:

					return 1;

		}

		

		return 0;

	}

	

	

	

	/*! update()

		\e Purpose

			- Updates the Current Colour

	*/

	public void update()

	{

		switch (index)

		{

			case 1:

					borderColor = clrChooser.getColor();

					break;

			case 2:

					aliveColor = clrChooser.getColor();

					break;

			case 3:

					enteredColor = clrChooser.getColor();

					break;

			case 4:

					deadColor = clrChooser.getColor();

					break;

		}

	}

	

	

	

	/*! Color copyColor(Color color_)

		\e Purpose

			- Copies the selected Color

	*/

	private Color copyColor(Color color_)

	{

		Color tmp = new Color( color_.getRed(), color_.getGreen(), color_.getBlue() );

		return tmp;

	}

}