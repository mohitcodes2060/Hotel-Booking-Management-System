public class HotelApp {

    public static void main(String[] args) {

        System.out.println("Booking Cancellation");

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Cancellation service
        CancellationService cancelService = new CancellationService();

        // STEP 1: Simulate confirmed booking
        String reservationId = "Single-1";
        String roomType = "Single";

        cancelService.registerBooking(reservationId, roomType);

        // STEP 2: Cancel booking
        cancelService.cancelBooking(reservationId, inventory);

        // STEP 3: Show rollback history
        cancelService.showRollbackHistory();

        // STEP 4: Show updated inventory
        System.out.println(
                "\nUpdated Single Room Availability: "
                        + inventory.getRoomAvailability("Single")
        );
    }
}