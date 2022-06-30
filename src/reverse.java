//Q1)Write the logic to reverse the String given in the parameter without
//        the help of predefined reverse method and return the reversed
//        String:(HINT use Array)

import java.util.Scanner;
class reverse{
    public static String reverseString(String input){
//write the logic
        String bag="";
       for(int i=input.length()-1;i>=0;i--){
           bag=bag+input.charAt(i);;
       }
       return bag;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reverseString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}
