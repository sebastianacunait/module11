
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
