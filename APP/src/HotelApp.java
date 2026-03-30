public class HotelApp {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistence = new FilePersistenceService();

        // 🔁 LOAD DATA
        persistence.loadInventory(inventory, filePath);

        // DISPLAY CURRENT INVENTORY
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: " + inventory.getRoomAvailability("Single"));
        System.out.println("Double: " + inventory.getRoomAvailability("Double"));
        System.out.println("Suite: " + inventory.getRoomAvailability("Suite"));

        // 💾 SAVE DATA
        persistence.saveInventory(inventory, filePath);
    }
}