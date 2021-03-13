package nl.novi.basicprogramming;

public class Inhabitant {
    private String firstName;
    private String lastName;
    private House house;

    // CONSTRUCTOR 1
    public Inhabitant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // CONSTRUCTOR 2
    public Inhabitant(String firstName, String lastName, House house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    // Methodes (+ getters en setters)
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
        this.lastName = lastName;
    }

    public House getHouse() {
        return house;
    }
    public void setHouse(House house) {
        this.house = house;
    }

    public String toString() {
        String string = firstName + " " + lastName;
        if (house != null) {
            string += " woont op " + house.toString() + ".";
        } else {
            string += " is dakloos.";
        }

        return string;
    }
}
