package Ejercicio3;

import javax.swing.*;
import java.util.Collections;
import java.util.Vector;

/**
 * This class uses a Vector to dynamically store integers entered by the user
 * until "1" is entered to stop. Then, it shows the smallest value.
 */
public class VectorMinValueApp {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        String input;

        while (true) {
            input = JOptionPane.showInputDialog("Enter an integer (or type 1 to finish):");
            if (input.equals("1")) {
                break;
            }

            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number. Try again.");
            }
        }

        if (numbers.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No valid numbers were entered.");
        } else {
            System.out.println("Unsorted: " + numbers);
            Collections.sort(numbers);
            System.out.println("Sorted: " + numbers);

            int min = numbers.firstElement();
            JOptionPane.showMessageDialog(null, "The smallest number is: " + min);
        }
    }
}
