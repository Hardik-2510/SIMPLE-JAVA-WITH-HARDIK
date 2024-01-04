import java.util.* ; 

public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Find The Average of Three Numbers !\n");
        System.out.print("Enter a Number 1 :- ");
        int x = sc.nextInt();
        System.out.print("Enter a Number 2 :- ");
        int y = sc.nextInt();
        System.out.print("Enter a Number 3 :- ");
        int z = sc.nextInt();
        
        int avg = (x + y + z) / 3 ;
        
        System.out.println("The Average of " + x + "," + y + "," + z + " is " + avg);
    }
}
