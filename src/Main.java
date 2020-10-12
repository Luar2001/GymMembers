public class Main {

    public static void main(String[] args) {

        ReadFile readFile = new ReadFile("files/customers.txt");

        Split3Way split = new Split3Way(readFile.getCustomers());

        new Search(split.customer);


    }
}
