package F3class;
import java.util.Scanner;
public class Thirdclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age < 18) {   
            System.out.println("You are a minor.");
         }
         else
         {
            System.out.println("You are an adult.");
         }
        sc.close();
    }
    
}
