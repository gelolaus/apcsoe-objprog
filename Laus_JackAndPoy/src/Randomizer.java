/*
 * Created by Angelo John Benedict Laus - CPE231
 * January 11, 2024
 */

import java.util.Random;

public class Randomizer {

    Random randy;
    int pc;

    public Randomizer() {

        pc = this.createRandomNum();

    }

    public int createRandomNum() {
        randy = new Random();
        return randy.nextInt(3) + 1;
    }

}
