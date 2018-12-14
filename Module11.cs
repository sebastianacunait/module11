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

using System;
					
public class Module11{
	
	private static int[] module11Sequence = new int[] {2,3,4,5,6,7};
	private static int[] test = new int[] {1,5,6,4,6,8,6,1};
	
	public static void Main(){
		double digit = getControlDigit(test);
		Console.WriteLine(digit);
	}
	
	public static double getControlDigit(int[] array){
		double[] multiplication = new double[test.Length];
		double sum = 0;
		int j = 0;
		int s = 0;
		for(int i= array.Length -1; i>=0; i--){
		    //Step 1
		    multiplication[j]= module11Sequence[s] * array[i];
		    //Step 2
		    sum = sum +multiplication[j];
		    s++;
		    j++;
		    // If the sequence reach 6 the cycle repeats
		    if(j % 6 == 0 && j!= 0){
			s = 0;
		    }
        	}
		double step3 = sum % 11;
		double step4 = 11 - step3;
        	return step4;
	}
	
}
