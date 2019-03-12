import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Type {


    public static void main(String[] args) throws Exception{

        FileInputStream fileInputStream = new FileInputStream("C:\\TEMP\\test2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\TEMP\\test3.txt");
               System.out.println(fileInputStream.available());
               byte [] buffer =  new byte[100];
        while (fileInputStream.available()>0){


            int count = fileInputStream.read(buffer);
            System.out.println(count);
            fileOutputStream.write(buffer,0,count);
//            for (byte array: buffer
//                 ) {
//                System.out.println(array);
//
//            }
//            System.out.println("iteration");


        }

        }


    }

