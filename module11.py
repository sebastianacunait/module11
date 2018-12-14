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



    
    
