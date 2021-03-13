package nl.novi.basicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // VIA CONTSTRUCTOR 1 UIT APPARTMENT KLASSE
        // Maak personen aan via de Person klasse
        Person lucas = new Person("Lucas", "Molenaar");
        Person thomas = new Person("Thomas", "Molenaar");
        Person moniek = new Person("Moniek", "Bakker");

        // Maak een nieuw appartement object aan via de Appartment klasse
        Appartment mijnHuis = new Appartment("Huibert Pootlaan", "92");

        // Voeg de personen toe aan de Person ArrayList via het Appartment object (klasse) en addPerson (methode)
        mijnHuis.addPerson(lucas);
        mijnHuis.addPerson(thomas);
        mijnHuis.addPerson(moniek);

        //mijnHuis.showInformation();
        System.out.println(mijnHuis.toString());

        // VIA CONSTRUCTOR 2 UIT APPARTMENT KLASSE
        // Maak personen aan via Person klasse
        Person studentOne = new Person("Sjaak", "Patat");
        Person studentTwo = new Person("Fred", "Frikandel");
        Person studentThree = new Person("Co", "Kroket");
        Person studentFour = new Person("Piet", "Friet");

        // Maak een nieuwe ArrayList van de Person klasse
        List<Person> students = new ArrayList<>();
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentThree);
        students.add(studentFour);

        // Maak een nieuw Appartment object
        Appartment studentsHouse = new Appartment("Krotjesstraat", "80", students);

        // Print de toString methode van de Appartment klasse in de console
        System.out.println(studentsHouse.toString());
    }
}
