/*
	jColony
	
	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.
	
	Distributed under the terms of LICENSE.TXT
*/

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class BasicOptionsPanel extends JPanel
{
	public JLabel lblLagTime;
	public JSlider sldLagTime;
	public JLabel lblGridWidth;
	public JTextField txtGridWidth;
	public JLabel lblGridHeight;
	public JTextField txtGridHeight;
	public JLabel lblMaxGens;
	public JTextField txtMaxGens;
	
	public JLabel lblShape;
	public JComboBox cmbShape;
	
	public JLabel lblMinBirth;
	public JLabel lblMaxBirth;
	public JLabel lblMinSurvival;
	public JLabel lblMaxSurvival;
	
	public JTextField txtMinBirth;
	public JTextField txtMaxBirth;
	public JTextField txtMinSurvival;
	public JTextField txtMaxSurvival;
	
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