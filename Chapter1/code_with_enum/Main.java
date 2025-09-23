package OOA_D.Chapter1.code_with_enum;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocaster",
                                            Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like this: ");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("  We have a " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " guitar:");
                System.out.println("    " + guitar.getBackWood() + " back and sides,\n    " + guitar.getTopWood() + " top.");
                System.out.println("  You can have it for only $" + guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95692", 1293.92, Builder.GIBSON,
                            "Stratocaster", Type.ACOUSTIC, Wood.CEDAR, Wood.CEDAR);
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER,
                            "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}