import java.util.*;
import java.io.*;

public class incomeTax{
    
      public static void main(String[] args){

           try{

             double tax = 0;

             Scanner sc = new Scanner(System.in);
           
             System.out.println("Enter the income : ");
             double income = sc.nextDouble();

             while(income >=0){
             if(income <= 150000){
                 System.out.println("No tax");
             }
          
             else if(income >=150001 && income <= 300000){
                  tax = income * 0.01;
                  System.out.println("Tax" + tax);
             }

             else if(income >= 300001 && income <=500000){
                  tax = 300000 * 0.01 + (500000 - income) * 0.02 ;
                  System.out.println("Tax" + tax);
             }
         
             else{
                  tax = 300000 * 0.01 + 500000 *0.02 +(income - 500000);
                  System.out.println("Tax : " + tax);
             }
           }
          }
         
           catch (Exception e){
               System.out.println("Invalid entry " );
           }
       }
    }
