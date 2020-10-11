import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFile();

        Split3Way split = new Split3Way(readFile.getCustomers());

        Search search = new Search(split.customer);


    }
}
