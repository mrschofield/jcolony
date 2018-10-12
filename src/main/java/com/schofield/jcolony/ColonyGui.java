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

public class ColonyGui extends JFrame implements ActionListener, ColonyObserver
{
	private AboutPanel aboutBox = new AboutPanel();
	private boolean UseControlPanel = false;
	private ColonyCtlr ctrl = new ColonyCtlr(this,20,20);
	private ColonyMenu menu;
	private ColourPanel clrPanel;
	private ControlPanel ctrlPanel;
	private CulturePlate plate;
	private int lagTime = 125;
	private int optionsOpen = 1;
	private OptionsPanel optionPanel;
	private Preset preset = new Preset();
	private StatusPanel statusPanel;

	/*!
		\e Purpose
			- To initialize this Frame
			- To add the various components to this frame
		\e Requirements
			- None
		\e Promise
			- Various components (CulturePlate, ControlPanel, etc) to be
			  added to the frame
	*/
	public ColonyGui()
	{
		super("Colony GUI");
		menu = new ColonyMenu(this);
		setBounds(100,100,600,600);
		//setResizable(false);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		ctrlPanel = new ControlPanel();
		statusPanel = new StatusPanel();
		optionPanel = new OptionsPanel(this);
		clrPanel = new ColourPanel();
		plate = new CulturePlate(ctrl,20,20);
		setBounds(250,250,600,600);
		updateStatus();

		getContentPane().setLayout(new BorderLayout());

		getContentPane().add(statusPanel, BorderLayout.NORTH);

		if (UseControlPanel)
			getContentPane().add(ctrlPanel, BorderLayout.WEST);
		else
			setJMenuBar(menu);

		getContentPane().add(plate, BorderLayout.CENTER);

		optionPanel.btnLoadWalker.addActionListener(this);
		optionPanel.btnSave.addActionListener(this);
		optionPanel.btnChooseClr.addActionListener(this);

		setVisible(true);
		repaint();
		validate();
	}

	/*!
		\e Purpose
			- To accept user actions, and to handle them accordingly.
		\e Requirements
			- An ActionEvent
		\e Promise
			- Instructs the CulturePlate to "Start", "Stop", etc. according
			  to the ActionEvent Specifications.
	*/
	public void actionPerformed(ActionEvent e_)
	{
		if (e_.getSource() == ctrlPanel.btnStart)
			plate.start();
		else if (e_.getSource() == ctrlPanel.btnStop)
			plate.stop();
		else if (e_.getSource() == ctrlPanel.btnStep)
			plate.step();
		else if (e_.getSource() == ctrlPanel.btnPause)
			plate.pause();
		else if (e_.getSource() == ctrlPanel.btnReset)
			plate.reset();
		else if (e_.getSource() == ctrlPanel.btnOptions)
			toggleOptions(2);
		else if (e_.getSource() == optionPanel.btnSave)
			updateStuff();
		else if (e_.getSource() == optionPanel.btnChooseClr)
			toggleOptions(3);
		else if (e_.getSource() == optionPanel.btnLoadWalker)
			ctrl.setWalkerPreset();
	}

	public void updateStuff()
	{
		ctrl.setMaxGen( toInt(optionPanel.panelBasic.txtMaxGens.getText()) );
		lagTime = optionPanel.panelBasic.sldLagTime.getValue();
		String shape = optionPanel.panelBasic.cmbShape.getSelectedItem().toString();
		int width = toInt(optionPanel.panelBasic.txtGridWidth.getText());
		int height =  toInt(optionPanel.panelBasic.txtGridHeight.getText());

		Rules tmpRules = ctrl.getRules();
		tmpRules.setMinBirth(toInt(optionPanel.panelBasic.txtMinBirth.getText()));
		tmpRules.setMaxBirth(toInt(optionPanel.panelBasic.txtMinBirth.getText()));
		tmpRules.setMinSurvival(toInt(optionPanel.panelBasic.txtMinBirth.getText()));
		tmpRules.setMaxSurvival(toInt(optionPanel.panelBasic.txtMaxBirth.getText()));

		if (ctrl.setSize( width, height ))
			plate = new CulturePlate(ctrl,width,height,shape);

		clrPanel.update();

		plate.setColor(clrPanel.getBorderColor(), clrPanel.getAliveColor(), 
		clrPanel.getEnteredColor(), clrPanel.getDeadColor());
	}

	/*!
		\e Purpose
			- To listen for Colony Status Changes

		\e Requirements
			- None

		\e Promise
			- To accept Colony Status Changes
			- To update the status bar as necessary
			- To update the culture plate as necessary
	*/
	public void colonyChanged()
	{
		updateStatus();
		plate.repaint();

		if (ctrl.getState() == ColonyCtlr.RUNNING)
		{
			try
			{
				Thread.sleep(lagTime); // 450 = Default, Range between 75 and 775
			} 
			catch (InterruptedException e)
			{ 
			}
		}
	}

	/*!
		\e Purpose
			- Retuns the index of the currently open panel
	*/
	public int optionsOpen()
	{
		return optionsOpen;
	}

	/*!
		\e Purpose
			- Pauses the Life Generation Process by calling CulturePlate.pause()
	*/
	public void pause()
	{
		plate.pause();
	}

	/*!
		\e Purpose
			- Clears and resets the Colony by calling CulturePlate.reset()
	*/
	public void reset()
	{
		plate.reset();
		colonyChanged();
	}

	/*!
		\e Purpose
			- Saves the Current Options
	*/
	public void save()
	{
		ctrl.setMaxGen( toInt(optionPanel.panelBasic.txtMaxGens.getText()) );
		lagTime = optionPanel.panelBasic.sldLagTime.getValue();

		String shape = optionPanel.panelBasic.cmbShape.getSelectedItem().toString();

		int width = toInt(optionPanel.panelBasic.txtGridWidth.getText());
		int height = toInt(optionPanel.panelBasic.txtGridHeight.getText());

		Rules tmpRules = ctrl.getRules();
		tmpRules.setMinBirth(toInt(optionPanel.panelBasic.txtMinBirth.getText()));
		tmpRules.setMaxBirth(toInt(optionPanel.panelBasic.txtMinBirth.getText()));
		tmpRules.setMinSurvival(toInt(optionPanel.panelBasic.txtMinBirth.getText()));
		tmpRules.setMaxSurvival(toInt(optionPanel.panelBasic.txtMaxBirth.getText()));

		if (ctrl.setSize( width, height ))
			plate = new CulturePlate(ctrl,width,height,shape);

		clrPanel.update();
		plate.setColor(clrPanel.getBorderColor(), clrPanel.getAliveColor(), clrPanel.getEnteredColor(), clrPanel.getDeadColor());
	}

	/*!
		\e Purpose
			- Starts the Generation Process by calling CulturePlate.start()
	*/
	public void start()
	{
		plate.start();
	}

	/*!
		\e Purpose
			- Converts a Colony state to a String representation
		\e Promise
			- Returns the string representation
			- Returns "Unknown" if the state is not valid
	*/
	public String stateToString(int state_)
	{
		switch (state_)
		{
			case ColonyCtlr.STOPPED:
				return "Stopped";
			case  ColonyCtlr.PAUSED:
				return "Paused";
			case ColonyCtlr.STEPPING:
				return "Stepping";
			case ColonyCtlr.RUNNING:
				return "Running";
			default:
				return "Unknown";
		}
	}

	/*!
		\e Purpose
			- Steps through one Life Generation Process by calling CulturePlate.step()
	*/
	public void step()
	{
		plate.step();
	}


	/*!
		\e Purpose
			- Stops the Generation Process by calling CulturePlate.stop()
	*/
	public void stop()
	{
		plate.stop();
	}

	/*!
		\e Purpose
			- Converts a stop status to it's string representation

		\e Requirements
			- A valid stop status

		\e Promise
			- Returns a string representation
			- Returns "Unknown" if the stop status is not known
	*/
	public String stopStatusToString(int stopStatus_)
	{
		switch (stopStatus_)
		{
			case Colony.NORMAL:
				return "Normal";
			case Colony.DEAD:
				return "Dead";
			case Colony.STABLE:
				return "Stable";
			case Colony.CYCLIC:
				return "Cyclic";
			case Colony.MAXGEN:
				return "At Max Gen.";
			default:
				return "Unknown";
		}
	}

	/*!
		\e Purpose
			- Toggles the Currently open Panel
		\e Requirements
			- A Panel Index (1 - Culture Plate, 2 - Option Panel, 3 - Colour Picker, 
			  4 - About Box)
		\e Promise
			- Removes the current panel
			- Adds the selected panel
			- Repaints the selected panel
			- Repaints this frame
	*/
	public void toggleOptions(int i_)
	{
		if (i_ < 1 || i_ > 4)
			return;

		switch (optionsOpen)
		{
			case 1:
				remove(plate);
				break;

			case 2:
				remove(optionPanel);
				break;

			case 3:
				remove(clrPanel);
				break;
			case 4:
				remove(aboutBox);
		}

		switch (i_)
		{
			case 1:
				getContentPane().add(plate);
				plate.repaint();
				break;

			case 2:
				getContentPane().add(optionPanel);
				optionPanel.repaint();
				break;

			case 3:
				getContentPane().add(clrPanel);
				clrPanel.repaint();
				break;

			case 4:
				getContentPane().add(aboutBox);
				aboutBox.repaint();
				break;
		}

		optionsOpen = i_;
		repaint();
		validate();
	}

	/*!
		\e Purpose
			- To listen for Colony Status Changes
		\e Requirements
			- None
		\e Promise
			- To accept Colony Status Changes
			- To update the status bar as necessary
			- To update the culture plate as necessary
	*/
	public void updateStatus()
	{
		if (statusPanel != null && ctrl != null)
		{
			statusPanel.setNumGens(ctrl.getGenerationNumber());
			statusPanel.setPopulation(ctrl.getPopulationCount());
			statusPanel.setState(stateToString(ctrl.getState()));
			statusPanel.setStopStatus(stopStatusToString(ctrl.getStopStatus()));
		}
	}

	/*!
		\e Purpose
			- Sets the current generation to the walker preset by calling ColonyCtlr.setWalkerPreset()
			- Repaints the Culture Plate
	*/
	public void walkerPreset()
	{
		ctrl.setWalkerPreset();
		plate.repaint();
	}

	/*!
		\e Purpose
			- Converts a string to an integer and returns the result
	*/
	private int toInt(String text_)
	{
		int temp = Integer.parseInt( text_ );
		return temp;
	}

	public void switchControlPanel()
	{
		UseControlPanel = !UseControlPanel;

		if (UseControlPanel)
		{
			setJMenuBar(null);
			getContentPane().add(ctrlPanel, BorderLayout.WEST);
		}
		else
		{
			setJMenuBar(menu);
			remove(ctrlPanel);
		}
	}

	/*!
		\e Purpose
			- Provides a system entry-point to the Application.
		\e Requirements
			- None
		\e Promise
			- Starts the Colony GUI, and makes it visible to
			  the user.
	*/
	public static void main( String[] args )
	{
		ColonyGui gui = new ColonyGui();
	}
}