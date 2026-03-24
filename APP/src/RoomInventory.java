import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> roomAvailability;
    private Map<String, Room> roomTypes;   // NEW

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        roomTypes = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {

        // Create room objects
        roomTypes.put("Single", new SingleRoom());
        roomTypes.put("Double", new DoubleRoom());
        roomTypes.put("Suite", new SuiteRoom());

        // Set availability
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public int getRoomAvailability(String roomType) {
        return roomAvailability.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * FINAL DISPLAY (matches your expected output)
     */
    public void displayInventory() {

        System.out.println("Hotel Room Inventory Status\n");

        for (String type : roomTypes.keySet()) {

            Room room = roomTypes.get(type);
            int available = roomAvailability.get(type);

            System.out.println(type + " Room:");
            room.displayRoomDetails();
            System.out.println("Available Rooms: " + available);
            System.out.println();
        }
    }
}