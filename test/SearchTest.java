import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 17:39
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class SearchTest {

    ReadFile testList = new ReadFile();

    Split3Way test = new Split3Way(testList.getCustomers());

    public SearchTest() throws FileNotFoundException {
    }


    @Test
    public void userInputTest() {
        //test if user input is not null or something

        //checks the first persons id number
        assertEquals("7603021234,", test.customer[0][0]);

        //checks the third persons id number
        assertEquals("8512021234,", test.customer[2][0]);

        //firstName check
        assertEquals("Alhambra", test.customer[0][1]);
        //lastNameCheck
        assertEquals("Belle", test.customer[1][2]);

    }

    @Test
    public void CheckRegDateTest() {
        //checks the Registration date of the customer

        assertEquals("2019-07-01", test.customer[0][3]);

    }



}