import java.util.ArrayList;

/**
 * Created by Lukas Aronsson
 * Date: 11/10/2020
 * Time: 15:18
 * Project: Inlämningsuppgift 2
 * Copyright: MIT
 **/
public class Split3Way {

    private int CustomersSize;

    protected String[][] customer = new String[14][4];
    // TODO: 11/10/2020 Change to size of customerSize/4 but i get index error same as (14)

    /**
     * Constructor that calls the setCustomersSize,SplitListContainingAPerson
     *
     * @param customers The list of customers, id numbers and registration's
     */
    public Split3Way(ArrayList<String> customers){

        //sets the size of the arraylist from ReadFile
        setCustomersSize(customers);

        //sorts the Arraylist Based on index into the multidimensional array
        SplitListContainingAPerson(customers);

    }

    /**
     * Returns the size of the arrayList Customers
     *
     * @return Returns the size of CustomersSize
     */
    public int getCustomersSize() {
        return CustomersSize;
    }

    /**
     * Sets the CustomersSize (the size of the arraylist)
     *
     * @param customers The list of customers, id numbers and registration's
     */
    public void setCustomersSize(ArrayList<String> customers) {
       this.CustomersSize = customers.size();
    }

    /**
     * Splits the arraylist into a multidimensional array that stores 4 Strings per index
     *
     * @param customers The list of customers, id numbers and registration's
     */
    public void SplitListContainingAPerson(ArrayList<String> customers){

        //i is for index in array h is for index in arraylist and g is for multidimensional index
        for(int i=0, g=0, h=0; h<getCustomersSize(); g++, h++){


            //if g exceeds 3 it will turn to 1 (its only for spaces in each of the multi arrays
            if(g==4){
                g = 0;
                i++;
            }

            //takes the string on index i and adds it in index i g in the multidimensional array
            customer[i][g]=customers.get(h);


        }

    }


}
