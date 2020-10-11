import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 14:14
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class Split3WayTest {

    ReadFile testList = new ReadFile();

    Split3Way test = new Split3Way(testList.getCustomers());

    public Split3WayTest() throws FileNotFoundException {
    }


    @Test
    public void SplitListContainingAPersonTest() {
        //split into smaller lists of 4
    }

    @Test
    public void CheckNameTest() {
        //checks the first and last name of the customer

        //firstName check
        assertEquals("Alhambra", test.customer[0][1]);
        //lastNameCheck
        assertEquals("Belle", test.customer[1][2]);

    }

    @Test
    public void CheckIdNumberTest() {
        //checks the IdNumber of the customer

        //checks the first persons id number
        assertEquals("7603021234,", test.customer[0][0]);

        //checks the third persons id number
        assertEquals("8512021234,", test.customer[2][0]);

    }

    @Test
    public void CheckRegDateTest() {
        //checks the Registration date of the customer

        assertEquals("2019-07-01", test.customer[0][3]);

    }

}


