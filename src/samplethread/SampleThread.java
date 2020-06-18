
package samplethread;

/**
 *
 * @author gabrielhs
 */
public class SampleThread {

    
    public static void main(String[] args) {
       Hilo1 h1=new Hilo1(1000, "P1");
       Hilo1 h2=new Hilo1(2000, "P2");
       
       h1.start();
       h2.start();
    }
    
}
