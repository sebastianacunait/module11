# Module 11

What it is Module11 well, module11 it is a mathematical algorithm for check errors in a sequence of numbers. Do you wanna know more? please visit this links 

 - [Module 11 - External Link](http://www.pgrocer.net/Cis51/mod11.html)
 - [Check Digit - Wikipedia](https://en.wikipedia.org/wiki/Check_digit)
 - [Code Bar Implementation -Wikipedia ](https://en.wikipedia.org/wiki/Codabar)

# How does it work?

The algorithm consist in four steps

 1. **Multiply digits with the sequence**
 2. **Sum all results**
 3. **Calculate module 11**
 4. **Subtract 11 to result**
 
 **Sequence    ->**  [ 2 , 3 , 4 , 5 , 6 , 7 ]





## Step 1 - Multiply digits with the sequence

|                |                               |                             | | | | | | |
|----------------|-------------------------------|-----------------------------|-|-|-|-|-|-|
|**Number test** |   1                           |   5                         |6 |4 |6 |8 |6| 1| 
|**Sequence**    |   3                           |   2                         |7 |6 |5 |4 |3| 2|
|**RESULT**      |**3**                          |**10**                       |**42** |**24** |**30**|**32** |**18** |**2**|

> If the length of the test sequence is less than the sequence, just repeat the sequence, in this case we repeat 2 and 3.




## Step 2 - Sum all results
3 + 10 + 42 + 24 + 30 + 32 + 18 + 2 = **161**




## Step 3 - Calculate module 11
 **161** mod 11 = **7** 




## Step 4 - Subtract 11 to result

11 - **7** = **4**

**That means the control digit is 4.**
> If we change a number of the test sequenece 15646861 the control digit will change




## Notes
  
The application of this algorithm is varied, from barcode to identification cards of Chile where sometimes we will see a K or a 0 instead of the digit 10 and 11.
