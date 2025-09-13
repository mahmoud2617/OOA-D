public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocaster",
                                            "electric", "Alder", "Alder");

        Guitar guitar = inventory.search(whatErinLikes);

        if (guitar != null) {
            System.out.println("Erin, you might like this: ");
            System.out.println(guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType());
            System.out.println("guitar: " + guitar.getBackWood() + " back and sides, " + guitar.getTopWood() + " top.");
            System.out.println("You can have it for only $" + guitar.getPrice());
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95692", 1293.92, "A new builder",
                            "Stratocaster", "acoustic", "zan", "zan");
        inventory.addGuitar("V95693", 1499.95, "Fender",
                            "Stratocaster", "electric", "Alder", "Alder");
    }
}