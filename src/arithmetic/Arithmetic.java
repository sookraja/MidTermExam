/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * @author sookraja
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        System.out.print("Enter another integer: ");
        int m = in.nextInt();
        double result = r.calculate(m,n);
        System.out.println("result :" +result); 
    
    }
}

