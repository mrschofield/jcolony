/*
	jColony

	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.

	Distributed under the terms of LICENSE
*/

package com.schofield.jcolony;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ColonyMenu extends JMenuBar implements ActionListener
{
	private ColonyGui gui;
	private JMenu		menuState, menuOptions, menuPresets, menuHelp;
	private JMenuItem	itemAbout, itemBlog;
	private JMenuItem	itemLoadPreset, itemSavePreset, itemWalker;
	private JMenuItem	itemPlate, itemOptions, itemColours;
	private JMenuItem	itemStart, itemStep, itemStop, itemPause, itemReset;

	/*!
		\e Purpose
			- To initialize this Frame
			- To add the various components to this frame

		\e Requirements
			- A Reference to ColonyGui

		\e Promise
			- Various components (CulturePlate, ControlPanel, etc) to be
			  added to the frame
	*/
	public ColonyMenu(ColonyGui gui_)
	{
		itemStart	= new JMenuItem("Start");
		itemStep	= new JMenuItem("Step");
		itemStop	= new JMenuItem("Stop");
		itemPause	= new JMenuItem("Pause");
		itemReset	= new JMenuItem("Reset");
		itemPlate	= new JMenuItem("Culture Plate");
		itemOptions	= new JMenuItem("Options");
		itemColours	= new JMenuItem("Choose Colours");
		//itemLoadPreset = new JMenuItem("Load Preset");
		//itemSavePreset = new JMenuItem("Save Preset");
		itemWalker	= new JMenuItem("Load Walker");
		itemAbout	= new JMenuItem("About");
		//itemBlog	= new JMenuItem("Author's Blog");

		itemStart.addActionListener(this);
		itemStep.addActionListener(this);
		itemStop.addActionListener(this);
		itemPause.addActionListener(this);
		itemReset.addActionListener(this);
		itemPlate.addActionListener(this);
		itemOptions.addActionListener(this);
		itemColours.addActionListener(this);
		//itemLoadPreset.addActionListener(this);
		//itemSavePreset.addActionListener(this);
		itemWalker.addActionListener(this);
		itemAbout.addActionListener(this);
		//itemBlog.addActionListener(this);

		menuState	= new JMenu("Colony");
		menuState.add(itemStart);
		menuState.add(itemStep);
		menuState.add(itemStop);
		menuState.add(itemPause);
		menuState.add(itemReset);

		menuOptions	= new JMenu("Navigate");
		menuOptions.add(itemPlate);
		menuOptions.add(itemOptions);
		menuOptions.add(itemColours);

		menuPresets	= new JMenu("Presets");
		//menuPresets.add(itemLoadPreset);
		//menuPresets.add(itemSavePreset);
		menuPresets.add(itemWalker);

		menuHelp = new JMenu("Help");
		menuHelp.add(itemAbout);
		//menuHelp.add(itemBlog);

		add(menuState);
		add(menuOptions);
		add(menuPresets);
		add(menuHelp);

		gui = gui_;
	}

	/*!
		\e Purpose
			- Accepts a single action event
	*/
	public void actionPerformed(ActionEvent e_)
	{
		if (e_.getSource() == itemStart)
			gui.start();
		else if (e_.getSource() == itemStep)
			gui.step();
		else if (e_.getSource() == itemStop)
			gui.stop();
		else if (e_.getSource() == itemPause)
			gui.pause();
		else if (e_.getSource() == itemReset)
			gui.reset();
		else if (e_.getSource() == itemOptions)
			toggleOptions();
		else if (e_.getSource() == itemColours)
			gui.toggleOptions(3);
		else if (e_.getSource() == itemWalker)
			gui.walkerPreset();
		else if (e_.getSource() == itemAbout)
			gui.toggleOptions(4);
		else if (e_.getSource() == itemPlate)
			gui.toggleOptions(1);

		//else if (e_.getSource() == itemLoadPreset)
		//else if (e_.getSource() == itemSavePreset)
	}

	/*!
		\e Purpose
			- Toggles the current open panel
	*/
	private void toggleOptions()
	{
		if (gui.optionsOpen() == 2)
			gui.toggleOptions(1);
		else
			gui.toggleOptions(2);
	}
}