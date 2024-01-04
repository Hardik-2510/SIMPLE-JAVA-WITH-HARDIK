import java.util.*;
class main{
    public static void main(String[] args){
        System.out.print("Enter Marks :- ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if(mark < 100 && mark > 75){
            System.out.print("A+");
        }
        else if(66 < mark && mark > 75){
            System.out.print("A");
        }
        else if(51 < mark && 65 > mark){
            System.out.print("B");
        }
        else if(41 < mark && 50 > mark){
            System.out.print("C");
        }
        else if(33 < mark && 40 > mark){
            System.out.print("D");
        }
        else{
            System.out.print("Fail");
        }
    }
}
