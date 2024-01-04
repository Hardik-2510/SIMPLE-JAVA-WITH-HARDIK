import java.util.*;

class main{
    public static void main(String[] args){

        System.out.println("1.BLD ");
        System.out.println("2.EM-1 ");
        System.out.println("3.EDG ");
        System.out.println("4.WORKSHOP ");
        System.out.println("Choose A Subject  :-");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch(opt){
            case 1:
                System.out.println("You Choose BLD - Basics Of Logic Development ");
                break;
            case 2:
                System.out.println("You Choose EM-1 - Engineering Mathematics - 1 ");
                break;       
            case 3:
                System.out.println("You Choose EDG - Engineering Drawing Graphics ");
                break;
            case 4:
                System.out.println("You Choose WorkShop ");
                break;
            default:
            System.out.println("Choose Invalid Option !!");
            break;
        }
    }
}
