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

    protected String[][] customer = new String[this.CustomersSize][4];

    public Split3Way(ArrayList<String> customers){
        setCustomersSize(customers);

        SplitListContainingAPerson(customers);


    }

    public int getCustomersSize() {
        return CustomersSize;
    }

    public void setCustomersSize(ArrayList<String> customers) {
       this.CustomersSize = customers.size();
    }

    public void SplitListContainingAPerson(ArrayList<String> customers){

        //i is for index and g is for multidimensional index
        for(int i=0, g=0; i < CustomersSize; i++,  g++){

            //if g exceeds 3 it will turn to 1 (its only for spaces in each of the multi arrays
            if(g==4){
                g = 0;
            }

            //takes the string on index i and adds it in index i g in the multidimensional array
            customer[i][g]=customers.get(i);


        }

    }

    public void CheckIdNumber(){

    }

    public void CheckName() {

    }

    public void CheckRegDate(){

    }




}
