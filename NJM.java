package NJM;

import javax.swing.JOptionPane;


public class NJM{

    public static void write(double text){
        System.out.println(text);
    }


    public static String query(Object text){
       return JOptionPane.showInputDialog(text);
    }

}

