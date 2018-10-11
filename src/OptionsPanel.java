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

public class OptionsPanel extends JPanel
{
	public BasicOptionsPanel panelBasic;
	public JButton btnSave;
	public JButton btnChooseClr;
	public JButton btnLoadWalker;
	private ColonyGui gui;
	
	/*!
	\e Purpose
		- To initilise this class
		
	\e Requirements
		- None
		
	\e Promise
		- Adds buttons to this panel in an appropriate fashion.
	*/
	public OptionsPanel(ColonyGui gui_)
	{
		super();
		
		gui = gui_;
		setLayout(new GridLayout(2,1,2,2));
		
		panelBasic = new BasicOptionsPanel();
		add(panelBasic);
		
		btnSave = new JButton("Save!");
		btnChooseClr = new JButton("Choose Colours!");
		btnLoadWalker = new JButton("Load Walker Preset");
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout());
		btnPanel.add(btnSave);
		btnPanel.add(btnChooseClr);
		btnPanel.add(btnLoadWalker);
		add(btnPanel);
		
		repaint();
		validate();
	}
}
