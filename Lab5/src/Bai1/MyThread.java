/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import static java.lang.Thread.sleep;

/**
 *
 * @author Admin
 */
public class MyThread extends Thread
{
 public static void main(String[] args)
 {
 MyThread th = new MyThread();
 th.start();
 System.out.println("This is the main thread");
 }
 @Override
 public void run()
 {
//     for(int i=0;i<10;i++)
//         System.err.println("This is the child Thread");
 while (true)
 {
 try
 {
 System.out.println("This is the child Thread");
 sleep(1000);
 } catch (InterruptedException ex) 
 {
 ex.printStackTrace();
 }
 }
 }
}
