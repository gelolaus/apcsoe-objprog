/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 12, 2023 */

public class Main {

    public Main() {

        System.out.println("\nUsing the Class Car\n");

        Car CarA = new Car("APP1234",
                "Sedan",
                20.2,
                "Blue",
                false);

        System.out.println("\t|\t\tCar A License Plate:\t\t\t|\t\t" + CarA.licensePlateNo + "\t\t|");
        System.out.println("\t|\t\tCar A Type:\t\t\t\t\t\t|\t\t" + CarA.carType + "\t\t|");
        System.out.println("\t|\t\tCar A Ave MPG:\t\t\t\t\t|\t\t" + CarA.aveMPG + "\t\t|");
        System.out.println("\t|\t\tCar A Color:\t\t\t\t\t|\t\t" + CarA.carColor + "\t\t|");
        System.out.println("\t|\t\tIs Car A's tail light working?\t|\t\t" + CarA.tailLightWorking + "\t\t|");

        System.out.println("\n\t-------------------------------------------------------------\n");

        Car CarB = new Car("TRP1234",
                "Van",
                18.9,
                "Red",
                true);

        System.out.println("\t|\t\tCar B License Plate:\t\t\t|\t\t" + CarB.licensePlateNo + "\t\t|");
        System.out.println("\t|\t\tCar B Type:\t\t\t\t\t\t|\t\t" + CarB.carType + "\t\t\t|");
        System.out.println("\t|\t\tCar B Ave MPG:\t\t\t\t\t|\t\t" + CarB.aveMPG + "\t\t|");
        System.out.println("\t|\t\tCar B Color:\t\t\t\t\t|\t\t" + CarB.carColor + "\t\t\t|");
        System.out.println("\t|\t\tIs Car B's tail light working?\t|\t\t" + CarB.tailLightWorking + "\t\t|");

        System.out.println("\n\t-------------------------------------------------------------\n");
        System.out.println("Changes\n");

        CarA.changePaintColor("Pink");


        System.out.println("\t|\t\tCar A Color:\t\t\t\t\t|\t\t" + CarA.carColor + "\t\t|");

    }
    public static void main(String[] args) {

        Main startProgram = new Main();

    }
}