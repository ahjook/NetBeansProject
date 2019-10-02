/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IO;

import java.util.Scanner;

/**
 *
 * @author ajocme_sd2082
 */
public class CLIInput {
    
    public double getNum()
    {
        Scanner s = new Scanner(System.in);
        double blade = s.nextDouble();
        return blade;
    }
    
    
    
}
