//Q3) Finding prime number inside an array:
//public class Main{
  //  public int[] findAndReturnPrimeNumbers(int[] inputArray){
//write the logic to iterate through the supplied inputArray and
//determine each element whether it is prime or not
//create a second array of int
//if any number is prime inside the inputArray then add that number inside the second
//array
//and return the second array
//if no prime number is found then return the empty array.
  //  }
    //public static void main(String[] args){
//Create the object of Main class
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
      //  int[] arr = {10,12,5,50,11,14,15};
//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following
        //message:
// "Prime number not found in the supplied Array"


import java.util.Scanner;

public class prime {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int[] ans=new int[5];

        for(int j=0;j< inputArray.length;j++) {
            int count = 0;
            int s=0;
            for (int i = 1; i <= inputArray[j]; i++) {
                if (inputArray[j] % i == 0) {
                    count=count+1;
                    s=inputArray[j];
                 //System.out.println(count);
                }
            }
            if(count==2){
//                System.out.println(s);

                ans[j]=s;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a={4,4,4,4,3};
        int count=0;
        prime p1=new prime();
       for(int i=0;i<(p1.findAndReturnPrimeNumbers(a).length);i++) {
           if (p1.findAndReturnPrimeNumbers(a)[i] != 0) {
               System.out.println(p1.findAndReturnPrimeNumbers(a)[i]);
           } else if (p1.findAndReturnPrimeNumbers(a)[i] == 0) {
               count++;
           }
       }
           if(count==p1.findAndReturnPrimeNumbers(a).length){
               System.out.println("no prime numbers");
           }





    }
}
//public class prime{
//    public static void main (String[] args){
//        int[] array = new int [5];
//        Scanner in = new Scanner (System.in);
//
//        System.out.println("Enter the elements of the array: ");
//        for(int i=0; i<5; i++)
//        {
//            array[i] = in.nextInt();
//        }
//      //  Elements in the array are looped one by one using for loop.
//        for(int i=0; i<array.length; i++){
//            boolean isPrime = true;
//
//           // Using for loop and if condition, prime numbers are identified from all the numbers that are entered in the array.
//            for (int j=2; j<array[i]; j++){
//
//                if(array[i]%j==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//
//          //  All the prime numbers or the numbers that satisfy the if condition are displayed as output.
//            if(isPrime)
//
//                System.out.println(array[i] + " are the prime numbers in the array ");
//        }
//    }
//}