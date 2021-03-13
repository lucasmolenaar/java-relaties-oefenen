package nl.novi.basicprogramming;

public class Main {

    public static void main(String[] args) {
        Car aFord = new Car("Ford", "Fiesta");
        aFord.addPart("Engine");
        aFord.addPart("Left front tire");
        aFord.addPart("Right front tire");
        aFord.addPart("Left back tire");
        aFord.addPart("Right back tire");

        System.out.println(aFord.toString());

        Car aMercedes = new Car("Mercedes", "GLE Coupé");

        System.out.println("----------------------");
        System.out.println(aMercedes.toString());
    }
}
