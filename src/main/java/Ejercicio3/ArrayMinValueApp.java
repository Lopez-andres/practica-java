package Ejercicio3;

import javax.swing.*;
import java.util.Arrays;

/**
 * This class reads a set of integers from the user, sorts them,
 * and shows the smallest value.
 */
public class ArrayMinValueApp {
    public static void main(String[] args) {
        try {
            int size = Integer.parseInt(JOptionPane.showInputDialog("Enter how many integers you want to input:"));
            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                String input = JOptionPane.showInputDialog("Enter integer #" + (i + 1) + ":");
                numbers[i] = Integer.parseInt(input);
            }

            System.out.println("Unsorted: " + Arrays.toString(numbers));
            Arrays.sort(numbers);
            System.out.println("Sorted: " + Arrays.toString(numbers));

            int min = numbers[0];
            JOptionPane.showMessageDialog(null, "The smallest number is: " + min);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter only integers.");
        }
    }
}
