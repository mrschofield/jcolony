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



public class AboutPanel extends JPanel implements ActionListener

{

	public JComboBox cmbAbout;

	public JTextArea txtAbout;

	

	/*!

		\e Purpose

			- Initialise the User Interface for this panel

	*/

	public AboutPanel()

	{

		super();

		setLayout(new BorderLayout());

		

		cmbAbout = new JComboBox();

		txtAbout = new JTextArea();

		

		cmbAbout.addItem("About");

		cmbAbout.addItem("Copyright");

		

		cmbAbout.setFont(new java.awt.Font("Verdana", 0, 14));

		txtAbout.setFont(new java.awt.Font("Verdana", 0, 12));

		

		cmbAbout.addActionListener(this);

		

		txtAbout.setLineWrap(true);

		txtAbout.setMargin(new Insets(10,10,10,10));

		txtAbout.setWrapStyleWord(true);

		

		add(cmbAbout, BorderLayout.NORTH);

		add(txtAbout, BorderLayout.CENTER);

		

		switchResource("About");

		

		validate();

	}

	

	

	

	/*! actionPerformed(ActionEvent e_)

		\e Purpose

			- Accepts a change in the Colour Combo Box

	*/

	public void actionPerformed(ActionEvent e_)

	{

		if (e_.getSource() == cmbAbout)

			switchResource(cmbAbout.getSelectedItem().toString());

	}

	

	

	

	/*!

		\e Purpose

			- Changes the About Box's Text, as per selected resource

	*/

	public int switchResource(String resource_)

	{

		if (resource_.equals("About"))

		{

			txtAbout.setText("jColony is a simple implementation of 'The Game of Life', written in java.\n"

			+ "Much work has been done to get jColony to work effectively, and more work is still needed."

			+ "\n\nContributions are welcomed!" );

		}

		else if (resource_.equals("History"))

		{

			txtAbout.setText("Over the Past 2+ Months i have worked on Colony, to ensure that "

			+ "it not only works well enough to use, but has some neat features. These features "

			+ "will hopefull grow as time permits ^_^");

		}		

		else if (resource_.equals("Copyright"))

		{

			txtAbout.setText("Copyright (c) 2005-2006 Mathew Schofield.\nAll Rights Reserved.\n\n");

		}

		

		return 0;

	}

}