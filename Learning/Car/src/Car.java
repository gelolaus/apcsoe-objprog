/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 12, 2023 */

public class Car {

    // Attributes
    String licensePlateNo;
    String carType;
    double aveMPG;
    String carColor;
    boolean tailLightWorking;

    /* The Characteristic when it is created. This is a function where it accepts five (5) parameters. */
    public Car(String inputLicensePlateNo,
               String inputCarType,
               double inputAveMPG,
               String inputCarColor,
               boolean inputTailLightWorking)

    {

        // The 'this.' is used to tell that the attribute is in this class.

        this.licensePlateNo = inputLicensePlateNo;
        this.carType = inputCarType;
        this.aveMPG = inputAveMPG;
        this.carColor = inputCarColor;
        this.tailLightWorking = inputTailLightWorking;

    }

    public void changePaintColor(String newCarColor) {

        this.carColor = newCarColor;

    }
}