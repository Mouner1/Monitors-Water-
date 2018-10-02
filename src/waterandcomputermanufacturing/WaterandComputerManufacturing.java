/*
Mouner Dabjan
Oct 2 2018
This porgram was created to calculate the total number of tons of waters used in monitors 
 */

package waterandcomputermanufacturing;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class WaterandComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // constant 
        final double WATER_COMPUTER = 1.5; 
        
        
        Scanner keyboard = new Scanner (System.in); 
        
        // variables 
        
        double monitor; 
        double tons;
        
        
        //input
        
        System.out.println("Please enter the number of computer monitors you have:"); 
        monitor = keyboard.nextDouble(); 
        
        // algorithm for calculating the tons of water 
        
        tons = monitor * WATER_COMPUTER; 
        
        //output 
        
        System.out.println("The total number of tons of water used is " + tons + "."); 
        
        
        
       
     
    }
    
}
