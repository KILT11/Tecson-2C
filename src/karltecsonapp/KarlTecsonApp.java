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
public class KarlTecsonApp {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int marks, sci, h, math, soc, arts;
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter remarks in Science: ");
        sci = sc.nextInt();
        System.out.print("Enter remarks in History: ");
        h = sc.nextInt();
        System.out.print("Enter remarks in Math: ");
        math = sc.nextInt();
        System.out.print("Enter remarks in Soc: ");
        soc = sc.nextInt();
        System.out.print("Enter remarks in Arts: ");
        arts = sc.nextInt();
        
        marks = sci+h+math+soc+arts;
       
        
        System.out.println("Total Remarks: "+marks);
        float percentage = marks /5f;
        System.out.printf("Total Percentage: %.2f\n",percentage);
        
        String remarks;
       

        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 70 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage >= 75 && percentage <= 80) {
            remarks = "Fair";
        } else if (percentage >= 80 && percentage <= 85) {
            remarks = "Good";
        } else if (percentage >= 85 && percentage <= 90) {
            remarks = "Very Good";
        } else if (percentage >= 90 && percentage <= 100) {
            remarks = "Excellent";
        } else {
            remarks = "Invalid";
        }

        System.out.println("Remarks : " +remarks);

        if (percentage >= 70) {

            System.out.println("Congrats "+name+" you Passed.");

        } else {
            System.out.println("Try Again");
        }
    }
    
}
