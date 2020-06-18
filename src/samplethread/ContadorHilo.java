/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplethread;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author gabrielhs
 */
public class ContadorHilo implements Runnable{
private JTextField txtV;
    public ContadorHilo(JTextField txtV) {
        this.txtV=txtV;
    }

    @Override
    public void run() {
        while(true){
            long v= Long.parseLong(txtV.getText());
            v++;
            txtV.setText(String.valueOf(v));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ContadorHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
