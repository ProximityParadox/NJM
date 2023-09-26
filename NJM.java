package NJM;

import javax.swing.JOptionPane; 

import java.security.SecureRandom;


public class NJM{

    public static void write(Object text){
        System.out.println(text);
    }

    public static void print(Object text){
        System.out.print(text);
    }

    public static String query(Object text){
       return JOptionPane.showInputDialog(text);
    }


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
    
    public static int[] arrayAppend(int[] array, int value_to_append){
        int i = array.length;
        int[] temporaryHoldingArray = new int[i + 1];
        
        int index = 0;
        while (index < array.length) {
            temporaryHoldingArray[index] = array[index];
            index++;
        }
        
        temporaryHoldingArray[i] = value_to_append;
        
        return temporaryHoldingArray;
    }

    public static long[] arrayAppend(long[] array, long value_to_append){
        int i = array.length;
        long[] temporaryHoldingArray = new long[i + 1];
        
        int index = 0;
        while (index < array.length) {
            temporaryHoldingArray[index] = array[index];
            index++;
        }
        
        temporaryHoldingArray[i] = value_to_append;
        
        return temporaryHoldingArray;
    }

    public static double[] arrayAppend(double[] array, double value_to_append){
        int i = array.length;
        double[] temporaryHoldingArray = new double[i + 1];
        
        int index = 0;
        while (index < array.length) {
            temporaryHoldingArray[index] = array[index];
            index++;
        }
        
        temporaryHoldingArray[i] = value_to_append;
        
        return temporaryHoldingArray;
    }

    public static String[] arrayAppend(String[] array, String value_to_append){
        int i = array.length;
        String[] temporaryHoldingArray = new String[i + 1];
        
        int index = 0;
        while (index < array.length) {
            temporaryHoldingArray[index] = array[index];
            index++;
        }
        
        temporaryHoldingArray[i] = value_to_append;
        
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