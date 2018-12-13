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
|**Number test** |      1                        |      5                      |6 |4 |6 |8 |6| 1| 
|**Sequence**    |   2                           |   3                         |4 |5 |6 | 7| 2|3|
|**RESULT**      |**2**                          |**15**                       |**24** |**20** |**36**|**56** |**12** |**3**|




## Step 2 - Sum all results

$$2+15+24+20+36+56+12+3=168$$




## Step 3 - Calculate module 11

$$ 168 mod 11 = 3$$ 




## Step 4 - Subtract 11 to result

$$11- 3= 8$$**That means the control digit it is 8.**
> If we change a number of the test sequenece 15646861 the control digit will change




## Notes
  
The application of this algorithm is varied, from barcode to identification cards of Chile where sometimes we will see a K or a 0 instead of the digit 11 and 10.
