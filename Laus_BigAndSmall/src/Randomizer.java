/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 4, 2024
 */

import java.util.Random;

public class Randomizer {

    Random randy;
    int d1, d2, d3;

    public Randomizer() {

        d1 = this.createRandomNum();
        d2 = this.createRandomNum();
        d3 = this.createRandomNum();

        while (d1 == d2 || d1 == d3 || d2 == d3) {
            d1 = this.createRandomNum();
            d2 = this.createRandomNum();
            d3 = this.createRandomNum();
        }

        System.out.println(d1 + " " + d2 + " " + d3);

    }

    public int createRandomNum() {
        randy = new Random();
        return randy.nextInt(6) + 1;
    }


}
