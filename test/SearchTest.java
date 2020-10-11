import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 17:39
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class SearchTest {


    @Test
    public void userInputTest() {

    }

    @Test
    public void CheckIdNumberTest(){

        //checks the IdNumber of the customer

        //checks the first persons id number
        assertEquals("7603021234,", test.customer[0][0]);

        //checks the third persons id number
        assertEquals("8512021234,", test.customer[2][0]);

    }
    public void CheckNameTest() {

        //firstName check
        assertEquals("Alhambra", test.customer[0][1]);
        //lastNameCheck
        assertEquals("Belle", test.customer[1][2]);

    }



}