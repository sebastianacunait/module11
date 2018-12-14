'''
  The MIT License
  Copyright (c) 2014-2016 Ilkka Seppälä
 
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, andor sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
 
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.
 
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
 '''
 

# Example of Module 11

module11Sequence = [2,3,4,5,6,7]
testS = [1,5,6,4,6,8,6,1]

class Module11:
    
    def __init__(self,array):
        self.test = array
    
    def getControlDigit(self):
        multiplication = []
        totalsum = 0
        j = 0
        s = 0
        self.test.reverse()
        # loop inverse the sequence
        for index, item in enumerate(self.test):
            # step 1
            multiplication.append(module11Sequence[s] * item)
            # step 2
            totalsum +=  multiplication[index]
            s = s + 1
            j = j + 1
            # If the sequence reach 6 the cycle repeats
            if j % 6 == 0 and j != 0:
                s = 0;
        step3 = totalsum % 11
        step4 = 11 - step3
        return step4
        
module = Module11(testS)
digit = module.getControlDigit()
print digit



    
    
