import java.util.*;

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows :- ");
        int rows = sc.nextInt();
        System.out.print("Enter Number Of Columns :- ");
        int cols = sc.nextInt();
        
        int[][] numbers = new int[rows][cols];
        System.out.println("Enter Value Of Matrix :- ");
        for(int i = 0 ; i < rows ;i++){
            for(int j = 0 ; j < cols ; j++){
                numbers[i][j] = sc.nextInt();
            }
        System.out.println("The Value Of Matrix :- \n");
        for(int i = 0 ; i < rows ;i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }    
     }
  }
}
