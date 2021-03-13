package nl.novi.basicprogramming;

public class House {
    // Variabelen
    private String streetName;
    private String houseNumber;

    // Constructor
    public House(String streetName, String houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    // Getters en setters en andere methodes

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return streetName + " " + houseNumber;
    }
}
