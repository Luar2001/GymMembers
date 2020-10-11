import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 15:18
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class Split3Way {

    private int CustomersSize;

    protected String[][] customer = new String[100][4];

    public Split3Way(ArrayList<String> customers){

        //sets the size of the arraylist from ReadFile
        setCustomersSize(customers);

        //sorts the Arraylist Based on index into the multidimensional array
        SplitListContainingAPerson(customers);

        //prints the entire array
        PrintCustomer();

    }

    public int getCustomersSize() {
        return CustomersSize-1;
    }

    public void setCustomersSize(ArrayList<String> customers) {
       this.CustomersSize = customers.size();
    }

    public void SplitListContainingAPerson(ArrayList<String> customers){

        //i is for index in array h is for index in arraylist and g is for multidimensional index
        for(int i=0, g=0, h=0; h < customers.size(); g++, h++){

            //if g exceeds 3 it will turn to 1 (its only for spaces in each of the multi arrays
            if(g==4){
                g = 0;
                i++;
            }

            //takes the string on index i and adds it in index i g in the multidimensional array
            customer[i][g]=customers.get(h);


        }

    }

    /**
     * Prints the entire Multidimensional array (FOR TESTING)
     */
    public void PrintCustomer(){
        System.out.println("ARRAY PRINT");
        for (String[] s : customer)
            System.out.println(Arrays.toString(s));
    }

    public void CheckIdNumber(){

    }

    public void CheckName() {

    }

    public void CheckRegDate(){

    }




}
