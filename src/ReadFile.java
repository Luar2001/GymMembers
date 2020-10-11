import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lukas Aronsson
 * Date: 10/10/2020
 * Time: 17:44
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 * <p>
 * Reads from file and makes it into a ArrayList of strings
 **/
public class ReadFile {

    protected ArrayList<String> customers = new ArrayList<>();

    /**
     * The constructor that checks if file was read and calls the Read method
     *
     * @throws FileNotFoundException if the file that the scanner reads is not found
     */
    public ReadFile() throws FileNotFoundException {

        //the name and path of the file with customers
        String fileName = "files/customers.txt";

        //try with resources so that the scanner closes
        try (Scanner scan = new Scanner(new File(fileName))) {
            Read(scan);
        }

    }

    /**
     * gets the customers list
     *
     * @return The list of customers
     */
    public ArrayList<String> getCustomers() {
        return customers;
    }

    /**
     * Reads the customers names, ID numbers and registration date and sends it to AddToList
     *
     * @param scan a Scanner that reads form the file with customer names
     */
    public void Read(Scanner scan) {

        while (scan.hasNext()) {

            // TODO: 11/10/2020 remove , form the string before adding it to the arraylist
            AddToList(scan);
        }

    }

    /**
     * Adds the strings form Read one word at a time to a list called customers
     *
     * @param scan a Scanner that reads form the file with customer names
     */
    public void AddToList(Scanner scan) {

        this.customers.add(scan.next());

    }



}
