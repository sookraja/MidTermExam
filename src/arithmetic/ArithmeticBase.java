/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * @author sookraja
 */
public class ArithmeticBase 
{
    public enum function {PLUS, MINUS, TIMES, DIVIDE};
    
    double calculate(double x, double y) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arithmetic operation to perform(1 for Plus, 2 for Minus, 3 for Times, 4 for Divide): ");
        int s = sc.nextInt();
        switch (s) 
        {
            case 1:
                return x + y;
            case 2:
                return x - y;
            case 3:
                return x * y;
            case 4:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
