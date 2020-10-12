import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 14:14
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class Split3WayTest {

    ReadFile testList = new ReadFile("test/TestTXTFile.txt");

    Split3Way test = new Split3Way(testList.getCustomers());


    @Test
    public void SplitListContainingAPersonTest() {

        //checks if the multidimensional array is 4 indexes deep
        assertEquals(4, test.customer[0].length);
        //checks if the multidimensional array is not 5 indexes deep
        assertNotEquals(5, test.customer[0].length);

        //Check data in array for matches
        assertEquals("7603021234", test.customer[0][0]);
        assertEquals("Alhambra", test.customer[0][1]);
        assertNotEquals("Alhambra", test.customer[0][0]);
    }



}


