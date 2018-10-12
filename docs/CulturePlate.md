# Class CulturePlate [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java)  

<details>  
  <summary>  
    Show license  

  </summary>  
  <ul>  
jColony Copyright (c )2005-2006 Mathew Schofield All Rights Reserved. Distributed under the terms of LICENSE   </ul>  
</details>  

<br/>Access: public  
Parent class: JPanel  
package: com.schofield.jcolony  

## Dependencies

<details>  
  <summary>  
    Show dependencies  
  </summary>  
  <ul>  
<li>java.awt.*</li>
<li>java.awt.event.*</li>
<li>java.util.*</li>
<li>javax.swing.*</li>
<li>javax.swing.border.*</li>
  </ul>  
</details>  

## Member Variables

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: package-private  
+ Modifiers: 22 

#### CellShape[][] cells [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  
+ Modifiers: 25 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  
+ Modifiers: 26 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  
+ Modifiers: 27 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  
+ Modifiers: 28 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  
+ Modifiers: 29 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L)

+ Access: private  
+ Modifiers: 30 

## Methods

### String[] [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L20)

+ Description:   
+ Access: public  
+ Modifiers: static final 
+ return: String[] SHAPES = new  

This method has no parameters.  


### ctrl_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L41)

+ Description:   
+ Access: public  
+ return: CulturePlate  

This method has no parameters.  


### Colony [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L59)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - To initilize the culture plate \e Requirements - The Number of Cells in the X plane - The Number of Cells in teh Y plane - A  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| Cells | /*! \e Purpose - To initilize the culture plate \e Requirements - The Number of Cells in the X plane - The Number of Cells in teh Y plane - A Colony \e Promise - Creates a plate with the specificed number of | No description found |  
| CulturePlate | /*! \e Purpose - To initilize the culture plate \e Requirements - The Number of Cells in the X plane - The Number of Cells in teh Y plane - A Colony \e Promise - Creates a plate with the specificed number of Cells | No description found |  
| ctrl_ | ColonyCtlr | No description found |  
| xCells_ | int | No description found |  
| yCells_ | int | No description found |  


### Colony [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L77)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - To initilize the culture plate \e Requirements - The Number of Cells in the X plane - The Number of Cells in teh Y plane - A  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| Cells | /*! \e Purpose - To initilize the culture plate \e Requirements - The Number of Cells in the X plane - The Number of Cells in teh Y plane - A Colony \e Promise - Creates a plate with the specificed number of | No description found |  
| CulturePlate | /*! \e Purpose - To initilize the culture plate \e Requirements - The Number of Cells in the X plane - The Number of Cells in teh Y plane - A Colony \e Promise - Creates a plate with the specificed number of Cells | No description found |  
| ctrl_ | ColonyCtlr | No description found |  
| xCells_ | int | No description found |  
| yCells_ | int | No description found |  
| cellShape_ | String | No description found |  


### objects [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L96)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Sets up the Culture Plate for the first time \e Requirements - None \e Promise - Creates the array of Cells / Cell  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| initPlate | /*! \e Purpose - Sets up the Culture Plate for the first time \e Requirements - None \e Promise - Creates the array of Cells / Cell objects void | No description found |  


### DIRECTLY [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L136)

+ Description:   
+ Access: public  
+ return: /*! \brief DO NOT CALL THIS METHOD  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| repaint | instead call | No description found |  
| CulturePlate | \e Purpose - Paints the | No description found |  
| plate | and all cells on it. \e Requirements - A Graphics Context to paint to. \e Promise - Paints the CulturePlate - Paints the cells to the culture | No description found |  
| paint | and all cells on it. \e Requirements - A Graphics Context to paint to. \e Promise - Paints the CulturePlate - Paints the cells to the culture plate void | No description found |  
| g_ | Graphics | No description found |  


### method [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L150)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Pauses the Colony Model \e Promise - Runs the Model's pause  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| pause | /*! \e Purpose - Pauses the Colony Model \e Promise - Runs the Model's pause method void | No description found |  


### method [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L161)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Resets the Colony Model \e Promise - Runs the Model's reset  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| reset | /*! \e Purpose - Resets the Colony Model \e Promise - Runs the Model's reset method void | No description found |  


### objects [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L174)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Sets up the Culture Plate for the first time \e Requirements - None \e Promise - Creates the array of Cells / Cell  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| resize | /*! \e Purpose - Sets up the Culture Plate for the first time \e Requirements - None \e Promise - Creates the array of Cells / Cell objects void | No description found |  


### Colours [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L206)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Updates each Cell with the new  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setColor | /*! \e Purpose - Updates each Cell with the new Colours void | No description found |  
| borderColor_ | Color | No description found |  
| aliveColor_ | Color | No description found |  
| enteredColor_ | Color | No description found |  
| deadColor_ | Color | No description found |  


### method [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L226)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Starts the Colony Model \e Promise - Runs the Model's start  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| start | /*! \e Purpose - Starts the Colony Model \e Promise - Runs the Model's start method void | No description found |  


### method [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L237)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Steps through one Life Generation Process in the Colony Model \e Promise - Runs the Model's step  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| step | /*! \e Purpose - Steps through one Life Generation Process in the Colony Model \e Promise - Runs the Model's step method void | No description found |  


### method [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L248)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Stops the Colony Model \e Promise - Runs the Model's stop  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| stop | /*! \e Purpose - Stops the Colony Model \e Promise - Runs the Model's stop method void | No description found |  


### found [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CulturePlate.java#L260)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Converts a CellShape's name to an index number \e Promise - Returns an index number - Returns 0 if the shape could not be  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| switchCellShape | /*! \e Purpose - Converts a CellShape's name to an index number \e Promise - Returns an index number - Returns 0 if the shape could not be found int | No description found |  
| cellShape_ | String | No description found |  


