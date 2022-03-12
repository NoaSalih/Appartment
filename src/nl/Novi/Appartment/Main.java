package nl.Novi.Appartment;

public class Main {

    public static void main(String[] args) {
        Inhabitant Noa = new Inhabitant("Noa", "Salih");
        House Dubbeldam = new House("Dubbeldamstraat", "1");

        Inhabitant sjonnie = new Inhabitant("Sjonnie", "Flodder");
        House yellowHouse = new House("Rode straat", "10");
        Noa.setHouse(Dubbeldam);
        sjonnie.setHouse(yellowHouse);

        System.out.println(Noa.toString());
        System.out.println(sjonnie.toString());

        Inhabitant kees = new Inhabitant("Kees", "Flodder", yellowHouse);
        Inhabitant maFlodder = new Inhabitant("Ma", "Flodder", yellowHouse);

        System.out.println(kees.toString());
        System.out.println(maFlodder.toString());

        System.out.println("En het huis:");
        System.out.println(yellowHouse.toString());

        Inhabitant koos = new Inhabitant("Koos", "Meijer");
        System.out.println(koos.toString());    }
}
