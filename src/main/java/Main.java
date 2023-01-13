import customer.Address;
import customer.Costumer;
import customer.Name;

public class Main {

    public static void main(String[] args) {

        Costumer costumer = new Costumer("Dr.", new Name("John", "The Rock", "Doe"), 1979,
                new Address("USA", "Atlanta", "Easy", 12), "johntherockdoe@gmail.com");

        System.out.println(costumer);
    }
}
