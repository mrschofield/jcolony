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
import javax.swing.border.*;

public class BasicOptionsPanel extends JPanel
{
	public JComboBox cmbShape;
	public JLabel lblGridHeight;
	public JLabel lblGridWidth;
	public JLabel lblLagTime;
	public JLabel lblMaxBirth;
	public JLabel lblMaxGens;
	public JLabel lblMaxSurvival;
	public JLabel lblMinBirth;
	public JLabel lblMinSurvival;
	public JLabel lblShape;
	public JSlider sldLagTime;
	public JTextField txtGridHeight;
	public JTextField txtGridWidth;
	public JTextField txtMaxBirth;
	public JTextField txtMaxGens;
	public JTextField txtMaxSurvival;
	public JTextField txtMinBirth;
	public JTextField txtMinSurvival;

	/*!
		\e Purpose
			- Initialise the User Interface and add the required
			  buttons onto it.
	*/
	public BasicOptionsPanel()
	{
		super();
		setLayout(new GridLayout(10,2,2,2));
		lblMaxGens = new JLabel("Set Max Gens (100 is Default): ");
		txtMaxGens = new JTextField("100");
		lblGridWidth = new JLabel("Grid Width: ");
		lblGridHeight = new JLabel("Grid Height: ");
		txtGridWidth = new JTextField("20");
		txtGridHeight = new JTextField("20");
		lblLagTime = new JLabel("Lag Time [Lower = Less lag/Faster]");
		sldLagTime = new JSlider(JSlider.HORIZONTAL,25, 775, 125);
		sldLagTime.setMajorTickSpacing(250);
		sldLagTime.setMinorTickSpacing(25);
		sldLagTime.setPaintTicks(true);
		sldLagTime.setPaintLabels(true);
		lblShape = new JLabel("Shape: ");
		cmbShape = new JComboBox();

		for (int i = 0 ; i < CulturePlate.SHAPES.length ; i++)
		{
			cmbShape.addItem(CulturePlate.SHAPES[i]);
		}

		lblMinBirth = new JLabel("Min Nbrs For Birth");
		lblMaxBirth = new JLabel("Max Nbrs For Birth");
		lblMinSurvival = new JLabel("Min Nbrs For Survival");
		lblMaxSurvival = new JLabel("Max Nbrs For Survival");

		txtMinBirth = new JTextField("2");
		txtMaxBirth = new JTextField("3");
		txtMinSurvival = new JTextField("2");
		txtMaxSurvival = new JTextField("3");

		add(lblGridWidth);
		add(txtGridWidth);
		add(lblGridHeight);
		add(txtGridHeight);
		add(lblLagTime);
		add(sldLagTime);
		add(lblMaxGens);
		add(txtMaxGens);
		add(lblShape);
		add(cmbShape);
		add(lblMinBirth);
		add(txtMinBirth);
		add(lblMaxBirth);
		add(txtMaxBirth);
		add(lblMinSurvival);
		add(txtMinSurvival);
		add(lblMaxSurvival);
		add(txtMaxSurvival);
		repaint();
		validate();
	}
}