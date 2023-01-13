public class Main {

    public static void main(String[] args) {

        Person person = new Person("Dr.", new Name("John", "The Rock", "Doe"), 1979,
                new Address("USA", "Atlanta", "Easy", 12), "johntherockdoe@gmail.com");

        System.out.println(person);
    }
}
