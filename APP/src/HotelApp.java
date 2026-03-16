/**
 * ==========================================================
 * MAIN CLASS - UseCase2RoomInitialization
 * ==========================================================
 *
 * Demonstrates creation of different room types
 * and static availability values.
 *
 * @version 2.1
 */

public class HotelApp {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization");
        System.out.println();

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteAvailability);
    }
}