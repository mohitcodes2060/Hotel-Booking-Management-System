/**
 * ============================================================
 * MAIN CLASS - HotelApp
 * ============================================================
 *
 * Use Case 6: Room Allocation Processing
 *
 * @version 6.0
 */
public class HotelApp {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing");

        // Step 1: Inventory
        RoomInventory inventory = new RoomInventory();

        // Step 2: Booking Queue
        BookingRequestQueue queue = new BookingRequestQueue();

        // Step 3: Add booking requests
        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        // Step 4: Allocation service
        RoomAllocationService allocator = new RoomAllocationService();

        // Step 5: Process queue (FIFO)
        while (queue.hasPendingRequests()) {

            Reservation r = queue.getNextRequest();

            allocator.allocateRoom(r, inventory);
        }
    }
}