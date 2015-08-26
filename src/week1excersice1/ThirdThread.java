
package week1excersice1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonas
 */
public class ThirdThread extends Thread{
    
    boolean end = true;
    
    public void run(){
        long number = 10;
        
       try{
           while (end){
               number++;
               System.out.println(number);
               sleep(3000);
                      
           }
       } catch (InterruptedException ex){
           Logger.getLogger(ThirdThread.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public void end (boolean b){
        end = b;
    }
    
}
