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

        //check if multidim exceeds index of 4
        //checks if multidim has more then 1 index
    }

    @Test
    public void CheckRegDateTest() {
        //checks the Registration date of the customer

        assertEquals("2019-07-01", test.customer[0][3]);

    }

}


