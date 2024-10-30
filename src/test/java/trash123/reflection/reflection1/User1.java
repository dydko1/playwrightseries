package trash123.reflection.reflection1;

public class User1 {

    public String firstName;
    public String firstName2;
    private String lastName;
    private int age;

    public User1() {
    }

    public User1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() < 3) {
            throw new RuntimeException("Nazwisko powinno mieć min. 3 znaki");
        }
        this.lastName = lastName;
    }

    public void setLastName(String lastName, String secondPart) {
        this.lastName = lastName + secondPart;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", firstName2='").append(firstName2).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }
}