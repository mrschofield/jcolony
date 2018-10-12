# Class ColonyCtlr [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java)  

<details>  
  <summary>  
    Show license  

  </summary>  
  <ul>  
jColony Copyright (c )2005-2006 Mathew Schofield All Rights Reserved. Distributed under the terms of LICENSE   </ul>  
</details>  

<br/>Access: public  
Parent class: ColonyNotifier  
Interfaces:  
- Runnable  

package: com.schofield.jcolony  

## Dependencies

<details>  
  <summary>  
    Show dependencies  
  </summary>  
  <ul>  
<li>java.util.*</li>
  </ul>  
</details>  

## Member Variables

####  int STOPPED  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: public  
+ Modifiers: static final 

####  int PAUSED  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: public  
+ Modifiers: static final 

####  int STEPPING  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: public  
+ Modifiers: static final 

####  int RUNNING  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: public  
+ Modifiers: static final 

#### boolean active [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: private  

####  boolean waiting  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: private  

#### Colony colony [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: private  

#### int state [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: private  

####  Thread colonyThread  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: private  
+ Modifiers: volatile 

####  boolean threadSuspended  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L)

+ Access: private  

## Methods

### 10 [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L37)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Creates a new colony and sets state to STOPPED \e Requirements - Width and Height >= 10 \e Promise - If width or height <  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| 10 | they = | No description found |  
| ColonyCtlr | they = 10 | No description found |  
| cObserver_ | ColonyObserver | No description found |  
| width_ | int | No description found |  
| height_ | int | No description found |  


### colony.initialise [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L59)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Calls  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| STOPPED | which will clear the history and set the stopStatus to dead - Sets the state to | No description found |  
| clear | which will clear the history and set the stopStatus to dead - Sets the state to STOPPED void | No description found |  


### colony.generateNext [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L70)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Generates the next generation by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| change | - Alerts the Colony of a | No description found |  
| generateNext | - Alerts the Colony of a change void | No description found |  


### generations [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L80)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the number of  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getGenerationNumber | /*! \e Purpose - Returns the number of generations int | No description found |  


### generations [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L89)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the maximum number of  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getMaxGen | /*! \e Purpose - Returns the maximum number of generations int | No description found |  


### generation [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L98)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the population count of the current  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getPopulationCount | /*! \e Purpose - Returns the population count of the current generation int | No description found |  


### getRules [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L103)

+ Description:   
+ Access: public  
+ return: Rules  

This method has no parameters.  


### colony [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L112)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the state of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getState | /*! \e Purpose - Returns the state of the colony int | No description found |  


### colony [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L121)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the stopStatus of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getStopStatus | /*! \e Purpose - Returns the stopStatus of the colony int | No description found |  


### x_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L137)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Check the state of the Cell at location x_ and y_ in the generation \e Requirements - x_ and y_ >= 0 - x < width - y < height \e Promise - Return the state of the cell - Returns false if  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| grid | y_ is not in the | No description found |  
| isAlive | y_ is not in the grid boolean | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### successful [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L149)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Loads the selected preset as the current generation \e Promise - Return true if it was  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| successful | false otherwise - Notifies the Colony of a change if | No description found |  
| loadPreset | false otherwise - Notifies the Colony of a change if successful boolean | No description found |  
| filename_ | String | No description found |  


### process [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L163)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Pauses the Generation  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| pause | /*! \e Purpose - Pauses the Generation process void | No description found |  


### Colony [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L172)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Runs the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| run | /*! \e Purpose - Runs the Colony void | No description found |  


### colony.setMaxGen [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L226)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the maximum number of generations to max_ by calling  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| 0 | \e Requirements - max_ > 0 \e Promise - if max_ <= | No description found |  
| The | max_ = | No description found |  
| The | max_ = | No description found |  
| setMaxGen | max_ = The void | No description found |  
| max_ | int | No description found |  


### successful [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L237)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Exports the current generation to a file \e Promise - Return true if it was  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| otherwise | false | No description found |  
| savePreset | false otherwise boolean | No description found |  
| filename_ | String | No description found |  


### grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L246)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the size of the Cell  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setSize | /*! \e Purpose - Sets the size of the Cell grid boolean | No description found |  
| width_ | int | No description found |  
| height_ | int | No description found |  


### generation [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L255)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Loads the walker preset as the current  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setWalkerPreset | /*! \e Purpose - Loads the walker preset as the current generation void | No description found |  


### colonyThread [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L265)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets state to RUNNING - Starts the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| start | /*! \e Purpose - Sets state to RUNNING - Starts the colonyThread void | No description found |  


### running [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L276)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Starts the colony's thread if it is not already running - interrupts the thread if it is already  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| startThread | /*! \e Purpose - Starts the colony's thread if it is not already running - interrupts the thread if it is already running void | No description found |  


### colonyThread [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L289)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets state to STEPPING - Starts the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| step | /*! \e Purpose - Sets state to STEPPING - Starts the colonyThread void | No description found |  


### STOPPED [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L298)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets state to  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| stop | /*! \e Purpose - Sets state to STOPPED void | No description found |  


### x_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\ColonyCtlr.java#L312)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Toggles the state of the cell in the current generation at position  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| colony.toggleCell | y_ by calling | No description found |  
| height | \e Requirements - x_ and y_ >= 0 - x < width - y < | No description found |  
| toggleCell | \e Requirements - x_ and y_ >= 0 - x < width - y < height void | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


