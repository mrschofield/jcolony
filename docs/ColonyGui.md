# Class ColonyGui [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java)  

<details>  
  <summary>  
    Show license  

  </summary>  
  <ul>  
jColony Copyright (c )2005-2006 Mathew Schofield All Rights Reserved. Distributed under the terms of LICENSE   </ul>  
</details>  

<br/>Access: public  
Parent class: JFrame  
Interfaces:  
- ActionListener  
- ColonyObserver  

package: com.schofield.jcolony  

## Dependencies

<details>  
  <summary>  
    Show dependencies  
  </summary>  
  <ul>  
<li>java.awt.*</li>
<li>java.awt.BorderLayout</li>
<li>java.awt.event.*</li>
<li>java.util.*</li>
<li>javax.swing.*</li>
  </ul>  
</details>  

## Member Variables

####  AboutPanel aboutBox  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

####  boolean UseControlPanel  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

####  ColonyCtlr ctrl  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

#### ColonyMenu menu [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

#### ColourPanel clrPanel [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

#### ControlPanel ctrlPanel [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

#### CulturePlate plate [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

####  int lagTime  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

####  int optionsOpen  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

#### OptionsPanel optionPanel [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

####  Preset preset  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

#### StatusPanel statusPanel [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L)

+ Access: private  

## Methods

### initialize [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L44)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - To  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| to | /*! \e Purpose - To initialize Frame - To add the various components | No description found |  
| components | /*! \e Purpose - To initialize Frame - To add the various components to frame \e Requirements - None \e Promise - Various | No description found |  
| frame | to be added to the | No description found |  
| ColonyGui | to be added to the frame | No description found |  


### actions [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L89)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - To accept user  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| "Start" | and to handle them accordingly. \e Requirements - An ActionEvent \e Promise - Instructs the CulturePlate to | No description found |  
| Specifications. | etc. according to the ActionEvent | No description found |  
| actionPerformed | etc. according to the ActionEvent Specifications. void | No description found |  
| e_ | ActionEvent | No description found |  


### updateStuff [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L111)

+ Description:   
+ Access: public  
+ return: void  

This method has no parameters.  


### necessary [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L146)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - To listen for Colony Status Changes \e Requirements - None \e Promise - To accept Colony Status Changes - To update the status bar as necessary - To update the culture plate as  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| colonyChanged | /*! \e Purpose - To listen for Colony Status Changes \e Requirements - None \e Promise - To accept Colony Status Changes - To update the status bar as necessary - To update the culture plate as necessary void | No description found |  


### panel [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L167)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Retuns the index of the currently open  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| optionsOpen | /*! \e Purpose - Retuns the index of the currently open panel int | No description found |  


### CulturePlate.pause [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L176)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Pauses the Life Generation Process by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| pause | void | No description found |  


### CulturePlate.reset [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L185)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Clears and resets the Colony by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| reset | void | No description found |  


### Options [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L195)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Saves the Current  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| save | /*! \e Purpose - Saves the Current Options void | No description found |  


### CulturePlate.start [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L222)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Starts the Generation Process by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| start | void | No description found |  


### valid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L234)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Converts a Colony state to a String representation \e Promise - Returns the string representation - Returns "Unknown" if the state is not  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| stateToString | /*! \e Purpose - Converts a Colony state to a String representation \e Promise - Returns the string representation - Returns "Unknown" if the state is not valid String | No description found |  
| state_ | int | No description found |  


### CulturePlate.step [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L255)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Steps through one Life Generation Process by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| step | void | No description found |  


### CulturePlate.stop [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L265)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Stops the Generation Process by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| stop | void | No description found |  


### known [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L281)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Converts a stop status to it's string representation \e Requirements - A valid stop status \e Promise - Returns a string representation - Returns "Unknown" if the stop status is not  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| stopStatusToString | /*! \e Purpose - Converts a stop status to it's string representation \e Requirements - A valid stop status \e Promise - Returns a string representation - Returns "Unknown" if the stop status is not known String | No description found |  
| stopStatus_ | int | No description found |  


### Index [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L312)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Toggles the Currently open Panel \e Requirements - A Panel  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| Plate | 1 - Culture | No description found |  
| Panel | 2 - Option | No description found |  
| Picker | 3 - Colour | No description found |  
| Box | 4 - About | No description found |  
| Repaints | \e Promise - Removes the current panel - Adds the selected panel - Repaints the selected panel - | No description found |  
| frame | \e Promise - Removes the current panel - Adds the selected panel - Repaints the selected panel - Repaints | No description found |  
| toggleOptions | \e Promise - Removes the current panel - Adds the selected panel - Repaints the selected panel - Repaints frame void | No description found |  
| i_ | int | No description found |  


### necessary [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L372)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - To listen for Colony Status Changes \e Requirements - None \e Promise - To accept Colony Status Changes - To update the status bar as necessary - To update the culture plate as  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| updateStatus | /*! \e Purpose - To listen for Colony Status Changes \e Requirements - None \e Promise - To accept Colony Status Changes - To update the status bar as necessary - To update the culture plate as necessary void | No description found |  


### ColonyCtlr.setWalkerPreset [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L388)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the current generation to the walker preset by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| Plate | - Repaints the Culture | No description found |  
| walkerPreset | - Repaints the Culture Plate void | No description found |  


### result [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L398)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Converts a string to an integer and returns the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| toInt | /*! \e Purpose - Converts a string to an integer and returns the result int | No description found |  
| text_ | String | No description found |  


### switchControlPanel [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L404)

+ Description:   
+ Access: public  
+ return: void  

This method has no parameters.  


### GUI [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyGui.java#L429)

+ Description:   
+ Access: public  
+ Modifiers: static 
+ return: /*! \e Purpose - Provides a system entry-point to the Application. \e Requirements - None \e Promise - Starts the Colony  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| user. | and makes it visible to the | No description found |  
| user. | and makes it visible to the | No description found |  
| main | and makes it visible to the user. void | No description found |  
| args | String[] | No description found |  


