# Class CellShape [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java)  

<details>  
  <summary>  
    Show license  

  </summary>  
  <ul>  
jColony Copyright (c )2005-2006 Mathew Schofield All Rights Reserved. Distributed under the terms of LICENSE   </ul>  
</details>  

<br/>Access: public  
Parent class: JComponent  
Interfaces:  
- MouseListener  

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
  </ul>  
</details>  

## Member Variables

####  ColonyCtlr ctrl  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: private  

####  boolean overMe  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

####  boolean state  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

####  Color aliveColor  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

####  Color borderColor  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

####  Color deadColor  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

####  Color enteredColor  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

#### int h [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

#### int iamX [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

#### int iamY [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

#### int w [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L)

+ Access: protected  

## Methods

### ctrl_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L32)

+ Description:   
+ Access: public  
+ return: CellShape  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| w_ | int | No description found |  
| h_ | int | No description found |  
| iamX_ | int | No description found |  
| iamY_ | int | No description found |  


### Draws [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L55)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| error. | /*! \e Purpose - Draws cell onto the selected graphics context \e Requirements - A Graphics context to draw to \e Promise - Draws to the context. - Returns early if there was an | No description found |  
| paint | /*! \e Purpose - Draws cell onto the selected graphics context \e Requirements - A Graphics context to draw to \e Promise - Draws to the context. - Returns early if there was an error. void | No description found |  
| g_ | Graphics | No description found |  


### To [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L76)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| min_ | /*! \e Purpose - To a random number between min_ and max_ inclusively. \e Requirements - A minimum number. - A maximum number. \e Promise - Returns a number that is lower or equal to max_ and above or equal to | No description found |  
| getRandom | /*! \e Purpose - To a random number between min_ and max_ inclusively. \e Requirements - A minimum number. - A maximum number. \e Promise - Returns a number that is lower or equal to max_ and above or equal to min_ int | No description found |  
| min_ | int | No description found |  
| max_ | int | No description found |  


### Draws [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L98)

+ Description:   
+ Access: protected  
+ return: /*! \e Purpose -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| error. | /*! \e Purpose - Draws cell onto the selected graphics context \e Requirements - A Graphics context to draw to \e Promise - Draws to the context. - Returns early if there was an | No description found |  
| draw | /*! \e Purpose - Draws cell onto the selected graphics context \e Requirements - A Graphics context to draw to \e Promise - Draws to the context. - Returns early if there was an error. void | No description found |  
| g_ | Graphics | No description found |  


### otherwise. [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L123)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Calculates if the co-ordinates are inside the shape \e Requirements - X and Y Co-Ordinates \e Promise - Calculates and returns true if they are in bounds - Returns false if  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| inBounds | /*! \e Purpose - Calculates if the co-ordinates are inside the shape \e Requirements - X and Y Co-Ordinates \e Promise - Calculates and returns true if they are in bounds - Returns false if otherwise. boolean | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### Event [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L132)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Accepts a Mouse Pressed  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| mousePressed | /*! \e Purpose - Accepts a Mouse Pressed Event void | No description found |  
| e_ | MouseEvent | No description found |  


### Event [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L141)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Accepts a Mouse Exited  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| mouseExited | /*! \e Purpose - Accepts a Mouse Exited Event void | No description found |  
| e_ | MouseEvent | No description found |  


### Event [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L152)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Accepts a Mouse Entered  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| mouseEntered | /*! \e Purpose - Accepts a Mouse Entered Event void | No description found |  
| e_ | MouseEvent | No description found |  


### Event [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L170)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Accepts a Mouse Released  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| mouseReleased | /*! \e Purpose - Accepts a Mouse Released Event void | No description found |  
| e_ | MouseEvent | No description found |  


### Event [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L178)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Accepts a Mouse Clicked  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| mouseClicked | /*! \e Purpose - Accepts a Mouse Clicked Event void | No description found |  
| e_ | MouseEvent | No description found |  


### Cells [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L186)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Colour of Alive  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setAliveColor | /*! \e Purpose - Sets the Colour of Alive Cells void | No description found |  
| color_ | Color | No description found |  


### border [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L196)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Colour of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setBorderColor | /*! \e Purpose - Sets the Colour of the border void | No description found |  
| color_ | Color | No description found |  


### Cells [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L206)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Colour of Dead  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setDeadColor | /*! \e Purpose - Sets the Colour of Dead Cells void | No description found |  
| color_ | Color | No description found |  


### is [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L216)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Active cell colour in terms of where the mouse  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setEnteredColor | /*! \e Purpose - Sets the Active cell colour in terms of where the mouse is void | No description found |  
| color_ | Color | No description found |  


### Cell [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L226)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Height of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setHeight | /*! \e Purpose - Sets the Height of the Cell void | No description found |  
| h_ | int | No description found |  


### Cell [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L237)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the state of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setState | /*! \e Purpose - Sets the state of the Cell boolean | No description found |  
| state_ | boolean | No description found |  


### Cell [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L247)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the width of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setWidth | /*! \e Purpose - Sets the width of the Cell void | No description found |  
| w_ | int | No description found |  


### Repaints [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\CellShape.java#L258)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Toggles the model of the cells state -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| cell | /*! \e Purpose - Toggles the model of the cells state - Repaints | No description found |  
| toggle | /*! \e Purpose - Toggles the model of the cells state - Repaints cell void | No description found |  


