public class Person {

    private String namePrefix;
    private Name name;
    private int yearOfBirth;
    private Address address;
    private String email;

    public Person(String namePrefix, Name name, int yearOfBirth, Address address, String email) {
        this.namePrefix = namePrefix;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.email = email;
    }

    public Person(Name name, int yearOfBirth, Address address, String email) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.email = email;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public Name getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePrefix='" + namePrefix + '\'' +
                ", name=" + name +
                ", yearOfBirth=" + yearOfBirth +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }
}
