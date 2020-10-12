import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Lukas Aronsson
 * Date: 10/10/2020
 * Time: 20:34
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
class ReadFileTest {

    ReadFile test = new ReadFile();

    //test list that contains test data
    List<String> testList = Arrays.asList("13123123", "TestName");


    @Test
    public final void readTest() {
        //if file was read

        // TODO: 11/10/2020 Figure out how to test if file was read

        //Test that the file was actually read (this data is on these indexes in the txt file)

    }

    @Test
    void addToListTest() {

        //if list was created successfully
        assertEquals("13123123", testList.get(0));
        assertEquals("TestName", testList.get(1));
        assertNotEquals(testList.get(0), "TestName");

        //test form the actually list in ReadFile.java
        assertEquals("7603021234", test.customers.get(0));
        assertEquals("Alhambra", test.customers.get(1));
        assertNotEquals(test.customers.get(0), "Alhambra");

    }
}