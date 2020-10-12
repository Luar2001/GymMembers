import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 17:49
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 * <p>
 * Searches the array for a match and records the matching user in a txt file with all the userdata and current date
 **/
public class Search {

    //the index in the array (aka the customer)
    private int arrayIndex;

    /**
     * Constructor that just calls for userInput
     *
     * @param customer Multidimensional array with customer names,idNumbers and registration date
     */
    public Search(String[][] customer) {


        try {
            //Calls the user input
            userInput(customer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: Could not ask for user input! ");
        }

    }

    /**
     * Sets the arrayIndex to the index of the current customer
     *
     * @param arrayIndex the index in the array that corresponds to a matching name or IdNumber
     */
    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    /**
     * Asks for userInput and checks if it matches any names or IdNumbers in the array
     *
     * @param customer Multidimensional array with customer names,idNumbers and registration date
     */
    public void userInput(String[][] customer) {


        String input = JOptionPane.showInputDialog("Input First, Lastname or ID Number of customer");

        for (int i = 0, g = 0; i < customer.length - 1; g++) {

            if (g == 4) {
                g = 0;
                i++;
            }

            //checks everything in lowercase
            if (customer[i][g].toLowerCase().equals(input.toLowerCase())) {

                setArrayIndex(i);

                CheckRegDate(customer);

                break; //hopefully breaks the for loop

            } else if (i == customer.length - 1) {

                JOptionPane.showMessageDialog(null, "ERROR: That Customer douse not exist! ");

            }

        }


    }

    /**
     * Checks that the current users registration date was less then a year ago
     *
     * @param customer Multidimensional array with customer names,idNumbers and registration date
     */
    public void CheckRegDate(String[][] customer) {

        //here we check the date for if its inside the right parameters

        LocalDate today = LocalDate.now();

        //turn registrationDate string into a date
        LocalDate regDate = LocalDate.parse(customer[arrayIndex][3]);

        //diff between 2 dates
        if (today.getYear() - regDate.getYear() < 1) {

            //Was registered less then a year ago :)
            RecordArrival(customer);

        } else {
            JOptionPane.showMessageDialog(null, "ERROR: Registered more then a year ago. ");
        }


    }

    /**
     * Writes to file the all the info about the current customer and the current date and prints the userdata to a
     * message box
     *
     * @param customer Multidimensional array with customer names,idNumbers and registration date
     */
    public void RecordArrival(String[][] customer) {

        //so i don't have to print it 2 times
        String customerMessage = customer[arrayIndex][0] + " " + customer[arrayIndex][1] + " " +
                customer[arrayIndex][2] + " " + customer[arrayIndex][3];

        //write to the file called Arrival.txt
        try (FileWriter fw = new FileWriter("files/Arrival.txt", true)) {

            new BufferedWriter(fw);
            fw.write(customerMessage + " " + LocalDate.now() + "\n");


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR: interrupted I/O operations! ");
        }
        //print out that the user arrived and all the data in the multi array
        JOptionPane.showMessageDialog(null, customerMessage);


    }


}
