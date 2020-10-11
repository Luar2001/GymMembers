import javax.sql.rowset.serial.SerialArray;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 17:49
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class Search {

    private final boolean KeepLooping = true;
    //the index in the array (aka the customer)
    private int arrayIndex;
    //the multidimensional index aka id or name
    private int arrayMultIndex;

    public Search(String[][] customer) {

        //Calls the user input
        userInput(customer);


    }

    public int getArrayIndex() {
        // TODO: 11/10/2020 use for when customer is there to get the multiarray and print that to joPtion pain then to file

        return arrayIndex;
    }

    public void setArrayIndex(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    public int getArrayMultIndex() {
        return arrayMultIndex;
    }

    public void setArrayMultIndex(int arrayMultIndex) {
        this.arrayMultIndex = arrayMultIndex;
    }

    /**
     * Asks for user input checks it and then returns it as a string
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

                setArrayMultIndex(g);

                System.out.println("TEST: \n" + customer[i][0] + "\n" +customer[i][1] + "\n"+ customer[i][2] + "\n" + customer[i][3]);

                CheckRegDate(customer[arrayIndex][3]);

                break; //hopefully breaks the for loop

            } else if (i == customer.length - 1) {

                JOptionPane.showMessageDialog(null, "ERROR: That Customer douse not exist, Please try again. ");

            }

        }


    }

    public void CheckRegDate(String Date) {

        //here we check the date for if its inside the right parameters
        System.out.println("it got to here");

    }


}
