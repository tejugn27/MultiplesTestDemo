package com.test;
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class MultiplesIterator {

    public static void main(String args[]) {
        // Assumptions: Iterate multiples of A value until X
        // for example if A=2 and X=5
        // output: 2 4 6 8 10

        // read input from command line
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer value for multiples(say A):");
        int multipleValue = in.nextInt();

        System.out.println("Enter an integer value that require multiples upto(say X):");
        int maxValue = in.nextInt();

        // closing scanner
        in.close();

        if (multipleValue == 0) {
            System.out.println("ERRR!!! Multiple Value should be a non-zero integer value");
            return;
        }
        if (maxValue <= 0) {
            System.out.println("ERRR!!! Max Interater Value should be greater than zero");
            return;
        }

        // Scenario 1: A until X
        performMultiplesIteration(multipleValue, maxValue);

        // Scenario 2: A + 1 until 2X
        int num = multipleValue + 1;
        if (num == 0) {
            System.out.println("\nScenario(A+1 until 2X) cannot be iterated, the multiple value returned:" + num);
        } else {
            performMultiplesIteration(num, 2 * maxValue);
        }

        // Scenario 3: A + 2 until 3X
        num = multipleValue + 2;
        if (num == 0) {
            System.out.println("\nScenario(A+2 until 3X) cannot be iterated, the multiple value returned:" + num);
        } else {
            performMultiplesIteration(num, 3 * maxValue);
        }
    }


    public static void performMultiplesIteration(int mulValue, int maxValue) {
        List<Integer> multiplesList = new ArrayList<>();
        for (int i = 1; i <= maxValue; i++) {
            int mul = mulValue * i;
            multiplesList.add(mul);
        }

        System.out.println("\nFollowing is the list of multiples of '" + mulValue +"' until '" + maxValue +"'");
        for (Integer n : multiplesList) {
            System.out.print(n + "\t");
        }
    }

}

