public class HotelApp {

    public static void main(String[] args) {

        System.out.println("Booking History and Reporting\n");

        BookingHistory history = new BookingHistory();

        // Directly add confirmed bookings (NO allocation print)
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history);
    }
}