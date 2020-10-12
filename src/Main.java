public class Main {

    public static void main(String[] args) {

        //name that registered less then a year ago
        //Diamanda 7608021234
        //name that registred more then a year ago
        //Alhambra 7603021234

        ReadFile readFile = new ReadFile("files/customers.txt");

        Split3Way split = new Split3Way(readFile.getCustomers());

        new Search(split.customer);


    }
}
