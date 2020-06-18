
package samplethread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabrielhs
 */
public class Hilo1 extends Thread{
private long timesleep=1;
private String name="";
    public Hilo1(long timesleep, String name) {
        this.timesleep=timesleep;
        this.name=name;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("un subproceso:" + name);
            try {
                sleep(timesleep);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        super.run(); //To change body of generated methods, choose Tools | Templates.
        }
        }
        

}
