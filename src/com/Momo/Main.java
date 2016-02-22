package com.Momo;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

       //The code below define and array with length of hundred
        int[] myarray = new int[100];
        //An Arraylist that is add the numberOfHouses
        ArrayList numberOfHouses = new ArrayList();
        //An ArrayList that add the number of crates
        ArrayList<Integer> crates = new ArrayList<Integer>();
        FileReader reader;
        BufferedReader finalRead;

        int maxval = 9; // A variable that store the maximum number of the recyclingreportstreet.txt
        try {
            reader = new FileReader("recyclingreport-mainstree.txt");
            finalRead = new BufferedReader(reader);
            String line = finalRead.readLine();
            int j = 0;
            while (line != null) {

                String[] u = line.split(" ");
                String ab = u[1];
                String b = u[3];
                int a = Integer.parseInt(ab);
                int cd = Integer.parseInt(b);
                myarray[a] = cd;
                if (myarray[a] == maxval) {
                    crates.add(myarray[a]);
                    numberOfHouses.add(a);
                }

                // System.out.println(line);

                line = finalRead.readLine();

            }
        }catch (IOException e){
            System.out.println("File not found");
        }

        System.out.println(crates);
        System.out.println(numberOfHouses);
        //The code below  the number of houses and the number of crates each house recycle
        System.out.println("Houses that recycle the most are listed below:\n");
        try {


            for (int w = 0; w < 11; w++) {
                System.out.println("House number " + numberOfHouses.get(w) + " recycle " + crates.get(w) + " crates");
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        System.out.print("Code is still runing");

        }
}



