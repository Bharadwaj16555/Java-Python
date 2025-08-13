import java.util.*;

public class Test2 {
    public static void Sum(int n) {
        int sum=0;
        for(int i=1;i%2!=0;i++) {
            System.out.println("Sum of first n odd numbers" + i );
            sum += i;
           
        }
        System.out.println("The sum of first n odd numbers is: " + sum);
        return;
    }
 
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Sum(n);
        sc.close();
}
}
