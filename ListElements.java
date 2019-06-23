/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listelements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//<ListElements> -- Picks Random Set integers, sorts them, delivers a sum
//then creates a floating avarage point.
//CSIS 312-B01
//<Citations> Deitel, P., & Deitel, H. (2018). 
//Java How to Program . Retrieved June 16, 2019,from https://libertyonline.
//vitalsource.com/#/books/9780134763507/cfi/6/2!/4@0:0

/**
 *
 * @author Victoria
 */
public class ListElements {
   
    public static void main(String[] args) {
        
        Random Numbers = new Random();// Produces random number   
        
        //Source Found In Book Java How to Program
        List<Integer> list = new LinkedList<Integer>();//Create list 
        
        System.out.println("Victoria Norwood - CSIS - B01 - Assignment 5\n");
        
        System.out.println("Random Numbers of 25 Integers from 0 to 100\n");

        // loop 25 times
        for (int i = 0; i < 25; i++) {
            // pick random integer 1 -100   
            int theSum = 1 + Numbers.nextInt(101);
            //Source Found In Book Java How to Program
            list.add(theSum);
            
            // prints out random numbers
            System.out.print(theSum +" ");
            
        } 
        
        System.out.println("\n\nSorted Numbers of 25 Integers from 0 to 100"
                     + "\n");
        
        //Source Found In Book Java How to Program
        //Sorts elements
        Collections.sort(list);
        
        for (int theSum: list){
            System.out.print(theSum + " ");
        
        }
        
        System.out.println();
        
        // sets int to 0
        int runSum = 0; 
        
        //Source Found In Book Java How to Program
        //sets calculation of elements
        for (int theSum: list){ 
            runSum += theSum;
            
        }
        
        System.out.println("\nThe Sum of the Elements\n");
        
        //calculates the elements
        System.out.println(+runSum);
        
        System.out.println("\nThe Floating-point Avarage of the Elements\n");
        
        //calculates the floating-point
        System.out.println(+((float) runSum/25.0));
    }
}