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
