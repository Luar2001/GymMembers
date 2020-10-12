import org.junit.jupiter.api.Test;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 17:39
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class SearchTest {

    ReadFile testList = new ReadFile("test/TestTXTFile.txt");

    Split3Way test = new Split3Way(testList.getCustomers());

    String customerMessage = test.customer[0][0] + " " + test.customer[0][1] + " " +
            test.customer[0][2] + " " + test.customer[0][3];


    @Test
    public void userInputTest() {
        //test if user input is not null or something

        //checks the first persons id number
        assertEquals("7603021234", test.customer[0][0]);

        //checks the third persons id number
        assertEquals("8512021234", test.customer[2][0]);

        //firstName check
        assertEquals("Alhambra", test.customer[0][1]);

        //lastNameCheck
        assertEquals("Belle", test.customer[1][2]);

    }

    @Test
    public void CheckRegDateTest() {

        //check that the registration dates can be read from file
        assertEquals("2019-07-01", test.customer[0][3]);
        assertEquals("2020-08-04", test.customer[2][3]);


        //Check 1 year apart Thing
        LocalDate regDate = LocalDate.parse(test.customer[0][3]); //2019-07-01

        assertEquals(1, LocalDate.of(2020, 6, 1).getYear() - regDate.getYear()); //there is less then 1 year apart
        assertNotEquals(1, LocalDate.of(2022, 7, 2).getYear() - regDate.getYear()); //there is more then 1 year apart

    }

    @Test
    public void RecordArrivalTest() throws IOException {


        //file writer
        try (FileWriter fw = new FileWriter("test/TestTXTArrivals.txt", true)) {

            new BufferedWriter(fw);
            fw.write(customerMessage + " " + LocalDate.now() + "\n");

        }

        //file reader
        try (Scanner scan = new Scanner(new File("test/TestTXTArrivals.txt"))) {


            //first read
            assertEquals("7603021234", scan.next());
            //second read
            assertEquals("Alhambra", scan.next());
            //third read
            assertNotEquals("7603021234", scan.next());

        }


    }


}