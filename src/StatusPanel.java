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

public class StatusPanel extends JPanel
{
	public JLabel lblNumGens;
	public JLabel lblPopulation;
	public JLabel lblState;
	public JLabel lblStopStatus;
	
	private JLabel lblTitleNumGens;
	private JLabel lblTitlePopulation;
	private JLabel lblTitleState;
	private JLabel lblTitleStopStatus;
	
	/*!
	\e Purpose
		- Sets up the Panel and adds Components
		
	\e Requirements
		- None
		
	\e Promise
		- None
	*/
	public StatusPanel()
	{
		super();
		
		lblTitleNumGens		= new JLabel("Num. Generations: ");
		lblTitlePopulation	= new JLabel("Population: ");
		lblTitleState		= new JLabel("State: ");
		lblTitleStopStatus	= new JLabel("Stop Status: ");
		
		lblNumGens			= new JLabel("?");
		lblPopulation		= new JLabel("?");
		lblState			= new JLabel("?");
		lblStopStatus		= new JLabel("?");
		
		add(lblTitleNumGens);
		add(lblNumGens);
		add(lblTitlePopulation);
		add(lblPopulation);
		add(lblTitleState);
		add(lblState);
		add(lblTitleStopStatus);
		add(lblStopStatus);
		
		Font font;
		font = new Font("Georgia", 0, 10);
		
		lblTitleNumGens.setFont(font);
		lblTitlePopulation.setFont(font);
		lblTitleState.setFont(font);
		lblTitleStopStatus.setFont(font);
		
		font = new Font("Georgia", 3, 12);
		
		lblNumGens.setFont(font);
		lblPopulation.setFont(font);
		lblState.setFont(font);
		lblStopStatus.setFont(font);
		
		validate();
	}
	
	
	
	/*!
	\e Purpose
		- Sets the Number of Generations
		
	\e Requirements
		- The current generation number.
		
	\e Promise
		- Updates the status panel, with the new number of
		  generations as specified.
	*/
	public void setNumGens( int numGens_ )
	{
		setNumGens(Integer.toString(numGens_));
	}
	
	
	
	/*!
	\e Purpose
		- Sets the Number of Generations
		
	\e Requirements
		- The current generation number.
		
	\e Promise
		- Updates the status panel, with the new number of
		  generations as specified.
	*/
	public void setNumGens( String numGens_ )
	{
		this.lblNumGens.setText(numGens_);
	}
	
	
	
	/*!
	\e Purpose
		- Sets the Population
		
	\e Requirements
		- The current population
		
	\e Promise
		- Updates the status panel, with the new population
		  as specified.
	*/
	public void setPopulation( int population_ )
	{
		setPopulation(Integer.toString(population_));
	}
	
	
	
	/*!
	\e Purpose
		- Sets the Population
		
	\e Requirements
		- The current population
		
	\e Promise
		- Updates the status panel, with the new population
		  as specified.
	*/
	public void setPopulation( String population_ )
	{
		this.lblPopulation.setText(population_);
	}
	
	
	
	/*!
	\e Purpose
		- Sets the State
		
	\e Requirements
		- The current Colony State
		
	\e Promise
		- Updates the status panel, with the new state
		  as specified.
	*/
	public void setState( String state_ )
	{
		this.lblState.setText(state_);
	}
	
	
	
	/*!
	\e Purpose
		- Sets the StopStatus
		
	\e Requirements
		- The current StopStatus
		
	\e Promise
		- Updates the status panel, with the new StopStatus
		  as specified.
	*/
	public void setStopStatus( String stopStatus_ )
	{
		this.lblStopStatus.setText(stopStatus_);
	}
}