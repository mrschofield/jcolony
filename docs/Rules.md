# Class Rules [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java)  

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

####  int maxBirth  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L)

+ Access: private  

####  int maxSurvival  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L)

+ Access: private  

####  int minBirth  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L)

+ Access: private  

####  int minSurvival  [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L)

+ Access: private  

## Methods

### die [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L29)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Controls whether the cell will  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| cell | or a new cell to be created. \e Requirements - Neighbours >= 0 \e Promise - Returns a | No description found |  
| applyRules | or a new cell to be created. \e Requirements - Neighbours >= 0 \e Promise - Returns a cell Cell | No description found |  
| cell_ | Cell | No description found |  
| neighbours_ | int | No description found |  


### None [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L49)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Minimum required Neighbours for Birth \e Requirements - None \e Promise -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setMinBirth | /*! \e Purpose - Sets the Minimum required Neighbours for Birth \e Requirements - None \e Promise - None void | No description found |  
| min_ | int | No description found |  


### None [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L62)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Minimum required Neighbours for Survival \e Requirements - None \e Promise -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setMinSurvival | /*! \e Purpose - Sets the Minimum required Neighbours for Survival \e Requirements - None \e Promise - None void | No description found |  
| min_ | int | No description found |  


### None [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L75)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Maximum allowed Neighbours for Birth \e Requirements - None \e Promise -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setMaxBirth | /*! \e Purpose - Sets the Maximum allowed Neighbours for Birth \e Requirements - None \e Promise - None void | No description found |  
| max_ | int | No description found |  


### None [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L88)

+ Description:   
+ Access: public  
+ return: /*! \e Purpose - Sets the Maximum allowed Neighbours for Survival \e Requirements - None \e Promise -  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| setMaxSurvival | /*! \e Purpose - Sets the Maximum allowed Neighbours for Survival \e Requirements - None \e Promise - None void | No description found |  
| max_ | int | No description found |  


### Birth [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L102)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Controls whether the cell is eligable for Birth \e Requirements - Neighbours >= Minimum for Birth - Neighbours <= Maximum for Birth \e Promise - Toggles the Cell if it is eligable for  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| birth | /*! \e Purpose - Controls whether the cell is eligable for Birth \e Requirements - Neighbours >= Minimum for Birth - Neighbours <= Maximum for Birth \e Promise - Toggles the Cell if it is eligable for Birth void | No description found |  
| cell_ | Cell | No description found |  
| neighbours_ | int | No description found |  


### Birth [[src]](https://github.com/mrschofield/jcolonyC:\Users\Mathew\src\jcolony\src\main\java\com\schofield\jcolony\Rules.java#L117)

+ Description:   
+ Access: private  
+ return: /*! \e Purpose - Controls whether the cell is eligable for Birth \e Requirements - Neighbours >= Minimum for Birth - Neighbours <= Maximum for Birth \e Promise - Toggles the Cell if it is eligable for  

| Name | Type | Description |  
| ----- | ----- | ----- |  
| survives | /*! \e Purpose - Controls whether the cell is eligable for Birth \e Requirements - Neighbours >= Minimum for Birth - Neighbours <= Maximum for Birth \e Promise - Toggles the Cell if it is eligable for Birth void | No description found |  
| cell_ | Cell | No description found |  
| neighbours_ | int | No description found |  


