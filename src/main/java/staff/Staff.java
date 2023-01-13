package staff;

import customer.Address;
import customer.Name;

public class Staff {

    private Name name;
    private Address address;

    public Staff(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
