import java.util.*;

public class main{
    public static void main(String[] args){ 
        String firstName = "Hardik";
        String lastName = "Patel";
        String fullName = firstName + " " +  lastName ;
        System.out.println(fullName.length());
        
        for(int i = 0; i < fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
