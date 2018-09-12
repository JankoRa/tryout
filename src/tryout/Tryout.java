/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryout;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janko
 */
public class Tryout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        aadding some code
        System.out.println("Hello world");
        try {
            // TODO code application logic here
            Thread.currentThread().sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tryout.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Adding some code
        
    }
    
}
