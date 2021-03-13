package nl.novi.basicprogramming;

public class Main {

    public static void main(String[] args) {
        House huibertPootlaan = new House("Beatrixstraat", "92");
        House krot = new House("Krotlaan", "666");

        Inhabitant piet = new Inhabitant("Piet", "Jansen", huibertPootlaan);
        System.out.println(piet.toString());

        Inhabitant klaas = new Inhabitant("Klaas", "Klaassen");
        System.out.println(klaas.toString());
        klaas.setHouse(krot);
        System.out.println(klaas.toString());
        System.out.println("Alleen het adres daarvan is: " + krot.toString());

        Inhabitant koos = new Inhabitant("Koos", "Dakloos");
        System.out.println(koos.toString());


    }
}
