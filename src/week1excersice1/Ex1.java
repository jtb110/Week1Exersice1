
package week1excersice1;

/**
 *
 * @author Jonas
 */
public class Ex1 {
    
    public static void main(String[] args) throws InterruptedException {
        
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        ThirdThread third = new ThirdThread();
        
        
        System.out.println("FIrst thread started");
        first.start();
        System.out.println("Second thread started");
        second.start();
        System.out.println("Third thread started");
        third.start();
        
        System.out.println("SLeeping 10s");
        Thread.sleep(10000);
        
        third.end(false);
    }
    
}