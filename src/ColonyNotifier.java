/*
	jColony
	
	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.
	
	Distributed under the terms of LICENSE.TXT
*/

public class ColonyNotifier
{
	private ColonyObserver cObserver;
	
	/*!
		\e Purpose
			- Initialises the notifier with a colony observer
	*/
	public ColonyNotifier(ColonyObserver cObserver_)
	{
		cObserver = cObserver_;
	}
	
	
	
	/*!
		\e Purpose
			- Alerts the Observer of a Change in the Model (Colony)
	*/
	public void colonyChanged()
	{
		cObserver.colonyChanged();
	}
}
			