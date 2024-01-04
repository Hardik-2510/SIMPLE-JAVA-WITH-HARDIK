import java.util.*;

public class main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array :- ");
        int size = sc.nextInt();
        
        int number[] = new int[size];
        
        for(int i = 0 ;i < size ;i++){
            System.out.print("\nEnter The " + (i+1) + " Value of array :- ");
             number[i] = sc.nextInt();
        }
        
        System.out.print("Enter a number find From array :- ");
        int x = sc.nextInt();
        
        for(int i = 0 ; i < number.length ; i++){
            if(number[i] == x){
                System.out.println(x + " found at index " + (i+1));
            }
        }
    }
}
