package model;

public class Restaurant {
    String name;
    Address address;
    Staff[] staff;

    public Restaurant(String name, Address address, Staff[] staff) {
        this.name = name;
        this.address = address;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Staff[] getStaff() {
        return staff;
    }

    public void setStaff(Staff[] staff) {
        this.staff = staff;
    }
}
