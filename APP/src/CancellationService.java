import java.util.*;

/**
 * CLASS - CancellationService
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 */
public class CancellationService {

    // Stack for rollback (LIFO)
    private Stack<String> releasedRoomIds;

    // Track reservationId → roomType
    private Map<String, String> reservationRoomTypeMap;

    // Constructor
    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    /**
     * Register confirmed booking
     */
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    /**
     * Cancel booking and restore inventory
     */
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        // Validate existence
        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Invalid cancellation request.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        // Add to rollback stack
        releasedRoomIds.push(reservationId);

        // Restore inventory
        int current = inventory.getRoomAvailability(roomType);
        inventory.updateAvailability(roomType, current + 1);

        // Remove booking (prevent duplicate cancel)
        reservationRoomTypeMap.remove(reservationId);

        System.out.println(
                "Booking cancelled successfully. Inventory restored for room type: "
                        + roomType
        );
    }

    /**
     * Show rollback history
     */
    public void showRollbackHistory() {

        System.out.println("\nRollback History (Most Recent First):");

        while (!releasedRoomIds.isEmpty()) {
            System.out.println(
                    "Released Reservation ID: " + releasedRoomIds.pop()
            );
        }
    }
}