package NJM;

import javax.swing.JOptionPane; 


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

}