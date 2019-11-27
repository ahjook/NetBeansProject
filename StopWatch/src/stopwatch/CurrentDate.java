/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwatch;

/**
 *
 * @author ajocme_sd2082
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
 
class CurrentDate extends JFrame {
 
    JTextField dateField; 
 
      public static void main(String[] args) {
        JFrame dte = new CurrentDate();
        dte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dte.setVisible(true);
    }
 
    public CurrentDate() {
 
        dateField= new JTextField(8);
 
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(dateField); 
 
        this.setContentPane(content);
        this.setTitle("Date");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
 
        javax.swing.Timer t = new javax.swing.Timer(1000, new DateListener());
        t.start();
 
    }
 
    class DateListener implements ActionListener {
            @Override
    	public void actionPerformed(ActionEvent e) {
 
            Calendar now = Calendar.getInstance();
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            int year = now.get(Calendar.YEAR);
            dateField.setText("" + (month + 1) + "/" + day + "/" + year);
 
    	}
    }
 
 
}
