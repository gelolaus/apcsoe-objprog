/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy, MMMM dd HH:mm:ss");
        System.out.println("Good Day!");
        System.out.println("The Date today is " + formatter.format(date));
    }
}