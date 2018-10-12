# Class Generation [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java)  

<details>  
  <summary>  
    Show license  

  </summary>  
  <ul>  
jColony Copyright (c )2005-2006 Mathew Schofield All Rights Reserved. Distributed under the terms of LICENSE   </ul>  
</details>  

<br/>Access: public  
package: com.schofield.jcolony  

## Dependencies

<details>  
  <summary>  
    Show dependencies  
  </summary>  
  <ul>  
  </ul>  
</details>  

## Member Variables

#### Cell[][] grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L)

+ Access: private  

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L)

+ Access: private  
+ Modifiers: 15 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L)

+ Access: private  
+ Modifiers: 16 

####   [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L)

+ Access: private  
+ Modifiers: 17 

## Methods

### width_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L28)

+ Description:   
+ Access: public  
+ return: Generation  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| height_ | int | No description found |  


### current_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L58)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Contructs the next generation based on  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| 10 | with the set rules. \e Requirements - Width and Height >= 10 \e Promise - If width or height < | No description found |  
| 10 | they = | No description found |  
| Generation | they = 10 | No description found |  
| current_ | Generation | No description found |  
| rules_ | Rules | No description found |  
| width_ | int | No description found |  
| height_ | int | No description found |  


### x [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L84)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the Cell at location  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| cellAt | y Cell | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### if [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L100)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Checks  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| equal | /*! \e Purpose - Checks if Generation is equal to another_ \e Requirements - None \e Promise - Returns true if they are | No description found |  
| otherwise. | false | No description found |  
| equals | false otherwise. boolean | No description found |  
| another_ | Generation | No description found |  


### grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L117)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the Width of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getWidth | /*! \e Purpose - Returns the Width of the grid int | No description found |  


### grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L126)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the Height of the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getHeight | /*! \e Purpose - Returns the Height of the grid int | No description found |  


### count [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L135)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Returns the current population  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| getPopulationCount | /*! \e Purpose - Returns the current population count int | No description found |  


### x_ [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L160)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Checks if a particular cell at  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| alive | y_ is alive \e Requirements - x_ and y_ are within the grid \e Promise - Returns true if the cell is | No description found |  
| grid. | and false otherwise. - Returns false if the cell is outside of the | No description found |  
| isAlive | and false otherwise. - Returns false if the cell is outside of the grid. boolean | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### neighbours [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L178)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Gets the number of neighbours near a selected cell \e Requirements - x_ and y_ are within the grid \e Promise - Returns number of  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| neighbours | /*! \e Purpose - Gets the number of neighbours near a selected cell \e Requirements - x_ and y_ are within the grid \e Promise - Returns number of neighbours int | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L206)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Places a particular cell at x_ and y_ \e Requirements - x_ and y_ are within the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| placeCellAt | /*! \e Purpose - Places a particular cell at x_ and y_ \e Requirements - x_ and y_ are within the grid void | No description found |  
| cell_ | Cell | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### Resizes [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L218)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| 10 | /*! \e Purpose - Resizes Generation with width_ and height_ \e Requirements - width_ and height_ >= | No description found |  
| setSize | /*! \e Purpose - Resizes Generation with width_ and height_ \e Requirements - width_ and height_ >= 10 void | No description found |  
| width_ | int | No description found |  
| height_ | int | No description found |  


### grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L251)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Toggles a cell at x_ and y_ \e Requirements - x_ and y_ are within the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| toggleCell | /*! \e Purpose - Toggles a cell at x_ and y_ \e Requirements - x_ and y_ are within the grid void | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


### grid [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Generation.java#L265)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Checks if the co-ordiantes are within the grid \e Requirements - None \e Promise - Returns true if they are within the  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| otherwise | false | No description found |  
| withinGrid | false otherwise boolean | No description found |  
| x_ | int | No description found |  
| y_ | int | No description found |  


