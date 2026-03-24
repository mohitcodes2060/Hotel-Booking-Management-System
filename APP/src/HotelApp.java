/**
 * ============================================================
 * MAIN CLASS - UseCase4RoomSearch
 * ============================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * @version 4.0
 */
public class HotelApp {

    public static void main(String[] args) {

        // Step 1: Create inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Step 3: Create search service
        RoomSearchService searchService = new RoomSearchService();

        // Step 4: Perform search
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}