package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaExceptionDemo {

    //Checked Exception

//    public static void main(String[] args) throws FileNotFoundException {
//
//        FileInputStream fis = new FileInputStream("./src/Files/data1.properties");
//    }

    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("./src/Files/data1.properties");
//        } catch (FileNotFoundException e) {
//            //throw new RuntimeException(e);
//            System.out.println("The file which your are looking is not available.");
//        }

        //UnChecked Exception
        try {
            int i = 2 / 0;
            System.out.println("The value of i is :" + i);
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }
    }

}
