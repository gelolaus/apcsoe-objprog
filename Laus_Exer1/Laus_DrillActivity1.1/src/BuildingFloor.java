/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 12, 2023 */

public class BuildingFloor {

    double totalFloorArea;
    int numberOfRooms;
    double heightOfFloor;
    String wallColor;

    public BuildingFloor(double inputTotalFloorArea,
                         int inputNumberOfRooms,
                         double inputHeightOfFloor,
                         String inputWallColor)

    {

        this.totalFloorArea = inputTotalFloorArea;
        this.numberOfRooms = inputNumberOfRooms;
        this.heightOfFloor = inputHeightOfFloor;
        this.wallColor = inputWallColor;

    }

    public void makeFloorChanges(int newNumberOfRooms,
                                 String newWallColor ) {

        this.numberOfRooms = newNumberOfRooms;
        this.wallColor = newWallColor;

    }

}
