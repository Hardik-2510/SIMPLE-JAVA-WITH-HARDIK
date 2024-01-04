import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number 1 :-");
        int x = sc.nextInt();
        System.out.print("Enter A Number 2 :-");
        int y = sc.nextInt();
        sum(x , y); 
    }
    public static void sum(int x ,int y){
        int z = x + y ;
        System.out.println( x + " + " + y + " = " + z );
        return;
    }
}
