
package week1excersice1;

/**
 *
 * @author Jonas
 */
public class FirstThread extends Thread {

 
    @Override
    public void run() {
        long res = 0;

        for (long i = 0; i < 1000000000; i++) {
            res += i;

        }

    }
}
