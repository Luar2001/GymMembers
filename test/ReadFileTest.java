import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Lukas Aronsson
 * Date: 10/10/2020
 * Time: 20:34
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 * <p>
 * test for ReadFile
 **/
class ReadFileTest {

    String path = "test/TestTXTFile.txt";

    ReadFile test = new ReadFile(path);


    @Test
    public final void readTest() throws FileNotFoundException {

        //if file was read

        Scanner testScan = new Scanner(new File(path));

        //if the first scan is 7603021234,
        assertEquals(testScan.next(), "7603021234,");
        //if the second on is Alhambra
        assertEquals(testScan.next(), "Alhambra");
        //if next 3 is not 7603021234,
        assertNotEquals(testScan.next(), "7603021234,");

    }

    @Test
    void addToListTest() {


        //test form the actually list in ReadFile.java
        assertEquals("7603021234", test.customers.get(0));
        assertEquals("Alhambra", test.customers.get(1));
        assertNotEquals(test.customers.get(0), "Alhambra");

    }
}