import java.util.*;
public class Test1 {
    
    public static void Avg(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int num3 = sc.nextInt();
        
        Avg(num1, num2, num3);
        sc.close();
    }

}

