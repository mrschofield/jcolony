/*
	jColony
	
	Copyright (c) 2005-2006 Mathew Schofield
	All Rights Reserved.
	
	Distributed under the terms of LICENSE.TXT
*/

import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.io.*;

public class Preset
{
	private RandomAccessFile rFile;
	
	public Preset()
	{
		//
	}
	
	
	
	public Generation loadGeneration(String file_)
	{
		try {
			byte[] data = new byte[1024];
			rFile = new RandomAccessFile(file_, "r");
			
			//rFile.readLine();
			
			String width_ = rFile.readLine();
			String height_ = rFile.readLine();
			
			if (width_ == null || height_ == null)
				return null;
			
			int width = Integer.parseInt( width_ );
			int height = Integer.parseInt( height_ );
			
			Generation tmpGen = new Generation(width, height);
			
			String nextLine = rFile.readLine();
			while (nextLine != null)
			{
				String[] cords = nextLine.split(":");
				
				if (cords.length < 2)
					return null; // File is corrupt
				
				tmpGen.toggleCell( Integer.parseInt( cords[0] ), Integer.parseInt( cords[1] ) );
				
				nextLine = rFile.readLine();
			}
			
			rFile.close();
			
			return tmpGen;
		}
		catch (IOException e_)
		{
			//
		}
		
		return null;
	}
	
	
	
	public boolean saveGeneration(String file_, Generation gen_)
	{
	
		if (file_ == null)
			return false;
		
		if (gen_ == null)
			return false;

		try {
			rFile = new RandomAccessFile(file_, "rw");
			
			String width = Integer.toString(gen_.getWidth());
			String height = Integer.toString(gen_.getHeight());
			
			//rFile.writeChars(gen_.getWidth() + "");
			//rFile.writeChars(gen_.getHeight() + "");
			
			rFile.writeUTF(width);
			rFile.writeUTF(height);
			
			System.out.println(gen_.getWidth());
			System.out.println(gen_.getHeight());
			
			for (int x = 0 ; x < gen_.getWidth() ; x++)
			{
				for (int y = 0 ; y < gen_.getHeight() ; y++)
				{
					if (gen_.isAlive(x,y))
					{
						rFile.writeUTF(x + ":" + y);
						System.out.println(x + ":" + y);
					}
				}
			}
			
			rFile.close();
			
			return true;
		}
		catch (IOException e_)
		{
			//
		}
		
		return false;
	}
}