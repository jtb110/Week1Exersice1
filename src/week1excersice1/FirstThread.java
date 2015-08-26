/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1excersice1;

/**
 *
 * @author Jonas
 */
public class FirstThread extends Thread {

    /**
     * @param args the command line arguments
     */
    public void run() {
        long res = 0;

        for (long i = 0; i < 1000000000; i++) {
            res += i;

        }

    }
}
