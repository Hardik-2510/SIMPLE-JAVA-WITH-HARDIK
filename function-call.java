import  java.util.*; 
public class function{
    public static void printMyName(String name){// function declaration
        System.out.println("This Name is Printed By Called Function And Name Is " + name);
        return;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name :- ");
        String name = sc.next();
        printMyName(name);// call the function
    }
}
