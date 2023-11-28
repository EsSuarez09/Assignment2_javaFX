package com.example.assignment2_javafx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excel {

    // List to store numbers from input
    private ArrayList<Double> numbers;

//    public ExcelFile(ArrayList<Double> numbers) {
//        this.numbers = numbers;
//    }

    //Constructor that initializes the "numbers" list from a string of space-separated number
    public Excel(String numberString) {

        this.numbers = new ArrayList<>();

        //Split the input string into an array of strings
        String[] strNumArray = numberString.split(" ");

        // Convert the array to a list
        List<String> strNumList = Arrays.asList(strNumArray);

        // Create an ArrayList from the list
        ArrayList<String> strNumArrayList = new ArrayList<>(strNumList);

        // Iterate through the ArrayList, parse each string to double, and add to the "numbers" list
        strNumArrayList.forEach(strNum -> {

            try {

                double num = Double.parseDouble(strNum.trim());
                this.numbers.add(num);

            } catch (Exception e) {
                System.out.println("error" + e);
            }
        });
    }

    // Calculate and return the total sum of numbers in the "numbers' list
    public double findTotal() {
        double total = 0;

        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    //Calculate and return the average of numbers in the "numbers" list
    public double findAvg() {

        // Check if the list is empty to avoid division by zero
        if (numbers.isEmpty()) {
            return 0;
        }

        double avg = findTotal() / numbers.size();

        return avg;
    }

    // Find and return the maximum value in the "numbers" list
    public double findMax() {

        // Check if the list is empty to avoid errors
        if (numbers.isEmpty()) {
            return 0;
        }

        double max = numbers.get(0);

        // Iterate through the list to find the maximum value
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    // Find and return the minimum value in the "number" list
    public double findMin() {

        // Check if the list is empty to avoid errors
        if (numbers.isEmpty()) {
            return 0;
        }

        double min = numbers.get(0);

        // Iterate through the list to find the minimum value
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }
}