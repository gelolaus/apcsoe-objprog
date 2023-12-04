/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 12, 2023 */

public class Main {

    public Main() {

        System.out.println("\nBuilding Floor\n");

        BuildingFloor BF8 = new BuildingFloor(1,
                1,
                1,
                "White");

        BuildingFloor BF3 = new BuildingFloor(2,
                2,
                2,
                "Black");

        System.out.println("\t\tEIGHT FLOOR\t\t");
        System.out.println("Floor Area:\t\t\t" + BF8.totalFloorArea);
        System.out.println("Number of Rooms:\t" + BF8.numberOfRooms);
        System.out.println("Height of Floor:\t" + BF8.heightOfFloor);
        System.out.println("Wall Color:\t\t\t" + BF8.wallColor);

        System.out.println("\n----------------------------\n");

        System.out.println("\t\tTHIRD FLOOR\t\t");
        System.out.println("Floor Area:\t\t\t" + BF3.totalFloorArea);
        System.out.println("Number of Rooms:\t" + BF3.numberOfRooms);
        System.out.println("Height of Floor:\t" + BF3.heightOfFloor);
        System.out.println("Wall Color:\t\t\t" + BF3.wallColor);

        BF8.makeFloorChanges(10,
                "Orange");

        BF3.makeFloorChanges(20,
                "Gray");

        /*Got this from Stack Overflow: https://stackoverflow.com/questions/1401481/how-to-do-a-system-pause-in-java-for-debugging
         * I'll be using this to pause the console for debugging.*/
        System.out.println("\nPress ENTER Key To Continue...");
        new java.util.Scanner(System.in).nextLine();

        System.out.println("\nSome Changes\n");

        System.out.println("\t\tEIGHT FLOOR\t\t");
        System.out.println("Floor Area:\t\t\t" + BF8.totalFloorArea);
        System.out.println("Number of Rooms:\t" + BF8.numberOfRooms);
        System.out.println("Height of Floor:\t" + BF8.heightOfFloor);
        System.out.println("Wall Color:\t\t\t" + BF8.wallColor);

        System.out.println("\n----------------------------\n");

        System.out.println("\t\tTHIRD FLOOR\t\t");
        System.out.println("Floor Area:\t\t\t" + BF3.totalFloorArea);
        System.out.println("Number of Rooms:\t" + BF3.numberOfRooms);
        System.out.println("Height of Floor:\t" + BF3.heightOfFloor);
        System.out.println("Wall Color:\t\t\t" + BF3.wallColor);

    }

    public static void main(String[] args) {

        Main startProgram = new Main();

    }
}