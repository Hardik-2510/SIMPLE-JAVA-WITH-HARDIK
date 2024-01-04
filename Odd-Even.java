import java.util.*;
  class main{
     public static void main(String[] args){
       System.out.print("Enter Number To Check Odd Or Even
       :- ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(n % 2 == 0){
         System.out.println(n + " is Even Number !");
       }
         else{
           System.out.println(n + " is Odd Number !");
       }
   }
}
