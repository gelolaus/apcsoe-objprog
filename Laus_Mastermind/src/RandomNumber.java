/*
 * Created by Angelo John Benedict Laus - CPE231
 * December 21, 2023
 */

import java.awt.*;
import java.util.Random;

public class RandomNumber {

    Random randy;
    int p1, p2, p3, p4;

    public RandomNumber() {

        p1 = this.createRandomNumber();
        p2 = this.createRandomNumber();
        p3 = this.createRandomNumber();
        p4 = this.createRandomNumber();

        while (p1 == p2 || p1 == p3 || p1 == p4 || p2 == p3 || p2 == p4 || p3 == p4) {
            p1 = this.createRandomNumber();
            p2 = this.createRandomNumber();
            p3 = this.createRandomNumber();
            p4 = this.createRandomNumber();
        }

        System.out.println(p1 + " " + p2 + " " + p3 + " " + p4);

    }

    public int createRandomNumber() {

        randy = new Random();
        return randy.nextInt(6) + 1;

    }

    public void resetAll() {

        p1 = this.createRandomNumber();
        p2 = this.createRandomNumber();
        p3 = this.createRandomNumber();
        p4 = this.createRandomNumber();

        while (p1 == p2 || p1 == p3 || p1 == p4 || p2 == p3 || p2 == p4 || p3 == p4) {
            p1 = this.createRandomNumber();
            p2 = this.createRandomNumber();
            p3 = this.createRandomNumber();
            p4 = this.createRandomNumber();
        }

        System.out.println(p1 + " " + p2 + " " + p3 + " " + p4);

    }

}
