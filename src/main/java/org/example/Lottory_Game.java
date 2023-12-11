package org.example;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Lottory_Game {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rand = new Random();
        // Create an ArrayList to store the drawn numbers
        ArrayList<Integer> drawnNumbers = new ArrayList<>();
        // Generate 6 random numbers from 1 to 49 and add them to the ArrayList
        for (int i = 0; i < 6; i++) {
            int drawnNumber = rand.nextInt(49) + 1;
            while (drawnNumbers.contains(drawnNumber)) {
                drawnNumber = rand.nextInt(49) + 1;
            }
            drawnNumbers.add(drawnNumber);
        }
        // Sort the ArrayList in ascending order
        Collections.sort(drawnNumbers);
        // Display the drawn numbers
        System.out.println("The drawn numbers are: "+ drawnNumbers);
    }
}
