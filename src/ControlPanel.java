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

public class ControlPanel extends JPanel
{
	public JButton btnStart;
	public JButton btnStop;
	public JButton btnPause;
	public JButton btnReset;
	public JButton btnStep;
	public JButton btnOptions;
	public JButton btnLoadPreset;
	public JButton btnSavePreset;
	
	/*!
	\e Purpose
		- To initilize this class
		
	\e Requirements
		- None
		
	\e Promise
		- Adds start, step, stop, pause and reset buttons to this panel
		  in an appropriate fashion.
	*/
	public ControlPanel()
	{
		super();
		
		setLayout(new GridLayout(15,1,3,3));
		
		btnStart = new JButton(" Start ");
		btnStep  = new JButton(" Step  ");
		btnStop  = new JButton(" Stop  ");
		btnPause = new JButton(" Pause ");
		btnReset = new JButton(" Reset ");
		btnOptions = new JButton("Options");
		btnLoadPreset = new JButton("Load Preset");
		btnSavePreset = new JButton("Save Preset");
		
		add( btnStart );
		add( btnStep  );
		add( btnStop  );
		add( btnPause );
		add( btnReset );
		add( btnLoadPreset);
		add( btnSavePreset);
		add( btnOptions );
		
		validate();
	}
}