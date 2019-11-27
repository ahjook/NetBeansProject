/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwatch;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author ajocme_sd2082
 */
public class StopWatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Timer timer = new Timer();
        timer.setSize(250,300);
        timer.setVisible(true);
        timer.setTitle("StopWatch");
        timer.setDefaultCloseOperation(EXIT_ON_CLOSE);

            CurrentDate date = new CurrentDate();
            date.setSize(250,300);
            date.setVisible(true);
            date.setTitle("Date");
            date.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}

