/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karltecsonapp;
import java.util.Scanner;
/**
 *
 * @author SCC-PC9
 */
public class ThirdApp {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        if ( n < 0 ){
            System.out.println(n+"is a Negative number ");
        } else if ( n > 0){
            System.out.println( n+ " is a Positive number");
         
         }else
         System.out.println("Inputted number Zero");
    }
}
