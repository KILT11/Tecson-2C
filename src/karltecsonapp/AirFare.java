
package karltecsonapp;
import java.util.Scanner;

public class AirFare {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance;
        int Class;
        float total;
        double discount, disctotal;
        System.out.print("Distance: ");
         distance = sc.nextInt();
        System.out.print("Class: ");
         Class = sc.nextInt();
         
         switch (Class){
             case 1:
                 Class = 250;
                 total = distance * Class;
                 if (distance >= 1000){
                         discount = total * 0.10;
                         disctotal = total - discount;
                        System.out.println("Total Fare: "+disctotal);
                    }else{
                       System.out.println("Total Fare: "+total);
                   }
              break;
              
             case 2:
                 Class = 500;
                 total = distance * Class;
                   if (distance >= 1000){
                         discount = total * 0.10;
                         disctotal = total - discount;
                        System.out.println("Total Fare: "+disctotal);
                    }else{
                       System.out.println("Total Fare: "+total);
                   }
                 break;
              
          }         
        
    }
    
}
