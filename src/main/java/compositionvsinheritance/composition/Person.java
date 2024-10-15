package compositionvsinheritance.composition;

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.street + ", " + address.city + ", " + address.zipCode);
    }
}