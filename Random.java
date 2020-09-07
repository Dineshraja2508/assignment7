

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;
import java.util.ArrayList;


/**
 *
 * @author ELCOT
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList a = new ArrayList(); 
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
        int minimum = 10;
      int maximum = 90;
      int average = 0;
        // adding elements and simultaneously finding average
         for (int j = 0; j<20; j++)
        {
        int pick =  (int) (Math.random() * (maximum - minimum + 1) + minimum); 
        a.add(pick);
        average = average+pick;
        
        }
        average = average/20;
System.out.println("Contents of a: " + a);
System.out.println("The average is     "+ average);
      // finding elements above average
       for (int j =0; j<20; j++ ){
         int a1 = (int) a.get(j);
         if(a1>average){
             b.add(a1);}
             
         else
          c.add(a1);
         }
         
System.out.println("\n \nContents of the main array: " + a);
System.out.println("\n \nContents greater than average: " + b);
System.out.println("\n \nContents lesset than average: " + c);
           
    }
    
}
