
package week1excersice1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonas
 */
public class SecondThread extends Thread {
    @Override
    public void run(){
        try{
            for(int i = 1; i < 6; i++){
            System.out.println(i);
            sleep(2000);
        }
        } catch (InterruptedException ex){
            Logger.getLogger(SecondThread.currentThread().getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}