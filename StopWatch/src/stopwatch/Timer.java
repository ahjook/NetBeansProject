package stopwatch;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * StopWatch
 * @author Santhosh Reddy Mandadi
 * @since 08-Jun-2009
 * @version 1.0
 */
public class Timer extends JFrame implements ActionListener,Runnable
{
 
 JLabel disp , text;
 JButton btn , btn1;
 boolean stop = false;
 int i,j,k,l;
 
 public Timer()
 {
//  text = new JLabel("<html><h1>StopWatch</h1></html>");
  disp = new JLabel();
  btn = new JButton("Start");
  btn1= new JButton("Stop");
  disp.setFont(new Font("Serif",Font.BOLD,20));
  disp.setBackground(Color.cyan);
  disp.setForeground(Color.red);
  disp.setBounds(50,350,100,30);
  btn.addActionListener(this);
  btn1.addActionListener(this);
  btn.setBounds(100,350,100,30);
  btn1.setBounds(170,350,100,30);
  
  Container c = getContentPane();
  c.setLayout(new FlowLayout());
//  c.add(text);
  c.add(disp);
  c.add(btn);
  c.add(btn1);
  
 }
 @Override
 public void run()
 {
  
  for(i=0;;i++)
  {
   for(j=0;j< 60;j++)
   {
    for(k=0;k< 60;k++)
    {
     for(l=0;l< 100;l++)
     {
      if(stop)
      {
       break;
      }
      NumberFormat nf = new DecimalFormat("00");
      disp.setText(nf.format(i)+":"+nf.format(j)+":"+nf.format(k)+":"+nf.format(l));
      try{
       Thread.sleep(10);
      }catch(Exception e){}
     }
    }
   }
  }
 }
 @Override
 public void actionPerformed(ActionEvent a)
 {
  Thread t = new Thread(this);
  if(a.getActionCommand().equals("Start"))
  {
   t.start();
   btn1.setText("Stop");
  }
  else
  {
   stop = true;
  }
 }
 
// public static void main(String[] args) 
// {
//  Timer s=new Timer();
//  s.setSize(500,100);
//  s.setVisible(true);
//  s.setTitle("StopWatch");
//  s.setDefaultCloseOperation(EXIT_ON_CLOSE);
// }
}