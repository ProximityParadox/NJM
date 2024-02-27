import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Arrays;

public class njm{

    private njm() {
        // This will prevent the instantiation of this class.
    }
    public static void write(Object text){
        System.out.println(text);
    }

    public static void print(Object text){
        System.out.print(text);
    }

    public static String query(Object text){
        return JOptionPane.showInputDialog(text);
    }

    public static void output(Object text){
        JOptionPane.showMessageDialog(null, text);
    }

    public static int verify(Object text){return JOptionPane.showConfirmDialog(null, text);}

    public static Object[] unsafearrayAppend(Object[] array, Object value_to_append) {
        int i = array.length;
        Object[] temporaryHoldingArray = new Object[i + 1];

        int index = 0;
        while (index < array.length) {
            temporaryHoldingArray[index] = array[index];
            index++;
        }

        temporaryHoldingArray[i] = value_to_append;

        return temporaryHoldingArray;
    }


    //generic array append. Cast to datatype when required
    public static <T> T[] arrayAppend(T[] array, T valueToAppend) {
        int length = array.length;
        T[] temporaryHoldingArray = Arrays.copyOf(array, length + 1);
        temporaryHoldingArray[length] = valueToAppend;
        return temporaryHoldingArray;
    }
    //this function generates an array
    public static int[] generate_array(int array_length, int max_number_to_be_generated){

        SecureRandom random = new SecureRandom();


        int array[] = new int[array_length];
        int ran;
        int i = 0;


        while(i<array_length){

            ran = random.nextInt(max_number_to_be_generated);
            array[i]= ran;
            i++;
        }

        return array;

    }


    //this function generates a 2 dimension array
    public static int[][] generate_2_dimensional_array(int first_array_length, int second_array_length, int first_max_number_to_be_generated, int second_max_number_to_be_generated){

        int array[][] = new int[first_array_length][second_array_length];

        SecureRandom random = new SecureRandom();


        int ran;
        int i = 0;
        int j = 0;

        while(i<first_array_length){

            ran = random.nextInt(first_max_number_to_be_generated);
            array[i][j] = ran;

            while(j<second_array_length){
                ran = random.nextInt(second_max_number_to_be_generated);
                array[i][j] = ran;
                j++;
            }
            j=0;
            i++;
        }

        return array;

    }

}