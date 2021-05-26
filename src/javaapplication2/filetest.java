/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.*;
import java.util.*;
import java.lang.*;

public class filetest {

private static File file;
private static BufferedReader counterReader = null;
private static BufferedReader fileReader = null;

public static void main(String[] args) throws FileNotFoundException, IOException {

        file = new File("input.txt");
        //counterReader = new BufferedReader(new FileReader("input.txt"));
       // Scanner input=new Scanner(new File("input.txt"));
        int myInstance = 0;
        String line = null;
            //while ((line = input.nextInt()) != null) {
              //  myInstance++;
            //}


            String[] first = new String[myInstance];

            int counter = 0;

            fileReader = new BufferedReader(new FileReader("input.txt"));

            while ((line = fileReader.readLine()) != null) {
                String[] temp = line.split(" ");

                first[counter] = temp[0];

                 System.out.println(first[counter]);
                counter++;

        }
}




 public static int avg(int[] numbers,int length) {
    int sum = 0;
    for (int i = 0; i < length; i++) {
        sum = (sum + numbers[i]);

    }
    return (sum / length);
}
}