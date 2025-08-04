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
public class SecondApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,res;
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        res = n % 2;
        if ( n == 0 ){
            System.out.println("Inputted number Zero");
        } else if ( res == 0){
            System.out.println("Inputted number is Even");
         
         }else
         System.out.println("Inputted number is Odd");
    }
}
