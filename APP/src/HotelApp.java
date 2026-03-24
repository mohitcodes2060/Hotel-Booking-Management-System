/**
 * ============================================================
 * MAIN CLASS - HotelApp
 * ============================================================
 *
 * Use Case 5: Booking Request Queue (FIFO)
 *
 * @version 5.0
 */
public class HotelApp {

    public static void main(String[] args) {

        // Step 1: Display header
        System.out.println("Booking Request Queue");

        // Step 2: Create queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Step 3: Create booking requests
        Reservation r1 = new Reservation("Mohit", "Single");
        Reservation r2 = new Reservation("Rohit", "Double");
        Reservation r3 = new Reservation("Subhas", "Suite");

        // Step 4: Add to queue
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Step 5: Process queue (FIFO)
        while (bookingQueue.hasPendingRequests()) {

            Reservation r = bookingQueue.getNextRequest();

            System.out.println(
                    "Processing booking for Guest: "
                            + r.getGuestName()
                            + ", Room Type: "
                            + r.getRoomType()
            );
        }
    }
}