import java.util.*;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows :- ");
        int rows = sc.nextInt();
        System.out.print("Enter Number Of Columns :- ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        System.out.print("\n Enter A Matrix :- ");
        for(int i = 0 ; i < rows ;i++){
            for(int j = 0 ; j < cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter A Number To Find :- ");
        int x = sc.nextInt();
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(numbers[i][j] == x ){
                    System.out.println("X Found At (" + (i+1) + " , " + (j+1) + ")");
                }
            }
        }
    }
}
