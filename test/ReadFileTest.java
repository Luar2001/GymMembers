import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Lukas Aronsson
 * Date: 10/10/2020
 * Time: 20:34
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
class ReadFileTest {

    ReadFile test = new ReadFile();

    ReadFileTest() throws IOException {
    }


    @Test
    public final void readTest() {
        //if file was read

        // TODO: 11/10/2020 Figure out how to test if file was read

    }

    @Test
    void addToListTest() {
        //if list was created successfully

        assertEquals("7603021234,", test.customers.get(0));
        assertEquals("Alhambra", test.customers.get(1));
        assertNotEquals(test.customers.get(0), "Alhambra");

    }
}