/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import java.text.DecimalFormat;

/**
 *
 * @author Sebastian Acuña
 */
 
public final class Module11 {
    
    private final static int[] module11Sequence = {2,3,4,5,6,7};
    private final static double[] test = {1,5,6,4,6,8,6,1};
    
    /**
     * 
     * Get control digit with Module 11 algorithm for a sequence of numbers
     * 
     * @param testsequence
     * @return 
     */
    public static Integer getControlDigit(double[] testsequence){
        
        // Initialize variables
        double[] multiplication = new double[testsequence.length];
        double sum = 0;
        int j=0;
        int s=0;
        // Loop inverted sequence
        for(int i= testsequence.length -1; i>=0; i--){
            //Step 1
            multiplication[j]= module11Sequence[s] * testsequence[i];
            System.out.println(multiplication[j]);
            //Step 2
            sum = sum +multiplication[j];
            s++;
            j++;
            // If the sequence reach 6 the cycle repeats
            if(j % 6 == 0 && j!= 0){
                s = 0;
            }
        }
        System.out.println("sum: "+sum);
        double step3 = sum % 11;
        System.out.println("step 3: "+step3);
        double step4 = 11 - step3;
        System.out.println("step 4: "+step4);
        DecimalFormat df = new DecimalFormat("###.#");
        String digito = df.format(step4);
        return new Integer(digito);
    }
    
    public static void main(String[] args) {
        Integer digit = getControlDigit(test);
        System.out.println("digit: "+digit);
    }
    
}
