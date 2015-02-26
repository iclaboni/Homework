
package javaapplication4;

import java.util.*;

public class JavaApplication4 {

    public static void main(String[] args) {
     System.out.println("What is the name of your favorite city");
     Scanner sc = new Scanner (System.in) ;
     String city = sc.nextLine();
     String upper = city.toUpperCase();
     String lower = city.toLowerCase();
     String first = city.substring(0,1);
     int Stringsize = city.length();
     System.out.println("The name of the city in Upper case:" + upper);
     System.out.println("The name of the city in lower case:" + lower);
     System.out.println("The first character in the name of the city: "+ first);
     System.out.println("The number of characters in the city:" + Stringsize);
     
     
    }
    
}
