package nl.novi.basicprogramming;

import java.util.List;
import java.util.ArrayList;

public class Appartment {
    // Variabelen (instance)
    private String streetName;
    private String houseNumber;
    private List<Person> persons; // Relatie met een andere klasse

    // Constructor 1
    public Appartment(String streetName, String houseNumber, List<Person> persons) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.persons = persons;
    }

    // Constructor 2
    public Appartment(String streetName, String houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.persons = new ArrayList<>();
    }

    // Methodes
    public String getStreetName() { return streetName; }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void showInformation() {
        System.out.println("Er wonen " + persons.size() + " personen in het huis op " + streetName);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Op ").append(streetName).append(" ").append(houseNumber).append(" wonen ")
                .append(persons.size()).append(" mensen:");

        for(Person inhabitant : persons) {
            stringBuilder.append("\n\r").append(inhabitant.toString()).append(".");
        }
        stringBuilder.append("\n\r");
        return stringBuilder.toString();
    }
}
